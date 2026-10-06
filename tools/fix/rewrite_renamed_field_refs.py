#!/usr/bin/env python3
"""Rewrite field-access call sites that still use a jadx-renamed field's
*original* name to the jadx-assigned (renamed) name.

Background
----------
jadx renames a field when the original short name would collide (typically with
the ``a`` package).  It rewrites *most* call sites but some remain, producing
``cannot find symbol`` errors such as::

    me1Var.a      // me1 declares  /* renamed from: a */ ... f348a

Renaming the *declaration* back to ``a`` is unsafe: a bare ``a`` then shadows the
``a`` package and breaks ``a.wv.w(...)`` style qualified access.  So instead we
rewrite the access sites to jadx's name.

Matching
--------
For each field ``X.fxxx`` with original name ``orig`` we rewrite:
  * ``<ClassSimple>.orig``          (static access)
  * ``<recv>.orig``  where ``recv`` has declared type ``<ClassSimple>``
      (instance access; ``recv`` resolved from the file's symbol table)

Only rewrites when ``orig`` is NOT a real member of the resolved type (i.e. the
symbol genuinely does not exist), so genuine fields keep working.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from collections import defaultdict
from dataclasses import dataclass
from typing import Dict, List, Optional

RENAME_RE = re.compile(r"/\*\s*renamed from:\s*([A-Za-z_$][A-Za-z0-9_$]*)\s*(?:,\s*reason:[^*]*)?\*/")
FIELD_DECL_RE = re.compile(
    r"^\s*(?:(?:public|protected|private|static|final|transient|volatile)\s+|/\*[^*]*\*/?\s*|\s)*"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$][\w$]*)\s*(=|;)"
)
DECL_RE = re.compile(
    r"(?:^|[;{(\s])"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$][\w$]*)\s*(?:=|;|,|\))"
)
CAST_RE = re.compile(r"\(\s*\(?\s*([A-Za-z_$][\w.$]*)(?:\s*<[^>]*>)?\s*\)?\s*\)\s*([A-Za-z_$][\w$]*)")


@dataclass
class Rename:
    obf_name: str
    orig_name: str
    class_simple: str


def simple(name: str) -> str:
    return name.rsplit(".", 1)[-1]


def simple_class_name(path: str) -> str:
    base = os.path.basename(path)
    return base[:-5] if base.endswith(".java") else base


def scan(files: List[str]) -> Dict[str, List[Rename]]:
    """simple class name -> list of Rename (a name may be ambiguous)."""
    out: Dict[str, List[Rename]] = defaultdict(list)
    for path in files:
        try:
            lines = open(path, "r", encoding="utf-8", errors="replace").readlines()
        except OSError:
            continue
        cls = simple_class_name(path)
        for i, line in enumerate(lines):
            m = RENAME_RE.search(line)
            if not m:
                continue
            orig = m.group(1)
            j = i + 1
            while j < len(lines) and lines[j].strip() == "":
                j += 1
            if j >= len(lines):
                continue
            fdm = FIELD_DECL_RE.match(lines[j])
            if not fdm:
                continue
            obf = fdm.group(2)
            if obf == orig:
                continue
            out[cls].append(Rename(obf, orig, cls))
    return out


def symtab(text: str) -> Dict[str, str]:
    table: Dict[str, str] = {}
    for m in DECL_RE.finditer(text):
        typ, name = m.group(1), m.group(2)
        if typ.lower() in {"return", "new", "if", "for", "while", "switch", "else"}:
            continue
        table[name] = simple(typ)
    for m in CAST_RE.finditer(text):
        table.setdefault(m.group(2), simple(m.group(1)))
    return table


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    files: List[str] = []
    for root, _dirs, names in os.walk(args.src_root):
        for n in names:
            if n.endswith(".java"):
                files.append(os.path.join(root, n))

    renames = scan(files)
    print(f"renamed-field classes: {len(renames)}")

    total = 0
    changed_files = 0
    for path in files:
        text = open(path, "r", encoding="utf-8", errors="replace").read()
        table = symtab(text)
        out_lines: List[str] = []
        file_changed = 0

        # pre-compile per-class patterns
        for line in text.splitlines(keepends=True):
            def repl(m: re.Match) -> str:
                nonlocal file_changed
                recv, field = m.group(1), m.group(2)
                cands: List[Rename] = []
                cands += renames.get(recv, [])
                typ = table.get(recv)
                if typ:
                    cands += renames.get(typ, [])
                for rc in cands:
                    if field == rc.orig_name:
                        file_changed += 1
                        return f"{recv}.{rc.obf_name}"
                return m.group(0)

            out_lines.append(re.sub(r"\b([A-Za-z_$][\w$]*)\.([A-Za-z_$][\w$]*)\b(?!\s*\()",
                                    repl, line))
        total += file_changed
        if file_changed:
            changed_files += 1
            if args.apply:
                open(path, "w", encoding="utf-8").writelines(out_lines)

    print(f"refs {'rewritten' if args.apply else 'to rewrite'}: {total} in {changed_files} files")
    return 0


if __name__ == "__main__":
    sys.exit(main())
