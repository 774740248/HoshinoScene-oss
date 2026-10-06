#!/usr/bin/env python3
"""
Resolve jadx register-leak identifiers (`r0`..`r15`) in Java by tracing the
matching register in the ground-truth smali.

Approach:
  1. Parse javac errors for `cannot find symbol` of kind `variable rN`
     (also `rN` used as a receiver/method owner).
  2. For each (file,line), find the enclosing Java method by scanning upward
     for a method signature.
  3. Match the smali method by class + method name + arity.
  4. Trace register vN (jadx `rN` == smali local register vN, since .locals
     registers are the only ones jadx names rN) backwards to its most recent
     meaningful definition:
       - iget-object vN, pM, Lcls;->field  -> this.<owner.field>   (or field name)
       - iget vN, pM, Lcls;->field
       - move-object vN, vM                -> recurse on vM
       - const / const-string              -> literal (skip)
       - new-instance vN, Lcls            -> (skip; object creation)
       - check-cast vN, Lcls               -> type hint only
  5. Emit replacement text for the Java `rN` token.

If the recovered expression references `this.<field>` and the Java line already
casts to a type, we simply substitute the identifier.
"""
import re, sys, os, collections, json

LOGFILE = sys.argv[1] if len(sys.argv) > 1 else '/tmp/build.log'
SRCROOT = sys.argv[2] if len(sys.argv) > 2 else '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = sys.argv[3] if len(sys.argv) > 3 else '/tmp/build-src/smali'


def parse_leaks(logfile):
    """Return list of (javafile, line, regname)."""
    lines = open(logfile, encoding='utf-8', errors='replace').read().split('\n')
    out = []
    i = 0
    while i < len(lines):
        m = re.match(r'^(\S+\.java):(\d+): error: cannot find symbol$', lines[i])
        if m:
            block = '\n'.join(lines[i+1:i+6])
            sm = re.search(r'symbol:\s+variable\s+(r\d+)\b', block)
            if sm:
                out.append((m.group(1), int(m.group(2)), sm.group(1)))
            i += 5
        elif re.match(r'^(\S+\.java):(\d+): error:', lines[i]):
            i += 3
        else:
            i += 1
    # Also catch rN used as receiver: "cannot find symbol ... variable rN" appears
    # the same way, so covered. Additionally catch 'method X() location: class rN'
    i = 0
    while i < len(lines):
        m = re.match(r'^(\S+\.java):(\d+): error: cannot find symbol$', lines[i])
        if m:
            block = '\n'.join(lines[i+1:i+6])
            sm = re.search(r'symbol:\s+method\s+\S+\s*\n\s*location:\s+class\s+(r\d+)', block)
            if sm:
                out.append((m.group(1), int(m.group(2)), sm.group(1)))
            i += 5
        elif re.match(r'^(\S+\.java):(\d+): error:', lines[i]):
            i += 3
        else:
            i += 1
    return out


def enclosing_method(lines, lineno):
    """Scan upward from lineno (1-based) for a method signature line; return the
    method name or None."""
    KEYWORDS = {
        'if', 'for', 'while', 'switch', 'catch', 'synchronized', 'do', 'else',
        'try', 'return', 'new', 'throw', 'case', 'default', 'super', 'this',
        'assert', 'break', 'continue',
    }
    sig_re = re.compile(
        r'^\s*(?:(?:public|private|protected|static|final|synchronized|native|abstract|transient)\s+)*'
        r'(?:[\w\.\<\>\[\]\?]+\s+)+([A-Za-z_$][\w$]*)\s*\([^;{}]*\)\s*\{?\s*$')
    for i in range(lineno-1, max(-1, lineno-120), -1):
        if i-1 >= len(lines):
            continue
        line = lines[i-1]
        if '(' not in line or ')' not in line:
            continue
        m = sig_re.match(line)
        if not m:
            continue
        name = m.group(1)
        if name in KEYWORDS:
            continue
        # a declaration/assignment line like `Type name = foo(...)` ends with ';'
        if line.rstrip().endswith(';'):
            continue
        return name, line.strip()
    return None, ''


