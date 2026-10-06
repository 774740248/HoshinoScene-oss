#!/usr/bin/env python3
"""Add missing imports for well-known Android/AndroidX simple class names.

jadx sometimes emits an unqualified simple name (e.g. `SparseIntArray`) without
the corresponding import, producing `cannot find symbol: class X`. This script
scans a curated FQN table and inserts the missing `import` when a file uses the
simple name as a type but does not already import/qualify it.
"""
import os
import re
import sys

# simple name -> fully-qualified name
KNOWN = {
    "SparseIntArray": "android.util.SparseIntArray",
    "SparseArray": "android.util.SparseArray",
    "SparseBooleanArray": "android.util.SparseBooleanArray",
    "Size": "android.util.Size",
    "SizeF": "android.util.SizeF",
    "Bundle": "android.os.Bundle",
    "Parcelable": "android.os.Parcelable",
    "Parcel": "android.os.Parcel",
    "View": "android.view.View",
    "ViewGroup": "android.view.ViewGroup",
    "GradientDrawable": "android.graphics.drawable.GradientDrawable",
    "ObjectAnimator": "android.animation.ObjectAnimator",
    "Serializable": "java.io.Serializable",
    "File": "java.io.File",
    "List": "java.util.List",
    "Map": "java.util.Map",
    "Set": "java.util.Set",
    "Collection": "java.util.Collection",
    "ArrayList": "java.util.ArrayList",
    "HashMap": "java.util.HashMap",
    "ThreadFactory": "java.util.concurrent.ThreadFactory",
    "Dialog": "android.app.Dialog",
    "Activity": "android.app.Activity",
    "Context": "android.content.Context",
    "OnTouchListener": "android.view.View.OnTouchListener",
    "OnMenuItemClickListener": "android.view.MenuItem.OnMenuItemClickListener",
    "OnLongClickListener": "android.view.View.OnLongClickListener",
    "VersionedParcel": "androidx.versionedparcelable.VersionedParcel",
    "SavedStateRegistryOwner": "androidx.savedstate.SavedStateRegistryOwner",
    "SavedStateHandleController": "androidx.lifecycle.SavedStateHandleController",
    "SavedStateHandle": "androidx.lifecycle.SavedStateHandle",
    "OnContextAvailableListener": "androidx.activity.OnContextAvailableListener",
    "ScrollingViewBehavior": "com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior",
}

ROOT = "app/src/main/java"


def uses_type(text, name):
    return re.search(r"(?<![\w.])\b" + re.escape(name) + r"\b", text) is not None


def already_imported(text, fqn):
    return ("import " + fqn + ";") in text


def insert_import(text, fqn):
    lines = text.split("\n")
    # find package line, then insert import after the last existing import block
    pkg_idx = 0
    for i, ln in enumerate(lines):
        if ln.startswith("package "):
            pkg_idx = i
            break
    # find end of import block (contiguous imports after package)
    insert_at = pkg_idx + 1
    j = pkg_idx + 1
    while j < len(lines) and (lines[j].startswith("import ") or lines[j].strip() == ""):
        if lines[j].startswith("import "):
            insert_at = j + 1
        j += 1
    # if no imports, insert right after package (skip blank)
    if insert_at == pkg_idx + 1:
        while insert_at < len(lines) and lines[insert_at].strip() == "":
            insert_at += 1
    lines.insert(insert_at, "import " + fqn + ";")
    return "\n".join(lines)


def process_file(path):
    with open(path) as f:
        text = f.read()
    added = []
    for name, fqn in KNOWN.items():
        if uses_type(text, name) and not already_imported(text, fqn):
            # skip if a same-package class with that name exists
            if os.path.isfile(os.path.join(os.path.dirname(path), name + ".java")):
                continue
            text = insert_import(text, fqn)
            added.append(fqn)
    if added:
        with open(path, "w") as f:
            f.write(text)
    return added


def main():
    targets = sys.argv[1:]
    files = []
    if targets:
        files = targets
    else:
        for dirpath, _, names in os.walk(ROOT):
            for n in names:
                if n.endswith(".java"):
                    files.append(os.path.join(dirpath, n))
    total = 0
    for p in files:
        a = process_file(p)
        if a:
            total += len(a)
            print(f"{p}: +{a}")
    print(f"TOTAL IMPORTS ADDED: {total}")


if __name__ == "__main__":
    main()
