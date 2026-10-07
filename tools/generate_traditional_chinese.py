#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Generate Traditional Chinese (繁體中文) localization resources for HoshinoScene.
Generates resources into:
  - app/src/main/res/values-b+zh+Hant/
  - app/src/main/res/values-zh-rTW/
"""

import os
import re
import sys
import xml.etree.ElementTree as ET
import opencc

sys.stdout.reconfigure(encoding='utf-8')

# Initialize OpenCC s2twp (Simplified to Traditional Taiwan standard with phrases)
cc = opencc.OpenCC('s2twp')

# Custom replacements to apply after opencc s2twp
# Ordered from specific phrases to general terms
CUSTOM_REPLACEMENTS = [
    # Network & Connectivity
    ("移動資料", "行動數據"),
    ("移動數據", "行動數據"),
    ("移動網絡", "行動網路"),
    ("移動網路", "行動網路"),
    ("蜂窩網絡", "行動網路"),
    ("蜂窩網路", "行動網路"),
    ("飛行模式", "飛航模式"),
    ("局域網", "區域網路"),
    ("區域網", "區域網路"),
    ("熱點分享", "個人熱點"),
    ("連網", "連線網路"),
    
    # Process & Background/Foreground
    ("後臺執行", "背景執行"),
    ("後臺定位", "背景定位"),
    ("後臺程序", "背景處理程序"),
    ("後臺進程", "背景處理程序"),
    ("後臺任務", "背景工作"),
    ("後臺服務", "背景服務"),
    ("後臺耗電", "背景耗電"),
    ("後臺應用", "背景應用程式"),
    ("後臺限制", "背景限制"),
    ("後臺保活", "背景保活"),
    ("後臺清除", "背景清除"),
    ("後臺清理", "背景清理"),
    ("後臺管理", "背景管理"),
    ("允許後臺", "允許背景"),
    ("禁止後臺", "禁止背景"),
    ("後臺", "背景"),
    ("前臺應用", "前景應用程式"),
    ("前臺進程", "前景處理程序"),
    ("前臺程序", "前景處理程序"),
    ("前臺服務", "前景服務"),
    ("前臺狀態", "前景狀態"),
    ("前臺允許", "前景允許"),
    ("前臺", "前景"),
    ("其它進程", "其他處理程序"),
    ("所有進程", "所有處理程序"),
    ("進程限制", "處理程序限制"),
    ("進程名", "處理程序名稱"),
    ("進程列表", "處理程序清單"),
    ("進程管理器", "處理程序管理器"),
    ("殺進程", "結束處理程序"),
    ("殺死進程", "結束處理程序"),
    ("結束進程", "結束處理程序"),
    ("殺後臺", "清理背景"),
    ("進程", "處理程序"),
    ("線程", "執行緒"),
    
    # Permissions & Security
    ("許可權", "權限"),
    ("權限", "權限"),
    ("獲取權限", "取得權限"),
    ("ROOT權限", "Root 權限"),
    ("Root權限", "Root 權限"),
    ("root權限", "Root 權限"),
    ("超級使用者權限", "超級使用者權限"),
    ("懸浮窗權限", "浮動視窗權限"),
    
    # File & Storage
    ("檔名", "檔案名稱"),
    ("檔案名", "檔案名稱"),
    ("檔案夾", "資料夾"),
    ("軟體包", "軟體套件"),
    ("安裝包", "安裝套件"),
    ("剪貼板", "剪貼簿"),
    ("寫入剪貼簿", "寫入剪貼簿"),
    ("通話記錄", "通話紀錄"),
    ("通話記錄", "通話紀錄"),
    ("只讀模式", "唯讀模式"),
    ("只讀", "唯讀"),
    ("儲存卡", "記憶卡"),
    ("內部儲存", "內部儲存空間"),
    ("手機存儲", "手機儲存空間"),
    ("手機儲存", "手機儲存空間"),
    ("儲存目錄", "儲存目錄"),
    ("導出", "匯出"),
    ("導入", "匯入"),
    
    # Android System & UI
    ("重新整理率", "更新率"),
    ("螢幕重新整理率", "螢幕更新率"),
    ("開發者選項", "開發人員選項"),
    ("全域性", "全域"),
    ("藍芽", "藍牙"),
    ("繫結", "綁定"),
    ("對話方塊", "對話框"),
    ("快捷方式", "捷徑"),
    ("建立快捷方式", "建立捷徑"),
    ("解除安裝快捷方式", "移除捷徑"),
    ("懸浮窗", "浮動視窗"),
    ("懸浮視窗", "浮動視窗"),
    ("浮窗", "浮動視窗"),
    ("狀態列", "狀態列"),
    ("導航列", "導覽列"),
    ("壁紙", "桌布"),
    ("截屏", "螢幕截圖"),
    ("錄屏", "螢幕錄影"),
    ("屏幕", "螢幕"),
    ("圖示", "圖示"),
    ("小部件", "小工具"),
    ("桌面小部件", "桌面小工具"),
    ("解鎖螢幕", "解鎖畫面"),
    ("鎖屏", "螢幕鎖定"),
    ("自定義", "自訂"),
    ("自訂義", "自訂"),
    ("引數", "參數"),
    ("配置引數", "設定參數"),
    ("彈窗", "彈出式視窗"),
    ("彈窗提示", "彈出式提示"),
    ("快速設定快速設定圖格", "快速設定圖格"),
    ("快速設定磁貼", "快速設定圖格"),
    ("快速設置磁貼", "快速設定圖格"),
    ("磁貼名稱", "圖格名稱"),
    ("磁貼", "圖格"),
    ("無障礙服務", "無障礙服務"),
    ("輔助服務", "輔助服務"),
    ("輔助功能", "無障礙功能"),
    
    # Network card & addresses
    ("網絡卡", "網卡"),
    ("MAC地址", "MAC 位址"),
    ("IP地址", "IP 位址"),
    ("下載地址", "下載網址"),
    
    # Permissions and mounts
    ("解除安裝檔案系統", "卸載檔案系統"),
    ("網路訪問", "網路存取"),
    ("訪問網路狀態", "存取網路狀態"),
    ("訪問通知策略", "存取通知政策"),
    ("訪問超級使用者", "存取超級使用者"),
    ("訪問WIFI狀態", "存取 Wi-Fi 狀態"),
    ("訪問通知", "存取通知"),
    ("訪問位置", "存取位置"),
    ("安裝應用", "安裝應用程式"),
    ("刪除應用", "刪除應用程式"),
    ("應用大小", "應用程式大小"),
    ("應用使用統計", "應用程式使用統計"),
    ("應用列表", "應用程式清單"),
    ("殺死背景處理程序", "結束背景處理程序"),
    ("殺死處理程序", "結束處理程序"),
    ("殺死程序", "結束處理程序"),
    
    # Process & Arrays sorting
    ("其它程序", "其他處理程序"),
    ("所有程序", "所有處理程序"),
    ("按CPU", "依 CPU"),
    ("按RES", "依 RES"),
    ("按PID", "依 PID"),
    ("按UID", "依 UID"),
    
    # SMS / MMS / Contacts / Calendar
    ("彩信", "多媒體簡訊"),
    ("短信", "簡訊"),
    ("通訊錄", "聯絡人"),
    ("日曆", "行事曆"),
    
    # Account & Terms
    ("賬號", "帳號"),
    ("賬戶", "帳戶"),
    ("使用者名稱", "使用者名稱"),
    ("登陸", "登入"),
    ("註冊登入", "註冊登入"),
    
    # Hardware & Performance
    ("效能調度", "效能排程"),
    ("調度器", "排程器"),
    ("調度模式", "排程模式"),
    ("排程器算法", "排程器演算法"),
    ("調度", "排程"),
    ("運存", "執行記憶體"),
    ("執行記憶體", "執行記憶體"),
    ("快閃記憶體", "快閃記憶體"),
    ("快取記憶體", "快取"),
    ("快取", "快取"),
    ("電池最佳化", "電池最佳化"),
    ("安卓應用", "Android 應用程式"),
    ("所有應用", "所有應用程式"),
    ("應用程式列表", "應用程式清單"),
    ("清單列表", "清單"),
    ("預設應用", "預設應用程式"),
    ("首選應用", "偏好應用程式"),
    ("已禁用", "已停用"),
    ("禁用", "停用"),
    ("啟用", "啟用"),
    ("自啟動", "自動啟動"),
    ("開機自啟", "開機自動啟動"),
    ("開機啟動", "開機自動啟動"),
    ("卡頓", "卡頓"),
    ("掉幀", "掉格"),
    ("畫面播放速率", "幀率"),
    ("幀率", "幀率"),
    ("重啟", "重新啟動"),
    ("關機", "關機"),
    
    # Common operations
    ("獲取", "取得"),
    ("點選", "點選"),
    ("反饋", "意見反應"),
    ("幫助說明", "說明"),
    ("幫助", "說明"),
    ("確定", "確定"),
    ("取消", "取消"),
    ("儲存修改", "儲存變更"),
    ("儲存配置", "儲存設定"),
    ("未發生修改", "未進行變更"),
    ("未發生更改", "未進行變更"),
    ("倉庫", "存放庫"),
    ("Magisk的倉庫", "Magisk 存放庫"),
    ("官方上傳", "官方上傳"),
    ("使用者分享", "使用者分享"),
]

def convert_string_value(text):
    if not text:
        return text
    
    trimmed = text.strip()
    
    # Check if exact URL or path or command or resource reference
    if trimmed.startswith(('http://', 'https://', '@string/', '@color/', '@drawable/', 'sync;', 'com.omarea.', 'androidx.')):
        return text
    
    # Check if text is wrapped in double quotes
    is_quoted = (text.startswith('"') and text.endswith('"') and len(text) >= 2)
    inner = text[1:-1] if is_quoted else text
    
    # Convert inner text
    res = cc.convert(inner)
    for old, new in CUSTOM_REPLACEMENTS:
        res = res.replace(old, new)
        
    return f'"{res}"' if is_quoted else res

def parse_strings_xml(file_path):
    """Parse strings.xml and return a dict of (name -> (attrs_dict, raw_text))"""
    res = {}
    if not os.path.exists(file_path):
        return res
    
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    pattern = re.compile(r'<string\s+name=\"([^\"]+)\"([^>]*)>(.*?)</string>', re.DOTALL)
    for match in pattern.finditer(content):
        name = match.group(1)
        raw_attrs = match.group(2)
        text = match.group(3)
        res[name] = (raw_attrs, text)
        
    return res

def has_cjk(s):
    return any('\u4e00' <= ch <= '\u9fff' for ch in (s or ''))

def generate_strings():
    print("[1/5] Processing strings.xml...")
    zh_path = 'app/src/main/res/values-zh/strings.xml'
    rcn_path = 'app/src/main/res/values-zh-rCN/strings.xml'
    val_path = 'app/src/main/res/values/strings.xml'
    
    zh_map = parse_strings_xml(zh_path)
    rcn_map = parse_strings_xml(rcn_path)
    val_map = parse_strings_xml(val_path)
    
    print(f"  values-zh strings:     {len(zh_map)}")
    print(f"  values-zh-rCN strings: {len(rcn_map)}")
    print(f"  values strings:        {len(val_map)}")
    
    # Combine strings in priority order:
    # 1. values-zh (primary UI strings)
    # 2. values-zh-rCN (AndroidX / Material strings)
    # 3. values (permission and other strings that contain Chinese)
    combined = {}
    
    for name, (attrs, text) in zh_map.items():
        combined[name] = (attrs, text)
        
    for name, (attrs, text) in rcn_map.items():
        if name not in combined:
            combined[name] = (attrs, text)
            
    val_cjk_count = 0
    for name, (attrs, text) in val_map.items():
        if name not in combined and has_cjk(text):
            combined[name] = (attrs, text)
            val_cjk_count += 1
            
    print(f"  Added {val_cjk_count} Chinese permission/system strings from values/")
    print(f"  Total strings to translate: {len(combined)}")
    
    # Generate translated string elements
    out_lines = ['<?xml version="1.0" encoding="utf-8"?>\n<resources>\n']
    
    for name in sorted(combined.keys()):
        attrs, text = combined[name]
        conv_text = convert_string_value(text)
        out_lines.append(f'    <string name="{name}"{attrs}>{conv_text}</string>\n')
        
    out_lines.append('</resources>\n')
    return "".join(out_lines)

def generate_arrays():
    print("[2/5] Processing arrays.xml...")
    zh_arr_path = 'app/src/main/res/values-zh/arrays.xml'
    
    with open(zh_arr_path, 'r', encoding='utf-8') as f:
        content = f.read()
        
    # We want to preserve exact string-array definitions while converting items
    # Parse with ElementTree to inspect, then generate clean XML
    tree = ET.parse(zh_arr_path)
    root = tree.getroot()
    
    out_lines = ['<?xml version="1.0" encoding="utf-8"?>\n<resources>\n']
    
    for arr in root:
        if arr.tag in ('string-array', 'array'):
            name = arr.attrib.get('name')
            out_lines.append(f'    <{arr.tag} name="{name}">\n')
            for item in arr:
                text = item.text or ''
                conv = convert_string_value(text)
                if name == 'detail_categories' and conv == '應用':
                    conv = '應用程式'
                out_lines.append(f'        <item>{conv}</item>\n')
            out_lines.append(f'    </{arr.tag}>\n')
            
    out_lines.append('</resources>\n')
    return "".join(out_lines)

def generate_plurals():
    print("[3/5] Processing plurals.xml...")
    rcn_plurals_path = 'app/src/main/res/values-zh-rCN/plurals.xml'
    
    tree = ET.parse(rcn_plurals_path)
    root = tree.getroot()
    
    out_lines = ['<?xml version="1.0" encoding="utf-8"?>\n<resources>\n']
    for p in root:
        if p.tag == 'plurals':
            name = p.attrib.get('name')
            out_lines.append(f'    <plurals name="{name}">\n')
            for item in p:
                q = item.attrib.get('quantity')
                text = item.text or ''
                conv = convert_string_value(text)
                # Ensure correct measure word in Traditional Chinese
                conv = conv.replace("條新通知", "則新通知").replace("条新通知", "則新通知")
                out_lines.append(f'        <item quantity="{q}">{conv}</item>\n')
            out_lines.append('    </plurals>\n')
            
    out_lines.append('</resources>\n')
    return "".join(out_lines)

def main():
    print("=" * 60)
    print("HoshinoScene Traditional Chinese (繁體中文) Resource Generator")
    print("=" * 60)
    
    strings_content = generate_strings()
    arrays_content = generate_arrays()
    plurals_content = generate_plurals()
    
    # Read dimens and integers from values-zh
    dimens_content = open('app/src/main/res/values-zh/dimens.xml', 'r', encoding='utf-8').read()
    integers_content = open('app/src/main/res/values-zh/integers.xml', 'r', encoding='utf-8').read()
    
    target_dirs = [
        'app/src/main/res/values-b+zh+Hant',
        'app/src/main/res/values-zh-rTW'
    ]
    
    for tdir in target_dirs:
        os.makedirs(tdir, exist_ok=True)
        print(f"\nWriting resources to {tdir}...")
        
        with open(os.path.join(tdir, 'strings.xml'), 'w', encoding='utf-8') as f:
            f.write(strings_content)
        with open(os.path.join(tdir, 'arrays.xml'), 'w', encoding='utf-8') as f:
            f.write(arrays_content)
        with open(os.path.join(tdir, 'plurals.xml'), 'w', encoding='utf-8') as f:
            f.write(plurals_content)
        with open(os.path.join(tdir, 'dimens.xml'), 'w', encoding='utf-8') as f:
            f.write(dimens_content)
        with open(os.path.join(tdir, 'integers.xml'), 'w', encoding='utf-8') as f:
            f.write(integers_content)
            
        print(f"  ✓ {tdir}/strings.xml")
        print(f"  ✓ {tdir}/arrays.xml")
        print(f"  ✓ {tdir}/plurals.xml")
        print(f"  ✓ {tdir}/dimens.xml")
        print(f"  ✓ {tdir}/integers.xml")
        
    print("\n[4/5] Validating generated XML files...")
    for tdir in target_dirs:
        for fname in ['strings.xml', 'arrays.xml', 'plurals.xml', 'dimens.xml', 'integers.xml']:
            fpath = os.path.join(tdir, fname)
            try:
                tree = ET.parse(fpath)
                root = tree.getroot()
                print(f"  Valid XML: {fpath} (root: <{root.tag}>, children: {len(root)})")
            except Exception as e:
                print(f"  [ERROR] Failed to parse {fpath}: {e}")
                sys.exit(1)
                
    print("\n[5/5] Checking placeholder integrity...")
    zh_tree = ET.parse('app/src/main/res/values-zh/strings.xml')
    hant_tree = ET.parse('app/src/main/res/values-b+zh+Hant/strings.xml')
    
    zh_dict = {c.attrib['name']: c.text for c in zh_tree.getroot() if c.tag == 'string'}
    hant_dict = {c.attrib['name']: c.text for c in hant_tree.getroot() if c.tag == 'string'}
    
    placeholder_mismatches = 0
    for name, zh_val in zh_dict.items():
        hant_val = hant_dict.get(name)
        if not hant_val:
            continue
        zh_phs = re.findall(r'%[0-9]*\$?[a-zA-Z]', zh_val or '')
        hant_phs = re.findall(r'%[0-9]*\$?[a-zA-Z]', hant_val or '')
        if zh_phs != hant_phs:
            print(f"  [WARNING] Placeholder mismatch in '{name}': {zh_phs} vs {hant_phs}")
            placeholder_mismatches += 1
            
    if placeholder_mismatches == 0:
        print("  ✓ All format placeholders match 100%!")
    else:
        print(f"  [!] {placeholder_mismatches} placeholder mismatches found.")
        
    print("\n" + "=" * 60)
    print("Traditional Chinese localization generated successfully!")
    print("=" * 60)

if __name__ == '__main__':
    main()
