#!/usr/bin/env python3
"""
apply_lib_deobf.py — 把库类成员（字段/方法）去混淆映射应用到 Java 源码

输入
----
  lib-field-map.json     { "LClass#obfField": "realField" }
  androidx-member-map.json { "LClass#obfMethod": "realMethod" }

算法
----
1. 对每个 .java 文件，先扫描建立「变量 -> 声明类型」表：
     * `T v = ...;` / `T v;`
     * `... = (T) expr` 赋值给 `x` → x 的类型为 T（若 T 是库类型且 x 之前未知）
2. 再扫描全部语句，对形如 `expr.<obf>` 的成员访问：
     * 若 `expr` 是简单标识符，且其声明类型 T 在映射中命中 `LClass#obf`，则改名为真名。
     * 若 `expr` 形如 `((T) x)`，则直接用 T 查表。
3. 字段与方法分开处理，冲突时以字段优先（`x.q` 形式）。

只做「已知类型且映射唯一命中」的替换，避免误伤。
"""
import argparse
import json
import os
import re
import sys

# 变量声明类型捕获
RE_DECL = re.compile(
    r"\b([A-Za-z_][\w.$]*(?:\s*<[^;=]*>)?(?:\[\])*)\s+([A-Za-z_]\w*)\s*(?:=|;|:)")
RE_CASTASSIGN = re.compile(
    r"\b([A-Za-z_]\w*)\s*=\s*\(\s*([A-Za-z_][\w.$]*)\s*\)\s*[^;]+;")


def internal(t):
    return t.replace(".", "/")


def collect_var_types(src):
    """返回 {varName: internalTypeName}"""
    vt = {}
    for m in RE_DECL.finditer(src):
        t, v = m.group(1), m.group(2)
        t = re.sub(r"\s*<.*>", "", t).strip()
        if t in ("return", "new", "else", "if", "while", "for", "switch",
                 "case", "class", "public", "private", "protected", "static",
                 "final", "abstract", "int", "boolean", "byte", "short", "char",
                 "long", "float", "double", "void"):
            continue
        vt.setdefault(v, internal(t))
    for m in RE_CASTASSIGN.finditer(src):
        v, t = m.group(1), m.group(2)
        if t not in ("int", "boolean", "byte", "short", "char", "long", "float",
                     "double", "Object", "String"):
            vt.setdefault(v, internal(t))
    return vt


def build_member_index(field_map, method_map):
    """{internalClass: {'f': {obf: real}, 'm': {obf: real}}}"""
    idx = {}
    for key, real in field_map.items():
        if "#" not in key:
            continue
        cls, obf = key.split("#", 1)
        idx.setdefault(cls, {"f": {}, "m": {}})[  "f"][obf] = real
    for key, real in method_map.items():
        if "#" not in key:
            continue
        cls, obf = key.split("#", 1)
        idx.setdefault(cls, {"f": {}, "m": {}})[  "m"][obf] = real
    return idx


# 匹配 `((T) var).member` 或 `var.member`
RE_CAST_ACCESS = re.compile(r"\(\s*\(\s*([A-Za-z_][\w.$]*)\s*\)\s*([A-Za-z_]\w*)\s*\)\s*\.\s*([A-Za-z_]\w*)")
RE_VAR_ACCESS = re.compile(r"\b([A-Za-z_]\w*)\s*\.\s*([A-Za-z_]\w*)\b")


def process_file(path, idx, dry=False):
    src = open(path, encoding="utf-8", errors="surrogateescape").read()
    vt = collect_var_types(src)
    nf = nm = 0

    def repl_cast(m):
        nonlocal nf, nm
        t, var, mem = internal(m.group(1)), m.group(2), m.group(3)
        ent = idx.get(t)
        if not ent:
            return m.group(0)
        if mem in ent["f"]:
            nf += 1
            return f"(({m.group(1)}) {var}).{ent['f'][mem]}"
        if mem in ent["m"]:
            nm += 1
            return f"(({m.group(1)}) {var}).{ent['m'][mem]}"
        return m.group(0)

    src = RE_CAST_ACCESS.sub(repl_cast, src)

    def repl_var(m):
        nonlocal nf, nm
        var, mem = m.group(1), m.group(2)
        t = vt.get(var)
        if not t:
            return m.group(0)
        ent = idx.get(t)
        if not ent:
            return m.group(0)
        if mem in ent["f"]:
            nf += 1
            return f"{var}.{ent['f'][mem]}"
        if mem in ent["m"]:
            nm += 1
            return f"{var}.{ent['m'][mem]}"
        return m.group(0)

    src = RE_VAR_ACCESS.sub(repl_var, src)
    if (nf or nm) and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write(src)
    return nf, nm


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--art", default="/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000")
    ap.add_argument("--dry", action="store_true")
    args = ap.parse_args()
    fm = json.load(open(os.path.join(args.art, "lib-field-map.json")))
    mm_path = os.path.join(args.art, "androidx-member-map.json")
    mm = json.load(open(mm_path)) if os.path.exists(mm_path) else {}
    idx = build_member_index(fm, mm)
    print(f"index: {len(idx)} classes, "
          f"{sum(len(v['f']) for v in idx.values())} fields, "
          f"{sum(len(v['m']) for v in idx.values())} methods", file=sys.stderr)
    tf = tm = 0
    nfiles = 0
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if not f.endswith(".java"):
                continue
            nf, nm = process_file(os.path.join(dp, f), idx, args.dry)
            if nf or nm:
                nfiles += 1
            tf += nf
            tm += nm
    print(f"renamed: {tf} field refs, {tm} method refs in {nfiles} files", file=sys.stderr)


if __name__ == "__main__":
    main()
