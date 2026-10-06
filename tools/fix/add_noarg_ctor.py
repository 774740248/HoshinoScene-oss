#!/usr/bin/env python3
"""Add a minimal no-arg constructor to classes that extend a framework type
whose no-arg constructor does not exist.

Jadx sometimes drops the (synthetic) constructor of classes that extend e.g.
``ViewGroup.LayoutParams``; the compiler then fails with
``no suitable constructor found for X(no arguments)``. We synthesise a
constructor with the smallest valid ``super(...)`` call.
"""
import os
import re
import sys

# supertype (simple name as written in `extends`) -> super(...) arguments
SUPER_ARGS = {
    "android.view.ViewGroup.LayoutParams": "-2, -2",
    "android.view.ViewGroup.MarginLayoutParams": "-2, -2",
    "android.widget.LinearLayout.LayoutParams": "-2, -2",
    "android.widget.FrameLayout.LayoutParams": "-2, -2",
    "android.view.View.BaseSavedState": "android.os.Parcel.obtain()",
    "android.view.AbsSavedState": "android.os.Parcel.obtain()",
}
# types that actually DO have a usable no-arg ctor on a parent we control
ROOT = "app/src/main/java"


def add_ctor(path, clsname, sup, args):
    with open(path) as f:
        s = f.read()
    # already has a constructor?
    if re.search(r"\b" + re.escape(clsname) + r"\s*\(", s):
        return False
    m = re.search(r"(class\s+" + re.escape(clsname) + r"\b[^{]*\{)\n", s)
    if not m:
        return False
    ctor = f"\n    public {clsname}() {{\n        super({args});\n    }}\n"
    s = s[:m.end()] + ctor + s[m.end():]
    with open(path, "w") as f:
        f.write(s)
    return True


def main():
    files = sys.argv[1:]
    if not files:
        files = [os.path.join(ROOT, "a", n) for n in os.listdir(os.path.join(ROOT, "a")) if n.endswith(".java")]
    n = 0
    for p in files:
        with open(p) as f:
            s = f.read()
        mm = re.search(r"public\s+(?:final\s+|abstract\s+)?class\s+(\w+)\s+extends\s+([\w.$]+)", s)
        if not mm:
            continue
        clsname, sup = mm.group(1), mm.group(2)
        if sup in SUPER_ARGS:
            if add_ctor(p, clsname, sup, SUPER_ARGS[sup]):
                print(f"{p}: +ctor {clsname}() -> super({SUPER_ARGS[sup]})")
                n += 1
    print(f"TOTAL ctors added: {n}")


if __name__ == "__main__":
    main()
