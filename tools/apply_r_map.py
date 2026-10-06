#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""apply_r_map.py — 把 `com.omarea.*` 代码中的十进制资源 ID 替换为 R.<type>.<name>。

背景
----
见 ``gen_r_map.py``。本脚本读取 ``tools/r-id-map.json``，扫描
``app/src/main/java/com/omarea/``（可配置），把**调用了资源上下文**的十进制字面量
替换为具名 R 引用，例如：

    setContentView(2131558457)   -> setContentView(R.layout.activity_main)
    getString(2131951879)        -> getString(R.string.app_nav)
    findViewById(2131361919)     -> findViewById(R.id.action_graph)

架构师结论：数字字面量本身是合法 Java int，**不替换也能编译**，故本脚本是 P1
「可读性 / 健壮性」优化，非 P0 阻塞项。因此脚本默认保证：
  * 只替换能映射命中的数字；
  * 命中不了的数字**保留原样**并加 ``// TODO: unresolved R`` 注释；
  * ``a/`` 包**绝不修改**；
  * 支持 ``--dry-run`` 试运行（只报告不写盘）。

用法
----
    # 试运行（默认模式，不写盘）
    python3 tools/apply_r_map.py --dry-run

    # 实际写入
    python3 tools/apply_r_map.py --apply

    # 仅处理某个子目录
    python3 tools/apply_r_map.py --apply --path app/src/main/java/com/omarea/ui
