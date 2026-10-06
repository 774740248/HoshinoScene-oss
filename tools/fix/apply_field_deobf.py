#!/usr/bin/env python3
"""Apply library-member (field) deobfuscation maps, type-aware.

The decompiled tree references *obfuscated* members of R8-processed library
classes (e.g. ``tabLayout.q`` instead of ``tabLayout.tabSelectedIndicator``).
``lib-field-map.json`` maps ``owner/internal/name#obfField`` -> ``realField``.

To apply SAFELY we must know the static type of the receiver.  We therefore:

1. build a per-file symbol table of local variables / fields:  name -> type
   (from declarations ``Type name = ...;`` and cast expressions
   ``((Type) name).obfField``);
2. for each ``recv.obf`` access, resolve ``recv``'s type via the symbol table or
   the inline cast; if the resolved type's simple name matches an owner in the
   map and ``obf`` is in that owner's obf set, rewrite ``obf`` -> real name.

Only FIELDS are touched here (methods handled by apply_method_deobf.py).
"""

from __future__ import annotations

import argparse
import json
import os
import re
import sys
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

DECL_RE = re.compile(
    r"(?:^|[;{(\s])"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$][\w$]*)\s*(?:=|;|,|\))"
)
CAST_RE = re.compile(r"\(\s*\(?\s*([A-Za-z_$][\w.$]*)(?:\s*<[^>]*>)?\s*\)?\s*\)\s*([A-Za-z_$][\w$]*)")
MEMBER_RE = re.compile(r"(?P<recv>[A-Za-z_$][\w$]*)\s*\.\s*(?P<obf>[A-Za-z_$][\w$]*)\b(?!\s*\()")


def simple(name: str) -> str:
    """Return the bare class simple name for a JVM or binary name."""
    name = name.rstrip(";")
    return name.replace("/", ".").replace("$", ".").rsplit(".", 1)[-1]


def load_map(path: str) -> Dict[str, Dict[str, str]]:
    """owner-simple-name -> {obf -> real}."""
    raw = json.load(open(path, "r", encoding="utf-8"))
    owners: Dict[str, Dict[str, str]] = defaultdict(dict)
    for k, v in raw.items():
        if "#" not in k:
            continue
        owner, obf = k.split("#", 1)
        owners[simple(owner)][obf] = v
    return owners


def symtab(text: str) -> Dict[str, str]:
    table: Dict[str, str] = {}
    for m in DECL_RE.finditer(text):
        typ, name = m.group(1), m.group(2)
        if typ.lower() in {"return", "new", "if", "for", "while", "switch", "else"}:
            continue
        table[name] = simple(typ)
    for m in CAST_RE.finditer(text):
        typ, name = m.group(1), m.group(2)
        table.setdefault(name, simple(typ))
    return table


def process_file(path: str, owners: Dict[str, Dict[str, str]], apply: bool) -> int:
    with open(path, "r", encoding="utf-8", errors="replace") as fh:
        text = fh.read()
    table = symtab(text)
    changed = 0
    out_lines: List[str] = []
    for line in text.splitlines(keepends=True):
        def repl(m: re.Match) -> str:
            nonlocal changed
            recv, obf = m.group("recv"), m.group("obf")
            typ = table.get(recv)
            if not typ:
                return m.group(0)
            fields = owners.get(typ)
            if not fields or obf not in fields:
                return m.group(0)
            changed += 1
            return f"{recv}.{fields[obf]}"
        out_lines.append(MEMBER_RE.sub(repl, line))
    if apply and changed:
        with open(path, "w", encoding="utf-8") as fh:
            fh.writelines(out_lines)
    return changed


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--map", required=True)
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    owners = load_map(args.map)
    print(f"owners: {len(owners)}, total fields: {sum(len(v) for v in owners.values())}")

    files: List[str] = []
    for root, _dirs, names in os.walk(args.src_root):
        for n in names:
            if n.endswith(".java"):
                files.append(os.path.join(root, n))

    total = 0
    hits_by_owner: Dict[str, int] = defaultdict(int)
    for p in files:
        n = process_file(p, owners, args.apply)
        total += n
    print(f"{'applied' if args.apply else 'would apply'}: {total} field refs")
    return 0


if __name__ == "__main__":
    sys.exit(main())
