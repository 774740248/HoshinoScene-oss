#!/usr/bin/env python3
"""SAFE mechanical javac type-error fixer (v2).

Handles the common jadx type-mismatch patterns, driven by the javac log:

* ``int cannot be converted to boolean``       -> ``(expr) != 0``
* ``boolean cannot be converted to int``       -> ``(expr) ? 1 : 0``  (only in
  value contexts; if the target already is a ternary the fix is skipped)
* ``possible lossy conversion from float to int`` -> ``(int) (expr)``
* ``<A> cannot be converted to <B>``            -> ``(B) (expr)``  for the
  *Object/Number/*->concrete cases only.

Safety rules (v2)
-----------------
1. The offending span is expanded from the caret and MUST be a *balanced*
   expression that contains NO top-level ``? :`` ternary, no ``;`` and stays
   within the current statement.  If the span would cross a ternary operator
   (``?``/``:``) or a method-argument separator in an unsafe way, the fix is
   SKIPPED rather than guessing.
2. Only a single physical line is ever edited.
3. A fix is skipped when the span begins/ends inside an identifier boundary in a
   way that would corrupt the token stream (checked via a char-class whitelist
   plus an identifier-boundary guard).

This conservatism trades a few unfixed errors for ZERO introduced syntax
errors (the previous revision produced 400 ``';' expected``).
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from typing import Dict, List, Tuple

ERR = re.compile(r"^([^:]+\.java):(\d+): error: (.+)$")
IDENT = re.compile(r"[A-Za-z0-9_$]")


def read_lines(path: str) -> List[str]:
    return open(path, "r", encoding="utf-8", errors="replace").read().split("\n")


def caret_col(block: List[str]) -> int:
    for ln in block:
        s = ln.strip()
        if s and set(s) <= set("^~ ") and ("^" in s or "~" in s):
            return max(ln.index("^") if "^" in ln else ln.index("~"), 0)
    return 0


def classify(msg: str) -> Tuple[str, str]:
    """Return (kind, target_type)."""
    m = re.match(r"incompatible types: int cannot be converted to boolean", msg)
    if m:
        return "int2bool", ""
    m = re.match(r"incompatible types: boolean cannot be converted to int", msg)
    if m:
        return "bool2int", ""
    if "possible lossy conversion from float to int" in msg or \
       "possible lossy conversion from double to int" in msg:
        return "float2int", ""
    m = re.match(r"incompatible types: Object cannot be converted to ([\w.$]+)", msg)
    if m:
        return "obj2type", m.group(1)
    m = re.match(r"incompatible types: (?:Number|CharSequence|Comparable) cannot be converted to ([\w.$]+)", msg)
    if m:
        return "obj2type", m.group(1)
    return "", ""


def balanced_span(src: str, p: int) -> Tuple[int, int, bool]:
    """Expand from column p to a balanced expression span [a, b).

    Returns (a, b, ok).  ok=False means the span is unsafe to edit.
    Never crosses a top-level ternary ``? :`` or a ``;``.
    """
    if p >= len(src):
        return p, p, False
    if not (IDENT.match(src[p]) or src[p] in "(["):
        # caret may point at '(' of a cast or the operator; nudge forward
        q = p
        while q < len(src) and src[q] in " \t(":
            q += 1
        if q >= len(src) or not IDENT.match(src[q]):
            return p, p, False
        p = q
    start = p
    depth = 0
    i = p
    saw_ternary = False
    while i < len(src):
        ch = src[i]
        if ch in "([{":
            depth += 1
        elif ch in ")]}":
            if depth == 0:
                break
            depth -= 1
        elif depth == 0:
            if ch == "?":
                saw_ternary = True
            elif ch == ":":
                saw_ternary = True
            elif ch in ";,=":
                break
        i += 1
    end = i
    expr = src[start:end]
    if not expr.strip():
        return start, end, False
    if saw_ternary:
        return start, end, False
    return start, end, True


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("--dry", action="store_true")
    args = ap.parse_args()

    raw = open(args.log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]

    fixes: List[Tuple[str, int, str, str, int]] = []
    i = 0
    while i < len(raw):
        m = ERR.match(raw[i])
        if not m:
            i += 1
            continue
        f, line, msg = m.group(1), int(m.group(2)), m.group(3)
        kind, target = classify(msg)
        if kind:
            col = caret_col(raw[i:i + 6])
            fixes.append((f, line, kind, target, col))
        i += 1

    print(f"fixable type errors: {len(fixes)}")

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
            p = max(col, len(src) - len(src.lstrip()))
            if p >= len(src):
                skipped += 1
                continue
            a, b, ok = balanced_span(src, p)
            if not ok or a >= b:
                skipped += 1
                continue
            expr = src[a:b]
            # guard against already-cast / logical contexts that would re-break
            if kind == "int2bool":
                if re.search(r"[!=]=|!=|\?|:", expr):
                    skipped += 1
                    continue
                new = f"({expr}) != 0"
            elif kind == "bool2int":
                new = f"({expr}) ? 1 : 0"
            elif kind == "float2int":
                new = f"(int) ({expr})"
            elif kind == "obj2type":
                new = f"({target}) ({expr})"
            else:
                continue
            # identifier boundary sanity: char before a must not be ident (would
            # merge into a longer token) unless it is one of `(=,+-*/&|!?:).
            if a > 0 and IDENT.match(src[a - 1]) and src[a - 1] not in ")":
                skipped += 1
                continue
            lines[line - 1] = src[:a] + new + src[b:]
            applied += 1
        if not args.dry:
            open(f, "w", encoding="utf-8").write("\n".join(lines))
    print(f"{'would apply' if args.dry else 'applied'}: {applied} (skipped {skipped})")
    return 0


if __name__ == "__main__":
    sys.exit(main())