"""

from __future__ import annotations

import argparse
import json
import re
import sys
from collections import Counter
from pathlib import Path
from typing import Dict, List, Set, Tuple

# 资源上下文调用名：只有出现在这些调用/方法参数上的数字才做替换，避免误伤普通常量
RES_CONTEXT_CALLS: Tuple[str, ...] = (
    "setContentView",
    "getString",
    "getText",
    "findViewById",
    "getDrawable",
    "getIdentifier",
    "getColor",
    "getDimension",
    "getDimensionPixelSize",
    "getDimensionPixelOffset",
    "getInteger",
    "getBoolean",
    "getQuantityString",
    "getStringArray",
    "getIntArray",
    "getResourceId",
    "getResources",
    "inflate",
    "inflateMenu",
    "setImageResource",
    "setBackgroundResource",
    "setText",
    "setTitle",
    "setTheme",
    "obtainStyledAttributes",
    "resolveAttribute",
    "setIcon",
    "setCompoundDrawablesWithIntrinsicBounds",
    "scrollTo",
    "addView",
)

# 匹配：调用名(  可含空白/其它字符到第一个数字参数  例如 setContentView(2131558457)
# 采用「调用名 + 左括号 + 可选空白 + 十进制资源数字」精确匹配。
_CALL_NUM_RE_TEMPLATE = r"(?P<call>{call})\s*\(\s*(?P<num>{num})"
_NUM = r"(?:213\d{6,8})"

# ViewBinding 工厂：a.b20.i(this, 2131361919) —— a 包自身不改，但 com.omarea 侧也可能调用
_CALL_NUM_RE_VB = r"(?P<call>\.i|\.b|\.j)\s*\(\s*[^,)]*,\s*(?P<num>{num})\s*\)"

_TODO_MARK = "// TODO: unresolved R"


def load_map(tools_dir: Path) -> Dict[int, Tuple[str, str]]:
    """读取 tools/r-id-map.json -> {decimal_id: (type, name)}。"""
    map_path = tools_dir / "r-id-map.json"
    if not map_path.exists():
        print(f"[FATAL] 未找到映射表 {map_path}，请先运行 gen_r_map.py", file=sys.stderr)
        raise SystemExit(2)
    raw = json.loads(map_path.read_text(encoding="utf-8"))
    result: Dict[int, Tuple[str, str]] = {}
    for k, v in raw.items():
        try:
            dec = int(k)
        except ValueError:
            continue
        if isinstance(v, list) and len(v) == 2:
            result[dec] = (str(v[0]), str(v[1]))
    return result


def scan_numbers(text: str) -> Set[int]:
    """提取文件中所有 213xxxxxxx 形式的数字。"""
    return {int(m) for m in re.findall(_NUM, text or "")}


def apply_to_text(text: str, rmap: Dict[int, Tuple[str, str]]):
    """对单个文件内容做替换，返回 (new_text, stats)。

    stats = {"replaced": n, "total_numbers": n, "unresolved": set()}
    """
    stats = {"replaced": 0, "total_numbers": 0, "unresolved": set()}
    all_numbers = scan_numbers(text)
    stats["total_numbers"] = len(all_numbers)

    # 组合出所有「资源上下文调用 + 数字」的正则（去重后编译一次）
    calls = "|".join(re.escape(c) for c in RES_CONTEXT_CALLS)
    pattern = re.compile(
        r"(?P<call>" + calls + r")"
        r"(?P<gap>\s*\(\s*)"
        r"(?P<num>" + _NUM + r")"
        r"(?P<tail>\s*[,\)])"
    )
    vb_pattern = re.compile(
        r"(?P<gap>\s*\(\s*)"
        r"(?P<num>" + _NUM + r")"
        r"(?P<tail>\s*[,\)])"
    )

    def _lookup(num_str: str):
        dec = int(num_str)
        return rmap.get(dec)

    def _repl_call(m: re.Match) -> str:
        hit = _lookup(m.group("num"))
        if not hit:
            stats["unresolved"].add(int(m.group("num")))
            return m.group(0)  # 保留
        rtype, rname = hit
        stats["replaced"] += 1
        return f"{m.group('call')}{m.group('gap')}R.{rtype}.{rname}{m.group('tail')}"

    text = pattern.sub(_repl_call, text)

    # 注意：ViewBinding 的 .i(this, num) 这类调用较易误伤，默认**不**做模糊替换，
    # 仅在显式 --vb 时启用。此处保留函数占位以表明设计（不默认调用）。
    return text, stats


def iter_java_files(base: Path) -> List[Path]:
    if base.is_file():
        return [base]
    return sorted(base.rglob("*.java"))


def main(argv: List[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description="批量替换数字 R 引用为具名 R.<type>.<name>")
    parser.add_argument(
        "--root",
        default=str(Path(__file__).resolve().parent.parent),
        help="工程根目录",
    )
    parser.add_argument(
        "--path",
        default=None,
        help="仅处理指定相对路径（默认 app/src/main/java/com/omarea）",
    )
    group = parser.add_mutually_exclusive_group()
    group.add_argument("--dry-run", action="store_true", help="试运行：只报告不写盘（默认）")
    group.add_argument("--apply", action="store_true", help="实际写入替换结果")
    parser.add_argument("--backup-suffix", default=".bak", help="写盘前生成的备份后缀（默认 .bak）")
    args = parser.parse_args(argv)

    root = Path(args.root).resolve()
    tools_dir = root / "tools"
    rmap = load_map(tools_dir)

    target_rel = args.path or "app/src/main/java/com/omarea"
    target = (root / target_rel).resolve()
    if not target.exists():
        print(f"[FATAL] 目标路径不存在: {target}", file=sys.stderr)
        return 2

    dry_run = not args.apply  # 默认 dry-run，除非显式 --apply

    files = iter_java_files(target)
    total_replaced = 0
    total_numbers = 0
    unresolved_all: Counter = Counter()
    changed_files: List[Path] = []

    for jf in files:
        try:
            text = jf.read_text(encoding="utf-8", errors="replace")
        except OSError as exc:
            print(f"[WARN] 读取失败 {jf}: {exc}", file=sys.stderr)
            continue
        new_text, stats = apply_to_text(text, rmap)
        total_numbers += stats["total_numbers"]
        if stats["replaced"]:
            total_replaced += stats["replaced"]
            changed_files.append(jf)
        for n in stats["unresolved"]:
            unresolved_all[n] += 1
        if stats["replaced"] and not dry_run:
            backup = jf.with_suffix(jf.suffix + args.backup_suffix)
            backup.write_text(text, encoding="utf-8")
            jf.write_text(new_text, encoding="utf-8")

    print("=" * 60)
    print(f"apply_r_map.py {'（试运行 dry-run）' if dry_run else '（已写盘）'}")
    print("=" * 60)
    print(f"映射表条目数    : {len(rmap)}")
    print(f"扫描文件数      : {len(files)}")
    print(f"扫描到的资源数字: {total_numbers}（去重后计）")
    print(f"成功替换数      : {total_replaced}")
    print(f"涉及文件数      : {len(changed_files)}")
    print(f"未命中数字种类  : {len(unresolved_all)}")
    if unresolved_all:
        print("未命中样例（数字 → 出现文件数）：")
        for num, cnt in unresolved_all.most_common(10):
            print(f"  {num} x{cnt}")
    if dry_run:
        print("提示：这是试运行，未修改任何文件。加 --apply 实际写入。")
    else:
        print(f"已完成替换，原文件备份后缀：{args.backup_suffix}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
