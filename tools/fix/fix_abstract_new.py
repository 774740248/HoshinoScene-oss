#!/usr/bin/env python3
"""
Fix `<Abstract> is abstract; cannot be instantiated` by replacing
`new a.Abstract(...)` with the concrete class actually instantiated in the
ground-truth smali.

Strategy: at the error site, find the enclosing Java method; find the matching
smali method; locate `new-instance vX, La/Concrete;` occurrences immediately
followed (within a few instructions) by `invoke-direct {..}, La/Concrete;-><init>`
where Concrete is a subclass of Abstract (verify via smali `.super`). Choose the
one whose <init> descriptor best matches the Java argument count.
Fallback: if the Java LHS declared type is a concrete subclass of Abstract, use it.
"""
import re, os, sys, glob, collections

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
APPLY = '--apply' in sys.argv
LOG = next((a for a in sys.argv[1:] if a.endswith('.log')), '/tmp/build_r9.log')

SUPER_CACHE = {}


def _smali_path(cls_internal):
    p = os.path.join(SMALIROOT, cls_internal + '.smali')
    if os.path.exists(p):
        return p
    p = os.path.join(SMALIROOT, 'a', cls_internal + '.smali')
    return p if os.path.exists(p) else None


def super_of(cls_internal):
    if cls_internal in SUPER_CACHE:
        return SUPER_CACHE[cls_internal]
    p = _smali_path(cls_internal)
    res = None
    if p:
        for line in open(p, encoding='utf-8', errors='replace'):
            m = re.match(r'^\.super L([^;]+);', line)
            if m:
                res = m.group(1)
                break
    SUPER_CACHE[cls_internal] = res
    return res


def is_subclass_of(cls_internal, target_internal, depth=0):
    if depth > 12:
        return False
    if cls_internal == target_internal:
        return True
    s = super_of(cls_internal)
    if not s:
        return False
    return is_subclass_of(s, target_internal, depth + 1)


def is_abstract(cls_internal):
    p = _smali_path(cls_internal)
    if not p:
        return False
    for line in open(p, encoding='utf-8', errors='replace'):
        m = re.match(r'^\.class (.*)', line)
        if m:
            return 'abstract' in m.group(1)
    return False


def enclosing_method(lines, lineno):
    KEYWORDS = {'if', 'for', 'while', 'switch', 'catch', 'synchronized', 'do',
                'else', 'try', 'return', 'new', 'throw', 'case', 'default'}
    sig_re = re.compile(
        r'^\s*(?:(?:public|private|protected|static|final|synchronized|native|abstract|transient)\s+)*'
        r'(?:[\w\.\<\>\[\]\?]+\s+)+([A-Za-z_$][\w$]*)\s*\([^;{}]*\)\s*\{?\s*$')
    for i in range(lineno-1, max(-1, lineno-120), -1):
        if i-1 >= len(lines):
            continue
        line = lines[i-1]
        if '(' not in line or ')' not in line or line.rstrip().endswith(';'):
            continue
        m = sig_re.match(line)
        if m and m.group(1) not in KEYWORDS:
            return m.group(1)
    return None


def load_smali_methods(cls_internal):
    p = os.path.join(SMALIROOT, cls_internal + '.smali')
    if not os.path.exists(p):
        p = os.path.join(SMALIROOT, 'a', cls_internal + '.smali')
    if not os.path.exists(p):
        return []
    txt = open(p, encoding='utf-8', errors='replace').read().split('\n')
    methods = []
    cur = None
    for line in txt:
        ms = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if ms:
            cur = {'name': ms.group(2), 'body': []}
            methods.append(cur)
            continue
        if line.strip() == '.end method':
            cur = None
            continue
        if cur is not None:
            cur['body'].append(line)
    return methods


def find_anon_subclass(method, abstract_internal, argcount):
    """Return concrete subclass internal name whose <init> is invoked with the
    closest arg count, or None."""
    body = method['body']
    best = None
    bestdiff = 99
    for idx, line in enumerate(body):
        m = re.match(r'^\s*new-instance\s+(v\d+),\s*L([^;]+);', line)
        if not m:
            continue
        reg = m.group(1)
        cand = m.group(2)
        if not is_subclass_of(cand, abstract_internal) and cand != abstract_internal:
            continue
        # find the init invocation involving register `reg` within next ~12 lines
        for j in range(idx + 1, min(idx + 12, len(body))):
            mm = re.match(r'^\s*invoke-direct\s+\{([^}]*)\},\s*L[^;]+;-><init>\((.*)\)(\S+)\s*$', body[j])
            if mm:
                regs = [r.strip() for r in mm.group(1).split(',') if r.strip()]
                if reg not in regs:
                    continue
                pc = len(regs) - 1  # minus receiver
                diff = abs(pc - argcount)
                if diff < bestdiff:
                    bestdiff = diff
                    best = cand
                break
    return best


def main():
    lines = open(LOG, encoding='utf-8', errors='replace').read().split('\n')
    errs = []
    for i in range(len(lines)):
        m = re.match(r'^(\S+\.java):(\d+): error: (\S+) is abstract; cannot be instantiated$', lines[i])
        if m:
            errs.append((m.group(1), int(m.group(2)), m.group(3)))
    # dedupe
    errs = sorted(set(errs))
    print(f"abstract-instantiation errors: {len(errs)}")
    byfile = collections.defaultdict(list)
    for f, l, cls in errs:
        byfile[f].append((l, cls))

    total = 0
    samples = []
    for f, items in byfile.items():
        if not os.path.exists(f):
            continue
        src = open(f, encoding='utf-8').read().split('\n')
        cls_this = os.path.basename(f)[:-5]
        smethods = load_smali_methods(cls_this)
        mod = False
        for l, absname in sorted(items, reverse=True):
            line = src[l-1]
            # the instantiated abstract type is stated in the error (short name);
            # find `new <qualified-or-short>` on the line
            mm = re.search(r'new\s+([A-Za-z_$][\w$\.]*)\(([^()]*)\)', line)
            if not mm:
                continue
            ctor = mm.group(1)
            args = [a for a in mm.group(2).split(',') if a.strip()]
            argcount = len(args)
            # internal name
            if '.' in ctor:
                cand_internal = ctor.replace('.', '/')
            else:
                cand_internal = 'a/' + ctor if absname == ctor else ctor
            mname = enclosing_method(src, l)
            if not mname:
                continue
            sm_name = '<init>' if mname == cls_this else mname
            sm = next((x for x in smethods if x['name'] == sm_name), None)
            if sm is None:
                continue
            sub = find_anon_subclass(sm, cand_internal, argcount)
            repl = None
            if sub:
                # convert internal to dotted java form
                dotted = sub.replace('/', '.')
                repl = 'new ' + dotted + '(' + mm.group(2) + ')'
            if repl:
                newline = line[:mm.start()] + repl + line[mm.end():]
                if newline != line:
                    src[l-1] = newline
                    mod = True
                    total += 1
                    if len(samples) < 40:
                        samples.append(f"{os.path.basename(f)}:{l} new {ctor} -> {sub}")
        if mod and APPLY:
            open(f, 'w', encoding='utf-8').write('\n'.join(src))
    print(f"{'APPLIED' if APPLY else 'DRY'}: {total} replacements")
    for s in samples:
        print("  ", s)


main()
