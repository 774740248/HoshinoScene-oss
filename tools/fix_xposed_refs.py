#!/usr/bin/env python3
"""Disambiguate ``de.robv.android.xposed.*`` references inside the ``a`` package.

Problem
-------
The decompiled application package ``a`` contains a class literally named ``de``
(``a/de.java``).  Inside ``package a`` the simple name ``de`` therefore resolves
to the *class* ``a.de`` before the *package* ``de``, so fully-qualified Xposed
references such as ``de.robv.android.xposed.XposedHelpers`` are mis-parsed as
``a.de.robv...`` and fail with::

    error: cannot find symbol
      symbol:   class robv
      location: class de

Fix
---
Insert single-type imports (``import de.robv.android.xposed.XposedHelpers;``) for
every Xposed type referenced by the file.  A single-type import always takes
precedence over a same-package type, so the references resolve to the real Xposed
API stubs.

Usage:
    python3 tools/fix_xposed_refs.py [--apply] [--root app/src/main/java]
"""
from __future__ import annotations

import argparse
import re
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parent.parent
DEFAULT_ROOT = PROJECT_ROOT / "app" / "src" / "main" / "java"

PACKAGE_RE = re.compile(r"^package\s+[\w.]+\s*;", re.MULTILINE)

# Top-level Xposed types that may be imported directly.
XP_TYPES = (
    "de.robv.android.xposed.XC_MethodHook",
    "de.robv.android.xposed.XposedBridge",
    "de.robv.android.xposed.XposedHelpers",
    "de.robv.android.xposed.XSharedPreferences",
    "de.robv.android.xposed.IXposedHookLoadPackage",
    "de.robv.android.xposed.IXposedHookZygoteInit",
    "de.robv.android.xposed.callbacks.XC_LoadPackage",
)


def needs_fix(text: str) -> bool:
    return "de.robv.android.xposed" in text


def used_types(text: str) -> list[str]:
    used: list[str] = []
    for t in XP_TYPES:
        # match the type when used as `t.` or `t$` or bare `t`
        short = t.rsplit(".", 1)[1]
        if re.search(rf"\b{re.escape(t)}\b", text):
            used.append(t)
    return used


def process(path: Path, apply: bool) -> int:
    text = path.read_text(encoding="utf-8", errors="replace")
    if not needs_fix(text):
        return 0

    # Skip files that already import the type explicitly.
    m = PACKAGE_RE.search(text)
    if not m:
        return 0

    types = used_types(text)
    if not types:
        return 0

    # Rewrite fully-qualified references to their simple (imported) names so the
    # `a.de` class no longer shadows the `de` package.
    # Longest prefixes first to avoid partial replacements.
    new_text = text
    for t in sorted(types, key=len, reverse=True):
        short = t.rsplit(".", 1)[1]
        new_text = re.sub(rf"(?<![\w.]){re.escape(t)}\b", short, new_text)

    header_end = PACKAGE_RE.search(new_text).end()
    existing = new_text[:header_end]
    imports = []
    for t in types:
        if f"import {t};" in existing:
            continue
        imports.append(f"import {t};")

    if not imports and new_text == text:
        return 0

    if imports:
        new_text = new_text[:header_end] + "\n" + "\n".join(imports) + "\n" + new_text[header_end:]
    if apply:
        path.write_text(new_text, encoding="utf-8")
    return len(imports)


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--apply", action="store_true",
                        help="write changes (default is a dry run)")
    parser.add_argument("--root", type=Path, default=DEFAULT_ROOT)
    args = parser.parse_args()

    total_files = 0
    total_imports = 0
    for path in sorted(args.root.rglob("*.java")):
        # The Xposed stub sources live inside de.robv.* themselves and refer to
        # their own package correctly - never touch them.
        if "de/robv/android/xposed" in path.as_posix():
            continue
        n = process(path, args.apply)
        if n:
            total_files += 1
            total_imports += n
            print(f"  {'[apply]' if args.apply else '[dry]'} "
                  f"{path.relative_to(PROJECT_ROOT)}: +{n} import(s)")
    print(f"\nfiles: {total_files}, imports added: {total_imports}")
    if not args.apply:
        print("[dry-run] nothing written. Re-run with --apply.")


if __name__ == "__main__":
    main()
