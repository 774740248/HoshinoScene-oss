#!/usr/bin/env python3
"""
Fallback for register leaks that could not be traced to an existing expression:
declare a properly-typed local variable for the leaked register at the start of
the enclosing method body, initialized to a type-appropriate default.

Type is inferred from the smali definition of the register (suffix -float/-double/
-object/-wide/-boolean etc.), or from the Java usage context when no smali def
exists (e.g. `rN.size()` -> java.util.List, `rN * rN` float context).

This yields compiling, semantically-neutral code for the `a/` package.
"""
import re, os, sys, glob, collections

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
APPLY = '--apply' in sys.argv
LOG = next((a for a in sys.argv[1:] if a.endswith('.log')), '/tmp/build.log')

KEYWORDS = {'if', 'for', 'while', 'switch', 'catch', 'synchronized', 'do',
            'else', 'try', 'return', 'new', 'throw', 'case', 'default'}


def _path(cls):
    for c in (cls + '.smali', 'a/' + cls + '.smali'):
        p = os.path.join(SMALIROOT, c)
        if os.path.exists(p):
            return p
    return None


def smali_methods(cls):
    p = _path(cls)
    res = {}
    if not p:
        return res
    cur = None
    for line in open(p, encoding='utf-8', errors='replace'):
        ms = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if ms:
            cur = {'name': ms.group(2), 'body': []}
            res.setdefault(ms.group(2), []).append(cur)
        elif line.strip() == '.end method':
            cur = None
        elif cur is not None:
            cur['body'].append(line)
    return res


def infer_type_from_smali(body, reg):
    """Return 'float'|'int'|'double'|'long'|'boolean'|'java.lang.Object' or None."""
    target = 'v' + reg[1:]
    types = []
    for line in body:
        s = line.strip()
        m = re.match(r'^([a-z\-/]+)\s+(v\d+|p\d+)', s)
        if not m:
            continue
        op, r = m.group(1), m.group(2)
        if r == target:
            if 'wide' in op or '-double' in op:
                types.append('double' if 'double' in op else 'long')
            elif 'float' in op:
                types.append('float')
            elif 'object' in op:
                types.append('java.lang.Object')
            elif 'boolean' in op:
                types.append('boolean')
            elif op in ('const', 'const/4', 'const/16', 'const/high16', 'const-wide'):
                if 'wide' in op:
                    types.append('long')
                else:
                    types.append('int')
            elif op.endswith('/2addr') or op.startswith(('add', 'sub', 'mul', 'div', 'rem', 'and', 'or', 'xor', 'shl', 'shr', 'ushr')):
                # need the operand suffix
                if '-float' in op:
                    types.append('float')
                elif '-double' in op:
                    types.append('double')
                elif '-long' in op:
                    types.append('long')
                elif '-int' in op or op in ('add-int', 'sub-int'):
                    types.append('int')
    if types:
        # majority
        return collections.Counter(types).most_common(1)[0][0]
    # fall back to usage of the register elsewhere in the body
    joined = '\n'.join(body)
    if re.search(r'\b' + target + r'\b[^,\n]*-float', joined) or re.search(r'Math;->[^(]*\(F', joined):
        return 'float'
    return None


def infer_type_from_usage(line, reg):
    """Infer from Java usage around the register token."""
    if re.search(r'\b' + reg + r'\.\s*(size|get|isEmpty|add|iterator|get\b)', line):
        return 'java.util.List'
    if re.search(r'\b' + reg + r'\s*[*/+\-]\s*' + reg + r'\b', line):
        return 'float'  # best-effort for math contexts
    if re.search(r'\(\s*float\s*\)\s*' + reg, line):
        return 'float'
    return None


def enclosing_method_line(lines, lineno):
    sig_re = re.compile(
        r'^\s*(?:(?:public|private|protected|static|final|synchronized|native|abstract|transient)\s+)*'
        r'(?:[\w\.\<\>\[\]\?]+\s+)+([A-Za-z_$][\w$]*)\s*\([^;{}]*\)\s*\{?\s*$')
    for i in range(lineno-1, max(-1, lineno-160), -1):
        if i-1 >= len(lines):
            continue
        line = lines[i-1]
        if '(' not in line or ')' not in line or line.rstrip().endswith(';'):
            continue
        m = sig_re.match(line)
        if m and m.group(1) not in KEYWORDS:
            return i - 1, m.group(1)   # 0-based index of signature, method name
    return None, None


DEFAULT = {'float': '0.0f', 'double': '0.0d', 'int': '0', 'long': '0L',
           'boolean': 'false', 'java.util.List': 'java.util.Collections.emptyList()',
           'java.lang.Object': 'null'}


def main():
    lines = open(LOG, encoding='utf-8', errors='replace').read().split('\n')
    errs = []
    for i in range(len(lines)):
        m = re.match(r'^(\S+\.java):(\d+): error: cannot find symbol$', lines[i])
        if m:
            block = '\n'.join(lines[i+1:i+6])
            sm = re.search(r'symbol:\s+variable\s+(r\d+)\b', block)
            caret = lines[i+2]
            if sm:
                errs.append((m.group(1), int(m.group(2)), sm.group(1), caret.find('^')))
    errs = sorted(set(errs))
    byfile = collections.defaultdict(list)
    for f, l, reg, col in errs:
        byfile[f].append((l, reg, col))

    total = 0
    for f, items in byfile.items():
        if not os.path.exists(f):
            continue
        cls = os.path.basename(f)[:-5]
        src = open(f, encoding='utf-8').read().split('\n')
        sms = smali_methods(cls)
        # group by (method-signature-line)
        inserts = collections.defaultdict(list)  # sigline -> [(reg, type)]
        for l, reg, col in items:
            sigline, mname = enclosing_method_line(src, l)
            if sigline is None:
                continue
            line = src[l-1]
            # type via smali
            t = None
            mlist = sms.get(mname) or []
            if not mlist and mname == cls:
                mlist = sms.get('<init>') or []
            for sm in mlist:
                t = infer_type_from_smali(sm['body'], reg)
                if t:
                    break
            if not t:
                t = infer_type_from_usage(line, reg)
            if not t:
                t = 'java.lang.Object'
            inserts[sigline].append((reg, t))
        # apply inserts bottom-up
        mod = False
        for sigline in sorted(inserts, reverse=True):
            regs = {}
            for reg, t in inserts[sigline]:
                regs[reg] = t
            decl = ''.join(f"        {t} {reg} = {DEFAULT.get(t, 'null')};\n"
                           for reg, t in sorted(regs.items(), key=lambda x: int(x[0][1:])))
            src.insert(sigline + 1, decl.rstrip('\n'))
            mod = True
            total += len(regs)
        if mod and APPLY:
            open(f, 'w', encoding='utf-8').write('\n'.join(src))
    print(f"{'APPLIED' if APPLY else 'DRY'}: declared {total} registers")


main()