def load_smali_methods(classname):
    # classname may be 'gz0' (top-level in package a) or 'a/gz0' or nested.
    candidates = [
        os.path.join(SMALIROOT, classname + '.smali'),
        os.path.join(SMALIROOT, 'a', classname + '.smali'),
    ]
    path = next((p for p in candidates if os.path.exists(p)), None)
    if path is None:
        return None
    txt = open(path, encoding='utf-8', errors='replace').read().split('\n')
    methods = []
    cur = None
    depth = None
    for line in txt:
        ms = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)$', line)
        if ms:
            cur = {'body': [], 'name': ms.group(2), 'params': ms.group(3)}
            methods.append(cur)
            continue
        if line.strip() == '.end method':
            cur = None
            continue
        if cur is not None:
            loc = re.match(r'^\s*\.locals\s+(\d+)', line)
            if loc:
                cur['locals'] = int(loc.group(1))
            cur['body'].append(line)
    return methods


def trace_register(method, reg, this_class, _seen=None):
    """Trace local register 'vN' -> expression string, or None.
    Only handles common single-def cases."""
    if _seen is None:
        _seen = set()
    if reg in _seen:
        return None
    _seen.add(reg)
    body = method['body']
    target = 'v' + reg[1:]
    # find last definition before first unqualified use is complex; instead take
    # the FIRST definition of target in the body (jadx alias usually defined once).
    defs = []
    for line in body:
        s = line.strip()
        m = re.match(r'^(iget-object|iget|move-object|move-result-object|move-result|new-instance|sget-object|sget)\s+(' + target + r')\b(.*)$', s)
        if m:
            defs.append((m.group(1), m.group(3).strip()))
    # prefer iget-object/iget/new-instance/move-result-object/sget
    for op, rest in defs:
        if op in ('iget-object', 'iget'):
            fm = re.match(r',\s*(p\d+|v\d+),\s*L([^;]+);->(\S+):', rest)
            if fm:
                recv = fm.group(1)
                cls = fm.group(2).replace('/', '.')
                fld = fm.group(3)
                # receiver == p0 means this; if receiver is a local register we
                # cannot name, fall back to a bare local field access only when
                # the owner is this class.
                if recv == 'p0' or cls == this_class.replace('.', '/'):
                    return 'this.' + fld
                if recv.startswith('p'):
                    return fld
                # receiver is an unnamed local: give up on this def, try next
                continue
        if op == 'sget-object' or op == 'sget':
            fm = re.match(r',\s*L([^;]+);->(\S+):', rest)
            if fm:
                return fm.group(1).replace('/', '.') + '.' + fm.group(2)
    # handle move-object alias: move-object vX, vY -> trace vY
    for line in body:
        s = line.strip()
        mm = re.match(r'^move-object\s+(' + target + r'),\s*(p\d+|v\d+)$', s)
        if mm and not mm.group(2).startswith('p'):
            # avoid infinite recursion into self
            if mm.group(2) != target:
                r = trace_register(method, mm.group(2), this_class, _seen)
                if r:
                    return r
    return None


def main():
    leaks = parse_leaks(LOGFILE)
    byfile = collections.defaultdict(lambda: collections.defaultdict(list))
    for f, l, reg in leaks:
        byfile[f][l].append(reg)

    total = 0
    for f, linemap in byfile.items():
        if not os.path.exists(f):
            continue
        src_lines = open(f, encoding='utf-8').read().split('\n')
        cls = os.path.basename(f)[:-5]
        smethods = load_smali_methods(cls)
        if smethods is None:
            continue
        # group by enclosing method
        changed = False
        for l in sorted(linemap, reverse=True):
            regs = linemap[l]
            mname, sig = enclosing_method(src_lines, l)
            if mname is None:
                continue
            # find smali method by name
            cand = [m for m in smethods if m['name'] == mname]
            if not cand:
                continue
            sm = cand[0]
            line_txt = src_lines[l-1]
            new_txt = line_txt
            for reg in set(regs):
                rep = trace_register(sm, reg, cls)
                if not rep:
                    continue
                new_txt = re.sub(r'(?<![.\w])' + reg + r'(?![\w])', rep, new_txt)
            if new_txt != line_txt:
                src_lines[l-1] = new_txt
                total += 1
                changed = True
        if changed:
            open(f, 'w', encoding='utf-8').write('\n'.join(src_lines))
    print(f"register-leak: substituted {total} lines")


main()
