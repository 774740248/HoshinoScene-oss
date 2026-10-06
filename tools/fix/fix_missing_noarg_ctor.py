#!/usr/bin/env python3
"""
fix_missing_noarg_ctor.py — 为「仅被 Object.<init> 构造」的类补上无参构造器

背景
----
R8 有时把 `new X(args)` 优化成：
    new-instance X; invoke-direct {x}, Ljava/lang/Object;-><init>()V
即直接调用 `Object.<init>`（跳过 X 自身构造器），随后直接写公有字段。
jadx 将其译为 `new X()`，但 X 的 Java 源码只有带参构造器 → 编译失败：
    constructor X in class X cannot be applied to given types; found: no arguments

修复
----
为这些 X 添加 `public X() {}`。这忠实对应 dex 的 `Object.<init>` 语义
（X 的带参构造器在本调用点未被使用），且不改变既有行为。

仅处理：smali 中确实存在 `new-instance LX;` 紧跟 `invoke-direct {..}, Ljava/lang/Object;-><init>()V`
的类 X，且 Java 源码中 X 无无参构造器。
"""
import argparse
import os
import re
import sys

NOARG = re.compile(r"public\s+(\w+)\s*\(\s*\)\s*\{")


def find_classes_with_object_init(smali_files):
    """返回 {internalClass: True} —— 存在 Object.<init> 直构证据的类。"""
    out = {}
    for p in smali_files:
        try:
            t = open(p, encoding="utf-8", errors="ignore").read()
        except OSError:
            continue
        # 查找 new-instance vN, LX; 后 4 行内 invoke-direct {..}, Ljava/lang/Object;-><init>()V
        for m in re.finditer(r"new-instance\s+(v\d+),\s*L([^;]+);", t):
            reg, cls = m.group(1), m.group(2)
            seg = t[m.end(): m.end() + 200]
            if re.search(r"invoke-direct\s+\{" + reg + r"\},\s*Ljava/lang/Object;-><init>\(\)V", seg):
                out[cls] = True
    return out


def add_noarg_ctor(path, clsname):
    src = open(path, encoding="utf-8", errors="surrogateescape").read()
    if NOARG.search(src):
        return False
    # 在类声明行 `{` 之后插入
    m = re.search(r"(public\s+(?:final\s+)?(?:abstract\s+)?class\s+" + re.escape(clsname) +
                  r"[^{]*\{)", src)
    if not m:
        return False
    ins = m.end()
    ctor = f"\n\n    public {clsname}() {{\n    }}\n"
    src = src[:ins] + ctor + src[ins:]
    open(path, "w", encoding="utf-8", errors="surrogateescape").write(src)
    return True


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    smali_files = []
    for dp, _, fs in os.walk(args.smali):
        for f in fs:
            if f.endswith(".smali"):
                smali_files.append(os.path.join(dp, f))
    evid = find_classes_with_object_init(smali_files)
    n = 0
    for internal in evid:
        jp = os.path.join(args.root, internal + ".java")
        if not os.path.exists(jp):
            continue
        clsname = internal.split("/")[-1]
        if args.apply:
            if add_noarg_ctor(jp, clsname):
                print(f"+ no-arg ctor: {jp}")
                n += 1
        else:
            src = open(jp, encoding="utf-8", errors="ignore").read()
            if not NOARG.search(src):
                print(f"[dry] need ctor: {jp}")
                n += 1
    print(f"TOTAL: {n}")


if __name__ == "__main__":
    main()
