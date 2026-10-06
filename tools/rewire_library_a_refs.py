#!/usr/bin/env python3
"""Rewire R8-internal library classes back to the obfuscated ``a`` package.

Problem
-------
R8 obfuscated the application together with its bundled library classes.  jadx
emitted some of those library internals under their *library* package (e.g.
``androidx/lifecycle/a.java``) even though their bodies reference the obfuscated
application package ``a`` (``a.gv0``, ``a.id0`` ...).

When such a class is named ``a`` (e.g. ``androidx.lifecycle.a``), the simple name
``a`` inside ``package androidx.lifecycle`` resolves to the *class itself* before
the package ``a``, producing errors like::

    androidx/lifecycle/a.java:4: error: cyclic inheritance involving a
        public final class a extends a.gv0 {

Fix
---
For every restored library source file, add a *single-type import*
(``import a.gv0;``) for each referenced ``a.<ClassName>`` token and then rewrite
the qualified reference ``a.<ClassName>`` to the bare ``<ClassName>``.  A
single-type import takes precedence over the package name, so the reference
resolves unambiguously to the application package class.

Only files that were restored by ``restore_androidx_internals.py`` (i.e. library
sources whose class is absent from ``app/libs/*.jar``) are processed.

Usage:
    python3 tools/rewire_library_a_refs.py [--apply]
"""
from __future__ import annotations

import argparse
import re
from pathlib import Path

import restore_androidx_internals as restore

PROJECT_ROOT = Path(__file__).resolve().parent.parent

# matches `a.` followed by a lowercase-leading class identifier (R8 style).
# The leading `(?<![\w.])` guard prevents matching the `.a` tail of a longer
# qualified name such as `androidx.activity.a.this` (which would otherwise be
# mis-read as `a.this`).
A_REF_RE = re.compile(r"(?<![\w.])a\.([a-z][a-z0-9_]*)\b")
PACKAGE_RE = re.compile(r"^package\s+([\w.]+)\s*;", re.MULTILINE)
IMPORT_RE = re.compile(r"^import\s+[\w.]+;\s*$", re.MULTILINE)


def restored_library_files() -> list[Path]:
    """Return project-relative paths of the restored R8-internal library files."""
    jar_classes = restore.collect_jar_classes()
    result: list[Path] = []
    for src in restore.iter_candidate_sources():
        rel = restore.original_relative(src)
        if restore.fqcn_for(rel) in jar_classes:
            continue
        result.append(Path("app/src/main/java") / rel)
    return result


def rewire(path: Path, apply: bool) -> int:
    text = path.read_text(encoding="utf-8", errors="replace")
    pkg_match = PACKAGE_RE.search(text)
    if not pkg_match or pkg_match.group(1) == "a":
        return 0  # not a library file, or already inside package a

    names = sorted(set(A_REF_RE.findall(text)))
    if not names:
        return 0

    # Rewrite qualified references `a.Foo` -> `Foo` (strip only the leading `a.`).
    new_text = A_REF_RE.sub(lambda m: m.group(1), text)

    # Insert single-type imports right after the package statement.
    imports = "".join(f"import a.{n};\n" for n in names)
    insert_at = pkg_match.end()
    new_text = new_text[:insert_at] + "\n" + imports + new_text[insert_at:]

    if apply:
        path.write_text(new_text, encoding="utf-8")
    return len(names)


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--apply", action="store_true",
                        help="write changes (default is a dry run)")
    args = parser.parse_args()

    total = 0
    for rel in restored_library_files():
        path = PROJECT_ROOT / rel
        if not path.is_file():
            continue
        n = rewire(path, args.apply)
        if n:
            total += 1
            print(f"  {'[apply]' if args.apply else '[dry]'} {rel}: "
                  f"{n} import(s) added")
    print(f"\nfiles rewired: {total}")
    if not args.apply:
        print("[dry-run] nothing written. Re-run with --apply.")


if __name__ == "__main__":
    main()
