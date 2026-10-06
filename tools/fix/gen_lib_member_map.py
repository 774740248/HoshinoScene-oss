#!/usr/bin/env python3
"""Generate an obfuscated-member -> real-member map for library classes.

Context
-------
The recovered app source (package ``a``) references members of R8-obfuscated
copies of third-party libraries (material, appcompat, androidx, ...).  The
*same* classes are available in their pristine form inside ``app/libs/*.jar``
under their original member names.  We hold the dex ground truth for the
obfuscated copies in ``/tmp/build-src/smali``.

Strategy (methods)
------------------
For every library class present both as smali and inside a jar:

* extract methods from smali: name, parameter descriptor list, return descriptor;
* extract methods from the pristine class via ``javap -p -s`` (name + JVM
  signature);
* keep only smali methods whose name is *obfuscated* (1-2 chars);
* match each obfuscated smali method to a javap method FIRST by exact
  parameter+return descriptor.  If several javap methods share the descriptor,
  break ties by comparing the *sequence of real (non-obfuscated) member
  references* in the two method bodies (jadx/javap bytecode) — the body with
  the highest overlap wins, provided the score is unique and > 0.

Strategy (fields)
-----------------
Fields are matched by (type, static, final) uniqueness exactly as in
``build_field_map_type.py`` (already integrated here for completeness).

Output: JSON ``{internal/Owner#obfName -> realName}``.
"""

from __future__ import annotations

import argparse
import json
import os
import re
import subprocess
import sys
import tempfile
import zipfile
from collections import defaultdict
from typing import Dict, List, Optional, Tuple

SHORT = re.compile(r"^[a-zA-Z_$]{1,2}\d*$")

METHOD_HEAD = re.compile(
    r"^\.method\s+(?P<mods>[^\n]*?)\s*(?P<name>[^\s(]+)\((?P<params>[^)]*)\)(?P<ret>\S+)",
    re.M)
FIELD_RE = re.compile(
    r"^\.field\s+(?P<mods>[\w\s]*?)\s*(?P<name>[A-Za-z_$][\w$]*):(?P<type>[^\s=]+)", re.M)
REAL_OWNER = ("java/", "javax/", "android/", "androidx/", "com/google/",
              "kotlin/", "kotlinx/", "org/", "sun/", "dalvik/")


def parse_params(desc: str) -> List[str]:
    """Split a JVM parameter descriptor list into individual type descriptors."""
    out: List[str] = []
    i = 0
    while i < len(desc):
        c = desc[i]
        if c == "[":
            j = i
            while j < len(desc) and desc[j] == "[":
                j += 1
            if desc[j] == "L":
                k = desc.index(";", j)
                out.append(desc[i:k + 1])
                i = k + 1
            else:
                out.append(desc[i:j + 1])
                i = j + 1
        elif c == "L":
            k = desc.index(";", i)
            out.append(desc[i:k + 1])
            i = k + 1
        else:
            out.append(c)
            i += 1
    return out


def smali_methods(path: str) -> List[dict]:
    text = open(path, "r", encoding="utf-8", errors="replace").read()
    out: List[dict] = []
    for part in re.split(r"^\.method", text, flags=re.M)[1:]:
        head, _, body = part.partition("\n")
        m = re.search(r"([^\s(]+)\(([^)]*)\)(\S+)", head.strip())
        if not m:
            continue
        name, params, ret = m.group(1), m.group(2), m.group(3)
        # collect real member refs in body (invoke-* to real owners)
        seq: List[str] = []
        for im in re.finditer(r"invoke-\w+\s+\{[^}]*\},\s*L([^;]+);->([^\s(]+)\(", body):
            owner, meth = im.group(1), im.group(2)
            if owner.startswith(REAL_OWNER) and not SHORT.match(meth):
                seq.append(f"{owner}->{meth}")
        for fm in re.finditer(r"(?:iget|iput|sget|sput)[-\w]*\s+[^,]+,\s*[^,]+,\s*L([^;]+);->([^\s:]+):", body):
            owner, fld = fm.group(1), fm.group(2)
            if owner.startswith(REAL_OWNER) and not SHORT.match(fld):
                seq.append(f"{owner}=>{fld}")
        out.append({"name": name, "params": params, "ret": ret,
                    "sig": f"({params}){ret}", "seq": seq,
                    "ops": smali_opcodes(body)})
    return out


