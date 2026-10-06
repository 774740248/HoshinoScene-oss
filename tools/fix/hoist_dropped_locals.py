#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Hoist declarations for jadx-dropped locals.

Pattern handled: javac reports `cannot find symbol: variable V` at a site whose
source line is a simple assignment `V = <expr>;` (or `V = <expr> ;`) and V is
not declared anywhere in the enclosing file.  jadx dropped the original
declaration (typically a try/finally merge or a catch-merge).  We restore the
declaration by inserting `Type V;` (or `Type V = <expr>;` when the RHS is an
object literal that cannot live on its own) at the top of the enclosing method
body, inferring the declared Java type of `<expr>` from:

  1. `new Type(...)`            -> Type
  2. a `(Type) ...` cast        -> Type
  3. a simple identifier whose declaration we can find -> that type
  4. a method call `x.f()` whose enclosing class is known (rare) -> skip
  5. `null` / primitives        -> Object / boolean / int
  6. a `<Class>Var` / `<Class>VarN` receiver -> <Class>

Only a *simple identifier* LHS is accepted; anything else is skipped, keeping
the transform conservative.
"""
import os
import re
import sys
from collections import defaultdict

ROOT = "app/src/main/java"

# Parse javac log blocks: file, line, source-line text, symbol, location.
BLOCK_HDR = re.compile(r"^(/[^:]+\.java):(\d+): error: cannot find symbol")


def parse_log(path):
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    out = []
    i = 0
    n = len(lines)
    while i < n:
        m = BLOCK_HDR.match(lines[i])
        if not m:
            i += 1
            continue
        j = i + 1
        sym = None
        loc = None
        src = lines[i + 1] if i + 1 < n else ""
        while j < n and not lines[j].startswith("/"):
            t = lines[j].strip()
            if t.startswith("symbol:"):
                sym = t
            if t.startswith("location:"):
                loc = t
            j += 1
        out.append((m.group(1), int(m.group(2)), src.strip(), sym, loc))
        i = j
    return out


ASSIGN_LHS = re.compile(r"^([A-Za-z_$][A-Za-z0-9_$]*)\s*=\s*(.+?)\s*;\s*$")


def decl_type_of_rhs(rhs, file_decls, prims_map):
    rhs = rhs.strip()
    # new Type(...)
    m = re.match(r"new\s+([A-Za-z_$][A-Za-z0-9_$.<>]*)\s*\(", rhs)
    if m:
        return m.group(1)
    # cast (Type) expr  (allow generics)
    m = re.match(r"\(\s*([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s*\)", rhs)
    if m:
        return m.group(1)
    # simple identifier -> look up existing decl map
    if re.match(r"^[A-Za-z_$][A-Za-z0-9_$]*$", rhs):
        if rhs in prims_map:
            return prims_map[rhs]
        if rhs in file_decls:
            return file_decls[rhs]
        # VarN / Var suffix convention: strip trailing digits
        m2 = re.match(r"^([A-Za-z_$][A-Za-z0-9_$]*?)\d+$", rhs)
        if m2 and m2.group(1) in file_decls:
            return file_decls[m2.group(1)]
        return None
    # field/method receiver like x.y  -> unknown
    # literal null
    if rhs == "null":
        return "Object"
    if rhs in ("true", "false"):
        return "boolean"
    if re.match(r"^-?\d+$", rhs):
        return "int"
    if re.match(r"^-?\d+\.\d+f?$", rhs):
        return "float"
    return None


METHOD_SIG = re.compile(
    r"^(\s*)(?:public\s+|private\s+|protected\s+|static\s+|final\s+|synchronized\s+|native\s+|abstract\s+|transient\s+|volatile\s+)*"
    r"([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*\([^;{]*\)\s*(?:throws\s+[^{]+)?\{\s*$"
)
METHOD_SIG2 = re.compile(
    r"^\s*(?:public\s+|private\s+|protected\s+|static\s+|final\s+|synchronized\s+)*"
    r"([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*\([^;{]*\)\s*(?:throws\s+[^{]+)?\{\s*$"
)


def collect_file_decls(text):
    """Map simple var name -> declared java type, for locals & fields."""
    decls = {}
    # fields & locals: Type name [= ...];
    for m in re.finditer(
        r"(?:^|[;{(])\s*([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*(?:=[^;]*)?;",
        text,
    ):
        if m.group(1) in ("return", "new", "if", "for", "while", "else", "try", "catch", "throw", "assert", "this", "super", "case", "switch", "do"):
            continue
        decls.setdefault(m.group(2), m.group(1))
    # for-each: for (Type x : ...)
    for m in re.finditer(r"for\s*\(\s*([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*:", text):
        decls.setdefault(m.group(2), m.group(1))
    # catch (Type name)
    for m in re.finditer(r"catch\s*\(\s*([A-Za-z_$][A-Za-z0-9_$.<>\[\]]*)\s+([A-Za-z_$][A-Za-z0-9_$]*)\s*\)", text):
        decls.setdefault(m.group(2), m.group(1))
    return decls


def enclosing_method_insert_ln(lines, at_ln):
    """Return 1-based line number to insert a decl (just after the '{' of the
    enclosing method).  at_ln is the 1-based error line.  Returns None if not
    inside a method body we can locate."""
    depth = 0
    # Scan backwards tracking brace depth to find the method-opening brace.
    for li in range(at_ln - 1, -1, -1):
        line = lines[li]
        # crude brace count from right to left is hard; instead find the line
        # whose net still leaves us at the outer method body.
        # We count braces of the line and walk upward.
        pass
    # Robust: walk upward, maintain depth of *closing* - *opening* seen so far.
    closers = 0
    for li in range(at_ln - 2, -1, -1):
        line = lines[li]
        # strip strings/comments crudely
        for ch in reversed(line):
            if ch == "}":
                closers += 1
            elif ch == "{":
                if closers == 0:
                    # this '{' opens the block that contains at_ln.
                    # Determine if it is a method opening brace.
                    if METHOD_SIG.match(line) or METHOD_SIG2.match(line):
                        return li + 1  # insert after this line (convert to next idx)
                    # nested block (try/if/for) -> continue outward
                    closers = 0
                    continue
                closers -= 1
    return None


def process_file(path, sites):
    """sites: list of (line, rhs) to hoist for a given file."""
    lines = open(path, encoding="utf-8", errors="replace").read().split("\n")
    text = "\n".join(lines)
    file_decls = collect_file_decls(text)
    # primitives of very common names not otherwise declared
    prims_map = {}

    # Insert deepest-first so line numbers above stay valid.
    events = []
    for ln, rhs in sites:
        typ = decl_type_of_rhs(rhs, file_decls, prims_map)
        if not typ:
            continue
        ins = enclosing_method_insert_ln(lines, ln)
        if ins is None:
            continue
        # avoid duplicate declarations
        events.append((ins, ln, typ, rhs))

    if not events:
        return 0
    # group by insertion point, combine
    by_ins = defaultdict(list)
    for ins, ln, typ, rhs in events:
        by_ins[ins].append((ln, typ, rhs))

    added = 0
    for ins in sorted(by_ins.keys(), reverse=True):
        group = by_ins[ins]
        # dedupe by (typ, name) using the LHS name found at ln
        seen = set()
        decl_lines = []
        for ln, typ, rhs in sorted(group):
            m = ASSIGN_LHS.match(lines[ln - 1].strip())
            if not m:
                continue
            name = m.group(1)
            key = (typ, name)
            if key in seen:
                continue
            seen.add(key)
            decl_lines.append(f"        {typ} {name};")
            added += 1
        if decl_lines:
            lines[ins:ins] = decl_lines

    open(path, "w", encoding="utf-8").write("\n".join(lines))
    return added


def main():
    log = sys.argv[1] if len(sys.argv) > 1 else "/tmp/c11.txt"
    blocks = parse_log(log)
    per_file = defaultdict(list)
    for f, ln, src, sym, loc in blocks:
        if not sym or "variable" not in sym:
            continue
        if loc and "of type Object" in loc:
            continue  # handled by cast fixer
        m = ASSIGN_LHS.match(src)
        if not m:
            continue
        # ensure LHS is a bare leaked-looking identifier (not a field access)
        lhs = m.group(1)
        if "." in src.split("=")[0]:
            continue
        per_file[f].append((ln, m.group(2)))

    total = 0
    for f, sites in per_file.items():
        if not os.path.isfile(f):
            continue
        added = process_file(f, sites)
        if added:
            print(f"  +{added:3d} decl(s)  {f.split('/java/')[-1]}")
        total += added
    print(f"\nTOTAL hoisted decls: {total}")


if __name__ == "__main__":
    main()
