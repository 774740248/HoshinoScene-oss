#!/usr/bin/env python3
"""Fix "cannot find symbol: class X" errors caused by jadx leaking smali
inner-class `$` names or dropping a fully-qualified outer-class prefix.

Strategy: an explicit, verified mapping table. Each entry maps the erroneous
token (as it appears in the recovered source) to the correct Java reference.
Only whole-file global replacements on `a/`-package files are performed; every
replacement is a pure textual refactor that preserves semantics.

Usage:
  python3 tools/fix/fix_missing_classes.py <build.log> [--apply]
"""
import os
import re
import sys


ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
JAVA = os.path.join(ROOT, "app", "src", "main", "java")

# (file-relative-to-JAVA, old-token, new-token)
# The old-token is matched as a whole token (word boundary aware, `$` safe).
REPLACEMENTS = [
    # smali inner-class `$` leaked into Java source -> dotted nested name
    ("a/f00.java", "android.graphics.Paint$Align", "android.graphics.Paint.Align"),
    ("a/pz.java", "android.graphics.Paint$Align", "android.graphics.Paint.Align"),
    ("a/ul1.java", "android.graphics.Paint$Align", "android.graphics.Paint.Align"),
    ("a/ck0.java", "android.graphics.Paint$Style", "android.graphics.Paint.Style"),
    ("a/mo0.java", "android.graphics.Paint$Style", "android.graphics.Paint.Style"),
    ("a/i00.java", "android.graphics.Paint$Style", "android.graphics.Paint.Style"),
    ("a/nz.java", "android.graphics.Paint$Style", "android.graphics.Paint.Style"),
    # inner interfaces / nested classes where the outer type is evident
    ("a/ml.java", "androidx.activity.OnContextAvailableListener",
     "androidx.activity.contextaware.OnContextAvailableListener"),
    ("a/kk0.java", "androidx.activity.OnContextAvailableListener",
     "androidx.activity.contextaware.OnContextAvailableListener"),
    ("a/km.java", "OnAttachListener",
     "androidx.appcompat.widget.ContentFrameLayout.OnAttachListener"),
    # unqualified jdk / android types
    ("a/bw.java", "CancellationException",
     "java.util.concurrent.CancellationException"),
    ("a/pp.java", "(Handler)", "(android.os.Handler)"),
    ("a/ts0.java", "(View)", "(android.view.View)"),
    ("a/g0.java", "(AccessibilityAction)",
     "(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)"),
    # unqualified listener / view / model types resolved to their real FQNs
    ("a/vb0.java", "(OnEditTextAttachedListener)",
     "(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener)"),
    ("a/et1.java", "(ActionBarVisibilityCallback)", "(a.j1)"),
    ("a/k40.java", "switchOptionItemViewArr[2] = (SwitchOptionItemView) findViewById;",
     "switchOptionItemViewArr[2] = (com.omarea.ui.SwitchOptionItemView) findViewById;"),
    ("a/w00.java", "(ActivityFastShare)", "(com.omarea.vtools.activities.ActivityFastShare)"),
    ("a/kf1.java", "(LoginResponse)", "(com.omarea.model.LoginResponse)"),
    ("a/go0.java", "(LoginResponse)", "(com.omarea.model.LoginResponse)"),
    ("a/un0.java", "(LoginResponse)", "(com.omarea.model.LoginResponse)"),
    ("a/io0.java", "(LoginResponse)", "(com.omarea.model.LoginResponse)"),
    # raw jadx type-variables leaked into Iterator declarations (no <T> in scope)
    ("a/e.java", "java.util.Iterator<E>", "java.util.Iterator"),
    ("a/yi.java", "java.util.Iterator<T>", "java.util.Iterator"),
    ("a/mi0.java", "java.util.Iterator<T>", "java.util.Iterator"),
    # Handler constructor callback
    ("a/vq.java", "(Callback)", "(android.os.Handler.Callback)"),
]

# Tokens that must be replaced as exact substrings (they already carry their
# own delimiters so a whole-token regex would not match). Detected by shape.
def _is_paren_token(tok: str) -> bool:
    return tok.startswith("(") or tok.startswith("java.util.Iterator")


def apply_replacements(dry_run: bool) -> int:
    applied = 0
    for rel, old, new in REPLACEMENTS:
        path = os.path.join(JAVA, rel)
        if not os.path.exists(path):
            print(f"  skip (missing file): {rel}")
            continue
        with open(path, "r", encoding="utf-8") as fh:
            src = fh.read()
        if _is_paren_token(old):
            count = src.count(old)
            if count == 0:
                continue
            new_src = src.replace(old, new)
        else:
            # whole-token replace so we do not corrupt longer identifiers;
            # guard with a negative look-behind so an already-qualified
            # reference (e.g. `pkg.` immediately before) is never re-prefixed.
            pattern = re.compile(r'(?<![A-Za-z0-9_$.])' + re.escape(old) +
                                 r'(?![A-Za-z0-9_$])')
            new_src, count = pattern.subn(new, src)
            if count == 0:
                continue
        if not dry_run:
            with open(path, "w", encoding="utf-8") as fh:
                fh.write(new_src)
        print(f"  {'[dry]' if dry_run else '[ok] '} {rel}: {count} x {old} -> {new}")
        applied += count
    return applied


def main() -> None:
    args = sys.argv[1:]
    dry_run = "--apply" not in args
    total = apply_replacements(dry_run)
    print(f"TOTAL: {total} replacements ({'dry-run' if dry_run else 'APPLIED'})")


if __name__ == "__main__":
    main()
