#!/usr/bin/env python3
"""
Add explicit casts for `A cannot be converted to B` errors (except X->boolean/int
and lossy numeric which need different handling) where a simple cast compiles.

Strategy: parse javac error blocks; for `TARGET cannot be converted to TYPE`,
locate the caret column in the source line and wrap the smallest sub-expression
starting at/around the caret with `(TYPE)`.
"""
import re, sys, collections, os

LOGFILE = sys.argv[1] if len(sys.argv) > 1 else '/tmp/build.log'
SRCROOT = sys.argv[2] if len(sys.argv) > 2 else '/workspace/hoshino-scene-recovered/app/src/main/java'

SKIP_TARGETS = {'int','long','short','byte','float','double','char','boolean'}

def parse(logfile):
    lines = open(logfile, encoding='utf-8', errors='replace').read().split('\n')
    errs = []
    i = 0
    while i < len(lines):
        m = re.match(r'^(\S+\.java):(\d+): error: (.*)$', lines[i])
        if m:
            src = lines[i+1] if i+1 < len(lines) else ''
            caret = lines[i+2] if i+2 < len(lines) else ''
            errs.append((m.group(1), int(m.group(2)), m.group(3), src, caret))
        i += 1
    return errs

def wrap_rhs(src, col, tname):
    """Wrap expression at col with (tname). Returns new line or None."""
    n = len(src)
    if col >= n: return None
    # find start token
    # scan left to skip whitespace
    s = col
    while s < n and src[s] == ' ': s += 1
    # token start
    begin = s
    # handle leading '(' casts / unary
    # find end: read a primary expression: identifier chain, calls, indexing, dots, casts
    i = s
    # simple tokenizer: consume until a top-level delimiter
    depth = 0
    end = s
    while end < n:
        c = src[end]
        if c in '([{': depth += 1
        elif c in ')]}':
            if depth == 0: break
            depth -= 1
        elif c in ',;' and depth == 0:
            break
        elif c == '?' and depth == 0:
            break
        end += 1
    expr = src[begin:end].rstrip()
    if not expr: return None
    # don't double-cast
    if expr.startswith('(' + tname + ')'): return None
    # trim trailing spaces
    trail = src[end:]
    return src[:begin] + f'({tname}) ' + expr + src[begin+len(expr):]

def main():
    errs = parse(LOGFILE)
    # group by file
    byfile = collections.defaultdict(list)
    for f, l, msg, src, caret in errs:
        m = re.match(r'incompatible types: (\S+) cannot be converted to (\S+)', msg)
        if not m: continue
        a, b = m.group(1), m.group(2)
        if a in SKIP_TARGETS or b in SKIP_TARGETS: continue
        if a.startswith('bad'): continue
        byfile[f].append((l, a, b, src, caret))
    files_fixed = 0; total = 0
    for f, items in byfile.items():
        path = f
        if not os.path.exists(path):
            # try relative
            alt = os.path.join(SRCROOT, f.split('/main/java/')[-1]) if '/main/java/' in f else None
            if alt and os.path.exists(alt): path = alt
            else: continue
        lines = open(path, encoding='utf-8').read().split('\n')
        for l, a, b, src, caret in sorted(items, reverse=True):
            if l-1 >= len(lines): continue
            cur = lines[l-1]
            col = caret.find('^')
            if col < 0: continue
            new = wrap_rhs(cur, col, b)
            if new and new != cur:
                lines[l-1] = new; total += 1
        open(path, 'w', encoding='utf-8').write('\n'.join(lines))
        files_fixed += 1
    print(f"cast-wrapped {total} sites in {files_fixed} files")

main()
