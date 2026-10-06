#!/usr/bin/env python3
"""Mechanical javac type-error fixer.

Handles the common jadx type-mismatch patterns, driven by the javac log:

* ``int cannot be converted to boolean``      -> ``(expr) != 0``
* ``boolean cannot be converted to int``      -> ``(expr) ? 1 : 0``
* ``possible lossy conversion from float to int`` -> insert ``(int)`` cast before
  the offending expression
* ``Object cannot be converted to T``          -> insert ``(T)`` cast

For each error the offending source span is located using the source line and the
caret column javac reports, so we edit exactly the expression javac points at.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from typing import Dict, List, Tuple

ERR = re.compile(r"^([^:]+\.java):(\d+): error: (.+)$")


def read_lines(path: str) -> List[str]:
    return open(path, "r", encoding="utf-8", errors="replace").read().split("\n")


def caret_col(error_block: List[str], src_line: str) -> int:
    """Return the 0-based column from the caret line following the source echo."""
    for ln in error_block:
        s = ln.strip()
        if s and set(s) <= set("^ ") and "^" in s:
            return ln.index("^")
    return 0


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("--dry", action="store_true")
    ap.add_argument("--max", type=int, default=100000)
    args = ap.parse_args()

    raw = open(args.log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]

    # group errors by (file, line) with their message + caret column
    fixes: List[Tuple[str, int, str, str, int]] = []
    i = 0
    while i < len(raw):
        m = ERR.match(raw[i])
        if not m:
            i += 1
            continue
        f, line, msg = m.group(1), int(m.group(2)), m.group(3)
        block = raw[i:i + 6]
        col = caret_col(block, "")
        kind = None
        target = None
        if re.match(r"incompatible types: int cannot be converted to boolean", msg):
            kind = "int2bool"
        elif re.match(r"incompatible types: boolean cannot be converted to int", msg):
            kind = "bool2int"
        elif "possible lossy conversion from float to int" in msg or \
             "possible lossy conversion from double to int" in msg:
            kind = "float2int"
        elif re.match(r"incompatible types: Object cannot be converted to (\S+)", msg):
            kind = "obj2type"
            target = re.match(r"incompatible types: Object cannot be converted to (\S+)", msg).group(1)
        if kind:
            fixes.append((f, line, kind, target or "", col))
        i += 1

    print(f"fixable type errors: {len(fixes)}")

    # apply per file, from bottom to top so line numbers stay valid
    by_file: Dict[str, List[Tuple[int, str, str, int]]] = {}
    for (f, line, kind, target, col) in fixes:
        by_file.setdefault(f, []).append((line, kind, target, col))

    applied = 0
    skipped = 0
    for f, items in by_file.items():
        if not os.path.exists(f):
            continue
        lines = read_lines(f)
        for (line, kind, target, col) in sorted(items, key=lambda x: -x[0]):
            if line - 1 >= len(lines):
                continue
            src = lines[line - 1]
            indent = len(src) - len(src.lstrip())
            p = max(col, indent)
            if p >= len(src):
                skipped += 1
                continue
            # expand to a *balanced* expression bounded by ; , ) or end
            end = p
            depth = 0
            ok = True
            while end < len(src):
                ch = src[end]
                if ch in "([{":
                    depth += 1
                elif ch in ")]}":
                    if depth == 0:
                        break
                    depth -= 1
                elif ch in ";,=" and depth == 0:
                    break
                end += 1
            expr = src[p:end].strip()
            # guard: expression must not itself contain a statement terminator or
            # unbalanced brackets, and must be non-trivial
            if not expr or not re.match(r"^[\w.$\[\]()\s+\-*/%<>&|!?:'\"]+$", expr):
                skipped += 1
                continue
            if expr.count("(") != expr.count(")") or expr.count("[") != expr.count("]"):
                skipped += 1
                continue
            if kind == "int2bool":
                new = f"({expr}) != 0"
            elif kind == "bool2int":
                new = f"({expr}) ? 1 : 0"
            elif kind == "float2int":
                new = f"(int) ({expr})"
            elif kind == "obj2type":
                new = f"({target}) ({expr})"
            else:
                continue
            lines[line - 1] = src[:p] + new + src[end:]
            applied += 1
        if not args.dry:
            open(f, "w", encoding="utf-8").write("\n".join(lines))
    print(f"{'would apply' if args.dry else 'applied'}: {applied} (skipped {skipped})")
    return 0


if __name__ == "__main__":
    sys.exit(main())
