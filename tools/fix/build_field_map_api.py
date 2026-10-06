#!/usr/bin/env python3
"""Build a RELIABLE obfuscated-field -> real-name map for library classes.

Relies on the fact that R8 keeps *public API* method names but renames
package-private / private members.  So getters/setters such as
``getTabSelectedIndicator()`` survive with their real names, while the backing
field ``tabSelectedIndicator`` becomes ``q``.  By disassembling the *smali* of a
library class (ground truth dex) and reading which field a preserved
getter/setter touches, we recover the real field name with high confidence.

For each library class:
  1. ``javap -p`` the jar to get real method names + descriptors.
  2. Parse the smali to get methods (name + descriptor) and their body field
     accesses (``iget*`` / ``iput*`` / ``sget*`` / ``sput*``).
  3. Match obf method -> real method by *position of non-obfuscated methods*:
     methods whose real name is unchanged (public API, e.g. ``getX``) anchor the
     sequence; obfuscated ones in between are aligned.
  4. For an anchored ``getX``/``isX``/``setX`` method, read the field it accesses
     and map ``obfField -> x`` (getter) -- camel-cased.
"""

from __future__ import annotations

import argparse
import json
import os
import re
import subprocess
import sys
import tempfile
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

FIELD_RE = re.compile(r"^\.field .*?([A-Za-z_$][\w$]*):([^\s=]+)", re.M)
METHOD_RE = re.compile(r"^\.method .*?([A-Za-z_$<][\w$<>]*)\(([^)]*)\)(\S+)$", re.M)
# field access: iget-object v0, v1, Lcom/x/Y;->name:TYPE
ACCESS_RE = re.compile(r"\b(i|s)get(?:-object|-boolean|-byte|-char|-short|-wide)?\s+[vp]\d+,\s*[vp]\d+,\s*L([^;]+);->([A-Za-z_$][\w$]*):(\S+)")
PUT_RE = re.compile(r"\b(i|s)put(?:-object|-boolean|-byte|-char|-short|-wide)?\s+[vp]\d+,\s*[vp]\d+,\s*L([^;]+);->([A-Za-z_$][\w$]*):(\S+)")


def is_api(name: str) -> bool:
    """True only for accessor-style names (getX / setX / isX)."""
    return bool(re.match(r"^(get|set|is)[A-Z_]", name))


def camel(name: str) -> str:
    return name[:1].lower() + name[1:]


def parse_smali(path: str) -> Tuple[Dict[str, str], List[Tuple[str, str, List[str], List[str]]]]:
    text = open(path, "r", encoding="utf-8", errors="replace").read()
    fields = {m.group(1): m.group(2) for m in FIELD_RE.finditer(text)}
    methods: List[Tuple[str, str, List[str], List[str]]] = []
    # split by .method ... .end method
    for block in re.split(r"\.method\b", text)[1:]:
        head, _sep, _tail = block.partition("\n")
        m = re.match(r".*?([A-Za-z_$<][\w$<>]*)\(([^)]*)\)(\S+)", head.strip())
        if not m:
            continue
        name, desc = m.group(1), m.group(3)
        reads = [g.group(3) for g in ACCESS_RE.finditer(block)]
        writes = [g.group(3) for g in PUT_RE.finditer(block)]
        methods.append((name, desc, reads, writes))
    return fields, methods


def javap_members(jar: str, cls: str) -> Tuple[List[str], Dict[str, str]]:
    """Return (real method names in order, desc->name map)."""
    with tempfile.TemporaryDirectory() as td:
        try:
            subprocess.run(["unzip", "-o", "-q", jar, cls, "-d", td],
                           check=True, capture_output=True, timeout=120)
        except Exception:
            return [], {}
        cf = os.path.join(td, cls)
        if not os.path.exists(cf):
            return [], {}
        try:
            out = subprocess.run(["javap", "-p", cf], capture_output=True,
                                 text=True, timeout=60).stdout
        except Exception:
            return [], {}
    names: List[str] = []
    desc_map: Dict[str, str] = {}
    for line in out.splitlines():
        line = line.strip()
        mm = re.match(r".*\s([A-Za-z_$<][\w$<>]*)\((.*)\);?$", line)
        if mm:
            nm = mm.group(1)
            names.append(nm)
            desc_map.setdefault(nm, nm)
    return names, desc_map


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--libs", default="app/libs")
    ap.add_argument("--out", default="/tmp/lib-field-map2.json")
    ap.add_argument("--classes", nargs="*", default=[], help="internal names")
    args = ap.parse_args()

    # map internal name -> jar
    jar_of: Dict[str, str] = {}
    for j in os.listdir(args.libs):
        if not j.endswith(".jar"):
            continue
        p = os.path.join(args.libs, j)
        try:
            out = subprocess.run(["unzip", "-l", p], capture_output=True,
                                 text=True, timeout=90).stdout
        except Exception:
            continue
        for line in out.splitlines():
            mm = re.search(r"(\S+\.class)\s*$", line.strip())
            if mm:
                jar_of.setdefault(mm.group(1)[:-6], p)

    targets = args.classes or [c for c in jar_of if os.path.exists(
        os.path.join(args.smali, c + ".smali"))]

    result: Dict[str, str] = {}
    for c in targets:
        sp = os.path.join(args.smali, c + ".smali")
        if not os.path.exists(sp):
            continue
        fields, methods = parse_smali(sp)
        real_names, _ = javap_members(jar_of[c], c + ".class")
        if not real_names:
            continue
        # anchor alignment: walk smali methods in order, assign real names in order
        # only when the smali name is non-obfuscated / matches an api name present
        real_pool = list(real_names)
        for (name, desc, reads, writes) in methods:
            cand = name.split("$")[0]
            if not is_api(cand):
                continue
            if cand not in real_pool:
                continue
            src = reads or writes
            if len(set(src)) != 1:
                continue
            fld = src[0]
            if fld not in fields:
                continue
            if cand.startswith("set"):
                result.setdefault(f"{c}#{fld}", camel(cand[3:]))
            else:
                result.setdefault(f"{c}#{fld}", camel(re.sub(r"^(get|is)", "", cand)))

    json.dump(result, open(args.out, "w"), indent=1)
    print(f"resolved fields: {len(result)} -> {args.out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
