#!/usr/bin/env python3
"""
fix_raw_foreach.py — 修复「原始(raw)集合」增强 for 循环导致的 Object 转换错误

背景
----
jadx 有时把集合声明为 raw 类型（`java.util.ArrayList` / `java.util.HashMap`），
元素类型退化为 Object，于是：
    for (a.zq1 zq1Var : this.f132a.values()) { ... }
javac 报 `incompatible types: Object cannot be converted to zq1`。

真实 dex 中，循环体首句往往是 `zq1Var.xxx`，说明元素真实类型即声明类型。
修复：把「被迭代的表达式」强转为 `Iterable<X>`：
    for (a.zq1 zq1Var : (Iterable<a.zq1>) this.f132a.values()) { ... }
（产生 unchecked 警告但语义正确，且与原 dex 的 check-cast 一致。）

判定（保守）
----
仅当：`for (T v : EXPR)` 且 EXPR 形如 `xxx.entrySet()`/`xxx.values()`/
`xxx.keySet()`/普通引用，且该 for 行对应的编译错误是 `Object cannot be converted
to T` 时才改。
"""
import argparse
import json
import os
import re
import sys

FOR_RE = re.compile(
    r"^(\s*)for\s*\(\s*([A-Za-z_][\w.$]*(?:<[^>]*>)?)\s+([A-Za-z_]\w*)\s*:\s*(.+?)\s*\)\s*\{?\s*$"
)


def process(path, fix_lines, dry=False):
    lines = open(path, encoding="utf-8", errors="surrogateescape").read().split("\n")
    changed = 0
    for ln in fix_lines:
        i = ln - 1
        if i < 0 or i >= len(lines):
            continue
        m = FOR_RE.match(lines[i])
        if not m:
            continue
        indent, typ, var, expr = m.group(1), m.group(2), m.group(3), m.group(4)
        if expr.startswith("(") and "Iterable<" in expr:
            continue
        lines[i] = f"{indent}for ({typ} {var} : (Iterable<{typ}>) {expr}) {{"
        changed += 1
    if changed and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write("\n".join(lines))
    return changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--errors", required=True, help="javac 输出文件")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    byfile = {}
    for l in open(args.errors, encoding="utf-8", errors="ignore"):
        m = re.match(r"\s*(/workspace/[^:]+\.java):(\d+): error: incompatible types: "
                     r"Object cannot be converted to (\S+)", l)
        if m:
            byfile.setdefault(m.group(1), []).append((int(m.group(2)), m.group(3)))
    total = 0
    for f, lst in byfile.items():
        n = process(f, [ln for ln, _ in lst], dry=not args.apply)
        if n:
            print(f"{'' if args.apply else '[dry] '}fixed {n}: {f}")
            total += n
    print(f"TOTAL foreach casts: {total}")


if __name__ == "__main__":
    main()
