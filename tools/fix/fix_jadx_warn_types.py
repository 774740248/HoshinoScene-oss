#!/usr/bin/env python3
"""
fix_jadx_warn_types.py — 用 jadx 的 `Type inference failed` 注释恢复真实类型

背景
----
jadx 在无法推断寄存器类型时会写入：
    /* JADX WARN: Type inference failed for: r1v3, types: [a.b20, java.lang.Object] */
types 列表按「具体 -> 宽泛」排列；首项通常就是真实类型。jadx 却常退化输出
`java.lang.Object`，导致：
  * `X x = new java.lang.Object();`      -> 应为 `new X()`
  * `return new java.lang.Object();`     -> 应为 `new <首个候选>()`
  * `X x = (X) someObjectVar` 其实变量就是 X

修复规则（保守，全部要求有 WARN 依据）
----
1. 收集方法区间内的 `Type inference failed for: rXXvY, types: [T1, T2...]` 注释，
   记 reg -> T1（首个非 Object 候选优先，否则 T1）。
2. `new java.lang.Object()` 出现时：
   - 若在 `return` 语句：取最近 WARN 的首候选；
   - 若在 `T x = ...` 声明：取声明类型 T；
   - 若在 `this.field = ...` 赋值：取声明的字段类型。
3. 若无法确定，保留原样（不动）。

用法
----
    python3 tools/fix/fix_jadx_warn_types.py --dry
    python3 tools/fix/fix_jadx_warn_types.py --apply
"""
import argparse
import os
import re
import sys

WARN_RE = re.compile(
    r"JADX\s+WARN:\s*Type inference failed for:\s*(r\d+v\d+)"
    r"(?:,\s*types:\s*\[([^\]]+)\])?"
)
NEWOBJ_RE = re.compile(r"new\s+(?:java\.lang\.)?Object\s*\(\s*\)")
FIELD_DECL_RE = re.compile(r"^(\s*)(?:public|private|protected|static|final|\s)*"
                           r"([A-Za-z_][\w.$]*)\s+([A-Za-z_]\w*)\s*;")
DECL_RE = re.compile(r"^(\s*)([A-Za-z_][\w.$]*(?:<[^;=]*>)?(?:\[\])*)\s+"
                     r"([A-Za-z_]\w*)\s*=\s*(.*)$")


def first_type(raw):
    if not raw:
        return None
    parts = [p.strip() for p in raw.split(",") if p.strip()]
    for p in parts:
        if p not in ("java.lang.Object", "Object"):
            return p
    return parts[0] if parts else None


def fix_file(path, dry=False):
    text = open(path, encoding="utf-8", errors="surrogateescape").read()
    if "new java.lang.Object()" not in text and "new Object()" not in text:
        return 0
    lines = text.split("\n")
    # 收集 WARN: 行号 -> firstType
    warns = []
    for i, l in enumerate(lines):
        m = WARN_RE.search(l)
        if m:
            warns.append((i, first_type(m.group(2))))
    if not warns:
        return 0
    changed = 0

    def nearest_warn(ln, window=60):
        best = None
        for (wi, t) in warns:
            if wi <= ln and (ln - wi) <= window and t:
                best = t
        return best

    for i, l in enumerate(lines):
        if not NEWOBJ_RE.search(l):
            continue
        # 1) 纯 return 语句：`return new Object();`（排除三元/表达式内嵌）
        if re.match(r"^\s*return\s+" + NEWOBJ_RE.pattern + r"\s*;\s*$", l):
            t = nearest_warn(i)
            if t:
                lines[i] = NEWOBJ_RE.sub(f"new {t}()", l)
                changed += 1
            continue
        # 1b) 三元/赋值内嵌的 `new Object()`：不能用 return 的类型，跳过（由人工/其他规则处理）
        if re.search(r"\?", l):
            continue
        # 2) (T) new Object()  ->  new T()   （强转已指明真实类型，优先）
        cm = re.search(r"\(\s*([A-Za-z_][\w.$]*)\s*\)\s*" + NEWOBJ_RE.pattern, l)
        if cm:
            t = cm.group(1)
            lines[i] = re.sub(r"\(\s*" + re.escape(t) + r"\s*\)\s*" + NEWOBJ_RE.pattern,
                              f"new {t}()", l)
            changed += 1
            continue
        # 3) T x = new Object();
        dm = DECL_RE.match(l)
        if dm:
            t = dm.group(2)
            t = re.sub(r"\s*<.*>", "", t).strip()
            if t not in ("Object", "java.lang.Object"):
                lines[i] = NEWOBJ_RE.sub(f"new {t}()", l)
                changed += 1
                continue
        # 3) this.field = new Object();
        am = re.match(r"^(\s*)(?:this\.)?([A-Za-z_]\w*)\s*=\s*" + NEWOBJ_RE.pattern + r"\s*;", l)
        if am:
            t = nearest_warn(i)
            if t:
                lines[i] = NEWOBJ_RE.sub(f"new {t}()", l)
                changed += 1
    if changed and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write("\n".join(lines))
    return changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    total = 0
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if f.endswith(".java"):
                n = fix_file(os.path.join(dp, f), dry=not args.apply)
                if n:
                    print(f"{'[dry]' if not args.apply else ''} fixed {n}: {os.path.join(dp,f)}")
                    total += n
    print(f"TOTAL: {total}")


if __name__ == "__main__":
    main()
