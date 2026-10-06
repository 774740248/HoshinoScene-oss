#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""gen_r_map.py — 从 res/values/public.xml 生成「十进制资源 ID → R.<type>.<name>」映射。

用途
----
jadx 反编译后的 `com.omarea.*` 代码把资源引用内联成了十进制数字字面量，例如
``setContentView(2131558457)``、``getString(2131951879)``、``findViewById(2131361919)``。
本脚本解析 ``public.xml``（形如 ``<public type="anim" name="abc_fade_in" id="0x7f010000" />``），
把每个十六进制 ID 转成十进制，产出 JSON 映射表，供 ``apply_r_map.py`` 做具名替换。

进位说明
--------
``0x7f010000`` = 2130771968（十进制）。代码里的数字即 API 运行期资源 ID。
``0x7f`` 为应用资源包固定前缀，其后一位十六进制表示类型区间
（``0x7f0a`` = id、``0x7f0d`` = layout、``0x7f13`` = string …）。

输出
----
* ``tools/r-id-map.json``         —— 机器可读：``{"2130771968": ["anim", "abc_fade_in"]}``
* ``tools/r-name-map.json``       —— 反向：``{"anim/abc_fade_in": 2130771968}``（可选，便于交叉校验）
* ``docs/r-resource-map.md``      —— 人类可读表格 + 统计

用法
----
    python3 tools/gen_r_map.py
    python3 tools/gen_r_map.py --root /workspace/hoshino-scene-recovered
