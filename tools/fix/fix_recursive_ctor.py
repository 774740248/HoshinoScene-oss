#!/usr/bin/env python3
"""Fix jadx 'recursive constructor invocation' artifacts.

jadx sometimes turns a superclass constructor call (or a synthetic field
assignment) into a bogus `this(p0);` self-call inside the outer constructor.

Two cases:
  1. Subclass with default ctor in smali -> replace `this(p0);` with `super();`
  2. Synthetic class with `iput` in smali      -> replace `this(p0);` with
     the corresponding Java field assignment `this.<field> = p0;`

The ground-truth smali lives under /tmp/build-src/smali/a/<name>.smali.
"""
import os
import re
import sys

JAVA_A = "app/src/main/java/a"
SMALI_A = "/tmp/build-src/smali/a"

# obf field name -> java field name overrides where renaming occurred.
FIELD_OVERRIDE = {
    # class -> {smali_field: java_field}
}

SELF_CALL_RE = re.compile(r"^(\s*)this\(p0\);\s*$")


def smali_iput_file(smali_text, cls):
    """Return (smali_field, java_type) for the iput into this class, else None."""
    pat = re.compile(
        r"iput(?:-object|-boolean|-byte|-char|-short|-wide)?\s+p\d+,\s*p0,\s*La/"
        + re.escape(cls) + r";->([A-Za-z0-9_]+):([^ ]+)"
    )
    m = pat.search(smali_text)
    if not m:
        return None
    return m.group(1), m.group(2)


def java_field_for(cls, smali_field, java_text):
    """Find the java field declaration whose name matches (or stem-matches)."""
    # exact name
    if re.search(r"\b" + re.escape(smali_field) + r"\s*[;=]", java_text):
        return smali_field
    # jadx renames colliding fields to fNNNa; pick the sole synthetic field
    fields = re.findall(r"public final\s+/\* synthetic \*/\s+[^;]+?\s+([A-Za-z0-9_]+)\s*;", java_text)
    if len(fields) == 1:
        return fields[0]
    return None


def process(cls):
    jpath = os.path.join(JAVA_A, cls + ".java")
    spath = os.path.join(SMALI_A, cls + ".smali")
    if not os.path.isfile(jpath):
        return f"{cls}: no java"
    with open(jpath) as f:
        java = f.read()
    smali = ""
    if os.path.isfile(spath):
        smali = open(spath).read()

    lines = java.split("\n")
    changed = False
    iput = smali_iput_file(smali, cls) if smali else None
    for i, ln in enumerate(lines):
        m = SELF_CALL_RE.match(ln)
        if not m:
            continue
        indent = m.group(1)
        if iput:
            sfield, stype = iput
            jfield = java_field_for(cls, sfield, java)
            if jfield:
                lines[i] = f"{indent}this.{jfield} = p0;"
            else:
                lines[i] = f"{indent}this.{sfield} = p0;"
        else:
            lines[i] = f"{indent}super();"
        changed = True
    if changed:
        with open(jpath, "w") as f:
            f.write("\n".join(lines))
        return f"{cls}: fixed ({'field' if iput else 'super()'})"
    return f"{cls}: no self-call"


def main():
    classes = sys.argv[1:]
    for c in classes:
        print(process(c))


if __name__ == "__main__":
    main()
