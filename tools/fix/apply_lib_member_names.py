#!/usr/bin/env python3
"""
Apply obfuscated->real library member renames using the prebuilt lib_index.json
and the smali ground truth.

Safe application modes:
  (A) fully-qualified static refs:      pkg.Class.short   -> pkg.Class.real
  (B) explicit cast receiver receiver:  ((pkg.Class) expr).short -> ...real
  (C) simple receiver with declared type from a cast earlier on the same line,
      handled implicitly by (B)'s pattern search.

Mapping derived from descriptor alignment (normalized) between smali and jar.
"""
import re, os, glob, json, sys, difflib, collections

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
INDEX = json.load(open('/workspace/hoshino-scene-recovered/tools/fix/lib_index.json'))

DRY = '--apply' not in sys.argv
LOGFILE = '/tmp/build_r7.log'


def norm(d):
    if d.startswith('L') or d.startswith('['):
        return 'L;'
    return d


def align(obf, real):
    od = [norm(d) for _, d in obf]
    rd = [norm(d) for _, d in real]
    sm = difflib.SequenceMatcher(a=od, b=rd, autojunk=False)
    mp = {}
    for b in sm.get_matching_blocks():
        for k in range(b.size):
            mp[obf[b.a+k][0]] = real[b.b+k][0]
    return mp


def smali_members(cls_internal):
    p = os.path.join(SMALIROOT, cls_internal + '.smali')
    if not os.path.exists(p):
        return [], [], []
    fields, methods, smethods = [], [], []
    for line in open(p, encoding='utf-8', errors='replace'):
        m = re.match(r'^\.field (.*?)([A-Za-z_$][\w$]*):(\S+)\s*$', line)
        if m:
            if 'static' in m.group(1):
                continue
            fields.append((m.group(2), m.group(3)))
            continue
        mm = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if mm:
            entry = (mm.group(2), '(' + mm.group(3) + ')' + mm.group(4))
            if 'static' in mm.group(1):
                smethods.append(entry)
            else:
                methods.append(entry)
    return fields, methods, smethods


_MAP_CACHE = {}


def class_map(cls_dotted):
    if cls_dotted in _MAP_CACHE:
        return _MAP_CACHE[cls_dotted]
    ci = cls_dotted.replace('.', '/')
    fm, mm, smm = {}, {}, {}
    entry = INDEX.get(cls_dotted)
    if entry:
        sf, sm, ssm = smali_members(ci)
        jf = [tuple(x) for x in entry.get('fields', [])]
        jm = [tuple(x) for x in entry.get('methods', [])]
        # split jar members by static flag (3rd element)
        jfi = [(n, d) for n, d, s in jf if not s]
        jmi = [(n, d) for n, d, s in jm if not s]
        jms = [(n, d) for n, d, s in jm if s]
        if sf and jfi:
            fm = align(sf, jfi)
        if sm and jmi:
            mm = align(sm, jmi)
        if ssm and jms:
            smm = align(ssm, jms)
    _MAP_CACHE[cls_dotted] = (fm, mm, smm)
    return fm, mm, smm


def main():
    files = glob.glob(os.path.join(SRCROOT, '**', '*.java'), recursive=True)
    # Pattern for fully-qualified class receiver (dots) OR internal ($) forms
    fq = re.compile(r'\b((?:[a-z][\w$]*\.)+[A-Z][\w$]*)\s*\.\s*([a-z][\w$]{0,2})\b')
    # Pattern for explicit-cast receiver: ((pkg.Class) expr).short
    cast_recv = re.compile(
        r'(\(\s*\()\s*((?:[a-z][\w$]*\.)+[A-Z][\w$]*)\s*(\)[^()]*\)\s*\.\s*)([a-z][\w$]{0,2})\b')
    total = 0
    changed = 0
    log = []
    for path in files:
        try:
            txt = open(path, encoding='utf-8').read()
        except Exception:
            continue

        # Pass 1: cast-receiver
        def crepl(m):
            nonlocal total
            cls = m.group(2)
            short = m.group(4)
            fm, mm, smm = class_map(cls)
            after = txt[m.end():m.end()+1]
            real = (smm.get(short) or mm.get(short)) if after == '(' else fm.get(short)
            if real and real.startswith('access$'):
                real = None
            if real and real != short:
                total += 1
                log.append(f"{os.path.basename(path)}: (cast){cls}.{short} -> {real}")
                return f"{m.group(1)}{cls}{m.group(3)}{real}"
            return m.group(0)

        txt2 = cast_recv.sub(crepl, txt)

        out = []
        last = 0
        for m in fq.finditer(txt2):
            cls = m.group(1)
            short = m.group(2)
            fm, mm, smm = class_map(cls)
            # decide field / instance-method / static-method by following char
            after = txt2[m.end():m.end()+1]
            is_call = after == '('
            if is_call:
                real = smm.get(short) or mm.get(short)
            else:
                real = fm.get(short)
            if real and real.startswith('access$'):
                real = None
            if real and real != short:
                out.append(txt2[last:m.start()])
                out.append(f"{cls}.{real}")
                last = m.end()
                total += 1
                log.append(f"{os.path.basename(path)}: {cls}.{short} -> {real}")
        new = txt2
        if out:
            out.append(txt2[last:])
            new = ''.join(out)
        if new != txt:
            if not DRY:
                open(path, 'w', encoding='utf-8').write(new)
            changed += 1
    print(f"{'DRY' if DRY else 'APPLIED'}: {total} renames in {changed} files")
    for l in log[:40]:
        print("  ", l)


main()
