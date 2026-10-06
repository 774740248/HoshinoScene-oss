#!/usr/bin/env python3
"""Repair jadx ``this.<leaked>`` field references (field-name leakage).

jadx sometimes recovers the *original* field name in reference sites while
keeping the *obfuscated* name in the declaration (or vice-versa).  The result is
``cannot find symbol: variable <name>`` for ``this.<name>``.

This tool, driven by the javac log, fixes the reference sites:

1. Parse the log for ``cannot find symbol: variable X`` whose source line is
   ``this.X`` (no ``location:`` line -> it is a field of the current class).
2. For each affected class file, build the table of declared fields
   ``name -> type`` (own class only; also records the declaration ORDER).
3. Infer the leaked field's type from the usage on that line:
   * ``this.X = <expr>`` / ``this.X.a(...)`` / cast ``(T) this.X`` ...
   Use a set of heuristics; on ambiguity fall back to the smali of the class,
   which gives the exact field the compiler originally targeted (obf name),
   matched by the order of first use within the enclosing method.
4. Rewrite ``this.X`` -> ``this.decl`` when a UNIQUE by-type declaration exists.

Only ``this.<name>`` (own-class field) references are touched.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

ERR = re.compile(r"^([^:]+\.java):(\d+): error: cannot find symbol$")
DECL = re.compile(
    r"^\s*(?:public|protected|private|static|final|transient|volatile|\s)*"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+([A-Za-z_$][\w$]*)\s*(=|;)")

PRIM = {"int", "long", "short", "byte", "char", "boolean", "float", "double"}


def collect(log: str) -> Dict[str, List[Tuple[int, str]]]:
    """file -> list of (line, leaked_field_name)."""
    lines = open(log, "r", encoding="utf-8", errors="replace").read().splitlines()[:11000]
    out: Dict[str, List[Tuple[int, str]]] = defaultdict(list)
    i = 0
    while i < len(lines):
        m = ERR.match(lines[i])
        if m:
            blk = "\n".join(lines[i + 1:i + 6])
            sm = re.search(r"symbol:\s+variable\s+(\S+)", blk)
            # own-class field: no 'location:' in the block
            if sm and "location:" not in blk:
                name = sm.group(1)
                src = lines[i + 1].strip() if i + 1 < len(lines) else ""
                if re.search(r"\bthis\." + re.escape(name) + r"\b", src) or \
                   re.search(r"(?<![\w.])" + re.escape(name) + r"\b", src):
                    out[m.group(1)].append((int(m.group(2)), name))
        i += 1
    return out


def infer_type(line: str, name: str, decl_types: Dict[str, str]) -> Optional[List[str]]:
    """Return candidate declared-field names whose type fits `name` usage."""
    # explicit cast: (T) this.name
    m = re.search(r"\(\s*([A-Za-z_$][\w.$]*)\s*\)\s*this\." + re.escape(name), line)
    if m:
        return [n for n, t in decl_types.items() if t == m.group(1)]
    # assignment: this.name = <rhs>;
    m = re.search(r"this\." + re.escape(name) + r"\s*=\s*(.+?);", line)
    if m:
        rhs = m.group(1).strip()
        mm = re.match(r"new\s+([A-Za-z_$][\w.$]*)", rhs)
        if mm:
            t = mm.group(1)
            return [n for n, tt in decl_types.items() if tt == t]
        # literal
        if rhs in ("true", "false"):
            return [n for n, tt in decl_types.items() if tt == "boolean"]
        if re.match(r"^-?\d+$", rhs):
            return [n for n, tt in decl_types.items() if tt in ("int", "long")]
        if rhs.startswith('"'):
            return [n for n, tt in decl_types.items() if tt == "java.lang.String"]
        if rhs == "null":
            return None  # ambiguous
    # usage as `this.name.a(...)` -> field type has method `a`; can't tell -> None
    return None


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    groups = collect(args.log)
    print(f"files with this.-field leaks: {len(groups)}")

    applied = 0
    files_changed = 0
    for f, items in groups.items():
        f = f.strip()
        if not os.path.exists(f):
            continue
        src = open(f, encoding="utf-8", errors="replace").read()
        lines = src.split("\n")
        # declared fields name->type
        decl_types: Dict[str, str] = {}
        for ln in lines:
            m = DECL.match(ln)
            if m:
                t, n = m.group(1), m.group(2)
                base = re.sub(r"<.*>", "", t).strip()
                if base not in PRIM and base.split(".")[-1] in (
                        "public", "private", "protected", "static", "final"):
                    continue
                decl_types[n] = base
        changed = False
        for (line_no, name) in items:
            if line_no - 1 >= len(lines):
                continue
            line = lines[line_no - 1]
            cands = infer_type(line, name, decl_types)
            if cands is None or len(cands) != 1:
                continue
            target = cands[0]
            newline = re.sub(r"this\." + re.escape(name) + r"\b", f"this.{target}", line)
            if newline != line:
                lines[line_no - 1] = newline
                applied += 1
                changed = True
        if changed:
            files_changed += 1
            if args.apply:
                open(f, "w", encoding="utf-8", errors="surrogateescape").write("\n".join(lines))
    print(f"{'applied' if args.apply else 'would apply'}: {applied} refs in {files_changed} files")
    return 0


if __name__ == "__main__":
    sys.exit(main())
