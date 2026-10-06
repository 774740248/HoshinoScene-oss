#!/usr/bin/env python3
"""File-local obfuscated-method resolution.

For each `a/X.java` we read the ground-truth smali `a/X.smali` and collect the
pairs `(obfuscated_short_name, declaring_type)` from every
`invoke-virtual/interface {-}, L<Type>;-><name>(...)` instruction. If, within a
single source file, an obfuscated short name is used against exactly ONE
declaring type, and that type has a known real-name mapping (from
lib_shortmap.json or from the `a/` self-index), we can safely rewrite every
`.<short>(` occurrence in that file to the real name.

This is safe because the DEX compiler emitted the short name against that one
type within this method; the recovered source interleaves the same calls.

Usage: python3 resolve_file_local_methods.py [--apply]
"""
import json
import os
import re
import sys
from collections import defaultdict

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
JAVA = os.path.join(ROOT, "app", "src", "main", "java")
SMALI = "/tmp/build-src/smali"
LIBMAP = os.path.join(ROOT, "tools", "fix", "lib_shortmap.json")

INVOKE_RE = re.compile(r'invoke-(?:virtual|interface|static|direct|super)\s+\{[^}]*\},\s*L([\w/$]+);->([\w$<>]+)\(')


def load_libmap():
    with open(LIBMAP) as fh:
        raw = json.load(fh)
    # fqn(with '/') -> {short: real}
    out = {}
    for fqn, mem in raw.items():
        out[fqn.replace(".", "/")] = mem.get("methods", {})
    return out


def smali_short_to_type(smali_path):
    """Return {short_name: set(declaring_type)} for invoke instructions."""
    pairs = defaultdict(set)
    with open(smali_path, encoding="utf-8", errors="replace") as fh:
        for line in fh:
            m = INVOKE_RE.search(line)
            if m:
                pairs[m.group(2)].add(m.group(1))
    return pairs


def main():
    apply = "--apply" in sys.argv
    libmap = load_libmap()
    total = 0
    files = 0
    for rel in os.listdir(os.path.join(JAVA, "a")):
        if not rel.endswith(".java"):
            continue
        cls = rel[:-5]
        smali_path = os.path.join(SMALI, "a", cls + ".smali")
        if not os.path.exists(smali_path):
            continue
        jpath = os.path.join(JAVA, "a", rel)
        with open(jpath, encoding="utf-8") as fh:
            src = fh.read()
        calls = smali_short_to_type(smali_path)
        # build file-local renames for short names with a single declaring type
        renames = {}
        for short, types in calls.items():
            if len(short) > 3 or len(types) != 1:
                continue
            t = next(iter(types))
            real = libmap.get(t, {}).get(short)
            if real and real != short:
                renames[short] = real
        if not renames:
            continue
        # apply: .short(  ->  .real(   (short names are short/unique tokens)
        new = src
        cnt = 0
        for short, real in renames.items():
            pat = re.compile(r'\.' + re.escape(short) + r'\(')
            new, n = pat.subn('.' + real + '(', new)
            cnt += n
        if new != src:
            total += cnt
            files += 1
            if apply:
                with open(jpath, "w", encoding="utf-8") as fh:
                    fh.write(new)
    print(f"file-local method resolve: {total} renames in {files} files "
          f"({'APPLIED' if apply else 'dry-run'})")


if __name__ == "__main__":
    main()
