#!/usr/bin/env python3
"""
apply_method_deobf.py — 仅对「方法调用」应用库方法去混淆映射（安全版）

只处理两类明确形态：
  A. `((T) var).obfMethod(args)`         -> `((T) var).realMethod(args)`
  B. `var.obfMethod(args)` 其中 var 声明类型为库类 T -> 改名

严格约束：仅当 obfMethod 在 lib-method-map.json 中命中 T 时替换；
绝不把方法名替换成字段名（与字段映射分离）。
"""
import argparse
import json
import os
import re
import sys

RE_DECL = re.compile(r"\b([A-Za-z_][\w.$]*(?:\s*<[^;=]*>)?(?:\[\])*)\s+([A-Za-z_]\w*)\s*(?:=|;|:)")
RE_CASTASSIGN = re.compile(r"\b([A-Za-z_]\w*)\s*=\s*\(\s*([A-Za-z_][\w.$]*)\s*\)")


def internal(t):
    return t.replace(".", "/")


def var_types(src):
    vt = {}
    for m in RE_DECL.finditer(src):
        t, v = m.group(1), m.group(2)
        t = re.sub(r"\s*<.*>", "", t).strip()
        if t in ("return", "new", "else", "if", "while", "for", "switch", "case",
                 "class", "public", "private", "protected", "static", "final",
                 "abstract", "int", "boolean", "byte", "short", "char", "long",
                 "float", "double", "void"):
            continue
        vt.setdefault(v, internal(t))
    for m in RE_CASTASSIGN.finditer(src):
        v, t = m.group(1), m.group(2)
        vt.setdefault(v, internal(t))
    return vt


RE_CAST_CALL = re.compile(
    r"\(\s*\(\s*([A-Za-z_][\w.$]*)\s*\)\s*([A-Za-z_]\w*)\s*\)\s*\.\s*([A-Za-z_]\w*)\s*\(")
RE_VAR_CALL = re.compile(r"\b([A-Za-z_]\w*)\s*\.\s*([A-Za-z_]\w*)\s*\(")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--art", default="/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    mm = json.load(open(os.path.join(args.art, "lib-method-map.json")))
    bycls = {}
    for k, v in mm.items():
        c, o = k.split("#", 1)
        bycls.setdefault(c, {})[o] = v
    tot = 0
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if not f.endswith(".java"):
                continue
            p = os.path.join(dp, f)
            src = open(p, encoding="utf-8", errors="surrogateescape").read()
            if not any(f".{o}(" in src for c in bycls for o in bycls[c]):
                # quick skip
                pass
            vt = var_types(src)
            n = 0

            def rc(m):
                nonlocal n
                t, var, meth = internal(m.group(1)), m.group(2), m.group(3)
                if t in bycls and meth in bycls[t]:
                    n += 1
                    return f"(({m.group(1)}) {var}).{bycls[t][meth]}("
                return m.group(0)

            src = RE_CAST_CALL.sub(rc, src)

            def rv(m):
                nonlocal n
                var, meth = m.group(1), m.group(2)
                t = vt.get(var)
                if t and t in bycls and meth in bycls[t]:
                    n += 1
                    return f"{var}.{bycls[t][meth]}("
                return m.group(0)

            src = RE_VAR_CALL.sub(rv, src)
            if n:
                tot += n
                print(f"{'' if args.apply else '[dry] '}{n}: {p}")
                if args.apply:
                    open(p, "w", encoding="utf-8", errors="surrogateescape").write(src)
    print(f"TOTAL method renames: {tot}")


if __name__ == "__main__":
    main()