# --- opcode canonicalisation -------------------------------------------------
# The obfuscated dex copy and the pristine jar hold the *same* method bodies
# (R8 does not mutate logic), so their canonical opcode streams are (near)
# identical.  This is the most reliable signal to resolve overload ambiguity.

SMALI_OP_MAP = {
    "iget": "GETF", "iget-object": "GETF", "iget-boolean": "GETF",
    "iget-byte": "GETF", "iget-char": "GETF", "iget-short": "GETF",
    "iget-wide": "GETF",
    "iput": "PUTF", "iput-object": "PUTF", "iput-boolean": "PUTF",
    "iput-byte": "PUTF", "iput-char": "PUTF", "iput-short": "PUTF",
    "iput-wide": "PUTF",
    "sget": "GETF", "sget-object": "GETF", "sget-boolean": "GETF",
    "sget-byte": "GETF", "sget-char": "GETF", "sget-short": "GETF",
    "sget-wide": "GETF",
    "sput": "PUTF", "sput-object": "PUTF", "sput-boolean": "PUTF",
    "sput-byte": "PUTF", "sput-char": "PUTF", "sput-short": "PUTF",
    "sput-wide": "PUTF",
    "invoke-virtual": "INVK", "invoke-direct": "INVK", "invoke-static": "INVK",
    "invoke-interface": "INVK", "invoke-super": "INVK",
    "invoke-virtual/range": "INVK", "invoke-static/range": "INVK",
    "move-result": "MRES", "move-result-object": "MRES",
    "move-result-wide": "MRES",
    "const/4": "CONST", "const/16": "CONST", "const": "CONST",
    "const-string": "CSTR", "const-string/jumbo": "CSTR",
    "const-class": "CCLS",
    "new-instance": "NEW", "check-cast": "CAST",
    "if-eqz": "IF", "if-nez": "IF", "if-ltz": "IF", "if-gez": "IF",
    "if-gtz": "IF", "if-lez": "IF", "if-eq": "IF", "if-ne": "IF",
    "if-lt": "IF", "if-ge": "IF", "if-gt": "IF", "if-le": "IF",
    "goto": "GOTO", "goto/16": "GOTO", "goto/32": "GOTO",
    "packed-switch": "SW", "sparse-switch": "SW",
    "return-void": "RET", "return": "RET", "return-object": "RET",
    "return-wide": "RET",
    "throw": "THR",
    "cmp-long": "CMP", "cmpl-float": "CMP", "cmpg-float": "CMP",
    "cmpl-double": "CMP", "cmpg-double": "CMP",
    "add-int": "ADD", "sub-int": "SUB", "mul-int": "MUL", "div-int": "DIV",
    "rem-int": "REM", "and-int": "AND", "or-int": "OR", "xor-int": "XOR",
    "shl-int": "SHL", "shr-int": "SHR", "ushr-int": "USHR",
    "add-long": "ADD", "sub-long": "SUB", "mul-long": "MUL",
    "move": "MV", "move-object": "MV", "move-wide": "MV",
    "move/from16": "MV", "move-object/from16": "MV", "move/16": "MV",
    "array-length": "ALEN", "aput-object": "APUT", "aget-object": "AGET",
    "new-array": "NARR", "fill-array-data": "FARR",
    "instance-of": "INST", "int-to-long": "CVT", "long-to-int": "CVT",
    "int-to-float": "CVT", "float-to-int": "CVT", "int-to-boolean": "CVT",
    "nop": "NOP", "monitor-enter": "MON", "monitor-exit": "MON",
}

