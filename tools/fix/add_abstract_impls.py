#!/usr/bin/env python3
"""
Fix `<Class> is not abstract and does not override abstract method <sig> in <Base>`
by appending a stub implementation to <Class>.

The stub keeps the class concrete and compiling; jadx itself emits this exact
pattern for methods it could not decompile:
    throw new UnsupportedOperationException("Method not decompiled: ...");

We derive the Java signature from the smali abstract method in the base class
(return type + name + params).
"""
import re, os, sys, glob

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
APPLY = '--apply' in sys.argv
LOG = next((a for a in sys.argv[1:] if a.endswith('.log')), '/tmp/build.log')


def _path(cls):
    for c in (cls + '.smali', 'a/' + cls + '.smali'):
        p = os.path.join(SMALIROOT, c)
        if os.path.exists(p):
            return p
    return None


def smali_methods(cls):
    p = _path(cls)
    out = {}
    if not p:
        return out
    cur = None
    sig = None
    for line in open(p, encoding='utf-8', errors='replace'):
        ms = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if ms:
            cur = ms.group(2)
            sig = (ms.group(3), ms.group(4), 'abstract' in ms.group(1))
            out[(cur, ms.group(3), ms.group(4))] = sig
        elif line.strip() == '.end method':
            cur = None
    return out


DESC_PRIM = {'I': 'int', 'J': 'long', 'F': 'float', 'D': 'double',
             'Z': 'boolean', 'B': 'byte', 'S': 'short', 'C': 'char', 'V': 'void'}


def desc_to_java(desc):
    if desc in DESC_PRIM:
        return DESC_PRIM[desc]
    if desc.startswith('['):
        return desc_to_java(desc[1:]) + '[]'
    if desc.startswith('L') and desc.endswith(';'):
        return desc[1:-1].replace('/', '.')
    return 'java.lang.Object'


def split_params(params):
    res = []
    i = 0
    while i < len(params):
        c = params[i]
        if c in DESC_PRIM:
            res.append(DESC_PRIM[c]); i += 1
        elif c == '[':
            j = i
            while params[j] == '[':
                j += 1
            if params[j] == 'L':
                k = params.index(';', j)
            else:
                k = j
            res.append(desc_to_java(params[i:k+1])); i = k + 1
        elif c == 'L':
            k = params.index(';', i)
            res.append(desc_to_java(params[i:k+1])); i = k + 1
        else:
            i += 1
    return res


def parse_sig_from_error(msg):
    # msg like: "does not override abstract method o() in jq"
    m = re.search(r'abstract method (.+) in (\S+)$', msg)
    if not m:
        return None
    sigtxt, base = m.group(1), m.group(2)
    return sigtxt, base


def main():
    lines = open(LOG, encoding='utf-8', errors='replace').read().split('\n')
    errs = []
    for l in lines:
        m = re.match(r'^(\S+\.java):(\d+): error: (\S+) is not abstract and does not override abstract method (.+) in (\S+)$', l)
        if m:
            errs.append((m.group(1), m.group(3), m.group(4), m.group(5)))
    errs = sorted(set(errs))
    print(f"not_abstract errors: {len(errs)}")
    byfile = {}
    for f, cls, sigtxt, base in errs:
        byfile.setdefault(f, []).append((cls, sigtxt, base))

    total = 0
    for f, items in byfile.items():
        if not os.path.exists(f):
            continue
        cls_this = os.path.basename(f)[:-5]
        src = open(f, encoding='utf-8').read()
        add = []
        existing = set(re.findall(r'([\w<>]+)\s*\(', src))
        for cls, sigtxt, base in items:
            # sigtxt like "o()" or "q(q,p,p)" or "n(View,int)"
            mm = re.match(r'([\w$<>]+)\((.*)\)', sigtxt)
            if not mm:
                continue
            mname = mm.group(1)
            ptypes_text = mm.group(2)
            ptypes = [p.strip() for p in ptypes_text.split(',') if p.strip()]
            ret = 'void'
            # find smali method for return type
            bmethods = smali_methods(base)
            found = None
            for (n, params, desc), val in bmethods.items():
                if n == mname:
                    jparams = split_params(params)
                    if len(jparams) == len(ptypes):
                        found = (jparams, desc)
                        break
            if found:
                jparams, rdesc = found
                ret = desc_to_java(rdesc)
                sig = f"public {ret} {mname}(" + ', '.join(f"{t} p{i}" for i, t in enumerate(jparams)) + ')'
            else:
                sig = f"public void {mname}(" + ', '.join(f"{t} p{i}" for i, t in enumerate(ptypes)) + ')'
            stub = (f"    {sig} {{\n"
                    f"        throw new UnsupportedOperationException(\"Method not decompiled: {cls_this}.{mname}\");\n"
                    f"    }}\n")
            add.append(stub)
            total += 1
        if add:
            # insert before final closing brace
            idx = src.rstrip().rfind('}')
            newsrc = src[:idx] + '\n'.join(add) + src[idx:]
            if APPLY:
                open(f, 'w', encoding='utf-8').write(newsrc)
    print(f"{'APPLIED' if APPLY else 'DRY'}: {total} stubs")


main()
