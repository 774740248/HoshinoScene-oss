#!/usr/bin/env python3
"""Replace ``Type x = new java.lang.Object();`` with ``Type x = new Type();``.

jadx emits ``new java.lang.Object()`` when it loses the constructed type but the
declaration on the left already tells us the real type.  Works for both fields
and locals.
"""

from __future__ import annotations

import argparse
import os
import re
import sys

PAT = re.compile(
    r"([A-Za-z_$][\w.$]*(?:\s*<[^;=]*>)?(?:\[\])*)\s+([A-Za-z_$][\w$]*)\s*=\s*new\s+java\.lang\.Object\s*\(\s*\)")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    total = 0
    files = 0
    for root, _d, names in os.walk(args.src_root):
        for n in names:
            if not n.endswith(".java"):
                continue
            path = os.path.join(root, n)
            text = open(path, "r", encoding="utf-8", errors="replace").read()
            out = []
            n_fix = 0
            for line in text.splitlines(keepends=True):
                def repl(m):
                    nonlocal n_fix
                    typ, var = m.group(1), m.group(2)
                    base = typ.strip()
                    # strip generics; keep array suffix
                    arr = ""
                    while base.endswith("[]"):
                        arr = "[]" + arr
                        base = base[:-2]
                    base = re.sub(r"<.*>", "", base).strip()
                    if base in ("Object", "java.lang.Object", "var"):
                        return m.group(0)
                    n_fix += 1
                    return f"{typ} {var} = new {base}{arr}()"
                out.append(PAT.sub(repl, line))
            total += n_fix
            if n_fix:
                files += 1
                if args.apply:
                    open(path, "w", encoding="utf-8").write("".join(out))
    print(f"{'applied' if args.apply else 'would apply'}: {total} fixes in {files} files")
    return 0


if __name__ == "__main__":
    sys.exit(main())
