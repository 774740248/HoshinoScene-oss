#!/usr/bin/env python3
"""Drop ``final`` from fields/locals that javac reports as reassigned.

    error: cannot assign a value to final variable e
      location: ...

R8 keeps ``final`` on some fields, but the decompiled body reassigns them (the
original code used a non-final synthetic).  Removing ``final`` is
semantics-preserving for our purposes and lets the code compile.
"""

from __future__ import annotations

import argparse
import os
import re
import sys

ERR = re.compile(r"^([^:]+\.java):(\d+): error: cannot assign a value to final variable (\w+)$")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    lines = open(args.log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]
    # file -> set(var)
    per_file = {}
    for ln in lines:
        m = ERR.match(ln)
        if m:
            per_file.setdefault(m.group(1), set()).add(m.group(3))

    print(f"files: {len(per_file)}")
    total = 0
    for path, names in per_file.items():
        if not os.path.exists(path):
            continue
        text = open(path, "r", encoding="utf-8", errors="replace").read()
        out = text
        n = 0
        for var in names:
            # field decl:  (modifiers) Type var = ... ;   remove the final token
            pat = re.compile(r"(^[ \t]*(?:public|private|protected|static|transient|volatile|\s)*)"
                             r"final\s+([A-Za-z_$][\w.$<>\[\]]*\s+" + re.escape(var) + r"\s*[=;])",
                             re.M)
            out, k = pat.subn(lambda m: m.group(1) + m.group(2), out)
            n += k
            # local decl:  final Type var = ...
            pat2 = re.compile(r"(\bfinal\s+)([A-Za-z_$][\w.$<>\[\]]*\s+" + re.escape(var) + r"\s*=)")
            out, k2 = pat2.subn(lambda m: m.group(2), out)
            n += k2
        total += n
        if args.apply and out != text:
            open(path, "w", encoding="utf-8").write(out)
    print(f"{'applied' if args.apply else 'would apply'}: {total} final-removals")
    return 0


if __name__ == "__main__":
    sys.exit(main())