JAVAP_OP_MAP = {
    "getfield": "GETF", "getstatic": "GETF",
    "putfield": "PUTF", "putstatic": "PUTF",
    "invokevirtual": "INVK", "invokespecial": "INVK", "invokestatic": "INVK",
    "invokeinterface": "INVK", "invokedynamic": "INVK",
    "goto": "GOTO", "tableswitch": "SW", "lookupswitch": "SW",
    "ifnull": "IF", "ifnonnull": "IF", "ifeq": "IF", "ifne": "IF",
    "iflt": "IF", "ifge": "IF", "ifgt": "IF", "ifle": "IF",
    "if_icmpeq": "IF", "if_icmpne": "IF", "if_icmplt": "IF",
    "if_icmpge": "IF", "if_icmpgt": "IF", "if_icmple": "IF",
    "if_acmpeq": "IF", "if_acmpne": "IF",
    "aload": "LD", "aload_0": "LD", "aload_1": "LD", "aload_2": "LD",
    "aload_3": "LD", "iload": "LD", "iload_0": "LD", "iload_1": "LD",
    "iload_2": "LD", "iload_3": "LD", "lload": "LD", "fload": "LD",
    "dload": "LD", "astore": "ST", "astore_0": "ST", "astore_1": "ST",
    "astore_2": "ST", "astore_3": "ST", "istore": "ST", "istore_0": "ST",
    "istore_1": "ST", "istore_2": "ST", "istore_3": "ST", "lstore": "ST",
    "fstore": "ST", "dstore": "ST",
    "new": "NEW", "newarray": "NARR", "anewarray": "NARR",
    "checkcast": "CAST", "instanceof": "INST",
    "ldc": "CONST", "ldc_w": "CONST", "ldc2_w": "CONST",
    "bipush": "CONST", "sipush": "CONST", "iconst_0": "CONST",
    "iconst_1": "CONST", "iconst_2": "CONST", "iconst_3": "CONST",
    "iconst_4": "CONST", "iconst_5": "CONST", "iconst_m1": "CONST",
    "aconst_null": "CONST", "lconst_0": "CONST", "fconst_0": "CONST",
    "dconst_0": "CONST", "getstatic_": "GETF",
    "iadd": "ADD", "isub": "SUB", "imul": "MUL", "idiv": "DIV",
    "irem": "REM", "iand": "AND", "ior": "OR", "ixor": "XOR",
    "ishl": "SHL", "ishr": "SHR", "iushr": "USHR", "ineg": "NEG",
    "ladd": "ADD", "lsub": "SUB", "lmul": "MUL",
    "lcmp": "CMP", "fcmpl": "CMP", "fcmpg": "CMP", "dcmpl": "CMP",
    "i2l": "CVT", "i2f": "CVT", "i2d": "CVT", "l2i": "CVT",
    "f2i": "CVT", "f2d": "CVT", "d2i": "CVT", "i2b": "CVT", "i2c": "CVT",
    "ireturn": "RET", "lreturn": "RET", "freturn": "RET", "dreturn": "RET",
    "areturn": "RET", "return": "RET",
    "athrow": "THR", "arraylength": "ALEN",
    "aastore": "APUT", "iastore": "APUT", "aastore_": "APUT",
    "aaload": "AGET", "iaload": "AGET", "arraylength_": "ALEN",
    "nop": "NOP", "monitorenter": "MON", "monitorexit": "MON",
    "pop": "POP", "pop2": "POP", "dup": "DUP", "dup_x1": "DUP",
    "swap": "SWAP",
    "iinc": "INC", "wide": "INC",
}


def smali_opcodes(body: str) -> List[str]:
    ops: List[str] = []
    for line in body.splitlines():
        line = line.strip()
        if not line or line.startswith((".", ":", "#")):
            continue
        mn = line.split(None, 1)[0]
        if mn in SMALI_OP_MAP:
            ops.append(SMALI_OP_MAP[mn])
    return ops


def javap_opcodes(code_lines: List[str]) -> List[str]:
    ops: List[str] = []
    for line in code_lines:
        m = re.match(r"^\s*\d+:\s+([a-z][a-z0-9_]*)", line)
        if not m:
            continue
        mn = m.group(1)
        if mn in JAVAP_OP_MAP:
            ops.append(JAVAP_OP_MAP[mn])
    return ops


def javap_methods(cf: str) -> List[dict]:
    """Parse ``javap -p -s -c`` once: name, signature and canonical opcodes."""
    try:
        out = subprocess.run(["javap", "-p", "-s", "-c", cf], capture_output=True,
                             text=True, timeout=120).stdout
    except Exception:
        return []
    res: List[dict] = []
    lines = out.splitlines()
    i = 0
    cur: Optional[dict] = None
    codebuf: List[str] = []

    def flush() -> None:
        if cur is not None:
            cur["ops"] = javap_opcodes(codebuf)
            res.append(cur)

    while i < len(lines):
        line = lines[i]
        m = re.match(r"^\s*(?:[\w.$<>\[\],\s]+?)\s+([A-Za-z_$][\w$]*)\s*\(([^)]*)\);\s*$", line)
        if m and i + 1 < len(lines) and "descriptor:" in lines[i + 1]:
            flush()
            name = m.group(1)
            desc = lines[i + 1].split("descriptor:")[1].strip()
            dm = re.match(r"\(([^)]*)\)(\S+)", desc)
            if dm:
                cur = {"name": name, "sig": f"({dm.group(1)}){dm.group(2)}"}
            else:
                cur = None
            codebuf = []
        else:
            codebuf.append(line)
        i += 1
    flush()
    return res


