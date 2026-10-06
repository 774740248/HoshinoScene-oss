#!/usr/bin/env python3
"""Replace jadx `??` type placeholders in generated library sources.

Strategy per line containing a standalone `??`:
  1. If RHS is `new <Type>(...)` -> use <Type>
  2. Else if previous line is `/* JADX WARN: Type inference ... types: [...] */`
     -> use first type in the list
  3. Else default `Object`
Handles `?? name = expr;`, `?? name;`, `?? name = expr` (multiline decl).
"""
import os, re, sys

ROOTS = sys.argv[1:] or ["app/src/main/javaLib"]

def first_warn_type(lines, idx):
    # look back up to 3 lines for JADX WARN types list
    for k in range(idx-1, max(-1, idx-4), -1):
        m = re.search(r'types:\s*\[([^\]]*)\]', lines[k])
        if m:
            ts = [t.strip() for t in m.group(1).split(',') if t.strip()]
            if ts:
                return ts[0]
    return None

def strip_pkg(t):
    # keep simple/short: if last component, use as-is if it ends with a class-like name
    return t

DECL = re.compile(r'^(\s*)\?\?(\s+)([A-Za-z_$][\w$]*)(\s*=\s*)(.*)$')
DECL_ONLY = re.compile(r'^(\s*)\?\?(\s+)([A-Za-z_$][\w$]*)(\s*;.*)$')
NEWTYPE = re.compile(r'new\s+([A-Za-z_$][\w$.]*(?:\.[A-Za-z_$][\w$]*)*)\s*\(')

def pick_type(rhs, lines, i):
    m = NEWTYPE.search(rhs)
    if m:
        return m.group(1)
    # cast on rhs like (Foo) ...
    m = re.match(r'\s*\(\s*([A-Za-z_$][\w$.]*)\s*\)', rhs)
    if m:
        return m.group(1)
    wt = first_warn_type(lines, i)
    if wt:
        return wt
    return "java.lang.Object"

def fix_file(path):
    src = open(path, encoding='utf-8').read()
    if '??' not in src:
        return 0
    lines = src.split('\n')
    n = 0
    for i, ln in enumerate(lines):
        m = DECL.match(ln)
        if m:
            indent, sp, name, eq, rhs = m.groups()
            t = pick_type(rhs, lines, i)
            lines[i] = f"{indent}{t}{sp}{name}{eq}{rhs}"
            n += 1
            continue
        m2 = DECL_ONLY.match(ln)
        if m2:
            indent, sp, name, tail = m2.groups()
            t = first_warn_type(lines, i) or "java.lang.Object"
            lines[i] = f"{indent}{t}{sp}{name}{tail}"
            n += 1
            continue
    if n:
        open(path, 'w', encoding='utf-8').write('\n'.join(lines))
    return n

def main():
    total = 0; files = 0
    for root in ROOTS:
        for dp, _, fns in os.walk(root):
            for fn in fns:
                if fn.endswith('.java'):
                    c = fix_file(os.path.join(dp, fn))
                    if c: files += 1; total += c
    print(f"fixed {total} ?? placeholder lines in {files} files")

main()
