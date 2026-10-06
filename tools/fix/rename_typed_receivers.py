#!/usr/bin/env python3
"""
Rename obfuscated library member accesses on TYPED local receivers.

For every Java file, track local variable declarations `Type var = ...` /
`Type var;` and field/param declarations `Type var,`. Then for each usage
`var.short` (or `var.short(`), if `Type` is a library class present in
lib_index.json, rewrite `short` -> real name using the descriptor alignment.

Field of the enclosing class: `this.f` uses are handled by resolving the field's
declared type from the class body.

Only rewrites when a unique mapping exists; leaves everything else untouched.
"""
import re, os, glob, json, sys, difflib, collections

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
INDEX = json.load(open('/workspace/hoshino-scene-recovered/tools/fix/lib_index.json'))
APPLY = '--apply' in sys.argv


def norm(d):
    return 'L;' if (d.startswith('L') or d.startswith('[')) else d


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
        if m and 'static' not in m.group(1):
            fields.append((m.group(2), m.group(3)))
            continue
        mm = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if mm:
            entry = (mm.group(2), '(' + mm.group(3) + ')' + mm.group(4))
            (smethods if 'static' in mm.group(1) else methods).append(entry)
    return fields, methods, smethods


_CACHE = {}


def class_map(cls_dotted):
    if cls_dotted in _CACHE:
        return _CACHE[cls_dotted]
    entry = INDEX.get(cls_dotted)
    fm, mm, smm = {}, {}, {}
    if entry:
        sf, sm, ssm = smali_members(cls_dotted.replace('.', '/'))
        jf = [tuple(x) for x in entry.get('fields', [])]
        jm = [tuple(x) for x in entry.get('methods', [])]
        jfi = [(n, d) for n, d, s in jf if not s]
        jmi = [(n, d) for n, d, s in jm if not s]
        jms = [(n, d) for n, d, s in jm if s]
        if sf and jfi:
            fm = align(sf, jfi)
        if sm and jmi:
            mm = align(sm, jmi)
        if ssm and jms:
            smm = align(ssm, jms)
    _CACHE[cls_dotted] = (fm, mm, smm)
    return fm, mm, smm


# Library class simple names known in the index.
LIB_SIMPLE = {}
for k in INDEX:
    LIB_SIMPLE.setdefault(k.split('.')[-1], k)
LIB_SIMPLE_RAW = list(LIB_SIMPLE)

DECL = re.compile(
    r'^\s*(?:(?:final|public|private|protected|static|volatile|transient)\s+)*'
    r'([A-Za-z_$][\w$\.]*)\s+([A-Za-z_$][\w$]*)\s*(=|;|,|\))')


def declared_type(raw):
    """raw may be 'Toolbar', 'androidx.x.Toolbar', 'List<X>', 'Type[]'."""
    t = raw.split('<')[0].strip()
    t = t.replace('[]', '').strip()
    if t in LIB_SIMPLE:
        return LIB_SIMPLE[t]
    # fully qualified
    if '.' in t and t in INDEX:
        return t
    return None


def build_var_types(lines, classname):
    """Return dict varname -> list of (lineno, type_dotted). Later entries win."""
    vt = collections.defaultdict(list)
    # class-level fields
    for i, line in enumerate(lines, 1):
        m = DECL.match(line)
        if m:
            t = declared_type(m.group(1))
            if t:
                vt[m.group(2)].append((i, t))
        # params in method signatures
        if '(' in line and ')' in line and ('{' in line or line.strip().endswith(')')):
            params = line[line.find('(')+1:line.rfind(')')]
            for p in params.split(','):
                p = p.strip()
                if not p:
                    continue
                pm = re.match(r'(?:final\s+)?([A-Za-z_$][\w$\.\<\>\[\]]*)\s+([A-Za-z_$][\w$]*)', p)
                if pm:
                    t = declared_type(pm.group(1))
                    if t:
                        vt[pm.group(2)].append((i, t))
    return vt


def type_at(vt, var, lineno):
    best = None
    for (ln, t) in vt.get(var, []):
        if ln <= lineno:
            best = t
    return best


USE = re.compile(r'(?<![.\w])((?:this\.)?[A-Za-z_$][\w$]*)\.([a-z][\w$]{0,2})\b')


def main():
    files = glob.glob(os.path.join(SRCROOT, '**', '*.java'), recursive=True)
    total = 0
    changed = 0
    samples = []
    for path in files:
        lines = open(path, encoding='utf-8').read().split('\n')
        classname = os.path.basename(path)[:-5]
        vt = build_var_types(lines, classname)
        if not vt:
            continue
        mod = False
        for idx, line in enumerate(lines):
            lineno = idx + 1
            if line.strip().startswith('//') or line.strip().startswith('*'):
                continue

            def repl(m):
                nonlocal total, mod
                var, short = m.group(1), m.group(2)
                lookup = var[5:] if var.startswith('this.') else var
                t = type_at(vt, lookup, lineno)
                if not t:
                    return m.group(0)
                fm, mm, smm = class_map(t)
                after = line[m.end():m.end()+1]
                real = (smm.get(short) or mm.get(short)) if after == '(' else fm.get(short)
                if real and real.startswith('access$'):
                    real = None
                if real and real != short:
                    total += 1
                    mod = True
                    if len(samples) < 40:
                        samples.append(f"{classname}:{lineno} {var}.{short}->{real} ({t.split('.')[-1]})")
                    return f"{var}.{real}"
                return m.group(0)

            lines[idx] = USE.sub(repl, line)
        if mod:
            changed += 1
            if APPLY:
                open(path, 'w', encoding='utf-8').write('\n'.join(lines))
    print(f"{'APPLIED' if APPLY else 'DRY'}: {total} renames in {changed} files")
    for s in samples:
        print("  ", s)


main()