def real_method_seq(cf: str) -> Dict[str, List[str]]:
    """name+sig -> list of real member refs (from javap -c)."""
    try:
        out = subprocess.run(["javap", "-p", "-c", cf], capture_output=True,
                             text=True, timeout=90).stdout
    except Exception:
        return {}
    res: Dict[str, List[str]] = {}
    cur = None
    for line in out.splitlines():
        m = re.match(r"^\s*(?:[\w.$<>\[\],\s]+?)\s+([A-Za-z_$][\w$]*)\(([^)]*)\);\s*$", line)
        if m:
            cur = m.group(1)
            res.setdefault(cur, [])
            continue
        im = re.search(r"//\s*(?:Method|InterfaceMethod|Field)\s+([^.\s]+)[.\w/$]*\.([A-Za-z_$<>][\w$]*)", line)
        if im and cur is not None:
            owner = im.group(1).replace(".", "/")
            name = im.group(2)
            if owner.startswith(REAL_OWNER) and not SHORT.match(name):
                res[cur].append(f"{owner}->{name}")
    return res


def norm_type(t: str) -> str:
    t = t.rstrip(";")
    if t.startswith("L"):
        t = t[1:]
    t = re.sub(r"<.*>", "", t)
    return t.replace("/", ".")


FIELD_RE2 = FIELD_RE


def norm_sig(sig: str) -> str:
    """Normalise a method signature's owner types by simple name for compare."""
    def rep(mo: re.Match) -> str:
        return "L" + norm_type(mo.group(0)) + ";"
    return re.sub(r"L[^;]+;", rep, sig)


