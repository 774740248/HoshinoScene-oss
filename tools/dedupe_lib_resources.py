#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""dedupe_lib_resources.py — 去除 app res 中与三方库重复的资源声明（完整版）。

问题
----
反编译 APK 得到的 `res/` 是**已合并**的最终资源集，其中已包含 appcompat /
material / constraintlayout / core 等库的 attr / style / color / dimen / string 等。
还原工程重新声明这些库为 Maven 依赖后，aapt2 会因「同名资源被 app 与库同时声明」
而报 `Duplicate value for resource`。

修复
----
从 GRADLE_USER_HOME 的 transformed 库资源中提取库侧资源名字集合，删除 app 侧
`res/values/*.xml` 中**同名**的资源声明块（库会重新提供），从而消除冲突。

处理范围
--------
* 仅处理 `res/values/` 下的 *.xml（不含 public.xml / ids.xml，保留 ID 声明）。
* 支持自闭合（`<attr .../>`）与成对（`<attr ...> ... </attr>`、`<style>...</style>`）声明。
* 保留 app 自有的、库没有的资源声明不动。
* 默认 dry-run；`--apply` 才写盘，并输出到 tools/res-backups/ 备份。

用法
----
    python3 tools/dedupe_lib_resources.py --dry-run
    python3 tools/dedupe_lib_resources.py --apply
"""

from __future__ import annotations

import argparse
import glob
import re
from collections import defaultdict
from pathlib import Path
from typing import Dict, List, Set, Tuple

VALUES_DIRNAME = "values"
SKIP_FILES = {"public.xml", "ids.xml"}

# 资源类型（出现在 values 文件根下的顶层元素）
RES_TYPES = (
    "attr", "style", "color", "dimen", "string", "bool", "integer",
    "array", "string-array", "integer-array", "plurals", "item",
)

_DECL_OPEN_RE = re.compile(
    r"^(\s*)<(" + "|".join(RES_TYPES) + r")\b([^>]*?)(/?)>\s*$"
)
_NAME_RE = re.compile(r'\bname="([^"]+)"')
_LIB_DECL_RE = re.compile(
    r"<(" + "|".join(RES_TYPES) + r")\b[^>]*?\bname=\"([^\"]+)\""
)


def collect_lib_names(transforms_dir: Path) -> Dict[str, Set[str]]:
    """返回 {type: {name, ...}}，来自 transformed 库资源。"""
    result: Dict[str, Set[str]] = defaultdict(set)
    pattern = str(transforms_dir / "*" / "transformed" / "*" / "res" / "values" / "*.xml")
    for f in glob.glob(pattern):
        try:
            text = Path(f).read_text(encoding="utf-8", errors="replace")
        except OSError:
            continue
        for m in _LIB_DECL_RE.finditer(text):
            result[m.group(1)].add(m.group(2))
    return result


def strip_file(path: Path, lib_names: Dict[str, Set[str]]) -> Tuple[str, int]:
    """删除文件中与库同名的资源声明块，返回 (新内容, 删除条数)。"""
    lines = path.read_text(encoding="utf-8", errors="replace").splitlines()
    out: List[str] = []
    removed = 0
    i = 0
    n = len(lines)
    while i < n:
        line = lines[i]
        m = _DECL_OPEN_RE.match(line)
        if m:
            indent, rtype, _attrs, self_close = m.group(1), m.group(2), m.group(3), m.group(4)
            nm = _NAME_RE.search(line)
            name = nm.group(1) if nm else None
            if name and name in lib_names.get(rtype, set()):
                if self_close == "/":
                    removed += 1
                    i += 1
                    continue
                # 成对：跳过直到同级 </type>
                close = f"</{rtype}>"
                j = i + 1
                while j < n and close not in lines[j]:
                    j += 1
                removed += 1
                i = j + 1 if j < n else n
                continue
        out.append(line)
        i += 1
    return "\n".join(out) + "\n", removed


def main(argv: List[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description="去除 app res 与三方库重复的资源声明")
    parser.add_argument("--root", default=str(Path(__file__).resolve().parent.parent))
    parser.add_argument(
        "--transforms",
        default="/tmp/gradle-home/caches/9.3.0/transforms",
    )
    group = parser.add_mutually_exclusive_group()
    group.add_argument("--dry-run", action="store_true")
    group.add_argument("--apply", action="store_true")
    args = parser.parse_args(argv)

    root = Path(args.root).resolve()
    transforms = Path(args.transforms)
    values_dir = root / "app" / "src" / "main" / "res" / VALUES_DIRNAME
    backup_dir = root / "tools" / "res-backups"
    dry_run = not args.apply

    lib_names = collect_lib_names(transforms)
    print("库侧资源名统计：")
    for t in RES_TYPES:
        if lib_names.get(t):
            print(f"  {t:<14} {len(lib_names[t])}")

    total_removed = 0
    for vf in sorted(values_dir.glob("*.xml")):
        if vf.name in SKIP_FILES:
            continue
        new_text, removed = strip_file(vf, lib_names)
        if removed == 0:
            continue
        total_removed += removed
        print(f"[{'dry-run' if dry_run else 'apply'}] {vf.name}: 删除 {removed} 条")
        if not dry_run:
            backup_dir.mkdir(parents=True, exist_ok=True)
            (backup_dir / (vf.name + ".bak")).write_text(
                vf.read_text(encoding="utf-8", errors="replace"), encoding="utf-8"
            )
            vf.write_text(new_text, encoding="utf-8")

    print(f"合计删除声明：{total_removed}")
    if dry_run:
        print("（dry-run，未写盘；加 --apply 实际写入）")
    else:
        print(f"已完成，备份位于 {backup_dir}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
