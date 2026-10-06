#!/usr/bin/env python3
"""Unify split references for jadx-renamed fields.

Some fields are referenced by their ORIGINAL short name in some files and by the
jadx-renamed ``fNNN`` name in others (because the tree was patched in several
passes).  smali ground truth tells us the original name.  This script:

1. finds ``/* renamed from: X */`` field declarations whose new name matches the
   jadx numeric pattern (``f<digits><letters>``);
2. renames the declaration back to the original name ``X``;
3. rewrites every ``<Class>.<newname>`` reference in the whole tree to
   ``<Class>.<X>``.

A field and a method may share a name in Java, so the rename is legal even when
a method ``X`` exists in the same class.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from dataclasses import dataclass
from typing import Dict, List

RENAME_RE = re.compile(r"/\*\s*renamed from:\s*([A-Za-z_$][A-Za-z0-9_$]*)\s*(?:,\s*reason:[^*]*)?\*/")
FIELD_DECL_RE = re.compile(
    r"^\s*(?:(?:public|protected|private|static|final|transient|volatile)\s+|/\*[^*]*\*/?\s*|\s)*"
    r"([A-Za-z_$][\w.$]*(?:<[^>]*>)?(?:\[\])*)\s+"
    r"([A-Za-z_$][\w$]*)\s*(=|;)"
)
NUMERIC_NAME_RE = re.compile(r"^f\d+[a-z]?$")


@dataclass
class Rename:
    path: str
    line_idx: int
    obf_name: str
    orig_name: str
    class_simple: str
    qualified: str  # dotted, package-qualified class name, e.g. "a.q10"


def qualified_name(path: str, src_root: str) -> str:
    """Dotted package-qualified class name derived from the file path."""
    rel = os.path.relpath(path, src_root)
    rel = rel[:-5] if rel.endswith(".java") else rel
    return rel.replace(os.sep, ".")


def simple_class_name(path: str) -> str:
    base = os.path.basename(path)
    return base[:-5] if base.endswith(".java") else base


def scan(files: List[str], src_root: str) -> List[Rename]:
    out: List[Rename] = []
    for path in files:
        try:
            with open(path, "r", encoding="utf-8", errors="replace") as fh:
                lines = fh.readlines()
        except OSError:
            continue
        cls = simple_class_name(path)
        qual = qualified_name(path, src_root)
        for i, line in enumerate(lines):
            m = RENAME_RE.search(line)
            if not m:
                continue
            orig = m.group(1)
            j = i + 1
            while j < len(lines) and lines[j].strip() == "":
                j += 1
            if j >= len(lines):
                continue
            fdm = FIELD_DECL_RE.match(lines[j])
            if not fdm:
                continue
            obf = fdm.group(2)
            if obf == orig or not NUMERIC_NAME_RE.match(obf):
                continue
            out.append(Rename(path, j, obf, orig, cls, qual))
    return out


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    ap.add_argument("--only", default="", help="comma separated class simple names")
    args = ap.parse_args()

    files: List[str] = []
    for root, _dirs, names in os.walk(args.src_root):
        for n in names:
            if n.endswith(".java"):
                files.append(os.path.join(root, n))

    only = {s for s in args.only.split(",") if s}
    renames = [r for r in scan(files, args.src_root) if (not only or r.class_simple in only)]

    # dedupe by (path, obf)
    seen = set()
    uniq: List[Rename] = []
    for r in renames:
        key = (r.path, r.obf_name)
        if key in seen:
            continue
        seen.add(key)
        uniq.append(r)

    print(f"renamed-field candidates: {len(uniq)}")
    if not uniq:
        return 0

    if not args.apply:
        for r in uniq[:60]:
            print(f"  {r.class_simple}.{r.obf_name} -> .{r.orig_name}  ({r.path}:{r.line_idx+1})")
        return 0

    # 1) rewrite cross references <qualified.Class>.<obf> -> <qualified.Class>.<orig>
    #    We only match PACKAGE-QUALIFIED references (e.g. a.q10.f457a) to avoid
    #    colliding single-letter simple names (package ``a`` vs class ``a``).
    ref_rewrites = 0
    for path in files:
        with open(path, "r", encoding="utf-8", errors="replace") as fh:
            text = fh.read()
        orig_text = text
        for r in uniq:
            # qualified form: pkg.Class.obf  (class part escaped literally)
            pat = re.compile(r"(\b" + re.escape(r.qualified) + r")\." + re.escape(r.obf_name) + r"\b")
            text, n = pat.subn(lambda m: m.group(1) + "." + r.orig_name, text)
            ref_rewrites += n
        if text != orig_text:
            with open(path, "w", encoding="utf-8") as fh:
                fh.write(text)
    print(f"cross refs rewritten: {ref_rewrites}")

    # 2) rename inside each declaring file: every bare occurrence of the obf
    #    field name becomes the original name (declaration + self references).
    decl_fix = 0
    by_path2: Dict[str, List[Rename]] = {}
    for r in uniq:
        by_path2.setdefault(r.path, []).append(r)
    for path, rs in by_path2.items():
        with open(path, "r", encoding="utf-8", errors="replace") as fh:
            text = fh.read()
        for r in rs:
            text, n = re.subn(r"(?<![\w$])" + re.escape(r.obf_name) + r"(?![\w$])",
                              r.orig_name, text)
            decl_fix += n
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(text)
    print(f"declaration/self refs renamed: {decl_fix}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
