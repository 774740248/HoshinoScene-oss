#!/usr/bin/env python3
"""
fix_inlined_anon.py — 还原 jadx 内联的合成类（`new Interface(args){...// from class: X`）

背景
----
R8 生成的合成类（如 a.m70 implements OnClickListener）被 jadx 内联成：
    view.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: a.m70
        public final /* synthetic */ a.ej1 d;
        { this.d = this; }
        @Override public final void onClick(android.view.View view) { ... }
    });
该写法非法（接口匿名类不能带构造参数）。

修复
----
用真实合成类替换整个匿名块：
    view.setOnClickListener(new a.m70(this));
合成类 a.m70 的 Java 源码需已存在（由 jadx 产出或从 smali 恢复）。

算法
----
1. 逐行扫描 `... new <Type>(<args>) { // from class: <Synthetic>` 
2. 用花括号配对找到匿名类体的结束 `}`
3. 检查 `<Synthetic>.java` 是否存在（含内部类 java 文件名 $ 形式）
4. 存在则替换为 `new <Synthetic>(<args>)`；否则记录待补类。
"""
import argparse
import os
import re
import sys

NEW_ANON = re.compile(
    r"(new\s+)([A-Za-z_][\w.$]*)\s*\(([^)]*)\)\s*\{\s*//\s*from class:\s*([A-Za-z_][\w.$]*)")


def java_path(root, cls):
    return os.path.join(root, cls.replace(".", "/") + ".java")


def process(path, root, dry=False):
    text = open(path, encoding="utf-8", errors="surrogateescape").read()
    changed, missing = 0, []
    out = []
    i = 0
    while i < len(text):
        m = NEW_ANON.search(text, i)
        if not m:
            out.append(text[i:])
            break
        out.append(text[i:m.start()])
        args = m.group(3)
        syn = m.group(4)
        # find matching brace starting at the '{' in m
        brace = text.index("{", m.start() + len(m.group(1)) + len(m.group(2)))
        depth = 0
        j = brace
        while j < len(text):
            if text[j] == "{":
                depth += 1
            elif text[j] == "}":
                depth -= 1
                if depth == 0:
                    break
            j += 1
        end = j + 1
        # 只替换到匿名类体的结束 `}`；保留其后的 `)` 与 `;`（属于外层调用）
        k = end
        if os.path.exists(java_path(root, syn)):
            out.append(f"new {syn}({args})")
            i = k
            changed += 1
        else:
            # cannot fix; keep original text up to end of block
            out.append(text[m.start():end])
            i = end
            missing.append(syn)
    if changed and not dry:
        open(path, "w", encoding="utf-8", errors="surrogateescape").write("".join(out))
    return changed, missing


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default="app/src/main/java")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    tot, miss = 0, set()
    for dp, _, fs in os.walk(args.root):
        for f in fs:
            if not f.endswith(".java"):
                continue
            n, m = process(os.path.join(dp, f), args.root, dry=not args.apply)
            if n:
                print(f"{'' if args.apply else '[dry] '}{n}: {os.path.join(dp,f)}")
                tot += n
            miss.update(m)
    print(f"TOTAL inlined-anon fixed: {tot}; missing classes: {len(miss)}")
    if miss:
        print("missing:", sorted(miss)[:40])


if __name__ == "__main__":
    main()
