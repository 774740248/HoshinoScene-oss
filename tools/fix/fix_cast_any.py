#!/usr/bin/env python3
"""Generalised, verified cast fixer.

For `incompatible types: A cannot be converted to B` where B is a
NON-primitive target type that actually exists in the project (source tree or
`app/libs/*.jar`), wrap the whole RHS expression (`= <expr>` / `return <expr>` /
sole call argument) with `(B)`.

This generalises fix_cast_object2.py which only handled a handful of source
types. To stay SAFE we only cast when the target simple-name is a known class
(so we never inject a bogus type) and we never touch primitive targets. The
caller (cycle driver) verifies the error count strictly decreases before
committing, otherwise the change is reverted.

Usage: python3 fix_cast_any.py <build.log> [--apply] [--srclist file]
"""
import collections
import json
import os
import re
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
SRCROOT = os.path.join(ROOT, "app", "src", "main", "java")
LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/build.log"

PRIM = {"int", "long", "short", "byte", "float", "double", "char", "boolean", "void"}


def known_types():
    """Return the set of simple class names known to the project."""
    names = set()
    for root, _dirs, files in os.walk(SRCROOT):
        for f in files:
            if f.endswith(".java"):
                names.add(f[:-5])
    # add nested names from lib index (simple name of each class)
    idx_path = os.path.join(ROOT, "tools", "fix", "lib_index.json")
    if os.path.exists(idx_path):
        with open(idx_path) as fh:
            idx = json.load(fh)
        for k in idx:
            names.add(k.split(".")[-1])
    # plus common android/jdk classes seen in errors
    names |= {"View", "String", "ArrayList", "List", "LayoutParams", "Property",
              "DrawerListener", "CharSequence", "Runnable", "Callback"}
    return names


def load_errs(path):
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    out = []
    for i in range(len(lines)):
        m = re.match(
            r"^(\S+\.java):(\d+): error: incompatible types: (\S+) cannot be converted to (\S+)$",
            lines[i])
        if m:
            out.append((m.group(1), int(m.group(2)), m.group(3), m.group(4)))
    return out


def assign_index(line):
    depth = 0
    last = -1
    i = 0
    while i < len(line):
        c = line[i]
        if c in "([{":
            depth += 1
        elif c in ")]}":
            depth -= 1
        elif c == "=" and depth == 0:
            prev = line[i - 1] if i else ""
            nxt = line[i + 1] if i + 1 < len(line) else ""
            if prev not in "=!<>" and nxt != "=":
                last = i
        i += 1
    return last


def expr_end(line, start):
    n = len(line)
    s = start
    while s < n and line[s] == " ":
        s += 1
    depth = 0
    i = s
    while i < n:
        c = line[i]
        if c in "([{":
            depth += 1
        elif c in ")]}":
            if depth == 0:
                return i
            depth -= 1
        elif c == ";" and depth == 0:
            return i
        i += 1
    return n


def rhs_span(line):
    m = re.search(r"\breturn\s+", line)
    if m and "=" not in line[:m.start()]:
        return (m.end(), expr_end(line, m.end()))
    idx = assign_index(line)
    if idx >= 0:
        return (idx + 1, expr_end(line, idx + 1))
    return None


def main():
    apply = "--apply" in sys.argv
    known = known_types()
    byfile = collections.defaultdict(list)
    for f, l, a, b in load_errs(LOG):
        if b in PRIM:
            continue
        simple = b.split(".")[-1].split("<")[0]
        if simple not in known:
            continue
        byfile[f].append((l, b))
    total = 0
    for f, items in byfile.items():
        if not os.path.exists(f):
            continue
        lines = open(f, encoding="utf-8").read().split("\n")
        for l, b in sorted(set(items), reverse=True):
            if l - 1 >= len(lines):
                continue
            cur = lines[l - 1]
            tgt = b.split(".")[-1].split("<")[0]
            span = rhs_span(cur)
            if span is None:
                continue
            s, e = span
            while s < e and cur[s] == " ":
                s += 1
            expr = cur[s:e].rstrip()
            if not expr:
                continue
            if expr.startswith("(" + tgt + ")"):
                continue
            new = cur[:s] + f"({tgt}) " + expr + cur[e:]
            if new != cur:
                lines[l - 1] = new
                total += 1
        if apply:
            open(f, "w", encoding="utf-8").write("\n".join(lines))
    print(f"cast-any applied {total} sites in {len(byfile)} files "
          f"({'APPLIED' if apply else 'dry-run'})")


if __name__ == "__main__":
    main()
