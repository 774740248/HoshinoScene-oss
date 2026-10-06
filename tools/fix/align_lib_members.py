#!/usr/bin/env python3
"""Align obfuscated library-member short names (as used by the recovered
`a/` sources and by jadx for library classes) back to the real member names in
`app/libs/*.jar`.

The DEX in the APK was re-obfuscated: library classes KEEP their class names
but their *members* were renamed to short tokens (`k`, `l`, `b`, ...). The smali
under `/tmp/build-src/smali/<pkg>/...` is the ground truth for those short
names; the jars carry the real names. We align the two member sets by matching
NORMALIZED descriptors (all object/array types collapsed to `L;`, primitives
kept) and, when ambiguous, by the order of declaration.

Outputs a JSON map consumed by apply step:
    {  "<FQN>": {
          "fields":  { "<short>": "<real>" },
          "methods": { "<short><(normdesc)>": "<real>" }
       }, ... }

Usage: python3 align_lib_members.py [--write]
"""
import json
import os
import re
import subprocess
import sys
import tempfile

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
SMALI = "/tmp/build-src/smali"
LIBS = os.path.join(ROOT, "app", "libs")
OUT = os.path.join(ROOT, "tools", "fix", "lib_shortmap.json")

FIELD_RE = re.compile(r"^\.field\s+(?P<mods>[\w\s]*?)\s*(?P<name>[\w$]+):(?P<desc>\S+)")
METHOD_RE = re.compile(r"^\.method\s+(?P<mods>[\w\s]*?)\s*(?P<name>[\w$<>]+)\((?P<args>[^)]*)\)(?P<ret>\S+)")


def norm_desc(desc):
    """Collapse object/array types to L; so obfuscated & real descriptors match."""
    out = []
    i = 0
    while i < len(desc):
        c = desc[i]
        if c == "L":
            # skip until ';'
            while i < len(desc) and desc[i] != ";":
                i += 1
            out.append("L;")
        elif c == "[":
            # count array dims then treat base
            n = 0
            while i < len(desc) and desc[i] == "[":
                i += 1
                n += 1
            out.append("[" * n)
            if i < len(desc) and desc[i] == "L":
                while i < len(desc) and desc[i] != ";":
                    i += 1
                out.append("L;")
            elif i < len(desc):
                out.append(desc[i])
        else:
            out.append(c)
        i += 1
    return "".join(out)


def parse_smali_class(path):
    """Return (fqn, fields{name:normdesc}, methods{name+normdesc}) for one smali file."""
    fqn = None
    fields = {}
    methods = {}
    with open(path, encoding="utf-8", errors="replace") as fh:
        for line in fh:
            line = line.strip()
            if line.startswith(".class"):
                m = re.search(r"L([\w/$]+);", line)
                if m:
                    fqn = m.group(1)
            elif line.startswith(".field"):
                m = FIELD_RE.match(line)
                if m:
                    fields[m.group("name")] = norm_desc(m.group("desc"))
            elif line.startswith(".method"):
                m = METHOD_RE.match(line)
                if m:
                    sig = "(" + arg_sig(m.group("args")) + ")" + norm_desc(m.group("ret"))
                    methods[m.group("name") + sig] = True
    return fqn, fields, methods


def arg_sig(args):
    if not args:
        return ""
    return "".join(norm_desc(a) for a in args.split())


def iter_smali_files():
    for root, _dirs, files in os.walk(SMALI):
        for f in files:
            if f.endswith(".smali"):
                yield os.path.join(root, f)


_JAR_INDEX = None


def build_jar_index():
    """Map 'pkg/Class.class' -> jar path, scanning each jar exactly once."""
    global _JAR_INDEX
    if _JAR_INDEX is not None:
        return _JAR_INDEX
    idx = {}
    for j in sorted(os.listdir(LIBS)):
        if not j.endswith(".jar"):
            continue
        jp = os.path.join(LIBS, j)
        out = subprocess.run(["unzip", "-l", jp], capture_output=True,
                             text=True).stdout
        for line in out.split("\n"):
            if ".class" not in line:
                continue
            parts = line.split()
            if not parts:
                continue
            rel = parts[-1]
            if rel.endswith(".class") and rel not in idx:
                idx[rel] = jp
    _JAR_INDEX = idx
    return idx


def jar_classes_for(fqn):
    """Return jar path that contains fqn.class (fqn uses '/' separators)."""
    return build_jar_index().get(fqn.replace(".", "/") + ".class")


def javap_members(jarpath, fqn):
    """Return (fields{name:normdesc}, methods{name+normsig}) for a jar class.

    Parses `javap -p -s` output. Each member appears as a declaration line
    followed by an indented `descriptor: <desc>` line. We pair them up.
    """
    with tempfile.TemporaryDirectory() as td:
        rel = fqn.replace(".", "/") + ".class"
        subprocess.run(["unzip", "-o", jarpath, rel], cwd=td, capture_output=True)
        cpath = os.path.join(td, rel)
        if not os.path.exists(cpath):
            return {}, {}
        out = subprocess.run(["javap", "-p", "-s", cpath], capture_output=True,
                             text=True).stdout
    fields = {}
    methods = {}
    lines = out.split("\n")
    decl = None
    for raw in lines:
        s = raw.strip()
        if s.startswith("descriptor:"):
            desc = s.split()[-1]
            if decl is None:
                continue
            if "(" in decl:
                # method: name is token before '('; constructors print the FQN
                name = decl[:decl.index("(")].split()[-1]
                if name == fqn:
                    name = "<init>"
                methods[name + norm_desc(desc)] = True
            else:
                name = decl.rstrip(";").split()[-1]
                fields[name] = norm_desc(desc)
            decl = None
        elif s.endswith(";") and "(" not in s and " " in s:
            decl = s          # field declaration
        elif "(" in s and ")" in s:
            # method declaration; strip trailing 'throws ...' etc.
            decl = s
        else:
            decl = None
    return fields, methods


