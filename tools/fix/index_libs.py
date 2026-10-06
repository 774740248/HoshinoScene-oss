#!/usr/bin/env python3
"""
Build a global index of jar library classes -> {class_dotted: {'fields':[(name,desc)], 'methods':[(name,desc)]}}
by listing all classes in each jar and running `javap -p -s` in batches.
Writes tools/fix/lib_index.json
"""
import os, glob, subprocess, json, sys

LIBS = sorted(glob.glob('/workspace/hoshino-scene-recovered/app/libs/*.jar'))
OUT = '/workspace/hoshino-scene-recovered/tools/fix/lib_index.json'


def classes_in_jar(jar):
    r = subprocess.run(['unzip', '-Z1', jar], capture_output=True, text=True)
    names = [l.strip()[:-6].replace('/', '.')
             for l in r.stdout.split('\n') if l.strip().endswith('.class')]
    # skip inner classes with '$' for the primary index
    return [n for n in names]


def parse_javap(out):
    """Return {'fields':[(n,d)], 'methods':[(n,d)]} from javap -p -s output."""
    fields, methods = [], []
    lines = out.split('\n')
    i = 0
    while i < len(lines):
        line = lines[i].rstrip()
        if line.startswith(' ') and ';' in line and 'descriptor' not in line and not line.strip().startswith('}'):
            desc = ''
            if i + 1 < len(lines) and 'descriptor:' in lines[i+1]:
                desc = lines[i+1].split('descriptor:')[1].strip()
            head = line.strip()
            static = head.startswith('static') or ' static ' in head
            if '(' in head and ')' in head:
                name = head.split('(')[0].split()[-1]
                methods.append((name, desc, static))
            else:
                name = head.rstrip(';').strip().split()[-1]
                fields.append((name, desc, static))
            i += 2
            continue
        i += 1
    return {'fields': fields, 'methods': methods}


def main():
    index = {}
    for jar in LIBS:
        cls = classes_in_jar(jar)
        if not cls:
            continue
        B = 200
        for i in range(0, len(cls), B):
            batch = cls[i:i+B]
            try:
                r = subprocess.run(['javap', '-p', '-s', '-classpath', jar] + batch,
                                   capture_output=True, text=True, timeout=120)
            except Exception:
                continue
            # split output per class: javap separates classes by 'Compiled from'
            chunks = re_split_classes(r.stdout)
            for dotted, body in chunks.items():
                index[dotted] = parse_javap(body)
    json.dump(index, open(OUT, 'w'))
    print(f"indexed {len(index)} classes -> {OUT}")


def re_split_classes(out):
    import re
    res = {}
    # javap prints blocks: "Compiled from \"X.java\"\n<modifiers> class Name ..."
    parts = re.split(r'^(Compiled from .*)$', out, flags=re.M)
    # parts alternate: ['', 'Compiled from...', body, 'Compiled from...', body, ...]
    cur_name = None
    cur_body = []
    for p in parts:
        if p.startswith('Compiled from'):
            if cur_name:
                res[cur_name] = '\n'.join(cur_body)
            cur_name = None
            cur_body = [p]
            continue
        if not cur_body:
            cur_body.append(p)
        else:
            cur_body.append(p)
        # detect class name
        m = re.search(r'(?:class|interface|enum)\s+([\w\.\$]+)', p)
        if m and cur_name is None:
            cur_name = m.group(1)
    if cur_name:
        res[cur_name] = '\n'.join(cur_body)
    return res


main()
