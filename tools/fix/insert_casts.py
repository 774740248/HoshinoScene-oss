#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Insert explicit casts to resolve javac "incompatible types: A -> B" errors.

jadx frequently produces assignments/arguments whose static type is too general
(commonly ``Object``) while the target expects a concrete type.  javac reports
``incompatible types: <Found> cannot be converted to <Required>`` and prints a
caret under the offending expression.

This tool reconstructs the offending expression span from the caret column and
wraps it in an explicit ``(<Required>)`` cast.  Only *simple* target shapes are
handled to stay semantics-preserving:

  * ``LHS = EXPR;``                 -> ``LHS = (T) EXPR;``
  * ``return EXPR;``                -> ``return (T) EXPR;``
  * ``f(EXPR)`` / ``f(a, EXPR)``    -> ``f((T) EXPR)``  (single-line arg)

Anything with a ternary, lambda, or unbalanced brackets on the span is skipped.
"""
from __future__ import annotations

import os
import re
import sys
from collections import defaultdict

# error line: "<path>:<ln>: error: incompatible types: <found> cannot be converted to <required>"
ERR = re.compile(
    r"^(?P<path>[^:]+\.java):(?P<ln>\d+): error: incompatible types: "
    r"(?P<found>.+?) cannot be converted to (?P<required>.+)$"
)

PRIMS = {"int", "long", "short", "byte", "char", "boolean", "float", "double", "void"}


def parse_log(path):
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    out = []
    i = 0
    while i < len(lines):
        m = ERR.match(lines[i])
        if not m:
            i += 1
            continue
        src = lines[i + 1] if i + 1 < len(lines) else ""
        caret = lines[i + 2] if i + 2 < len(lines) else ""
        col = caret.find("^")
        out.append({
            "path": m.group("path"),
            "ln": int(m.group("ln")),
            "found": m.group("found").strip(),
            "required": m.group("required").strip(),
            "src": src,
            "col": col,
        })
        i += 1
    return out


def balanced_span(s, start):
    """Return index just past the balanced expression starting at `start`."""
    depth = 0
    i = start
    n = len(s)
    in_str = None
    while i < n:
        ch = s[i]
        if in_str:
            if ch == "\\":
                i += 2
                continue
            if ch == in_str:
                in_str = None
            i += 1
            continue
        if ch in "\"'":
            in_str = ch
            i += 1
            continue
        if ch in "([{":
            depth += 1
        elif ch in ")]}":
            if depth == 0:
                return i
            depth -= 1
        elif ch in ",;" and depth == 0:
            return i
        i += 1
    return n


def insert_cast(src_line, col, req):
    """Return (new_line, applied) for a single source line."""
    s = src_line
    if col < 0 or col >= len(s):
        return s, False
    # caret points at expression start; skip whitespace
    start = col
    while start < len(s) and s[start] == " ":
        start += 1
    if start >= len(s):
        return s, False
    # STRICT GUARDS -----------------------------------------------------------
    # The cast may only be inserted in front of a *standalone* expression:
    #   * the char at `start` must not be '(' (that is a call/group, whose
    #     caret javac places at the paren, not at the value to cast);
    #   * the char immediately before `start` must be a delimiter/space, never
    #     a '.'-chained receiver or an identifier tail (method name).
    if s[start] == "(":
        return s, False
    j = start - 1
    while j >= 0 and s[j] == " ":
        j -= 1
    if j >= 0 and (s[j] == "." or s[j].isalnum() or s[j] in "_$)]"):
        # e.g. `recv.method` or `arr[i]` / `f(x)` tails — refuse to split.
        return s, False
    # guard: never cast null / true / false / numeric literals via this path
    end = balanced_span(s, start)
    # If a call/grouping paren immediately follows the spanned expression the
    # expression is really a receiver/invocation base — do not cast.
    k = end
    while k < len(s) and s[k] == " ":
        k += 1
    if k < len(s) and s[k] == "(":
        return s, False
    expr = s[start:end]
    stripped = expr.strip()
    if not stripped:
        return s, False
    if stripped in ("null", "true", "false"):
        return s, False
    # skip ternaries / lambdas in the spanned expression
    if "?" in stripped or "->" in stripped:
        return s, False
    # skip if already starts with a cast to the required type
    m = re.match(r"^\(\s*([A-Za-z_$][\w.$]*(?:\[\])*)\s*\)", stripped)
    if m:
        existing = m.group(1)
        if _same_type(existing, req):
            return s, False
    new = s[:start] + f"({req}) " + s[start:]
    return new, True


def _same_type(a: str, b: str) -> bool:
    """Compare two type names ignoring packaging/generics."""
    def norm(t):
        t = re.sub(r"<.*>", "", t).strip().rstrip("[]")  # arrays normalised
        return t.rsplit(".", 1)[-1]
    return norm(a) == norm(b)


def process_file(path, sites):
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    applied = 0
    # apply from bottom to top so columns stay valid
    for site in sorted(sites, key=lambda x: x["ln"], reverse=True):
        ln = site["ln"]
        if ln - 1 >= len(lines):
            continue
        req = site["required"]
        # strip array/generic noise that cannot be a valid cast target
        if req in PRIMS or req.startswith("?"):
            continue
        new, ok = insert_cast(lines[ln - 1], site["col"], req)
        if ok:
            lines[ln - 1] = new
            applied += 1
    if applied:
        open(path, "w", encoding="utf-8").write("\n".join(lines))
    return applied


def main():
    log = sys.argv[1] if len(sys.argv) > 1 else "/tmp/c11.txt"
    sites = parse_log(log)
    per = defaultdict(list)
    for s in sites:
        per[s["path"]].append(s)
    total = 0
    for p, ss in per.items():
        if not os.path.isfile(p):
            continue
        n = process_file(p, ss)
        if n:
            print(f"  +{n:3d}  {p.split('/java/')[-1]}")
            total += n
    print(f"\nTOTAL casts inserted: {total} / {len(sites)} candidate sites")


if __name__ == "__main__":
    main()