def main():
    # The smali packages we can align (libraries that are also in jars)
    targetmap = {}
    checked = 0
    for path in iter_smali_files():
        rel = os.path.relpath(path, SMALI)[:-len(".smali")]
        if not (rel.startswith("androidx/") or rel.startswith("com/")
                or rel.startswith("android/")):
            continue
        fqn = rel.replace("/", ".")
        jp = jar_classes_for(fqn)
        if jp is None:
            continue
        sfqn, sf, sm = parse_smali_class(path)
        if sfqn is None:
            continue
        jf, jm = javap_members(jp, fqn)
        checked += 1
        # field alignment by normalized descriptor (sequence)
        fmap = align_fields(sf, jf)
        mmap = align_methods(sm, jm)
        if fmap or mmap:
            targetmap[fqn] = {"fields": fmap, "methods": mmap}
    print(f"aligned {len(targetmap)} classes (scanned {checked})")
    if "--write" in sys.argv:
        with open(OUT, "w") as fh:
            json.dump(targetmap, fh)
        print(f"wrote {OUT}")


def align_fields(smali_members, jar_members):
    """Align field short-names to real names.

    Fields are keyed as `name` with a normalized descriptor as the value in
    `smali_members`, and `name -> normdesc` in `jar_members`. We align by the
    descriptor sequence (obfuscation preserves declaration order).
    """
    import difflib
    out = {}
    sk_list = list(smali_members.keys())
    rk_list = list(jar_members.keys())
    sk_desc = [smali_members[k] for k in sk_list]
    rk_desc = [jar_members[k] for k in rk_list]
    # unique-descriptor direct match first
    from collections import Counter
    rk_count = Counter(rk_desc)
    sk_count = Counter(sk_desc)
    real_by_desc = {}
    for k in rk_list:
        real_by_desc.setdefault(jar_members[k], []).append(k)
    ambiguous = []
    for k in sk_list:
        d = smali_members[k]
        if rk_count[d] == 1 and sk_count[d] == 1:
            out[k] = real_by_desc[d][0]
        else:
            ambiguous.append(k)
    if ambiguous:
        amb = set(ambiguous)
        sk2 = [k for k in sk_list if k in amb]
        used = set(out.values())
        rk2 = [k for k in rk_list if k not in used]
        sm = difflib.SequenceMatcher(None, [smali_members[k] for k in sk2],
                                     [jar_members[k] for k in rk2], autojunk=False)
        for tag, i1, i2, j1, j2 in sm.get_opcodes():
            if tag == "equal":
                for k in range(i2 - i1):
                    out.setdefault(sk2[i1 + k], rk2[j1 + k])
    return out


def align_methods(smali_members, jar_members):
    """Align method short-names to real names.

    Pass 1: name-preserved methods (obfuscator kept public API names) map
            identically (`onMeasure` -> `onMeasure`).
    Pass 2: unique normalized signature among the jar maps directly.
    Pass 3: positional alignment on a *combined* key (name, argsig, retsig)
            using difflib over the arg-signature sequence.
    """
    import difflib

    def split(key):
        if "(" in key:
            return key[:key.index("(")], key[key.index("("):]
        return key, ""

    outright = set(jar_members)
    out = {}

    # Pass 1: identical keys (name + full normalized signature)
    remaining_smali = []
    for sk in smali_members:
        if sk in outright:
            n, _ = split(sk)
            out[n] = n
        else:
            remaining_smali.append(sk)

    # Pass 2: unique normalized signature in the jar
    real_by_sig = {}
    for rk in jar_members:
        _n, sig = split(rk)
        real_by_sig.setdefault(sig, []).append(_n)
    still = []
    for sk in remaining_smali:
        n, sig = split(sk)
        cands = real_by_sig.get(sig, [])
        if len(cands) == 1 and cands[0] not in out.values():
            out[n] = cands[0]
        else:
            still.append(sk)

    # Pass 3: positional over the arg-signature sequence of the leftovers
    if still:
        still_set = set(still)
        sk_list = [k for k in smali_members if k in still_set]
        used = set(out.values())
        rk_list = [k for k in jar_members if split(k)[0] not in used]
        sk_args = [split(k)[1] for k in sk_list]
        rk_args = [split(k)[1] for k in rk_list]
        sm = difflib.SequenceMatcher(None, sk_args, rk_args, autojunk=False)
        for tag, i1, i2, j1, j2 in sm.get_opcodes():
            if tag == "equal":
                for k in range(i2 - i1):
                    sn = split(sk_list[i1 + k])[0]
                    rn = split(rk_list[j1 + k])[0]
                    out.setdefault(sn, rn)
    return out


if __name__ == "__main__":
    main()
