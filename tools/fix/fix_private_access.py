#!/usr/bin/env python3
"""Widen visibility for members reported as ``has private access`` / ``has
protected access`` in another class.

    error: freezeApps has private access in ActivityFreezeApps

The decompiled callers live in a different package (``a``) from the declaring
class, so the member must be ``public``.  Widening a private/protected member to
public is behaviour-preserving and lets the callers compile.
"""

from __future__ import annotations

import argparse
import os
import re
import sys

ERR = re.compile(r"error: (\w+) has (?:private|protected) access in (\w+)")
DECL = re.compile(
    r"^([ \t]*)((?:public|private|protected|static|final|transient|volatile|abstract|\s)*)",
    re.M)


def find_class_file(simple: str, src_root: str):
    for root, _d, names in os.walk(src_root):
        if simple + ".java" in names:
            return os.path.join(root, simple + ".java")
    return None


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    lines = open(args.log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]
    pairs = set()
    for ln in lines:
        m = ERR.search(ln)
        if m:
            pairs.add((m.group(2), m.group(1)))

    print(f"member/class pairs: {len(pairs)}")
    fixed = 0
    for cls, member in sorted(pairs):
        path = find_class_file(cls, args.src_root)
        if not path:
            print(f"  ! not found: {cls}")
            continue
        text = open(path, "r", encoding="utf-8", errors="replace").read()
        out = text
        # field: modifiers Type member =|;
        fld = re.compile(r"^([ \t]*)((?:private|protected)\s+)((?:static|final|transient|volatile)\s+)*"
                         r"([A-Za-z_$][\w.$<>\[\]]*\s+" + re.escape(member) + r"\s*[=;])", re.M)
        out, n1 = fld.subn(lambda m: m.group(1) + "public " + (m.group(3) or "") + m.group(4), out)
        # method: modifiers Ret member(
        meth = re.compile(r"^([ \t]*)((?:private|protected)\s+)((?:static|final|abstract|synchronized|native)\s+)*"
                          r"([A-Za-z_$][\w.$<>\[\]]*\s+" + re.escape(member) + r"\s*\()", re.M)
        out, n2 = meth.subn(lambda m: m.group(1) + "public " + (m.group(3) or "") + m.group(4), out)
        if out != text:
            fixed += n1 + n2
            if args.apply:
                open(path, "w", encoding="utf-8").write(out)
            print(f"  {cls}.{member}: +{n1 + n2} -> public")
    print(f"{'applied' if args.apply else 'would apply'}: {fixed}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
