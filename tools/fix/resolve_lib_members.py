#!/usr/bin/env python3
"""
Resolve obfuscated library member short names (fields + methods) by mapping them
to real names in the deobfuscated jars via descriptor alignment.

For a class C:
  smali fields : [(obf_name, desc), ...]  (instance fields, declaration order)
  jar   fields : [(real_name, desc), ...] (from `javap -p -s`)
Align the descriptor sequences with difflib.SequenceMatcher; for equal blocks,
map obf_name -> real_name. Same for methods (name + descriptor), matching the
full method descriptor `(params)ret`.

Then rewrite Java member accesses `Type.fieldShort` -> `Type.fieldReal` for the
class of each reported field/method error.
"""
import re, os, sys, subprocess, json, collections, difflib

SRCROOT = '/workspace/hoshino-scene-recovered/app/src/main/java'
SMALIROOT = '/tmp/build-src/smali'
LIBS = sorted(
    __import__('glob').glob('/workspace/hoshino-scene-recovered/app/libs/*.jar'))
LOGFILE = sys.argv[1] if len(sys.argv) > 1 else '/tmp/build.log'
OUTMAP = '/workspace/hoshino-scene-recovered/tools/fix/libmember_map.json'


def smali_fields(cls_internal):
    """cls_internal like 'com/google/android/material/behavior/SwipeDismissBehavior'."""
    p = os.path.join(SMALIROOT, cls_internal + '.smali')
    if not os.path.exists(p):
        return [], []
    fields = []
    methods = []
    for line in open(p, encoding='utf-8', errors='replace'):
        m = re.match(r'^\.field (.*?)([A-Za-z_$][\w$]*):(\S+)\s*$', line)
        if m:
            if 'static' in m.group(1):
                continue
            fields.append((m.group(2), m.group(3)))
            continue
        mm = re.match(r'^\.method\s+(.*?)\s+([\w$<>]+)\((.*)\)(\S+)\s*$', line)
        if mm:
            if 'static' in mm.group(1):
                continue
            methods.append((mm.group(2), '(' + mm.group(3) + ')' + mm.group(4)))
    return fields, methods


_JAVAP_CACHE = {}


def jar_members(cls_dotted):
    """Return (fields, methods) from the jar using javap -p -s."""
    if cls_dotted in _JAVAP_CACHE:
        return _JAVAP_CACHE[cls_dotted]
    out = None
    for jar in LIBS:
        try:
            r = subprocess.run(['javap', '-p', '-s', '-classpath', jar, cls_dotted],
                               capture_output=True, text=True, timeout=30)
        except Exception:
            continue
        if r.returncode == 0 and 'Compiled from' in r.stdout:
            out = r.stdout
            break
    if out is None:
        _JAVAP_CACHE[cls_dotted] = ([], [])
        return [], []
    lines = out.split('\n')
    fields = []
    methods = []
    i = 0
    while i < len(lines):
        line = lines[i].rstrip()
        # member decl line ends with ';' ; next line has 'descriptor:'
        if line.startswith(' ') and (';' in line) and not line.strip().startswith('descriptor'):
            is_static = 'static' in line
            desc = ''
            if i + 1 < len(lines) and 'descriptor:' in lines[i+1]:
                desc = lines[i+1].split('descriptor:')[1].strip()
            # determine field vs method
            head = line.strip()
            if '(' in head and ')' in head:
                # method: name before '(', descriptor gives params+ret
                name = head.split('(')[0].strip().split()[-1]
                if not is_static:
                    methods.append((name, desc))
            else:
                # field: name before ';'
                nm = head.rstrip(';').strip().split()[-1]
                if not is_static:
                    fields.append((nm, desc))
            i += 2
            continue
        i += 1
    _JAVAP_CACHE[cls_dotted] = (fields, methods)
    return fields, methods


def _norm_desc(d):
    """Normalize a descriptor for alignment: replace any object/array type with a
    generic token so obfuscated vs real class names do not break alignment.
    Primitives are preserved."""
    if d.startswith('L') or d.startswith('['):
        return 'L;'
    return d


def align(obf, real):
    """obf/real: list of (name, desc). Return dict obf_name->real_name using
    descriptor-sequence alignment (normalized)."""
    o_desc = [_norm_desc(d) for _, d in obf]
    r_desc = [_norm_desc(d) for _, d in real]
    sm = difflib.SequenceMatcher(a=o_desc, b=r_desc, autojunk=False)
    mapping = {}
    for block in sm.get_matching_blocks():
        for k in range(block.size):
            on, od = obf[block.a + k]
            rn, rd = real[block.b + k]
            mapping[on] = rn
    return mapping


def build_map(classes_needed):
    result = {}
    for cls_internal in classes_needed:
        f, m = smali_fields(cls_internal)
        jf, jm = jar_members(cls_internal.replace('/', '.'))
        if not f or not jf:
            continue
        fm = align(f, jf)
        mm = align(m, jm)
        result[cls_internal] = {'fields': fm, 'methods': mm}
    return result


def main():
    # Parse errors for member short names on library classes.
    lines = open(LOGFILE, encoding='utf-8', errors='replace').read().split('\n')
    needed = collections.defaultdict(set)   # cls_internal -> set(short member)
    # We must know the owning class. For a field error the java line has a cast
    # or typed receiver; for simplicity, gather candidate classes from all
    # library classes referenced and try all members.
    # Strategy: collect all short symbols; also collect all "((Class).x" patterns.
    err_syms = set()
    i = 0
    while i < len(lines):
        mm = re.match(r'^(\S+\.java):(\d+): error: cannot find symbol$', lines[i])
        if mm:
            block = '\n'.join(lines[i+1:i+6])
            sm = re.search(r'symbol:\s+(?:variable|method)\s+([A-Za-z_$][\w$]*)', block)
            if sm:
                err_syms.add(sm.group(1))
            i += 5
        elif re.match(r'^(\S+\.java):(\d+): error:', lines[i]):
            i += 3
        else:
            i += 1
    print(f"candidate short symbols: {len(err_syms)}")
    print(sorted(err_syms)[:40])
    # We cannot map without knowing the owning class; this tool is a scaffold.
    # Save err syms for the interactive resolver.
    json.dump(sorted(err_syms), open('/tmp/err_syms.json', 'w'))
    print("saved /tmp/err_syms.json")


main()
