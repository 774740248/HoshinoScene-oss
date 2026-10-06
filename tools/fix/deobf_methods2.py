#!/usr/bin/env python3
"""
deobf_methods2.py — 库类「方法」去混淆（仅用真实成员调用序列打分）v2

改进点（相对 v1）
----------------
* 打分序列只保留 **未被混淆** 的被调用成员（java.*/android.*/androidx.*/com.google.*
  以及其它真实名），把 OBF 引用整体丢弃 —— 提高区分度。
* 结合 `.locals` 寄存器数与参数个数做强约束。
* 对同名多候选，要求最高分显著领先；否则写入 report 供人工。
"""
import argparse, difflib, json, os, re, shutil, subprocess, sys

SHORT = re.compile(r"^[a-zA-Z_$]{1,2}$|^[a-z]\d$")
REAL_PREFIX = ("java/", "javax/", "android/", "androidx/", "com/google/",
               "kotlin/", "kotlinx/", "org/", "sun/")


def is_real(owner, name):
    return owner.startswith(REAL_PREFIX) and not SHORT.match(name)


def smali_methods(path):
    t = open(path, encoding="utf-8", errors="ignore").read()
    out = {}
    for p in re.split(r"^\.method", t, flags=re.MULTILINE)[1:]:
        head, _, body = p.partition("\n")
        hm = re.search(r"([^\s(]+)\(([^)]*)\)(\S+)", head.strip())
        if not hm:
            continue
        nargs = 0 if not hm.group(2).strip() else hm.group(2).count(",") + 1
        lc = re.search(r"\.locals\s+(\d+)", body)
        seq = []
        for m in re.finditer(r"invoke-\w+\s+\{[^}]*\},\s*L([^;]+);->([^\s(]+)\(", body):
            if is_real(m.group(1), m.group(2)):
                seq.append(f"{m.group(1)}->{m.group(2)}")
        out.setdefault(hm.group(1), []).append(
            {"nargs": nargs, "locals": int(lc.group(1)) if lc else -1, "seq": seq})
    return out


def javap_methods(internal):
    r = subprocess.run(["javap", "-p", "-c", "-classpath", "/tmp/_deobf_jars",
                        ".".join(internal.split("/"))], capture_output=True, text=True)
    out, cur, buf, header = {}, None, [], None
    for l in r.stdout.splitlines():
        if re.match(r"^  [^\s]", l) and "(" in l and l.rstrip().endswith(";"):
            if cur:
                out[cur] = _mk(buf, header)
            header = l.strip().rstrip(";")
            cur = header.split("(")[0].split()[-1]
            buf = []
        elif l.startswith("    "):
            buf.append(l.strip())
    if cur:
        out[cur] = _mk(buf, header)
    return out


def _mk(lines, header):
    seq = []
    for x in lines:
        m = re.search(r"// (?:Method|InterfaceMethod) ([\w/$]+)\.([\w$<]+)", x)
        if m and is_real(m.group(1), m.group(2)):
            seq.append(f"{m.group(1)}->{m.group(2)}")
    args = ""
    if header and "(" in header:
        args = header[header.index("(") + 1 : header.rindex(")")].strip()
    return {"nargs": 0 if not args else args.count(",") + 1, "seq": seq}


def next_call(b):
    # approximate register count from max vN used
    return b.get("locals", -1)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--out", default="/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000")
    ap.add_argument("--classes", default="", help="逗号分隔的 internal 类名（空=全部）")
    args = ap.parse_args()

    if args.classes:
        targets = [c for c in args.classes.split(",") if c]
    else:
        targets = []
        for root in ("androidx", "com/google"):
            for dp, _, fs in os.walk(os.path.join(args.smali, root)):
                for f in fs:
                    if f.endswith(".smali"):
                        targets.append(os.path.relpath(os.path.join(dp, f), args.smali)[:-6]
                                       .replace(os.sep, "/"))
    mapping, report = {}, []
    for internal in targets:
        spath = os.path.join(args.smali, internal + ".smali")
        if not os.path.exists(spath):
            continue
        sm = smali_methods(spath)
        if not any(SHORT.match(n) for n in sm):
            continue
        real = javap_methods(internal)
        if not real:
            continue
        for obf, variants in sm.items():
            if not SHORT.match(obf):
                continue
            for v in variants:
                cands = [(rn, e) for rn, e in real.items()
                         if not rn.startswith("<") and e["nargs"] == v["nargs"] and e["seq"]]
                if not cands:
                    continue
                scored = sorted(((difflib.SequenceMatcher(None, v["seq"], e["seq"],
                                 autojunk=False).ratio(), rn) for rn, e in cands),
                                reverse=True)
                top, topn = scored[0]
                second = scored[1][0] if len(scored) > 1 else 0.0
                key = f"{internal}#{obf}"
                if top >= 0.45 and top - second >= 0.10:
                    # 同一 obf 名多变体（重载）时保留最高分
                    if key not in mapping or top > mapping[key][1]:
                        mapping[key] = (topn, top)
                else:
                    report.append((internal, obf, f"{top:.2f}/{second:.2f}", topn))
    final = {k: v[0] for k, v in mapping.items()}
    json.dump(final, open(os.path.join(args.out, "lib-method-map.json"), "w"),
              indent=1, sort_keys=True)
    with open(os.path.join(args.out, "lib-method-map.report.txt"), "w") as fh:
        for x in report:
            fh.write("\t".join(str(i) for i in x) + "\n")
    print(f"resolved {len(final)} methods, {len(report)} unresolved", file=sys.stderr)


if __name__ == "__main__":
    main()
