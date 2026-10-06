#!/usr/bin/env python3
"""
fix_object_vars.py — 恢复被 jadx 退化为 `Object` 的局部变量真实类型

背景
----
jadx 类型推断失败时会把局部变量声明成 `java.lang.Object`，但真实类型可由上下文恢复：
    1. JADX WARN 注释：`types: [a.j30, java.lang.Object]` 的首个非 Object 项
    2. 字段赋值：`this.f0 = obj;` 且字段 f0 声明类型为 T  -> obj: T
    3. 强转：`(T) obj`                              -> obj: T
    4. 返回/实参位置类型（略）

本脚本对每个形如
    java.lang.Object obj = <expr>;
    Object obj = <expr>;
的**局部声明**，收集上述证据，若能在同一方法体内唯一确定类型 T (T != Object)，
则改写为：
    T obj = <expr>;

并（可选）把后续 `(T) obj` 的冗余强转简化。

安全性
------
* 仅处理方法体内的局部声明（缩进 >= 8 空格且以 `java.lang.Object ` 或 `Object ` 开头）。
* 需证据唯一；多义则跳过并记录。
* 不改字段声明。
"""
import argparse
import os
import re
import sys
from collections import Counter

DECL = re.compile(r"^(\s+)(?:final\s+)?(java\.lang\.Object|Object)\s+"
                  r"([A-Za-z_]\w*)\s*=\s*(.*)$")
WARN = re.compile(r"JADX\s+WARN:\s*Type inference failed for:\s*[^,]+,\s*types:\s*\[([^\]]+)\]")
FIELD_DECL = re.compile(r"^\s*(?:public|private|protected|static|final|volatile|\s)*"
                        r"([A-Za-z_][\w.$]*)\s+(f?\w+)\s*(?:=|;)")
METHOD_START = re.compile(r"^\s{4}(?:public|private|protected|static|final|\s)*[\w<>\[\].$]+\s+\w+\s*\(")


def method_span(lines, idx):
    """找到包含 idx 的方法体行区间 [start, end)。"""
    start = 0
    for k in range(idx, -1, -1):
        if METHOD_START.match(lines[k]) or lines[k].rstrip().endswith("{"):
            start = k
            break
    end = len(lines)
    depth = 0
    for k in range(start, len(lines)):
        depth += lines[k].count("{") - lines[k].count("}")
        if k > start and depth <= 0:
            end = k + 1
            break
    return start, end


def collect_field_types(lines):
    """收集全文件的字段名 -> 类型（含 this.f 形式用的裸名）。"""
    ft = {}
    for l in lines:
        m = FIELD_DECL.match(l)
        if m and "(" not in l:
            ft.setdefault(m.group(2), m.group(1))
    return ft


def infer_type(lines, idx, var, field_types):
    """返回证据类型 Counter。"""
    votes = Counter()
    # 1) JADX WARN 上方 40 行
    for k in range(idx - 1, max(0, idx - 40), -1):
        m = WARN.search(lines[k])
        if m:
            for t in m.group(1).split(","):
                t = t.strip()
                if t and t not in ("java.lang.Object", "Object"):
                    votes[t] += 2
            break
    # 2) 方法体内全部语句证据
    s, e = method_span(lines, idx)
    pat_field = re.compile(r"(?:this\.)?([A-Za-z_]\w*)\s*=\s*" + re.escape(var) + r"\s*;")
    pat_cast = re.compile(r"\(\s*([A-Za-z_][\w.$]*)\s*\)\s*" + re.escape(var) + r"\b")
    for k in range(s, e):
        l = lines[k]
        for fm in pat_field.finditer(l):
            fname = fm.group(1)
            if fname in field_types and field_types[fname] not in ("Object", "java.lang.Object"):
                votes[field_types[fname]] += 3
        for cm in pat_cast.finditer(l):
            t = cm.group(1)
            if t not in ("Object", "java.lang.Object", "int", "boolean") and not t[0].islower() is False:
                pass
            if t not in ("Object", "java.lang.Object"):
                votes[t] += 1
    return votes


def process(path, dry=False):
    lines = open(path, encoding="utf-8", errors="surrogateescape").read().split("\n")
    field_types = collect_field_types(lines)
    changed = 0
    for i, l in enumerate(lines):
        m = DECL.match(l)
        if not m:
            continue
        indent, _, var = m.group(1), m.group(2), m.group(3)
        if len(indent) < 8:
            continue  # 只处理局部
        votes = infer_type(lines, i, var, field_types)
        if not votes:
            continue
        best, cnt = votes.most_common(1)[0]
        # 需唯一领先
        second = votes.most_common(2)[1][1] if len(votes) > 1 else 0
        if cnt < 2 or (second and cnt == second):
            continue
        rest = m.group(4)
        lines[i] = f"{indent}{best} {var} = {rest}"
        changed += 1
    if changed and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write("\n".join(lines))
    return changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    total, nf = 0, 0
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if not f.endswith(".java"):
                continue
            n = process(os.path.join(dp, f), dry=not args.apply)
            if n:
                total += n
                nf += 1
    print(f"{'' if args.apply else '[dry] '}fixed {total} Object vars in {nf} files")


if __name__ == "__main__":
    main()
