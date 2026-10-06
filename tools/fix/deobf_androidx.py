#!/usr/bin/env python3
"""
deobf_androidx.py — AndroidX 库成员去混淆映射生成器 (v3, 调用序列匹配)

背景
----
原 APK 构建时 R8 把 AndroidX 的「非公开成员」重命名成 a()/b()/e()...
反编译 smali 中 androidx 类名保留，但成员名退化成短名。

方法
----
smali(dex,寄存器机) 与 javap(JVM,栈机) 指令集不同，无法逐指令比对。
但 **被调用成员的序列** 是可比的：
  * 提取 smali 方法体 / javap 方法体中的 invoke 目标序列
  * 把「被混淆的成员引用」(owner->短名) 归一化为 'OBF'
  * 用 difflib.SequenceMatcher 计算序列相似度
  * 取最高分候选（需显著领先次高分）

产物
----
  androidx-member-map.json     { "internalClass#obfName": "realName" }
  androidx-member-map.report.txt
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
CORE_PKGS = ("java/", "javax/", "android/", "kotlin/", "kotlinx/", "org/", "sun/", "dalvik/")


def is_obf(owner, name):
    """判断成员引用是否『被混淆』（需要归一化）。"""
    if owner.startswith(CORE_PKGS):
        return False
    return bool(SHORT_NAME.match(name))


def norm_call(owner, name):
    return "OBF" if is_obf(owner, name) else f"{owner}->{name}"


RE_INVOKE = re.compile(r"invoke-\w+\s+\{[^}]*\},\s*L([^;]+);->([^\s(]+)\(")
RE_FIELD = re.compile(
    r"[si]get(?:-object|-wide|-boolean|-byte|-char|-short)?\s+[^,]+,\s*L([^;]+);->([^\s:]+):"
)


def smali_seq(body):
    seq = []
    for m in RE_INVOKE.finditer(body):
        seq.append(norm_call(m.group(1), m.group(2)))
    for m in RE_FIELD.finditer(body):
        o, n = m.group(1), m.group(2)
        seq.append("OBF" if is_obf(o, n) else f"FLD:{o}->{n}")
    return seq


def parse_javap(text):
    out = {}
    cur, buf, header = None, [], None
    for line in text.splitlines():
        if re.match(r"^  [^\s]", line) and "(" in line and line.rstrip().endswith(";"):
            if cur:
                out[cur] = _entry(buf, header)
            header = line.strip().rstrip(";")
            cur = header.split("(")[0].split()[-1]
            buf = []
        elif line.startswith("    ") or line.startswith("      "):
            buf.append(line.strip())
    if cur:
        out[cur] = _entry(buf, header)
    return out


def _entry(lines, header):
    seq = []
    for l in lines:
        m = re.search(r"// (?:Method|InterfaceMethod|Field) ([\w/$]+)\.([\w$<>]+)", l)
        if m:
            o, n = m.group(1), m.group(2)
            if n.startswith("<"):
                continue
            seq.append(norm_call(o, n) if "Field" not in l else
                       ("OBF" if is_obf(o, n) else f"FLD:{o}->{n}"))
    args = ""
    if header and "(" in header:
        args = header[header.index("(") + 1 : header.rindex(")")].strip()
    nargs = 0 if not args else args.count(",") + 1
    ret = header.rsplit(" ", 1)[-1] if header else "?"
    return {"seq": seq, "nargs": nargs, "ret": ret}


def ratio(a, b):
    if not a or not b:
        return 0.0
    return difflib.SequenceMatcher(None, a, b, autojunk=False).ratio()


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--libs", default="/workspace/hoshino-scene-recovered/app/libs")
    ap.add_argument("--out", default="/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000")
    ap.add_argument("--threshold", type=float, default=0.62)
    ap.add_argument("--margin", type=float, default=0.06)
    args = ap.parse_args()

    tmp = "/tmp/_deobf_jars"
    if not os.path.isdir(tmp):
        os.makedirs(tmp, exist_ok=True)
        for j in os.listdir(args.libs):
            if j.endswith(".jar"):
                subprocess.run(["unzip", "-oq", os.path.join(args.libs, j), "-d", tmp],
                               capture_output=True)

    adir = os.path.join(args.smali, "androidx")
    mapping, report = {}, []
    ncls = 0
    for dp, _, fs in os.walk(adir):
        for f in fs:
            if not f.endswith(".smali"):
                continue
            full = os.path.join(dp, f)
            internal = os.path.relpath(full, args.smali)[:-6].replace(os.sep, "/")
            t = open(full, encoding="utf-8", errors="ignore").read()
            if not any(SHORT_NAME.match(n) for n in re.findall(r"^\.method[^\n]*?\s([^\s(]+)\(", t, re.MULTILINE)):
                continue
            ncls += 1
            r = subprocess.run(
                ["javap", "-p", "-c", "-classpath", tmp, ".".join(internal.split("/"))],
                capture_output=True, text=True)
            if "Compiled from" not in r.stdout:
                report.append((internal, "*", "javap-fail"))
                continue
            real = parse_javap(r.stdout)
            for p in re.split(r"^\.method", t, flags=re.MULTILINE)[1:]:
                head, _, body = p.partition("\n")
                hm = re.search(r"([^\s(]+)\(([^)]*)\)(\S+)", head.strip())
                if not hm or not SHORT_NAME.match(hm.group(1)):
                    continue
                obf = hm.group(1)
                s = smali_seq(body)
                if not s:
                    continue
                scored = sorted(((ratio(s, e["seq"]), rn) for rn, e in real.items()
                                 if not rn.startswith("<") and e["seq"]), reverse=True)
                if not scored:
                    continue
                top, topn = scored[0]
                second = scored[1][0] if len(scored) > 1 else 0.0
                if top >= args.threshold and top - second >= args.margin:
                    mapping[f"{internal}#{obf}"] = topn
                else:
                    report.append((internal, obf, f"{top:.2f}(2nd {second:.2f})"))
    print(f"classes scanned: {ncls}", file=sys.stderr)
    print(f"resolved: {len(mapping)}, unresolved: {len(report)}", file=sys.stderr)
    os.makedirs(args.out, exist_ok=True)
    json.dump(mapping, open(os.path.join(args.out, "androidx-member-map.json"), "w"),
              indent=1, sort_keys=True)
    with open(os.path.join(args.out, "androidx-member-map.report.txt"), "w") as fh:
        for x in report:
            fh.write("\t".join(str(i) for i in x) + "\n")


if __name__ == "__main__":
    main()
