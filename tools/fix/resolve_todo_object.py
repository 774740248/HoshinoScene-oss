#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Resolve jadx "type unresolved, defaulted to Object" placeholders.

jadx emits:
    java.lang.Object obj = new java.lang.Object();
    /* TODO: jadx type unresolved, defaulted to Object */
    ...
    obj.<field> = ...;          // fails: Object has no such field

The true type is recoverable from a subsequent downcast in the same method,
e.g. `foo.b((en0) (obj));` or `return (cm0) (obj);`.  We rewrite the
declaration to the recovered concrete type (and the `new java.lang.Object()`
initializer accordingly), which fixes every member access on that variable at
once.

Conservative: only rewrites when exactly one distinct concrete cast target is
found for the variable within the enclosing method.
"""
import os
import re
import sys
from collections import Counter

ROOT = "app/src/main/java"

TODO = "jadx type unresolved, defaulted to Object"
DECL = re.compile(
    r"^(\s*)java\.lang\.Object\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*=\s*new\s+java\.lang\.Object\(\)\s*;\s*$"
)
DECL_NEW = re.compile(
    r"^(\s*)java\.lang\.Object\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*=\s*new\s+"
    r"([A-Za-z_$][A-Za-z0-9_$.]*)\s*\(([^;]*)\)\s*;\s*$"
)


def method_span(lines, idx):
    """Return (start, end) index range of the method body enclosing line idx."""
    closers = 0
    start = None
    for li in range(idx - 1, -1, -1):
        for ch in reversed(lines[li]):
            if ch == "}":
                closers += 1
            elif ch == "{":
                if closers == 0:
                    start = li
                    break
                closers -= 1
        if start is not None:
            break
    if start is None:
        return 0, len(lines)
    # forward to matching close
    depth = 0
    end = len(lines)
    for li in range(start, len(lines)):
        depth += lines[li].count("{") - lines[li].count("}")
        if depth <= 0 and li > start:
            end = li
            break
    return start, end


def find_cast_type(lines, start, end, var):
    """Find concrete downcast target of `var` within [start,end]."""
    pats = [
        re.compile(r"\(\s*([A-Za-z_$][A-Za-z0-9_$.]*)\s*\)\s*\(\s*" + re.escape(var) + r"\s*\)"),
        re.compile(r"\(\s*([A-Za-z_$][A-Za-z0-9_$.]*)\s*\)\s*" + re.escape(var) + r"\b"),
    ]
    found = Counter()
    for li in range(start, min(end + 1, len(lines))):
        for p in pats:
            for m in p.finditer(lines[li]):
                t = m.group(1)
                if t not in ("java.lang.Object", "Object"):
                    found[t] += 1
    return found


def process_file(path):
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    changed = 0
    i = 0
    while i < len(lines):
        # Pattern 1: `java.lang.Object V = new REAL(args);` -> retype to REAL.
        m2 = DECL_NEW.match(lines[i])
        if m2:
            indent, var, real, args = m2.group(1), m2.group(2), m2.group(3), m2.group(4)
            near = any(TODO in lines[k] for k in range(max(0, i - 3), min(len(lines), i + 4)))
            if near and real != "java.lang.Object":
                lines[i] = f"{indent}{real} {var} = new {real}({args});"
                changed += 1
            i += 1
            continue
        m = DECL.match(lines[i])
        if not m:
            i += 1
            continue
        indent, var = m.group(1), m.group(2)
        # require the jadx TODO marker nearby (within 3 lines before/after)
        near = False
        for k in range(max(0, i - 3), min(len(lines), i + 4)):
            if TODO in lines[k]:
                near = True
                break
        if not near:
            i += 1
            continue
        start, end = method_span(lines, i)
        cand = find_cast_type(lines, start, end, var)
        if len(cand) != 1:
            i += 1
            continue
        typ = next(iter(cand))
        # only accept types that look like class names (not primitives)
        if typ in ("int", "long", "boolean", "float", "double", "byte", "short", "char"):
            i += 1
            continue
        lines[i] = f"{indent}{typ} {var} = new {typ}();"
        changed += 1
        i += 1
    if changed:
        open(path, "w", encoding="utf-8").write("\n".join(lines))
    return changed


def main():
    total = 0
    touched = 0
    for dp, _, fs in os.walk(ROOT):
        for fn in fs:
            if not fn.endswith(".java"):
                continue
            p = os.path.join(dp, fn)
            try:
                txt = open(p, encoding="utf-8", errors="replace").read()
            except OSError:
                continue
            if TODO not in txt:
                continue
            c = process_file(p)
            if c:
                touched += 1
                total += c
                print(f"  +{c}  {p.split('/java/')[-1]}")
    print(f"\nTOTAL Object->concrete: {total} in {touched} files")


if __name__ == "__main__":
    main()
