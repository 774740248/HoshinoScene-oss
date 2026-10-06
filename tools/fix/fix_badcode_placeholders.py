#!/usr/bin/env python3
"""
fix_badcode_placeholders.py — 修复 jadx --show-bad-code 遗留的 `??` 占位类型

模式：
    ?? obj = new Object();
    ((ng1) obj).a = ...;
→
    ng1 obj = new ng1();
    obj.a = ...;

以及
    ?? obj = new Object();
    X x = (X) obj;
→
    X obj = new X();

判定依据：变量声明后，首次对该变量的使用是 `((T) var)` 形式的强转，
则真实类型即 T。若首次使用是 `(T) var`，同理。

只处理声明行形如 `?? <name> = new Object();` 的情形，绝不触碰字符串字面量
中的 "??"。
"""
import argparse
import os
import re
import shutil
import sys

DECL_RE = re.compile(r"^(\s*)\?\?\s+([A-Za-z_][A-Za-z0-9_]*)\s*=\s*new\s+Object\s*\(\s*\)\s*;\s*$")
CAST_PAREN = r"\(\(([A-Za-z_][\w.$]*)\)\s*%s\s*\)"  # ((T) var )...
CAST_PLAIN = r"\(([A-Za-z_][\w.$]*)\)\s*%s(?![A-Za-z0-9_])"


def find_type(lines, idx, var):
    """在 idx 之后查找 var 的首次强转类型。"""
    p1 = re.compile(CAST_PAREN % re.escape(var))
    p2 = re.compile(CAST_PLAIN % re.escape(var))
    for l in lines[idx + 1 : idx + 40]:
        m = p1.search(l) or p2.search(l)
        if m:
            t = m.group(1)
            if t not in ("Object", "java.lang.Object"):
                return t
    return None


def strip_redundant_cast(line, var, typ):
    """把 ((T) var) 简化成 (var)，因为 var 已声明为 T。"""
    line = re.sub(r"\(\(%s\)\s*%s\s*\)" % (re.escape(typ), re.escape(var)), var, line)
    return line


def process(path, dry=False):
    src = open(path, encoding="utf-8", errors="surrogateescape").read()
    if "?? " not in src:
        return 0
    lines = src.split("\n")
    changed = 0
    for i, l in enumerate(lines):
        m = DECL_RE.match(l)
        if not m:
            continue
        indent, var = m.group(1), m.group(2)
        typ = find_type(lines, i, var)
        if not typ:
            print(f"  [warn] {path}:{i+1}: cannot infer type for {var}", file=sys.stderr)
            continue
        lines[i] = f"{indent}{typ} {var} = new {typ}();"
        # 清理后续冗余强转
        for j in range(i + 1, min(i + 40, len(lines))):
            nl = strip_redundant_cast(lines[j], var, typ)
            if nl != lines[j]:
                lines[j] = nl
        changed += 1
    if changed and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write("\n".join(lines))
    return changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--dry", action="store_true")
    args = ap.parse_args()
    total = 0
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if f.endswith(".java"):
                n = process(os.path.join(dp, f), args.dry)
                if n:
                    print(f"fixed {n}: {os.path.join(dp,f)}")
                    total += n
    print(f"TOTAL placeholders fixed: {total}")


if __name__ == "__main__":
    main()
