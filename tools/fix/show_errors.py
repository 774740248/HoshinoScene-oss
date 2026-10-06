#!/usr/bin/env python3
"""Print source lines for javac errors in one or more files (diagnostic helper).

Usage: python3 show_errors.py <build.log> <substr> [substr2 ...]
"""
import re
import sys

log = sys.argv[1]
subs = sys.argv[2:]
lines = open(log, encoding="utf-8", errors="replace").read().split("\n")
for i, l in enumerate(lines):
    m = re.match(r"^(\S+\.java):(\d+): error: (.+)$", l)
    if not m:
        continue
    if not any(s in m.group(1) for s in subs):
        continue
    code = lines[i + 1].strip() if i + 1 < len(lines) else ""
    print(f"{m.group(1).split('/')[-1]}:{m.group(2)}  {m.group(3)[:70]}")
    print(f"    {code[:130]}")
