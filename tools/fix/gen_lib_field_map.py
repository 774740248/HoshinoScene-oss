#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Generate & apply an obf->real FIELD name map for third-party library classes.

The recovered app source references members of the *R8-obfuscated* copies of
third-party libraries, e.g. `((SideSheetBehavior) this.c).m`.  The jar we
compile against (`app/libs/*.jar`) holds the *pristine* library with real field
names, so such references fail with "cannot find symbol: variable m".

Ground truth for the obfuscated copies lives in `/tmp/build-src/smali`.

Mapping key: within a class, match an obfuscated smali field to a pristine jar
field by **JVM descriptor** when that descriptor is unique on both sides.
(A handful of classes have several fields sharing a descriptor; those are
resolved by declaration order as a secondary key, which R8 preserves.)

Output JSON: {"com/google/.../Owner": {"obfName->descriptor": "realName"}}
The applier walks the source tree and rewrites `recv.<obfName>` /
`((Type) recv).<obfName>` when `Type` is a mapped owner and the descriptor of
the resolved real field is compatible.
"""
from __future__ import annotations

import json
import os
import re
import subprocess
import sys
import zipfile
from collections import defaultdict
from typing import Dict, List, Tuple

SMALI_ROOT = "/tmp/build-src/smali"
LIBS_DIR = "app/libs"
OUT_JSON = "tools/fix/lib_field_map.json"

# Field line in smali: .field [access] name:descriptor
SMALI_FIELD = re.compile(
    r"^\.field\s+(?P<mods>[^\s:]*?(?:\s+\w+)*)\s+(?P<name>[A-Za-z_$][\w$]*):(?P<type>[^\s=]+)",
    re.M,
)
REAL_OWNER = ("java/", "javax/", "android/", "androidx/", "com/google/",
              "kotlin/", "kotlinx/", "org/", "sun/", "dalvik/")
SHORT = re.compile(r"^[a-zA-Z_$]{1,2}\d*$")

# javap line: "  <access flags> <type> <name>;" or with descriptor
JAVAP_FIELD = re.compile(
    r"^\s{2,}(?P<mods>(?:public|private|protected|static|final|volatile|transient|\s)+)"
    r"(?P<type>[^\s;]+)\s+(?P<name>[A-Za-z_$][\w$]*);"
)


def jar_classes(libs_dir: str) -> Dict[str, str]:
    """internal name -> jar path."""
    out: Dict[str, str] = {}
    for fn in sorted(os.listdir(libs_dir)):
        if not fn.endswith(".jar"):
            continue
        p = os.path.join(libs_dir, fn)
        try:
            with zipfile.ZipFile(p) as z:
                for n in z.namelist():
                    if n.endswith(".class"):
                        out[n[:-6]] = p
        except zipfile.BadZipFile:
            continue
    return out


def javap_fields(jar: str, internal: str) -> List[Tuple[str, str, str, bool, bool]]:
    """Return list of (name, descriptor, type, static, final) for a class."""
    try:
        res = subprocess.run(
            ["javap", "-p", "-s", "-classpath", jar, internal.replace("/", ".")],
            capture_output=True, text=True, timeout=60,
        )
    except (subprocess.TimeoutExpired, FileNotFoundError):
        return []
    lines = res.stdout.split("\n")
    out = []
    i = 0
    while i < len(lines):
        m = JAVAP_FIELD.match(lines[i])
        if m:
            desc = None
            if i + 1 < len(lines):
                dm = re.search(r"descriptor:\s+(\S+)", lines[i + 1])
                if dm:
                    desc = dm.group(1)
            mods = m.group("mods")
            if desc:
                out.append((m.group("name"), desc, m.group("type"),
                            "static" in mods, "final" in mods))
        i += 1
    return out


def smali_fields(path: str) -> List[Tuple[str, str, bool, bool]]:
    """Return list of (name, descriptor, static, final)."""
    text = open(path, encoding="utf-8", errors="replace").read()
    out = []
    for m in SMALI_FIELD.finditer(text):
        mods = m.group("mods") or ""
        out.append((m.group("name"), m.group("type"),
                    "static" in mods, "final" in mods))
    return out


def smali_path_for(internal: str) -> str:
    cands = [
        os.path.join(SMALI_ROOT, internal + ".smali"),
        os.path.join(SMALI_ROOT, "smali", internal + ".smali"),
    ]
    for c in cands:
        if os.path.isfile(c):
            return c
    # search one level deep
    return ""


def build_map() -> dict:
    classes = jar_classes(LIBS_DIR)
    mapping: Dict[str, Dict[str, str]] = {}
    n_classes = 0
    for internal, jar in classes.items():
        if not internal.startswith(REAL_OWNER):
            continue
        sp = smali_path_for(internal)
        if not sp:
            continue
        sf = smali_fields(sp)
        if not sf:
            continue
        jf = javap_fields(jar, internal)
        if not jf:
            continue
        # bucket jar fields by descriptor
        jb = defaultdict(list)
        for name, desc, typ, st, fin in jf:
            jb[desc].append(name)
        res: Dict[str, str] = {}
        # bucket smali obf fields by descriptor (keep declaration order)
        sb = defaultdict(list)
        for name, desc, st, fin in sf:
            sb[desc].append(name)
        for desc, names in sb.items():
            if desc not in jb:
                continue
            jnames = jb[desc]
            if len(names) == 1 and len(jnames) == 1:
                obf = names[0]
                real = jnames[0]
                if obf != real:
                    res[obf] = real
            # Ambiguous descriptor buckets (multiple fields share the same
            # descriptor) are left unmapped: R8 may drop/merge fields so
            # declaration-order alignment is not reliable enough to guarantee
            # semantic correctness.
        if res:
            mapping[internal] = res
            n_classes += 1
    print(f"mapped classes: {n_classes}, total entries: {sum(len(v) for v in mapping.values())}")
    # Emit the flat {owner#obf: real} shape consumed by apply_lib_member_map.py
    flat = {f"{owner}#{obf}": real
            for owner, d in mapping.items() for obf, real in d.items()}
    json.dump({"methods": {}, "fields": flat}, open(OUT_JSON, "w"), indent=1)
    return mapping


if __name__ == "__main__":
    build_map()
