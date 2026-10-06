#!/usr/bin/env python3
"""
Safe cast fixer for `Object cannot be converted to X` (and similar where the
source type is a supertype like Object/Number/Throwable and X is a concrete
class). Cast the ENTIRE RHS expression (or return value / sole-arg) with (X).

Only touches lines where the error source type is one of CASTABLE_FROM and the
target X looks like a real class (not a primitive).
"""
import re, sys, collections, os

LOGFILE = sys.argv[1] if len(sys.argv) > 1 else '/tmp/build.log'
SRCROOT = sys.argv[2] if len(sys.argv) > 2 else '/workspace/hoshino-scene-recovered/app/src/main/java'

CASTABLE_FROM = {'Object', 'Number', 'Throwable', 'Exception', 'Comparable'}
SKIP_TARGET = {'int','long','short','byte','float','double','char','boolean','void'}


def load_errs(logfile):
    lines = open(logfile, encoding='utf-8', errors='replace').read().split('\n')
    errs = []
    for i in range(len(lines)):
        m = re.match(r'^(\S+\.java):(\d+): error: incompatible types: (\S+) cannot be converted to (\S+)$', lines[i])
        if m:
            caret = lines[i+2] if i + 2 < len(lines) else ''
            errs.append((m.group(1), int(m.group(2)), m.group(3), m.group(4), caret))
    return errs


def find_rhs_span(line):
    """Return (start, end) of the expression on the RHS of '=' or after 'return',
    else None. end is exclusive; excludes trailing ';'."""
    # return <expr>
    m = re.search(r'\breturn\s+', line)
    if m and '=' not in line[:m.start()]:
        return (m.end(), _expr_end(line, m.end()))
    # assignment: find last top-level '=' not part of == != <= >=
    idx = _assign_index(line)
    if idx >= 0:
        return (idx + 1, _expr_end(line, idx + 1))
    return None


def _assign_index(line):
    depth = 0
    last = -1
    i = 0
    while i < len(line):
        c = line[i]
        if c in '([{':
            depth += 1
        elif c in ')]}':
            depth -= 1
        elif c == '=' and depth == 0:
            prev = line[i-1] if i > 0 else ''
            nxt = line[i+1] if i+1 < len(line) else ''
            if prev not in '=!<>' and nxt != '=':
                last = i
        i += 1
    return last


def _expr_end(line, start):
    """Given start index of expression, return end index (exclusive)."""
    n = len(line)
    s = start
    while s < n and line[s] == ' ':
        s += 1
    depth = 0
    i = s
    while i < n:
        c = line[i]
        if c in '([{':
            depth += 1
        elif c in ')]}':
            if depth == 0:
                # closing the enclosing statement
                return i
            depth -= 1
            if depth == 0:
                # could still continue (.foo() chained) - keep going until ';' or ','
                pass
        elif c == ';' and depth == 0:
            return i
        i += 1
    return n


def main():
    errs = load_errs(LOGFILE)
    byfile = collections.defaultdict(list)
    for f, l, a, b, caret in errs:
        if a not in CASTABLE_FROM:
            continue
        if b in SKIP_TARGET or b.startswith('void'):
            continue
        byfile[f].append((l, a, b, caret))

    total = 0
    files = 0
    for f, items in byfile.items():
        path = f
        if not os.path.exists(path):
            continue
        lines = open(path, encoding='utf-8').read().split('\n')
        for l, a, b, caret in sorted(set((l, a, b, caret) for l, a, b, caret in items), reverse=True):
            if l - 1 >= len(lines):
                continue
            cur = lines[l-1]
            # strip simple fully-qualified target for cast
            tgt = b.split('.')[-1]
            span = find_rhs_span(cur)
            if span is None:
                continue
            s, e = span
            # skip whitespace at start
            while s < e and cur[s] == ' ':
                s += 1
            expr = cur[s:e].rstrip()
            if not expr:
                continue
            if expr.startswith('(' + tgt + ')') or expr.startswith('(' + b + ')'):
                continue
            new = cur[:s] + f'({tgt}) ' + expr + cur[e:]
            if new != cur:
                lines[l-1] = new
                total += 1
        open(path, 'w', encoding='utf-8').write('\n'.join(lines))
        files += 1
    print(f"cast-fix applied {total} sites in {files} files")


main()