"""

from __future__ import annotations

import argparse
import json
import re
import sys
from collections import Counter
from pathlib import Path
from typing import Dict, List, Tuple

# public.xml 单行形如：<public type="anim" name="abc_fade_in" id="0x7f010000" />
_PUBLIC_RE = re.compile(
    r'<public\s+type="(?P<type>[^"]+)"\s+name="(?P<name>[^"]+)"\s+id="(?P<id>0x[0-9a-fA-F]+)"\s*/>'
)
# 兜底：属性顺序可能不同
_PUBLIC_RE_LOOSE = re.compile(
    r'<public\b[^>]*?type="(?P<type>[^"]+)"[^>]*?name="(?P<name>[^"]+)"[^>]*?id="(?P<id>0x[0-9a-fA-F]+)"[^>]*?/>'
)

# ids.xml 单行形如：<item type="id" name="Arrow" />（无 id，运行期分配）
_ITEM_RE = re.compile(r'<item\s+type="(?P<type>[^"]+)"\s+name="(?P<name>[^"]+)"\s*/>')


def parse_public_xml(path: Path) -> List[Tuple[str, str, int]]:
    """解析 public.xml，返回 [(type, name, decimal_id), ...]。"""
    entries: List[Tuple[str, str, int]] = []
    text = path.read_text(encoding="utf-8", errors="replace")
    for line in text.splitlines():
        m = _PUBLIC_RE.search(line) or _PUBLIC_RE_LOOSE.search(line)
        if not m:
            continue
        rtype = m.group("type").strip()
        rname = m.group("name").strip()
        hex_id = m.group("id").strip()
        try:
            dec_id = int(hex_id, 16)
        except ValueError:
            continue
        entries.append((rtype, rname, dec_id))
    return entries


def collect_ids_xml(public_xml: Path) -> List[str]:
    """收集同目录 ids.xml 中的 id 名称（这些 id 运行期分配，通常不在 public.xml）。"""
    ids_path = public_xml.parent / "ids.xml"
    if not ids_path.exists():
        return []
    names: List[str] = []
    text = ids_path.read_text(encoding="utf-8", errors="replace")
    for line in text.splitlines():
        m = _ITEM_RE.search(line)
        if m and m.group("type") == "id":
            names.append(m.group("name").strip())
    return names


def build_maps(entries: List[Tuple[str, str, int]]):
    """构建正向/反向映射。"""
    id_to_ref: Dict[str, List[str]] = {}
    ref_to_id: Dict[str, int] = {}
    type_counter: Counter = Counter()
    for rtype, rname, dec_id in entries:
        key = str(dec_id)
        # 同一 ID 多次出现时保留首个（public.xml 不应重复，此处防御性处理）
        if key not in id_to_ref:
            id_to_ref[key] = [rtype, rname]
            type_counter[rtype] += 1
        ref_to_id[f"{rtype}/{rname}"] = dec_id
    return id_to_ref, ref_to_id, type_counter


def write_json(path: Path, data: object) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(
        json.dumps(data, ensure_ascii=False, indent=2, sort_keys=True),
        encoding="utf-8",
    )


def write_markdown(
    path: Path,
    id_to_ref: Dict[str, List[str]],
    type_counter: Counter,
    sample_size: int = 40,
) -> None:
    """产出 docs/r-resource-map.md 人类可读表格。"""
    lines: List[str] = []
    lines.append("# R 资源 ID 映射表（r-resource-map）")
    lines.append("")
    lines.append("> 由 `tools/gen_r_map.py` 从 `res/values/public.xml` 生成。")
    lines.append("> 映射语义：`十进制资源 ID → R.<type>.<name>`。")
    lines.append("")
    lines.append("## 统计")
    lines.append("")
    lines.append(f"- 映射条目总数：**{len(id_to_ref)}**")
    lines.append("")
    lines.append("| type | 条目数 | 十六进制区间示例 |")
    lines.append("|------|-------:|------------------|")
    for rtype, count in type_counter.most_common():
        # 取该类型首个 ID 的十六进制前缀展示
        sample_hex = ""
        for dec_str, (t, _n) in id_to_ref.items():
            if t == rtype:
                sample_hex = hex(int(dec_str))
                break
        lines.append(f"| {rtype} | {count} | `{sample_hex}` |")
    lines.append("")
    lines.append("## 样例（前 %d 条）" % sample_size)
    lines.append("")
    lines.append("| 十进制 ID | 十六进制 | type | name | 代码写法 |")
    lines.append("|-----------|----------|------|------|----------|")
    shown = 0
    for dec_str in sorted(id_to_ref, key=lambda s: int(s)):
        rtype, rname = id_to_ref[dec_str]
        lines.append(
            f"| {dec_str} | `{hex(int(dec_str))}` | {rtype} | {rname} | `R.{rtype}.{rname}` |"
        )
        shown += 1
        if shown >= sample_size:
            break
    lines.append("")
    lines.append("> 全量映射见 `tools/r-id-map.json`。")
    lines.append("")
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text("\n".join(lines), encoding="utf-8")


def main(argv: List[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description="生成 R 资源 ID → 具名常量映射表")
    parser.add_argument(
        "--root",
        default=str(Path(__file__).resolve().parent.parent),
        help="工程根目录（默认取脚本上级目录）",
    )
    parser.add_argument("--sample", type=int, default=40, help="Markdown 样例条数")
    args = parser.parse_args(argv)

    root = Path(args.root).resolve()
    public_xml = root / "app" / "src" / "main" / "res" / "values" / "public.xml"
    if not public_xml.exists():
        print(f"[FATAL] 未找到 public.xml: {public_xml}", file=sys.stderr)
        return 2

    entries = parse_public_xml(public_xml)
    if not entries:
        print(f"[FATAL] public.xml 未解析出任何 <public> 条目: {public_xml}", file=sys.stderr)
        return 3

    id_to_ref, ref_to_id, type_counter = build_maps(entries)
    ids_names = collect_ids_xml(public_xml)

    tools_dir = root / "tools"
    docs_dir = root / "docs"
    write_json(tools_dir / "r-id-map.json", id_to_ref)
    write_json(tools_dir / "r-name-map.json", ref_to_id)
    write_markdown(docs_dir / "r-resource-map.md", id_to_ref, type_counter, args.sample)

    print("=" * 60)
    print("gen_r_map.py 完成")
    print("=" * 60)
    print(f"public.xml        : {public_xml}")
    print(f"<public> 条目数   : {len(entries)}")
    print(f"唯一映射条目数    : {len(id_to_ref)}")
    print(f"ids.xml 中 id 名  : {len(ids_names)}（运行期分配，通常不在 public.xml）")
    print("条目类型分布：")
    for rtype, count in type_counter.most_common():
        print(f"  - {rtype:<12} {count}")
    print("样例（十进制 → 十六进制 → R 引用）：")
    for dec_str in sorted(id_to_ref, key=lambda s: int(s))[:5]:
        rtype, rname = id_to_ref[dec_str]
        print(f"  {dec_str} → {hex(int(dec_str))} → R.{rtype}.{rname}")
    print(f"输出：{tools_dir / 'r-id-map.json'}")
    print(f"输出：{docs_dir / 'r-resource-map.md'}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
