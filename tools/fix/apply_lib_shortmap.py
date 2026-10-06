#!/usr/bin/env python3
"""Apply the DEX<->jar member-name alignment (lib_shortmap.json) to the
recovered `a/` sources.

Only METHOD short-names are rewritten (field alignment proved unreliable).
A rename is applied ONLY when the receiver's static type is known, so we never
guess. Two safe contexts are supported:

  A) cast receiver:   ((pkg.Class) expr).short(  ->  ((pkg.Class) expr).real(
  B) typed local/field receiver: for each local declared as a mapped library
     type, rewrite `<var>.short(` where `short` maps for that type.

Usage: python3 apply_lib_shortmap.py [--apply]
"""
import json
import os
import re
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
JAVA = os.path.join(ROOT, "app", "src", "main", "java")
MAP = os.path.join(ROOT, "tools", "fix", "lib_shortmap.json")


def load_map():
    with open(MAP) as fh:
        return json.load(fh)


def build_reverse(mapdata):
    """simple-class-name -> {short: real} for methods (only safe, real names)."""
    per = {}
    for fqn, members in mapdata.items():
        simple = fqn.split(".")[-1]
        mm = members.get("methods", {})
        # keep only genuine renames (skip identity like onMeasure->onMeasure)
        renames = {k: v for k, v in mm.items()
                   if k != v and k != "<init>" and k != "<clinit>"
                   and not k.startswith("access$")}
        if renames:
            per.setdefault(simple, {}).update(renames)
    return per


def apply_typed_receivers(src, per):
    """Rewrite `<var>.short(` where <var> is declared (local, field or param)
    with a mapped library type."""
    # collect declarations:  [modifiers] Type var [=;]  (Type may be FQN)
    decl_re = re.compile(
        r'\b(?:[A-Za-z_$][\w$]*\.)*([A-Za-z_$][\w$]*)\s+([A-Za-z_$][\w$]*)\s*(?=[=;,)])')
    typed = {}
    # method parameters:  Type name,
    for m in re.finditer(r'\b(?:[A-Za-z_$][\w$]*\.)*([A-Za-z_$][\w$]*)\s+([A-Za-z_$][\w$]*)\s*(?=[,)])', src):
        tname, var = m.group(1), m.group(2)
        if tname in per:
            typed[var] = tname
    for m in decl_re.finditer(src):
        tname, var = m.group(1), m.group(2)
        if tname in per:
            typed[var] = tname
    if not typed:
        return src, 0
    count = 0

    def repl(m):
        nonlocal count
        var, short = m.group(1), m.group(2)
        base = var.split(".")[-1]
        t = typed.get(base)
        if t and short in per[t]:
            count += 1
            return f"{var}.{per[t][short]}("
        return m.group(0)

    use = re.compile(r'(?<![.\w])((?:this\.)?[A-Za-z_$][\w$]*)\.([a-z][\w$]{0,3})\(')
    src = use.sub(repl, src)
    return src, count


def apply_cast_receivers(src, mapdata, fqn2simple):
    """Rewrite `((FQN) expr).short(` -> `((FQN) expr).real(`."""
    count = 0

    def repl(m):
        nonlocal count
        prefix, fqn, short = m.group(1), m.group(3), m.group(4)
        if fqn in mapdata and short in mapdata[fqn].get("methods", {}):
            real = mapdata[fqn]["methods"][short]
            if real != short:
                count += 1
                return f"{prefix}{real}("
        return m.group(0)

    pat = re.compile(
        r'((\(\s*\(((?:[a-zA-Z_$][\w$]*\.)+[A-Z_$][\w$]*)\)\s*[^()]*\)\s*\.\s*))'
        r'([a-z][\w$]{0,3})\(')
    src = pat.sub(repl, src)
    return src, count


def main():
    apply = "--apply" in sys.argv
    mapdata = load_map()
    per = build_reverse(mapdata)
    total_files = 0
    total_ren = 0
    for root, _dirs, files in os.walk(JAVA):
        for f in files:
            if not f.endswith(".java"):
                continue
            path = os.path.join(root, f)
            with open(path, encoding="utf-8") as fh:
                src = fh.read()
            new, c1 = apply_typed_receivers(src, per)
            new, c2 = apply_cast_receivers(new, mapdata, per)
            if new != src:
                total_files += 1
                total_ren += c1 + c2
                if apply:
                    with open(path, "w", encoding="utf-8") as fh:
                        fh.write(new)
    print(f"lib-shortmap: {total_ren} renames in {total_files} files "
          f"({'APPLIED' if apply else 'dry-run'})")


if __name__ == "__main__":
    main()
