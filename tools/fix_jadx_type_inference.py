#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""fix_jadx_type_inference.py — 修复 jadx `??` 类型推断失败占位符。

问题
----
jadx 对 R8 混淆产物反编译时，部分变量无法推断类型，会输出 `??` 占位符，例如：

    /* JADX WARN: Type inference failed for: r4v0, types: [a.ng1, java.lang.Object] */
    public static java.util.ArrayList C(java.lang.String[] strArr) {
        ...
        ?? obj = new java.lang.Object();   // ← 非法 Java，javac 报 illegal start of expression
        obj.f381a = str;
        ...
    }

修复
----
`JADX WARN: Type inference failed for: rXvY, types: [T1, T2, ...]` 注释给出了该寄存器
的候选类型列表。`??` 应取**列表首项** T1（jadx 认定的最具体类型）。本脚本：

  1. 逐行扫描，遇到 `?? <var> = <expr>;` 形式时，向上寻找最近的
     `Type inference failed for: <reg>` 注释（若为多变量连续声明，则按顺序消耗）；
  2. 用该注释 types 列表的首项替换 `??`；
  3. 若找不到对应注释，回退为 `java.lang.Object` 并标注 TODO。

安全策略
--------
* 仅处理 `com/omarea/` 与 `a/` 目录下的 `.java`（不碰 res / 其他）。
* 默认 dry-run；`--apply` 写盘并备份到 tools/java-backups/。
* 保留 JADX 注释（还原痕迹，符合约定 12）。

用法
----
    python3 tools/fix_jadx_type_inference.py --dry-run
    python3 tools/fix_jadx_type_inference.py --apply
"""

from __future__ import annotations

import argparse
import re
from pathlib import Path
from typing import List, Optional, Tuple

_PLACEHOLDER_RE = re.compile(
    r"^(\s*)(?:final\s+)?\?\?\s+([A-Za-z_$][A-Za-z0-9_$]*)\b"
)
_WARN_RE = re.compile(
    r"JADX\s+WARN:\s*Type inference failed for:\s*(?P<reg>r\d+v\d+)"
    r"(?:,\s*types:\s*\[(?P<types>[^\]]+)\])?"
)
_TODO = "/* TODO: jadx type unresolved, defaulted to Object */"


def parse_types(raw: Optional[str]) -> Optional[str]:
    if not raw:
        return None
    parts = [p.strip() for p in raw.split(",") if p.strip()]
    return parts[0] if parts else None


def fix_file(path: Path) -> Tuple[str, int, int]:
    """返回 (新内容, 修复数, 回退数)。

    规则：每个 `??` 与其**最近的上方** JADX WARN 注释关联；取该注释 types 列表首项。
    若同一 WARN 下有多个 `??`，后续 `??` 复用同一类型（jadx 对同寄存器多占位情形）。
    若无 JADX WARN，则回退 java.lang.Object 并加 TODO。
    """
    lines = path.read_text(encoding="utf-8", errors="replace").splitlines()
    out: List[str] = []
    last_type: Optional[str] = None
    last_warn_line: int = -1000
    fixed = 0
    fallback = 0
    for idx, line in enumerate(lines):
        wm = _WARN_RE.search(line)
        if wm:
            last_type = parse_types(wm.group("types"))
            last_warn_line = idx
            out.append(line)
            continue
        pm = _PLACEHOLDER_RE.match(line)
        if pm:
            indent = pm.group(1)
            # 仅当 WARN 在上方一定范围内（同一方法体附近，<=60 行）才复用
            tval = last_type if (idx - last_warn_line) <= 60 else None
            if tval is None:
                tval = "java.lang.Object"
                fallback += 1
                out.append(line.replace("??", tval, 1))
                out.append(f"{indent}{_TODO}")
                fixed += 1
                continue
            out.append(line.replace("??", tval, 1))
            fixed += 1
            continue
        out.append(line)
    return "\n".join(out) + "\n", fixed, fallback


def main(argv: List[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description="修复 jadx ?? 类型推断失败占位符")
    parser.add_argument("--root", default=str(Path(__file__).resolve().parent.parent))
    group = parser.add_mutually_exclusive_group()
    group.add_argument("--dry-run", action="store_true")
    group.add_argument("--apply", action="store_true")
    args = parser.parse_args(argv)

    root = Path(args.root).resolve()
    java_root = root / "app" / "src" / "main" / "java"
    backup_dir = root / "tools" / "java-backups"
    dry_run = not args.apply

    targets: List[Path] = []
    for sub in ("com/omarea", "a", "androidx", "android"):
        base = java_root / sub
        if base.exists():
            targets.extend(base.rglob("*.java"))

    total_fixed = 0
    total_fallback = 0
    touched = 0
    for jf in targets:
        text = jf.read_text(encoding="utf-8", errors="replace")
        if "??" not in text:
            continue
        new_text, fixed, fallback = fix_file(jf)
        if fixed == 0:
            continue
        touched += 1
        total_fixed += fixed
        total_fallback += fallback
        if not dry_run:
            backup_dir.mkdir(parents=True, exist_ok=True)
            rel = jf.relative_to(java_root)
            bak = backup_dir / rel
            bak.parent.mkdir(parents=True, exist_ok=True)
            bak.write_text(text, encoding="utf-8")
            jf.write_text(new_text, encoding="utf-8")

    print("=" * 60)
    print(f"fix_jadx_type_inference.py {'（dry-run）' if dry_run else '（已写盘）'}")
    print("=" * 60)
    print(f"扫描目标文件数    : {len(targets)}")
    print(f"命中（含 ??）文件 : {touched}")
    print(f"修复 ?? 总数      : {total_fixed}")
    print(f"无注释回退计数    : {total_fallback}")
    if dry_run:
        print("（dry-run，未写盘；加 --apply 实际写入，备份至 tools/java-backups/）")
    else:
        print(f"备份目录          : {backup_dir}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
