#!/usr/bin/env python3
"""Restore original (smali) field names for fields jadx renamed.

jadx emits:
    /* renamed from: a */
    public static final a.q10 f457a = ...;
because the class also has a method with the same short name.  Java permits a
field and a method to share a name, so we can rename the field back to the
original short name -- provided the ORIGINAL name is actually referenced as
``<SimpleClassName>.<name>`` somewhere in the tree (i.e. call sites were NOT
rewritten by jadx, which only rewrites the declaration for renamed fields).

Strategy
--------
1. Walk all ``*.java`` under the source root.
2. For each file, find comments of the form ``/* renamed from: X */`` (also with
   the verbose ``reason: ...`` suffix) that are immediately followed by a field
   declaration line.
3. Record (class_simple_name, obf_field_name, original_name).
4. Count references of ``<ClassSimple>.<original_name>`` (as a field: followed by
   end-of-token, not ``(``) across the whole tree vs references of the obf name.
5. If the original name is referenced but the obf name is NOT (or original refs
   > obf refs), rename the declaration back to the original name.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from dataclasses import dataclass
from typing import Dict, List, Tuple

# /* renamed from: a */  or  /* renamed from: a, reason: collision ... */
RENAME_RE = re.compile(r"/\*\s*renamed from:\s*([A-Za-z_$][A-Za-z0-9_$]*)\s*(?:,\s*reason:[^*]*)?\*/")
# field declaration: optional modifiers, type, name, (; or =)
FIELD_DECL_RE = re.compile(
    r"^\s*(?:public|protected|private|static|final|transient|volatile|\s)*"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$][\w$]*)\s*(=|;)"
)


@dataclass
class Rename:
    path: str
    line_idx: int
    obf_name: str
    orig_name: str
    class_simple: str


def simple_class_name(path: str) -> str:
    base = os.path.basename(path)
    return base[:-5] if base.endswith(".java") else base


def scan(files: List[str]) -> List[Rename]:
    out: List[Rename] = []
    for path in files:
        try:
            with open(path, "r", encoding="utf-8", errors="replace") as fh:
                lines = fh.readlines()
        except OSError:
            continue
        cls = simple_class_name(path)
        for i, line in enumerate(lines):
            m = RENAME_RE.search(line)
            if not m:
                continue
            orig = m.group(1)
            # the next non-blank line should be the declaration
            j = i + 1
            while j < len(lines) and lines[j].strip() == "":
                j += 1
            if j >= len(lines):
                continue
            fdm = FIELD_DECL_RE.match(lines[j])
            if not fdm:
                continue
            obf = fdm.group(2)
            if obf == orig:
                continue
            out.append(Rename(path, j, obf, orig, cls))
    return out


def count_refs(files: List[str], text_index: Dict[str, str], cls: str,
               name: str) -> int:
    """Count ``cls.name`` references that look like a FIELD access (not a call)."""
    pat_field = re.compile(r"\b" + re.escape(cls) + r"\." + re.escape(name) + r"\b(?!\s*\()")
    pat_field2 = re.compile(r"\b" + re.escape(cls) + r"\.a\." + re.escape(name) + r"\b(?!\s*\()")
    total = 0
    for path, text in text_index.items():
        total += len(pat_field.findall(text))
        total += len(pat_field2.findall(text))
    return total


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root", help="e.g. app/src/main/java")
    ap.add_argument("--apply", action="store_true")
    ap.add_argument("--min-orig", type=int, default=1,
                    help="require at least this many original-name refs")
    args = ap.parse_args()

    files: List[str] = []
    for root, _dirs, names in os.walk(args.src_root):
        for n in names:
            if n.endswith(".java"):
                files.append(os.path.join(root, n))

    text_index: Dict[str, str] = {}
    for p in files:
        try:
            with open(p, "r", encoding="utf-8", errors="replace") as fh:
                text_index[p] = fh.read()
        except OSError:
            text_index[p] = ""

    renames = scan(files)
    # group by (class, name) to dedupe
    by_key: Dict[Tuple[str, str], Rename] = {}
    for r in renames:
        by_key[(r.class_simple, r.path)] = r

    applied: List[Rename] = []
    for r in by_key.values():
        orig_refs = count_refs(files, text_index, r.class_simple, r.orig_name)
        obf_refs = count_refs(files, text_index, r.class_simple, r.obf_name)
        if orig_refs >= args.min_orig and orig_refs > obf_refs:
            applied.append(r)

    print(f"candidates: {len(by_key)}, to-apply: {len(applied)}")
    if args.apply:
        # group by path to write once
        by_path: Dict[str, List[Rename]] = {}
        for r in applied:
            by_path.setdefault(r.path, []).append(r)
        for path, rs in by_path.items():
            with open(path, "r", encoding="utf-8", errors="replace") as fh:
                lines = fh.readlines()
            for r in rs:
                line = lines[r.line_idx]
                lines[r.line_idx] = re.sub(
                    r"\b" + re.escape(r.obf_name) + r"\b",
                    r.orig_name, line, count=1)
            with open(path, "w", encoding="utf-8") as fh:
                fh.writelines(lines)
        print(f"applied renames in {len(by_path)} files")
    else:
        for r in applied[:40]:
            print(f"  {r.class_simple}.{r.obf_name} -> .{r.orig_name}  ({r.path})")
    return 0


if __name__ == "__main__":
    sys.exit(main())
