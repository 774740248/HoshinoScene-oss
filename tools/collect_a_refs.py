#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""collect_a_refs.py — 统计 `com.omarea` 代码对混淆 `a` 包的引用，产出依赖清单。

产出 ``docs/obfuscation-dependency-list.md``：列出全部被引用的 `a` 类、
被引用次数、引用来源文件，并标注「已解析 / 未解析」。

用法
----
    python3 tools/collect_a_refs.py
"""

from __future__ import annotations

import argparse
import re
from collections import Counter, defaultdict
from pathlib import Path
from typing import Dict, List, Set

_A_REF_RE = re.compile(r"\ba\.([A-Za-z0-9_]+)")


def main(argv: List[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description="收集 a 包引用，生成混淆依赖清单")
    parser.add_argument("--root", default=str(Path(__file__).resolve().parent.parent))
    args = parser.parse_args(argv)

    root = Path(args.root).resolve()
    omarea_root = root / "app" / "src" / "main" / "java" / "com" / "omarea"
    a_root = root / "app" / "src" / "main" / "java" / "a"

    a_classes: Set[str] = {p.stem for p in a_root.glob("*.java")} if a_root.exists() else set()

    counter: Counter = Counter()
    ref_files: Dict[str, Set[str]] = defaultdict(set)
    for jf in omarea_root.rglob("*.java"):
        text = jf.read_text(encoding="utf-8", errors="replace")
        rel = str(jf.relative_to(root))
        for m in _A_REF_RE.finditer(text):
            cls = m.group(1)
            counter[cls] += 1
            ref_files[cls].add(rel)

    resolved = sorted(c for c in counter if c in a_classes)
    unresolved = sorted(c for c in counter if c not in a_classes)

    lines: List[str] = []
    lines.append("# 混淆依赖清单（obfuscation-dependency-list）")
    lines.append("")
    lines.append("> 由 `tools/collect_a_refs.py` 生成。")
    lines.append("> 范围：`app/src/main/java/com/omarea/**` 对 `app/src/main/java/a/**` 的引用。")
    lines.append("")
    lines.append("## 汇总")
    lines.append("")
    lines.append(f"- `a` 包类文件总数：{len(a_classes)}")
    lines.append(f"- 被自有代码引用的不同 `a` 类：{len(counter)}")
    lines.append(f"- 已解析：{len(resolved)}；未解析：{len(unresolved)}")
    lines.append(f"- 引用总次数：{sum(counter.values())}")
    lines.append("")
    lines.append("## 已解析引用（Top 100，按次数降序）")
    lines.append("")
    lines.append("| `a` 类 | 引用次数 | 引用文件数 |")
    lines.append("|--------|--------:|----------:|")
    for cls in sorted(resolved, key=lambda c: counter[c], reverse=True)[:100]:
        lines.append(f"| `a.{cls}` | {counter[cls]} | {len(ref_files[cls])} |")
    lines.append("")
    lines.append("## 未解析引用（疑似 jadx 缺口）")
    lines.append("")
    if unresolved:
        lines.append("| `a` 类 | 引用次数 | 引用文件样例 |")
        lines.append("|--------|--------:|--------------|")
        for cls in sorted(unresolved, key=lambda c: counter[c], reverse=True):
            sample = ", ".join(sorted(ref_files[cls])[:3])
            lines.append(f"| `a.{cls}` | {counter[cls]} | {sample} |")
    else:
        lines.append("- 无")
    lines.append("")

    out = root / "docs" / "obfuscation-dependency-list.md"
    out.parent.mkdir(parents=True, exist_ok=True)
    out.write_text("\n".join(lines), encoding="utf-8")

    print("=" * 60)
    print("collect_a_refs.py 完成")
    print("=" * 60)
    print(f"a 包类文件总数        : {len(a_classes)}")
    print(f"被引用不同 a 类       : {len(counter)}")
    print(f"已解析 / 未解析       : {len(resolved)} / {len(unresolved)}")
    print(f"引用总次数            : {sum(counter.values())}")
    print(f"输出                  : {out}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
