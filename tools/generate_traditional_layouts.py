#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Generate Traditional Chinese (繁體中文) localized layouts for HoshinoScene.
Generates into:
  - app/src/main/res/layout-b+zh+Hant/
  - app/src/main/res/layout-zh-rTW/
"""

import os
import re
import sys
import opencc

sys.stdout.reconfigure(encoding='utf-8')

ROOT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RES_DIR = os.path.join(ROOT_DIR, "app", "src", "main", "res")
SRC_LAYOUT_DIR = os.path.join(RES_DIR, "layout")
DEST_HANT_DIR = os.path.join(RES_DIR, "layout-b+zh+Hant")
DEST_TW_DIR = os.path.join(RES_DIR, "layout-zh-rTW")

# Initialize OpenCC s2twp
cc = opencc.OpenCC('s2twp')

# Custom replacements consistent with generate_traditional_chinese.py
CUSTOM_REPLACEMENTS = [
    ("畫面播放速率", "幀率"),
    ("画质", "畫質"),
    ("模拟测试", "模擬測試"),
    ("能耗测试", "能耗測試"),
    ("内存", "記憶體"),
    ("卡顿", "頓挫"),
    ("壁纸", "桌布"),
    ("默认", "預設"),
    ("设置", "設定"),
    ("配置", "設定"),
    ("刷新率", "更新率"),
    ("信息", "訊息"),
    ("支持", "支援"),
    ("程序", "程式"),
    ("激活", "啟用"),
    ("云控", "雲控"),
    ("温控", "溫控"),
    ("性能", "效能"),
    ("线程", "線程"),
    ("随机访问", "隨機存取"),
    ("调速器", "調速器"),
]

def convert_string(text):
    if not text:
        return text
    # Convert with OpenCC
    res = cc.convert(text)
    # Apply custom replacements
    for old, new in CUSTOM_REPLACEMENTS:
        res = res.replace(old, new)
    return res

chinese_re = re.compile(r'[\u4e00-\u9fff]')

def convert_layout_file(src_path):
    with open(src_path, 'r', encoding='utf-8') as f:
        content = f.read()

    # Check if there are any CJK characters
    if not chinese_re.search(content):
        return None

    # 1. Replace attribute values: (android|app|tools):attr="val"
    def repl_attr(m):
        attr_prefix = m.group(1)
        val = m.group(2)
        if chinese_re.search(val):
            return f'{attr_prefix}="{convert_string(val)}"'
        return m.group(0)

    attr_pattern = re.compile(r'((?:android|app|tools):[a-zA-Z_]+)="([^"]*)"')
    new_content = attr_pattern.sub(repl_attr, content)

    # 2. Replace text nodes: >text<
    def repl_text_node(m):
        text = m.group(1)
        if chinese_re.search(text):
            return f'>{convert_string(text)}<'
        return m.group(0)

    node_pattern = re.compile(r'>([^<]+)<')
    new_content = node_pattern.sub(repl_text_node, new_content)

    return new_content

def main():
    os.makedirs(DEST_HANT_DIR, exist_ok=True)
    os.makedirs(DEST_TW_DIR, exist_ok=True)

    converted_files = []
    # Only convert layouts where actual UI text (attributes or text nodes) has CJK
    for fname in os.listdir(SRC_LAYOUT_DIR):
        if not fname.endswith('.xml'):
            continue
        src_path = os.path.join(SRC_LAYOUT_DIR, fname)
        new_content = convert_layout_file(src_path)
        if new_content is not None and new_content != open(src_path, 'r', encoding='utf-8').read():
            # Write to layout-b+zh+Hant
            dest_hant = os.path.join(DEST_HANT_DIR, fname)
            with open(dest_hant, 'w', encoding='utf-8') as f:
                f.write(new_content)
            # Write to layout-zh-rTW
            dest_tw = os.path.join(DEST_TW_DIR, fname)
            with open(dest_tw, 'w', encoding='utf-8') as f:
                f.write(new_content)
            converted_files.append(fname)
            print(f"Generated Traditional Chinese layout: {fname}")

    print(f"\nTotal layouts converted: {len(converted_files)}")

if __name__ == '__main__':
    main()