def opcode_similarity(a: List[str], b: List[str]) -> float:
    """Normalised opcode-sequence similarity via difflib ratio."""
    import difflib
    if not a or not b:
        return 0.0
    return difflib.SequenceMatcher(a=a, b=b, autojunk=False).ratio()


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--smali", default="/tmp/build-src/smali")
    ap.add_argument("--libs", default="app/libs")
    ap.add_argument("--out", default="/tmp/lib-member-map.json")
    args = ap.parse_args()

    jar_of: Dict[str, str] = {}
    for j in os.listdir(args.libs):
        if not j.endswith(".jar"):
            continue
        p = os.path.join(args.libs, j)
        try:
            with zipfile.ZipFile(p) as z:
                for n in z.namelist():
                    if n.endswith(".class"):
                        jar_of.setdefault(n[:-6], p)
        except Exception:
            continue

    method_map: Dict[str, str] = {}
    field_map: Dict[str, str] = {}
    stats = {"classes": 0, "m_uniq": 0, "m_body": 0, "m_amb": 0,
             "f_uniq": 0, "f_amb": 0}

    with tempfile.TemporaryDirectory() as td:
        for cls, jar in jar_of.items():
            sp = os.path.join(args.smali, cls + ".smali")
            if not os.path.exists(sp):
                continue
            smf = smali_methods(sp)
            if not smf:
                continue
            # extract class
            try:
                with zipfile.ZipFile(jar) as z:
                    data = z.read(cls + ".class")
                cf = os.path.join(td, "C.class")
                open(cf, "wb").write(data)
            except Exception:
                continue
            jm = javap_methods(cf)
            if not jm:
                continue
            stats["classes"] += 1

            # index javap methods by normalised signature
            idx: Dict[str, List[dict]] = defaultdict(list)
            for mm in jm:
                idx[norm_sig(mm["sig"])].append(mm)

            sm_by_sig: Dict[str, List[dict]] = defaultdict(list)
            for sm in smf:
                sm_by_sig[norm_sig(sm["sig"])].append(sm)

            for sig, sms in sm_by_sig.items():
                jcands = idx.get(sig, [])
                if not jcands:
                    continue
                jnames = {c["name"] for c in jcands}
                used_j: set = set()
                # 1) anchor real-named smali entries present in the javap bucket
                for sm in sms:
                    if not SHORT.match(sm["name"]) and sm["name"] in jnames:
                        used_j.add(sm["name"])
                sm_rest = [s for s in sms if SHORT.match(s["name"])]
                j_rest = [c for c in jcands if c["name"] not in used_j]
                if not sm_rest:
                    continue
                # 2) exact 1:1 by count -> declaration order (both sides preserve
                #    class-file member order).
                if len(sm_rest) == len(j_rest):
                    for sm, jc in zip(sm_rest, j_rest):
                        if sm["name"] == jc["name"]:
                            continue
                        method_map[f"{cls}#{sm['name']}"] = jc["name"]
                        stats["m_uniq"] += 1
                    continue
                # 3) count mismatch -> greedy opcode-sequence matching
                pool = list(j_rest)
                for sm in sm_rest:
                    best = None
                    best_score = -1
                    for jc in pool:
                        score = opcode_similarity(sm.get("ops", []), jc.get("ops", []))
                        if score > best_score:
                            best, best_score = jc, score
                    if best is not None and best_score >= 0.6:
                        method_map[f"{cls}#{sm['name']}"] = best["name"]
                        pool.remove(best)
                        stats["m_uniq"] += 1
                    else:
                        stats["m_amb"] += 1

            # ---- fields ----
            # rebuild smali fields
            sfields = []
            for fm in FIELD_RE2.finditer(open(sp, encoding="utf-8", errors="replace").read()):
                mods = fm.group("mods")
                sfields.append((fm.group("name"), fm.group("type"),
                                "static" in mods, "final" in mods))
            jfields = []
            for line in subprocess.run(["javap", "-p", cf], capture_output=True,
                                       text=True).stdout.splitlines():
                line = line.strip().rstrip(";")
                if "(" in line or "{" in line or not line or line.startswith("}"):
                    continue
                mm = re.match(r"(?P<mods>[\w\s]*?)\s*(?P<type>[\w.$<>\[\]]+)\s+(?P<name>[A-Za-z_$][\w$]*)$", line)
                if mm:
                    jfields.append((mm.group("name"), mm.group("type"),
                                    "static" in mm.group("mods"), "final" in mm.group("mods")))
            fidx: Dict[Tuple[str, bool, bool], List[str]] = defaultdict(list)
            for (nm, ty, st, fn) in jfields:
                fidx[(norm_type(ty), st, fn)].append(nm)
            used = set()
            # anchor real-named smali fields
            for (nm, ty, st, fn) in sfields:
                if not SHORT.match(nm) and nm in fidx.get((norm_type(ty), st, fn), []):
                    used.add(nm)
            # Pass 1: exact (type,static,final) uniqueness
            pending = []
            for (nm, ty, st, fn) in sfields:
                if not SHORT.match(nm):
                    continue
                key = (norm_type(ty), st, fn)
                cands = [c for c in fidx.get(key, []) if c not in used]
                if len(cands) == 1:
                    if cands[0] != nm:
                        field_map[f"{cls}#{nm}"] = cands[0]
                        used.add(cands[0])
                        stats["f_uniq"] += 1
                elif len(cands) > 1:
                    pending.append((nm, ty, st, fn))
                else:
                    pending.append((nm, ty, st, fn))
            # Pass 2: order alignment among remaining smali vs remaining javap,
            # bucketed by (static, final) only (type may differ because R8 may
            # have retyped e.g. a field to java.lang.Object).
            rem_j = [(nm, ty, st, fn) for (nm, ty, st, fn) in jfields if nm not in used]
            for bucket in {(s[2], s[3]) for s in pending}:
                sm_b = [s for s in pending if (s[2], s[3]) == bucket]
                j_b = [j for j in rem_j if (j[2], j[3]) == bucket]
                if len(sm_b) == len(j_b) and sm_b:
                    for sm, jc in zip(sm_b, j_b):
                        if sm[0] == jc[0]:
                            continue
                        field_map[f"{cls}#{sm[0]}"] = jc[0]
                        used.add(jc[0])
                        stats["f_uniq"] += 1
                else:
                    stats["f_amb"] += len(sm_b)

    # Emit method and field maps SEPARATELY with kind-tagged keys so the applier
    # can apply them with call-site awareness (a name may exist as BOTH a method
    # and a field on the same class, e.g. DrawerLayout#h).
    out = {"methods": method_map, "fields": field_map}
    json.dump(out, open(args.out, "w"), indent=1)
    print(f"classes: {stats['classes']}")
    print(f"methods: unique={stats['m_uniq']} body={stats['m_body']} ambiguous={stats['m_amb']}")
    print(f"fields:  unique={stats['f_uniq']} ambiguous={stats['f_amb']}")
    print(f"methods+fields -> {args.out}: {len(method_map)}+{len(field_map)}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
