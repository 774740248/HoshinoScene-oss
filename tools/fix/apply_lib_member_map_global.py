#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Whole-program library-member deobfuscation applier.

Builds a global symbol table (variable/field simple-name -> declared internal
type) across ALL recovered java files, then rewrites obfuscated library-member
*accesses* using the smali-derived member map produced by gen_lib_member_map.py.

Two access shapes are handled:

  * ``((Type) recv).member``   -> inline cast supplies the owner type.
  * ``recv.member`` (field access or method call) -> the owner type is resolved
    from the global symbol table (locals, params, and *fields of any class*).

Only accesses whose resolved owner is a mapped library class AND whose member is
present in that class's obf->real map are rewritten.  Method replacements are
applied only at call sites (``member(``); field replacements only at non-call
sites.  This separation prevents turning a method into a field or vice versa.
"""
from __future__ import annotations

import argparse
import json
import os
import re
from collections import defaultdict
from typing import Dict, Tuple

# ---------------------------------------------------------------------------
# Global symbol table construction
# ---------------------------------------------------------------------------

# local / param / field declaration:  Type name   (followed by = ; , ) or {)
DECL = re.compile(
    r"(?:^|[;{(\s,])([A-Za-z_$][\w.$]*(?:\s*<[^>{;]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$]\w*)\s*(?:=[^;]*|;|,|\)|\{)",
)
FOR_EACH = re.compile(r"for\s*\(\s*([A-Za-z_$][\w.$]*(?:\[\])*)\s+([A-Za-z_$]\w*)\s*:")
CATCH = re.compile(r"catch\s*\(\s*([A-Za-z_$][\w.$]*)\s+([A-Za-z_$]\w*)\s*\)")

SKIP_TYPES = {
    "return", "new", "if", "for", "while", "switch", "else", "case", "catch",
    "synchronized", "int", "long", "short", "byte", "char", "boolean", "float",
    "double", "void", "public", "private", "protected", "static", "final",
    "abstract", "class", "interface", "enum", "package", "import", "extends",
    "implements", "instanceof", "throw", "throws", "native", "volatile",
    "transient", "strictfp", "assert",
}


def internal(fq: str) -> str:
    return re.sub(r"<.*>", "", fq).replace("[]", "").strip().replace(".", "/")


def build_global_symtab(src_root: str) -> Dict[str, str]:
    """simpleName -> internal type; last writer wins (best effort)."""
    symtab: Dict[str, str] = {}
    for root, _d, names in os.walk(src_root):
        for nm in names:
            if not nm.endswith(".java"):
                continue
            p = os.path.join(root, nm)
            # convert the file's package into a prefix for unqualified types
            try:
                text = open(p, encoding="utf-8", errors="replace").read()
            except OSError:
                continue
            pkg = ""
            pm = re.search(r"^\s*package\s+([\w.]+)\s*;", text, re.M)
            if pm:
                pkg = pm.group(1).replace(".", "/") + "/"
            for m in DECL.finditer(text):
                typ, name = m.group(1), m.group(2)
                if typ in SKIP_TYPES or name in SKIP_TYPES:
                    continue
                fi = internal(typ)
                if "/" not in fi and pkg:
                    # unqualified type -> try packaged variant first
                    fi = pkg + fi
                symtab.setdefault(name, fi)
            for m in FOR_EACH.finditer(text):
                typ, name = m.group(1), m.group(2)
                fi = internal(typ)
                if "/" not in fi and pkg:
                    fi = pkg + fi
                symtab.setdefault(name, fi)
            for m in CATCH.finditer(text):
                typ, name = m.group(1), m.group(2)
                fi = internal(typ)
                if "/" not in fi and pkg:
                    fi = pkg + fi
                symtab.setdefault(name, fi)
    return symtab


# ---------------------------------------------------------------------------
# Member map index
# ---------------------------------------------------------------------------

def build_index(map_path: str):
    raw = json.load(open(map_path, encoding="utf-8"))
    meth_raw = raw.get("methods", {})
    fld_raw = raw.get("fields", {})

    def index(d):
        by_full = defaultdict(dict)
        simple_all = defaultdict(set)
        for k, v in d.items():
            if "#" not in k:
                continue
            owner, obf = k.split("#", 1)
            by_full[owner][obf] = v
            simple_all[owner.rsplit("/", 1)[-1]].add(owner)
        by_simple = {s: by_full[next(iter(o))] for s, o in simple_all.items() if len(o) == 1}
        return by_full, by_simple

    mf, ms = index(meth_raw)
    ff, fs = index(fld_raw)
    return mf, ms, ff, fs


CAST_ACC = re.compile(
    r"\(\s*\(\s*([A-Za-z_$][\w.$]*)\s*\)\s*([A-Za-z_$]\w*)\s*\)\s*\.\s*([A-Za-z_$]\w*)\s*(\()?")
VAR_ACC = re.compile(r"\b([A-Za-z_$]\w*)\s*\.\s*([A-Za-z_$]\w*)\s*(\()?")


def simple(fq: str) -> str:
    return fq.rstrip(";").replace("/", ".").replace("$", ".").rsplit(".", 1)[-1]


def process(text: str, symtab, mf, ms, ff, fs) -> Tuple[str, int]:
    n = 0

    def resolve(owner_internal, call):
        if call:
            if owner_internal in mf:
                return mf[owner_internal]
            return ms.get(owner_internal.rsplit("/", 1)[-1])
        if owner_internal in ff:
            return ff[owner_internal]
        return fs.get(owner_internal.rsplit("/", 1)[-1])

    def r_cast(m):
        nonlocal n
        typ, recv, member, call = m.group(1), m.group(2), m.group(3), m.group(4) or ""
        members = resolve(internal(typ), bool(call))
        if members and member in members:
            n += 1
            return f"(({typ}) {recv}).{members[member]}{call}"
        return m.group(0)

    text = CAST_ACC.sub(r_cast, text)

    def r_var(m):
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


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--map", required=True)
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    print("building global symbol table ...")
    symtab = build_global_symtab(args.src_root)
    print(f"  symbols: {len(symtab)}")
    mf, ms, ff, fs = build_index(args.map)
    print(f"  method owners={len(mf)} field owners={len(ff)}")

    files = []
    for root, _d, names in os.walk(args.src_root):
        for nm in names:
            if nm.endswith(".java"):
                files.append(os.path.join(root, nm))

    total = 0
    changed = 0
    for p in files:
        try:
            src = open(p, encoding="utf-8", errors="surrogateescape").read()
        except Exception:
            continue
        out, n = process(src, symtab, mf, ms, ff, fs)
        if n:
            total += n
            changed += 1
            if args.apply:
                open(p, "w", encoding="utf-8", errors="surrogateescape").write(out)
    print(f"{'applied' if args.apply else 'would apply'}: {total} refs in {changed} files")


if __name__ == "__main__":
    main()
