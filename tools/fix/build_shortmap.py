#!/usr/bin/env python3
"""
Build short(obfuscated-smali-name) -> real(jar-name) member map for library classes.

For each smali class that also exists in a lib jar, match:
  - fields  by descriptor
  - methods by (param-descriptors, return-descriptor)
Emit tools/fix/shortmap.json:
  { "Lcls;": {"fields":{short:real}, "methods":{short:real}, "super":"L..;" } }
"""
import os, re, json, zipfile, subprocess

SMALI = "/tmp/build-src/smali"
LIBS = "app/libs"
OUT = "tools/fix/shortmap.json"
JAVAP = "javap"

def jar_class_set():
    s = set()
    jar_of = {}
    for fn in sorted(os.listdir(LIBS)):
        if not fn.endswith(".jar"): continue
        with zipfile.ZipFile(os.path.join(LIBS, fn)) as z:
            for n in z.namelist():
                if n.endswith(".class") and "$" not in n:
                    cls = "L" + n[:-6] + ";"
                    s.add(cls); jar_of[cls] = os.path.join(LIBS, fn)
    return s, jar_of

_MEM_CACHE = {}
def javap_members(cls, jarpath):
    """Return {'fields':{name:desc}, 'methods':{name:'(params)ret'}, 'super':L..;}"""
    key = (cls, jarpath)
    if key in _MEM_CACHE: return _MEM_CACHE[key]
    fq = cls[1:-1].replace("/", ".")
    out = subprocess.run([JAVAP, "-p", "-s", "-cp", jarpath, fq],
                         capture_output=True, text=True).stdout
    fields = {}; methods = {}; superc = None
    cur = None
    lines = out.split("\n")
    for i, ln in enumerate(lines):
        ln = ln.strip()
        if ln.startswith("extends "):
            # e.g. "extends androidx.drawerlayout.widget.DrawerLayout ..."
            m = re.match(r'extends\s+([\w.$]+)', ln)
            if m: superc = "L" + m.group(1).replace(".", "/") + ";"
        desc = None
        if i+1 < len(lines) and lines[i+1].strip().startswith("descriptor:"):
            desc = lines[i+1].strip().split("descriptor:")[1].strip()
        if not desc or not ln or ln.endswith("{"):
            continue
        if desc.startswith("("):  # method descriptor
            m = re.search(r'([\w$<>]+)\(', ln)
            if m:
                name = m.group(1)
                if name.startswith("static "): continue
                methods.setdefault(name, desc)
        else:  # field descriptor
            m = re.search(r'([\w$]+)\s*[;=\s]', ln + " ")
            if m:
                fields.setdefault(m.group(1), desc)
    res = {"fields": fields, "methods": methods, "super": superc}
    _MEM_CACHE[key] = res
    return res

def parse_smali_class(path):
    fields = {}; methods = {}; superc = None
    with open(path, "r", encoding="utf-8", errors="replace") as f:
        for line in f:
            if line.startswith(".super "):
                superc = line[7:].strip()
            elif line.startswith(".field"):
                m = re.search(r'\.field\s+.*?([A-Za-z0-9_$]+):(\S+)', line)
                if m: fields[m.group(1)] = m.group(2)
            elif line.startswith(".method"):
                m = re.search(r'\.method\s+(.*?)\s*([A-Za-z0-9_$<>]+)\((.*?)\)(\S+)\s*$', line)
                if m:
                    methods[m.group(2)] = {"desc": m.group(4), "params": m.group(3),
                                           "static": ("static" in m.group(1))}
    return {"fields": fields, "methods": methods, "super": superc}

def looks_real(name):
    return not re.fullmatch(r'[A-Za-z0-9_$]{1,2}', name)

def main():
    jset, jar_of = jar_class_set()
    print("jar classes:", len(jset))
    result = {}
    total_f = total_m = 0
    for root, _, files in os.walk(SMALI):
        for fn in files:
            if not fn.endswith(".smali"): continue
            p = os.path.join(root, fn)
            cls = "L" + os.path.relpath(p, SMALI)[:-6].replace(os.sep, "/") + ";"
            if cls not in jset: continue
            sm = parse_smali_class(p)
            jar = javap_members(cls, jar_of[cls])
            # fields by descriptor
            byd = {}
            for n, d in jar["fields"].items():
                byd.setdefault(d, []).append(n)
            fmap = {}
            for sn, sd in sm["fields"].items():
                cands = byd.get(sd, [])
                if not cands: continue
                real = [c for c in cands if looks_real(c)]
                if len(cands) == 1: fmap[sn] = cands[0]
                elif len(real) == 1: fmap[sn] = real[0]
                else: fmap[sn] = sorted(cands, key=lambda x: (not looks_real(x), x))[0]
            # methods by signature desc (params+ret)
            bym = {}
            for n, d in jar["methods"].items():
                bym.setdefault(d, []).append(n)
            mmap = {}
            for sn, info in sm["methods"].items():
                full = "(" + info["params"] + ")" + info["desc"]
                cands = bym.get(full, [])
                if not cands: continue
                real = [c for c in cands if looks_real(c)]
                if len(cands) == 1: mmap[sn] = cands[0]
                elif len(real) == 1: mmap[sn] = real[0]
                else: mmap[sn] = sorted(cands, key=lambda x: (not looks_real(x), x))[0]
            if fmap or mmap or sm["super"]:
                result[cls] = {"fields": fmap, "methods": mmap, "super": sm["super"]}
                total_f += len(fmap); total_m += len(mmap)
    json.dump(result, open(OUT, "w"), indent=1)
    print("mapped classes:", len(result), "fields:", total_f, "methods:", total_m)

main()
