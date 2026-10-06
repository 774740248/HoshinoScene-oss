#!/usr/bin/env python3
"""Build obfuscated-field -> real-name map via UNIQUE TYPE matching.

For a library class we have two member lists:

* smali (dex ground truth) -- field names are obfuscated, types are real.
* javap (real names preserved) -- field names are real, types are real.

If, within a class, an *obfuscated* smali field's (type, static, final) tuple
matches exactly ONE javap field that is not itself already claimed, the mapping
is unambiguous and safe.  Fields with a duplicate signature are skipped.

Output: ``{internal/Class#obfField: realField}``
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

FIELD_RE = re.compile(r"^\.field\s+(?P<mods>[\w\s]*?)\s*(?P<name>[A-Za-z_$][\w$]*):(?P<type>[^\s=]+)",
                      re.M)


def parse_smali_fields(path: str) -> List[Tuple[str, str, bool, bool]]:
    """Return list of (name, type, is_static, is_final)."""
    out = []
    for m in FIELD_RE.finditer(open(path, "r", encoding="utf-8", errors="replace").read()):
        mods = m.group("mods")
        out.append((m.group("name"), m.group("type"),
                    "static" in mods, "final" in mods))
    return out


def javap_fields(cf: str) -> List[Tuple[str, str, bool, bool]]:
    try:
        out = subprocess.run(["javap", "-p", cf], capture_output=True,
                             text=True, timeout=60).stdout
    except Exception:
        return []
    res = []
    for line in out.splitlines():
        line = line.strip().rstrip(";")
        if "(" in line or "{" in line or not line or line.startswith("}"):
            continue
        mm = re.match(r"(?P<mods>[\w\s]*?)\s*(?P<type>[\w.$<>\[\]]+)\s+(?P<name>[A-Za-z_$][\w$]*)$", line)
        if not mm:
            continue
        mods = mm.group("mods")
        res.append((mm.group("name"), mm.group("type"),
                    "static" in mods, "final" in mods))
    return res


def norm_type(t: str) -> str:
    """Normalise a JVM/Java type to a comparable form."""
    t = t.rstrip(";")
    if t.startswith("L"):
        t = t[1:]
    # strip generics
    t = re.sub(r"<.*>", "", t)
    return t.replace("/", ".")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--libs", default="app/libs")
    ap.add_argument("--out", default="/tmp/lib-field-type-map.json")
    args = ap.parse_args()

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

    result: Dict[str, str] = {}
    stats = {"classes": 0, "unique": 0, "ambiguous": 0}

    with tempfile.TemporaryDirectory() as td:
        for cls, jar in jar_of.items():
            sp = os.path.join(args.smali, cls + ".smali")
            if not os.path.exists(sp):
                continue
            sf = parse_smali_fields(sp)
            if not sf:
                continue
            try:
                subprocess.run(["unzip", "-o", "-q", jar, cls + ".class", "-d", td],
                               check=True, capture_output=True, timeout=120)
            except Exception:
                continue
            cf = os.path.join(td, cls + ".class")
            if not os.path.exists(cf):
                continue
            jf = javap_fields(cf)
            if not jf:
                continue
            stats["classes"] += 1

            # index javap fields by (type, static, final)
            idx: Dict[Tuple[str, bool, bool], List[str]] = defaultdict(list)
            for (name, typ, st, fin) in jf:
                idx[(norm_type(typ), st, fin)].append(name)

            used: set = set()
            # Pass 1: unambiguous by (type,static,final)
            for (name, typ, st, fin) in sf:
                key = (norm_type(typ), st, fin)
                cands = [c for c in idx.get(key, []) if c not in used]
                if len(cands) == 1:
                    cand = cands[0]
                    if cand != name:
                        result[f"{cls}#{name}"] = cand
                        used.add(cand)
                        stats["unique"] += 1
                elif len(cands) > 1:
                    stats["ambiguous"] += 1

            # Pass 2: within each (type,static,final) bucket, align remaining
            # smali fields with remaining javap fields in declaration order.
            smali_by_key: Dict[Tuple[str, bool, bool], List[str]] = defaultdict(list)
            for (name, typ, st, fin) in sf:
                if f"{cls}#{name}" in result:
                    continue
                smali_by_key[(norm_type(typ), st, fin)].append(name)
            for key, sm_names in smali_by_key.items():
                j_cands = [c for c in idx.get(key, []) if c not in used]
                if len(sm_names) == len(j_cands) and len(sm_names) > 0:
                    # order alignment: smali decl order may differ from javap's,
                    # so only map when counts match AND it is the whole bucket
                    for sm, jc in zip(sm_names, j_cands):
                        if sm != jc:
                            result[f"{cls}#{sm}"] = jc
                            stats["unique"] += 1
                        used.add(jc)

    json.dump(result, open(args.out, "w"), indent=1)
    print(f"classes scanned: {stats['classes']}, unique mappings: {stats['unique']}, "
          f"ambiguous skipped: {stats['ambiguous']} -> {args.out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
