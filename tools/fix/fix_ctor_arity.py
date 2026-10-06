#!/usr/bin/env python3
"""Add delegating constructors to fix ``constructor X cannot be applied`` errors.

R8 synthetic constructors (e.g. inner-class switch selectors) are often called
without their trailing synthetic args because jadx dropped the constant.  Where
the compiler reports

    constructor pc in class pc cannot be applied to given types;
      required: ActivityPerfBench,int
      found:    ActivityPerfBench

we add a delegating overload ``pc(ActivityPerfBench) { this(x, 0); }`` that keeps
the original constructor intact.  Similarly, when a constructor requires args
but is invoked with none we add a no-arg overload passing null/0.

The script parses a javac log, groups the errors, and edits the *declaring*
class file (found by simple name under the source root).
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

CTOR_ERR = re.compile(
    r"^([^:]+):(\d+): error: constructor (\w+) in class (\w+) cannot be applied to given types;")
REQ = re.compile(r"^\s*required:\s*(.*)$")
FND = re.compile(r"^\s*found:\s*(.*)$")

DEFAULT_FOR = {
    "int": "0", "long": "0L", "short": "(short) 0", "byte": "(byte) 0",
    "char": "'\\0'", "float": "0.0f", "double": "0.0d", "boolean": "false",
}


def defvalue(typ: str) -> str:
    typ = typ.strip()
    return DEFAULT_FOR.get(typ, "null")


def sane_type(typ: str) -> str:
    """Return a compilable Java type, or '' if the type is not usable."""
    t = typ.strip()
    if not t or "<" in t or ">" in t:
        return ""
    if not re.match(r"^[A-Za-z_$][\w.$]*(\[\])*$", t):
        return ""
    return t


def find_class_file(simple: str, src_root: str) -> Optional[str]:
    for root, _dirs, names in os.walk(src_root):
        f = simple + ".java"
        if f in names:
            return os.path.join(root, f)
    return None


def collect(log: str) -> Dict[Tuple[str, str], Tuple[List[str], List[str], int]]:
    """(class_simple, ctor_name) -> (required_types, found_types, count)."""
    lines = open(log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]
    out: Dict[Tuple[str, str], Tuple[List[str], List[str], int]] = {}
    i = 0
    while i < len(lines):
        m = CTOR_ERR.match(lines[i])
        if not m:
            i += 1
            continue
        ctor, cls = m.group(3), m.group(4)
        req: List[str] = []
        fnd: List[str] = []
        for k in range(i + 1, min(i + 6, len(lines))):
            rm = REQ.match(lines[k])
            fm = FND.match(lines[k])
            if rm:
                req = [t.strip() for t in rm.group(1).split(",") if t.strip()]
            if fm:
                fnd = [] if "no arguments" in fm.group(1) else [
                    t.strip() for t in fm.group(1).split(",") if t.strip()]
        key = (cls, ctor)
        if key not in out:
            out[key] = (req, fnd, 0)
        r, f, c = out[key]
        out[key] = (r, f, c + 1)
        i += 1
    return out


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    groups = collect(args.log)
    print(f"constructor error groups: {len(groups)}")

    # only handle the "missing trailing params" case: ctor's non-synthetic
    # prefix matches the found args (or found is empty)
    plan: Dict[str, List[Tuple[str, List[str], List[str]]]] = defaultdict(list)
    for (cls, ctor), (req, fnd, cnt) in groups.items():
        if not req:
            continue
        # build a delegating overload taking exactly `fnd` params (or no-arg)
        params = fnd if fnd else []
        plan[cls].append((ctor, params, req))

    applied = 0
    for cls, items in plan.items():
        path = find_class_file(cls, args.src_root)
        if not path:
            print(f"  ! class file not found: {cls}")
            continue
        text = open(path, "r", encoding="utf-8", errors="replace").read()
        additions: List[str] = []
        seen_sigs = set()
        for (ctor, params, req) in items:
            params = [p for p in params]
            if any(not sane_type(p) for p in params) or any(not sane_type(p) for p in req):
                continue
            args_list = []
            for idx, rtyp in enumerate(req):
                args_list.append("p" + str(idx) if idx < len(params) else defvalue(rtyp))
            param_decl = ", ".join(f"{t} p{i}" for i, t in enumerate(params))
            sig = f"{ctor}({param_decl})"
            if sig in seen_sigs:
                continue
            seen_sigs.add(sig)
            additions.append(f"\n    public {ctor}({param_decl}) {{\n"
                             f"        this({', '.join(args_list)});\n    }}\n")

        if not additions:
            continue
        if not args.apply:
            print(f"  {cls}: +{len(additions)} delegating ctor(s) in {path}")
            applied += len(additions)
            continue

        # insert after the class-declaration line (first line containing '{' that
        # opens the class body, matched at top level)
        lines = text.splitlines(keepends=True)
        insert_at = None
        depth = 0
        for idx, line in enumerate(lines):
            if insert_at is None and "{" in line and ("class " in line or "interface " in line):
                depth += line.count("{") - line.count("}")
                if depth > 0:
                    insert_at = idx + 1
                continue
        if insert_at is None:
            print(f"  ! could not find class body for {cls}")
            continue
        block = "".join(additions)
        lines.insert(insert_at, block)
        open(path, "w", encoding="utf-8").write("".join(lines))
        applied += len(additions)
        print(f"  fixed {cls}: +{len(additions)} ctor(s)")

    print(f"applied additions: {applied}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
