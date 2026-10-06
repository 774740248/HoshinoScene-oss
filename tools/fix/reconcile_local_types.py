#!/usr/bin/env python3
"""Reconcile jadx type-confusion on local declarations.

Pattern (very common in the recovered `a/` sources):

    jm av = (androidx.appcompat.widget.ActionBarOverlayLayout) expr;

Here jadx emitted the obfuscated `a/jm` as the *declared* type while the *cast*
already names the real library type. Every subsequent `av.<member>` call is
against the real type, so the declaration is wrong. We rewrite the declared
type to match the cast.

Rule: for lines of the form `<ShortAtype> <var> = (<Real.Type>) <expr>;`
where `<ShortAtype>` resolves to an `a/` class and `<Real.Type>` is a
non-`a.` library class, replace `<ShortAtype>` with `<Real.Type>`.

Usage: python3 reconcile_local_types.py [--apply]
"""
import os
import re
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
JAVA = os.path.join(ROOT, "app", "src", "main", "java")

# <ShortAtype>|a.ShortAtype var = ( pkg.Real.Type ) expr ;
PAT = re.compile(
    r'(?P<pre>^[ \t]*(?:final\s+)?)'          # leading indent + optional final
    r'(?P<decl>(?:a\.)?[a-z][\w$]*)\s+'        # obfuscated declared type
    r'(?P<var>[A-Za-z_$][\w$]*)\s*=\s*'        # variable name
    r'\(\s*(?P<cast>(?:[a-zA-Z_$][\w$]*\.)+[A-Z_$][\w$]*)\s*\)',  # (Real.Type)
    re.MULTILINE)


def atype_exists(name):
    """True if `name` (single-letter-ish) is a real class in package a."""
    return os.path.exists(os.path.join(JAVA, "a", name + ".java"))


def main():
    apply = "--apply" in sys.argv
    total = 0
    files = 0
    for root, _dirs, fs in os.walk(JAVA):
        for f in fs:
            if not f.endswith(".java"):
                continue
            path = os.path.join(root, f)
            with open(path, encoding="utf-8") as fh:
                src = fh.read()
            changed = 0

            def repl(m):
                nonlocal changed
                decl = m.group("decl")
                cast = m.group("cast")
                short = decl.split(".")[-1]
                # only when the declared type is an `a/` class and cast is NOT a.
                if not atype_exists(short):
                    return m.group(0)
                if cast.split(".")[0] in ("a",):
                    return m.group(0)
                changed += 1
                return f"{m.group('pre')}{cast} {m.group('var')} = ({cast})"

            new = PAT.sub(repl, src)
            if new != src:
                total += changed
                files += 1
                if apply:
                    with open(path, "w", encoding="utf-8") as fh:
                        fh.write(new)
    print(f"reconcile local types: {total} decls in {files} files "
          f"({'APPLIED' if apply else 'dry-run'})")


if __name__ == "__main__":
    main()
