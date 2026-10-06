#!/usr/bin/env python3
"""
deobf_fields.py — 库类「字段」去混淆映射（按声明顺序 + 类型对齐）

背景
----
原 APK 用 R8 混淆了库类的非公开字段（TabLayout.tabSelectedIndicator -> TabLayout.q）。
smali 保留类名与字段的**声明顺序**与**类型**，但字段名变成短名。

方法
----
1. 从 smali 解析目标类的字段列表：(access, name, typeDescriptor)，保持声明顺序。
2. 用 javap 解析真实类的字段列表：(access, name, type)，保持声明顺序。
3. 用序列对齐（difflib.SequenceMatcher，比较元素 = 归一化后的类型字符串）把
   smali 字段与真实字段一一配对；只接受「类型相同」的对齐项。
4. 输出 { "internalClass#obfField": "realField" }。

类型归一化
----------
smali 中库类之间的引用类型也被混淆为 La/xxx; 形式，无法直接与真实类型比较。
对这些「不可解析引用类型」用占位符 'REF' 参与比对（两侧都标 REF），
基本类型 (I/Z/F/...) 与 java.* / android.* 引用保持字面量。
"""
import argparse
import difflib
import json
import os
import re
import shutil
import subprocess
import sys

SHORT_NAME = re.compile(r"^[a-zA-Z_$]{1,2}$|^[a-z]\d$")

# smali 类型描述符 -> 归一化 token
PRIM = {
    "V": "V", "Z": "Z", "B": "B", "S": "S", "C": "C", "I": "I",
    "J": "J", "F": "F", "D": "D",
}


def norm_smali_type(desc):
    """把 smali 类型描述符归一化；被混淆的引用类型统一成 REF。"""
    desc = desc.strip()
    if desc in PRIM:
        return desc
    m = re.match(r"^L([^;]+);$", desc)
    if m:
        cl = m.group(1)
        if cl.startswith(("java/", "javax/", "android/", "androidx/", "com/google/",
                          "kotlin/", "org/")):
            return "L" + cl + ";"
        return "REF"
    if desc.startswith("["):
        return desc  # 数组保留
    return desc


def norm_java_type(t):
    t = t.strip()
    m = re.match(r"^([A-Za-z_][\w.$]*)(<.*>)?(\[\])*$", t)
    if not m:
        return t
    base = m.group(1).replace(".", "/")
    arr = m.group(3) or ""
    if base in ("int", "boolean", "byte", "short", "char", "long", "float", "double", "void"):
        return {"int": "I", "boolean": "Z", "byte": "B", "short": "S", "char": "C",
                "long": "J", "float": "F", "double": "D", "void": "V"}[base] + arr
    if base.startswith(("java/", "javax/", "android/", "androidx/", "com/google/",
                        "kotlin/", "org/")):
        return "L" + base + ";" + arr
    return "REF" + arr


def parse_smali_fields(path):
    out = []
    t = open(path, encoding="utf-8", errors="ignore").read()
    for m in re.finditer(r"^\.field\s+([^\n]*?)\s+([^\s:]+):(\S+)\s*$", t, re.MULTILINE):
        acc, name, desc = m.group(1), m.group(2), m.group(3)
        out.append({"access": acc, "name": name, "raw": desc,
                    "norm": norm_smali_type(desc)})
    return out


def parse_javap_fields(text):
    out = []
    for line in text.splitlines():
        if not re.match(r"^  [^\s]", line):
            continue
        s = line.strip()
        if "(" in s or s.endswith("{") or s.startswith(("}", "Compiled", "class ", "public class")):
            continue
        m = re.match(r"^((?:public|private|protected|static|final|volatile|transient|abstract|synthetic)\s+)*([\w.$\[\]<>,? ]+?)\s+([\w$]+);$", s)
        if m:
            t = m.group(2).strip()
            out.append({"name": m.group(3), "raw": t, "norm": norm_java_type(t)})
    return out


def align(sm_fields, jv_fields):
    """返回 {obfName: realName}，仅保留唯一、类型一致的对齐。"""
    a = [f["norm"] for f in sm_fields]
    b = [f["norm"] for f in jv_fields]
    sm = difflib.SequenceMatcher(None, a, b, autojunk=False)
    res = {}
    for tag, i1, i2, j1, j2 in sm.get_opcodes():
        if tag == "equal":
            for k in range(i2 - i1):
                sf = sm_fields[i1 + k]
                jf = jv_fields[j1 + k]
                if sf["name"] != jf["name"]:
                    res[sf["name"]] = jf["name"]
        elif tag == "replace":
            # 在替换块内按类型再对齐
            used = set()
            for i in range(i1, i2):
                sf = sm_fields[i]
                cand = [j for j in range(j1, j2) if j not in used
                        and jv_fields[j]["norm"] == sf["norm"]]
                if len(cand) >= 1:
                    # 优先取顺序最近的
                    jj = sorted(cand, key=lambda x: abs(x - i))[0]
                    used.add(jj)
                    if sf["name"] != jv_fields[jj]["name"]:
                        res[sf["name"]] = jv_fields[jj]["name"]
    return res


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--libs", default="/workspace/hoshino-scene-recovered/app/libs")
    ap.add_argument("--out", default="/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000")
    args = ap.parse_args()

    tmp = "/tmp/_deobf_jars"
    if not os.path.isdir(tmp):
        os.makedirs(tmp, exist_ok=True)
        for j in os.listdir(args.libs):
            if j.endswith(".jar"):
                subprocess.run(["unzip", "-oq", os.path.join(args.libs, j), "-d", tmp],
                               capture_output=True)

    mapping = {}
    stats = []
    # 收集所有含被混淆字段的库类
    for root in ("androidx", "com"):
        base = os.path.join(args.smali, root)
        for dp, _, fs in os.walk(base):
            for f in fs:
                if not f.endswith(".smali"):
                    continue
                full = os.path.join(dp, f)
                internal = os.path.relpath(full, args.smali)[:-6].replace(os.sep, "/")
                if internal.startswith("a/") or internal.startswith("com/omarea/"):
                    continue
                smf = parse_smali_fields(full)
                obf = [x for x in smf if SHORT_NAME.match(x["name"])]
                if not obf:
                    continue
                r = subprocess.run(
                    ["javap", "-p", "-classpath", tmp, ".".join(internal.split("/"))],
                    capture_output=True, text=True)
                if "Compiled from" not in r.stdout:
                    continue
                jvf = parse_javap_fields(r.stdout)
                if not jvf:
                    continue
                amap = align(smf, jvf)
                n = 0
                for k, v in amap.items():
                    mapping[f"{internal}#{k}"] = v
                    n += 1
                stats.append((internal, len(obf), n, len(smf), len(jvf)))

    stats.sort(key=lambda x: -x[1])
    print(f"mapped fields: {len(mapping)} across {len(stats)} classes", file=sys.stderr)
    for s in stats[:20]:
        print(f"  {s[0]}: obf={s[1]} mapped={s[2]} (smali {s[3]} / real {s[4]})", file=sys.stderr)
    os.makedirs(args.out, exist_ok=True)
    json.dump(mapping, open(os.path.join(args.out, "lib-field-map.json"), "w"),
              indent=1, sort_keys=True)


if __name__ == "__main__":
    main()
