#!/usr/bin/env python3
"""Recover wrong local-variable types using the ``cannot find symbol`` errors.

When jadx loses a local's type it often picks the *first* candidate type from a
``JADX WARN`` comment, which can be wrong.  The compiler then reports e.g.

    file.java:31: error: cannot find symbol
        obj3.n = -1;
        ^
      symbol:   variable n
      location: variable obj3 of type gx

i.e. ``obj3`` is typed ``gx`` but the body accesses members ``gx`` does not have.
The real type is the class that *does* declare those members.

Algorithm
---------
1. Parse the javac log; collect, per (file, var), the set of missing members and
   the (wrong) inferred type.
2. For each such ``var``, look at the file for its initialiser
   (``Type var = new Type(...)`` / ``Type var = ...``) and gather the member
   names actually used on it (``var.<name>``).
3. Find the candidate class among {declared type, JADX-WARN candidates, smali
   ``new-instance`` right before the access, classes whose field set is a
   superset of the used members} that declares ALL used members.
4. Rewrite the declaration's type (and the ``new X()`` if present) to the winner.

Only rewrites when a UNIQUE candidate is found.
"""

from __future__ import annotations

import argparse
import os
import re
import sys
from collections import defaultdict
from typing import Dict, List, Optional, Set, Tuple

ERR_HEAD = re.compile(r"^([^:]+\.java):(\d+): error: cannot find symbol$")
SYM = re.compile(r"^\s*symbol:\s*(?:(\w+)\s+)?(\S+)\s*$")
LOC = re.compile(r"^\s*location:\s*variable (\w+) of type (\S+)$")
WARN = re.compile(r"types:\s*\[([^\]]+)\]")
DECL = re.compile(
    r"^(\s+)([A-Za-z_$][\w.$]*)\s+(\w+)\s*=\s*(new\s+[A-Za-z_$][\w.$]*\s*\(.*)?$")


def collect(log: str) -> Dict[Tuple[str, str], Tuple[str, Set[str]]]:
    lines = open(log, "r", encoding="utf-8", errors="replace").read().splitlines()[:10805]
    out: Dict[Tuple[str, str], Tuple[str, Set[str]]] = {}
    i = 0
    while i < len(lines):
        m = ERR_HEAD.match(lines[i])
        if not m:
            i += 1
            continue
        f = m.group(1)
        kind = sym = loc = ltype = None
        for k in range(i + 1, min(i + 6, len(lines))):
            s = SYM.match(lines[k]); l = LOC.match(lines[k])
            if s:
                kind = (s.group(1) or "").strip(); sym = s.group(2)
            if l:
                loc = l.group(1); ltype = l.group(2)
            if kind and loc:
                break
        if loc and ltype and kind == "variable" and sym and sym != loc:
            key = (f.strip(), loc)
            _, members = out.get(key, (ltype, set()))
            members.add(sym)
            out[key] = (ltype, members)
        i += 1
    return out


def class_members(cls: str, file_text: str, src_root: str) -> Set[str]:
    """Field/method names declared by class `cls` (simple name)."""
    path = None
    for root, _d, names in os.walk(src_root):
        if cls + ".java" in names:
            path = os.path.join(root, cls + ".java")
            break
    if not path:
        return set()
    text = open(path, "r", encoding="utf-8", errors="replace").read()
    members = set()
    for m in re.finditer(r"^\s*(?:public|private|protected|static|final|transient|volatile|\s)*"
                         r"[A-Za-z_$][\w.$<>\[\]]*\s+([A-Za-z_$]\w*)\s*(?:[=;(])", text, re.M):
        members.add(m.group(1))
    for m in re.finditer(r"^\s*(?:public|private|protected|static|final|abstract|\s)*"
                         r"[A-Za-z_$][\w.$<>\[\]]*\s+([A-Za-z_$]\w*)\s*\(", text, re.M):
        members.add(m.group(1))
    return members


def find_decl(file_text: str, var: str) -> Optional[re.Match]:
    pat = re.compile(r"^(\s+)([A-Za-z_$][\w.$]*)\s+" + re.escape(var) + r"\s*=", re.M)
    return pat.search(file_text)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("log")
    ap.add_argument("src_root")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    groups = collect(args.log)
    print(f"vars with wrong/missing members: {len(groups)}")

    # group by file
    by_file: Dict[str, List[Tuple[str, str, Set[str]]]] = defaultdict(list)
    for (f, var), (ltype, members) in groups.items():
        by_file[f].append((var, ltype, members))

    applied = 0
    for f, items in by_file.items():
        f = f.strip()
        if not os.path.exists(f):
            continue
        text = open(f, "r", encoding="utf-8", errors="replace").read()
        warns = [m.group(1) for m in WARN.finditer(text)]
        new_text = text
        for (var, ltype, members) in items:
            dm = find_decl(new_text, var)
            if not dm:
                continue
            cands: List[str] = []
            cands.append(ltype)
            for w in warns:
                for t in w.split(","):
                    t = t.strip().split(".")[-1]
                    if t and t not in ("java.lang.Object", "Object") and t not in cands:
                        cands.append(t)
            winner = None
            for c in cands:
                cm = class_members(c, new_text, args.src_root)
                if members and members <= cm:
                    winner = c
                    break
            if not winner or winner == ltype:
                continue
            # rewrite the declaration type
            line_start = dm.start()
            old = dm.group(0)
            new = dm.group(1) + winner + " " + var + " ="
            # preserve the rest of the line
            line_end = new_text.find("\n", dm.start())
            rest = new_text[dm.end():line_end]
            repl = dm.group(1) + winner + " " + var + " =" + rest
            new_text = new_text[:line_start] + repl + new_text[line_end:]
            # fix `new ltype(` -> `new winner(`
            new_text = re.sub(r"new\s+[A-Za-z_$][\w.$]*\." + re.escape(ltype) + r"\s*\(",
                              "new " + winner + "(", new_text)
            applied += 1
        if args.apply and new_text != text:
            open(f, "w", encoding="utf-8").write(new_text)

    print(f"{'applied' if args.apply else 'would apply'}: {applied}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
