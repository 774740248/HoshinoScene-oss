#!/usr/bin/env python3
"""Type-aware application of the library member deobfuscation map.

Handles the two shapes jadx emits for library-member access:

    A. ``((com.google.android.material.tabs.TabLayout) obj).g()``
       -> inline cast gives the receiver type.
    B. ``drawerLayout.a()`` where ``drawerLayout`` is declared
       ``androidx.drawerlayout.widget.DrawerLayout``.

For (B) a per-file symbol table (declarations + casts) resolves the receiver
type.  Only accesses whose resolved *simple owner name* matches an owner in the
map are rewritten; member replacement is applied to BOTH field reads/writes and
method calls.

The map keys are like ``com/google/android/material/tabs/TabLayout#g`` -> the
real member.  Because two different library classes can share a simple name, we
key the index by the FULL internal name and resolve receivers to a full name
whenever possible (falling back to simple-name matching only when unique).
"""

from __future__ import annotations

import argparse
import json
import os
import re
import sys
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

SIMPLENAMES: Dict[str, set] = defaultdict(set)   # simple -> {full internal}


def build_index(map_path: str):
    """Return (methods_by_full, methods_by_simple, fields_by_full, fields_by_simple).

    The map JSON has the shape ``{"methods": {...}, "fields": {...}}``; a bare
    flat ``{owner#name: real}`` map is also accepted and treated as methods.
    """
    raw = json.load(open(map_path, encoding="utf-8"))
    if "methods" in raw or "fields" in raw:
        meth_raw = raw.get("methods", {})
        fld_raw = raw.get("fields", {})
    else:
        meth_raw, fld_raw = raw, {}

    def index(d):
        by_full = defaultdict(dict)
        simple_all = defaultdict(set)
        for k, v in d.items():
            if "#" not in k:
                continue
            owner, obf = k.split("#", 1)
            by_full[owner][obf] = v
            simple_all[owner.rsplit("/", 1)[-1]].add(owner)
        by_simple = {}
        for s, owners in simple_all.items():
            if len(owners) == 1:
                by_simple[s] = by_full[next(iter(owners))]
        return by_full, by_simple

    mf, ms = index(meth_raw)
    ff, fs = index(fld_raw)
    return mf, ms, ff, fs


# match `((Type) recv).member` — group1=Type, group2=recv, group3=member, group4='(' if call
CAST_ACC = re.compile(
    r"\(\s*\(\s*([A-Za-z_$][\w.$]*)\s*\)\s*([A-Za-z_$]\w*)\s*\)\s*\.\s*([A-Za-z_$]\w*)\s*(\()?")
# match `recv.member` (not part of a `.class` literal / package-qualified static)
VAR_ACC = re.compile(r"\b([A-Za-z_$]\w*)\s*\.\s*([A-Za-z_$]\w*)\s*(\()?")

DECL = re.compile(
    r"(?:^|[;{(\s])([A-Za-z_$][\w.$]*(?:\s*<[^>{;]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$]\w*)\s*(?:=|;|,|\))")


def simple(fq: str) -> str:
    return fq.rstrip(";").replace("/", ".").replace("$", ".").rsplit(".", 1)[-1]


def internal(fq: str) -> str:
    return fq.replace(".", "/")


def build_symtab(text: str) -> Dict[str, str]:
    """name -> full internal type (best effort)."""
    tab: Dict[str, str] = {}
    for m in DECL.finditer(text):
        typ, name = m.group(1), m.group(2)
        base = re.sub(r"<.*>", "", typ).replace("[]", "").strip()
        if base in ("return", "new", "if", "for", "while", "switch", "else",
                    "case", "catch", "synchronized", "int", "long", "short",
                    "byte", "char", "boolean", "float", "double", "void",
                    "public", "private", "protected", "static", "final",
                    "abstract"):
            continue
        tab.setdefault(name, internal(base))
    return tab


def process(text: str, mf, ms, ff, fs) -> Tuple[str, int]:
    symtab = build_symtab(text)
    n = 0

    def resolve(typ: str, call: bool):
        fi = internal(typ)
        if call:
            if fi in mf:
                return mf[fi]
            s = simple(typ)
            return ms.get(s)
        if fi in ff:
            return ff[fi]
        s = simple(typ)
        return fs.get(s)

    def r_cast(m: re.Match) -> str:
        nonlocal n
        typ, recv, member, call = m.group(1), m.group(2), m.group(3), m.group(4) or ""
        members = resolve(typ, bool(call))
        if members and member in members:
            n += 1
            return f"(({typ}) {recv}).{members[member]}{call}"
        return m.group(0)

    text = CAST_ACC.sub(r_cast, text)

    def r_var(m: re.Match) -> str:
        nonlocal n
        recv, member, call = m.group(1), m.group(2), m.group(3) or ""
        typ = symtab.get(recv)
        if not typ:
            return m.group(0)
        members = resolve(typ, bool(call))
        if members and member in members:
            n += 1
            return f"{recv}.{members[member]}{call}"
        return m.group(0)

    text = VAR_ACC.sub(r_var, text)
    return text, n


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--map", required=True)
    ap.add_argument("--apply", action="store_true")
    ap.add_argument("--only-a", action="store_true", help="only process a/ package")
    args = ap.parse_args()

    mf, ms, ff, fs = build_index(args.map)
    print(f"method owners={len(mf)} fields owners={len(ff)}")

    files: List[str] = []
    for root, _d, names in os.walk(args.src_root):
        for nm in names:
            if nm.endswith(".java"):
                files.append(os.path.join(root, nm))

    total = 0
    changed_files = 0
    for p in files:
        if args.only_a and "/a/" not in p.replace("\\", "/"):
            continue
        try:
            src = open(p, encoding="utf-8", errors="surrogateescape").read()
        except Exception:
            continue
        out, n = process(src, mf, ms, ff, fs)
        if n:
            total += n
            changed_files += 1
            if args.apply:
                open(p, "w", encoding="utf-8", errors="surrogateescape").write(out)
    print(f"{'applied' if args.apply else 'would apply'}: {total} member refs "
          f"in {changed_files} files")
    return 0


if __name__ == "__main__":
    sys.exit(main())
