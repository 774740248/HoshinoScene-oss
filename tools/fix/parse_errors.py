#!/usr/bin/env python3
"""Parse javac output into structured, de-duplicated error records.

Output (JSON lines): {file, line, col, kind, symbol, location, raw}
"""
from __future__ import annotations

import argparse
import json
import re
import sys
from typing import Dict, List

ERR_HEAD = re.compile(r"^(?P<file>[^:\n]+\.java):(?P<line>\d+): error: (?P<msg>.*)$")
# subsequent context lines: "symbol:   ...", "location: ...", "  symbol: ..."
SYM = re.compile(r"^\s*symbol:\s*(?:(\w+)\s+)?(\S+)\s*$")
LOC = re.compile(r"^\s*location:\s*(.*)$")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("--out", default="")
    args = ap.parse_args()

    lines = open(args.log, "r", encoding="utf-8", errors="replace").read().splitlines()
    recs: List[Dict] = []
    i = 0
    while i < len(lines):
        m = ERR_HEAD.match(lines[i])
        if not m:
            i += 1
            continue
        rec = {
            "file": m.group("file"),
            "line": int(m.group("line")),
            "msg": m.group("msg"),
        }
        j = i + 1
        while j < len(lines) and j < i + 8:
            sm = SYM.match(lines[j])
            lm = LOC.match(lines[j])
            if sm:
                rec["sym_kind"] = sm.group(1) or ""
                rec["symbol"] = sm.group(2)
            elif lm:
                rec["location"] = lm.group(1)
            elif lines[j].strip() and not lines[j].startswith(" "):
                break
            else:
                # stop when we hit the caret / code echo lines
                if lines[j].strip().startswith("^"):
                    pass
            j += 1
            if "symbol" in rec and "location" in rec:
                break
        recs.append(rec)
        i += 1

    with open(args.out, "w") as fh:
        for r in recs:
            fh.write(json.dumps(r, ensure_ascii=False) + "\n")
    print(f"parsed {len(recs)} errors -> {args.out}")

    # quick histogram by message shape
    from collections import Counter
    c = Counter(re.sub(r"\d+", "N", r["msg"]) for r in recs)
    for k, v in c.most_common(20):
        print(f"{v:6d}  {k}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
