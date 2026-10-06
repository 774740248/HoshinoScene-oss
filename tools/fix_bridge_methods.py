#!/usr/bin/env python3
"""Remove duplicate bridge methods emitted by jadx.

Problem
-------
When a class implements an interface with covariant return types (e.g. a method
returning ``a.kj1`` that also satisfies ``android.view.MenuItem``), jadx emits BOTH
the real method *and* the compiler-synthesised *bridge* method.  The bridge method
is annotated with ``/* bridge *//* synthetic */`` and simply forwards to the real
one.  Because Java generates bridge methods automatically, keeping the explicit
copy makes the two methods share the same erased signature, producing javac errors
such as::

    method setContentDescription(CharSequence) is already defined in class xz0

Fix
---
Within each class body, locate method declarations, compute their *erased*
signature (method name + parameter type list, ignoring generic/covariant return
types), and when two or more methods collide:

  * drop the ones flagged ``/* bridge */`` (javac will regenerate them), and
  * if no bridge flag is present, keep the first declaration and drop the rest.

The tool operates purely on brace-balanced method bodies, so it is safe to run
repeatedly (idempotent).

Usage:
    python3 tools/fix_bridge_methods.py [--apply] [--path app/src/main/java/a]
"""
from __future__ import annotations

import argparse
import re
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parent.parent
DEFAULT_PATH = PROJECT_ROOT / "app" / "src" / "main" / "java" / "a"

# Matches a method declaration line such as:
#   public final /* bridge */ /* synthetic */ android.view.MenuItem setFoo(java.lang.CharSequence c) {
METHOD_RE = re.compile(
    r"^(?P<indent>\s*)(?P<mods>(?:public|private|protected|static|final|abstract|"
    r"native|synchronized|/\* bridge \*/|/\* synthetic \*/|\s)*)"
    r"(?P<ret>[A-Za-z_$][\w$.<>,?\[\] ]*?)\s+"
    r"(?P<name>[A-Za-z_$][\w$]*)\s*\((?P<params>[^)]*)\)\s*(?:\{)?\s*$"
)


def split_params(params: str) -> str:
    """Return a normalised, comma-joined list of parameter *types*."""
    params = params.strip()
    if not params:
        return ""
    # parameters may contain generics with commas - split only on top level
    parts: list[str] = []
    depth = 0
    current = ""
    for ch in params:
        if ch == "<":
            depth += 1
        elif ch == ">":
            depth -= 1
        if ch == "," and depth == 0:
            parts.append(current.strip())
            current = ""
        else:
            current += ch
    if current.strip():
        parts.append(current.strip())
    types: list[str] = []
    for p in parts:
        # drop trailing variable name; keep the type portion
        tokens = p.rsplit(None, 1)
        types.append(tokens[0] if len(tokens) > 1 else p)
    return ",".join(types)


def find_methods(lines: list[str]) -> list[dict]:
    """Return the method declarations found in a file (brace depth == class body)."""
    methods: list[dict] = []
    brace_depth = 0
    i = 0
    n = len(lines)
    while i < n:
        line = lines[i]
        # detect method declarations at class-body depth (depth == 1)
        if brace_depth == 1:
            m = METHOD_RE.match(line.rstrip("\n"))
            if m and not line.lstrip().startswith(("//", "*", "/*")):
                # find the closing brace of the method body
                depth = line.count("{") - line.count("}")
                start = i
                j = i
                if depth <= 0:
                    # one-line body or declaration on single line
                    while j < n and "{" not in lines[j]:
                        j += 1
                    depth = (lines[j].count("{") - lines[j].count("}")) if j < n else 0
                while j < n and depth > 0:
                    j += 1
                    if j < n:
                        depth += lines[j].count("{") - lines[j].count("}")
                end = j
                methods.append({
                    "start": start,
                    "end": end,
                    "name": m.group("name"),
                    "params": split_params(m.group("params")),
                    "bridge": "/* bridge */" in m.group("mods"),
                })
                i = end + 1
                continue
        brace_depth += line.count("{") - line.count("}")
        i += 1
    return methods


def signature(m: dict) -> str:
    return f"{m['name']}({m['params']})"


def process_file(path: Path, apply: bool) -> int:
    text = path.read_text(encoding="utf-8", errors="replace")
    lines = text.splitlines(keepends=True)
    methods = find_methods(lines)

    groups: dict[str, list[dict]] = {}
    for m in methods:
        groups.setdefault(signature(m), []).append(m)

    drop: set[int] = set()
    for sig, group in groups.items():
        if len(group) < 2:
            continue
        bridges = [m for m in group if m["bridge"]]
        if bridges:
            victims = bridges
        else:
            victims = group[1:]
        for m in victims:
            for ln in range(m["start"], m["end"] + 1):
                drop.add(ln)
            # also drop the immediately preceding annotation / comment lines so no
            # dangling `@Override` is left behind
            prev = m["start"] - 1
            while prev >= 0:
                stripped = lines[prev].strip()
                if (stripped.startswith("@")
                        or stripped.startswith("//")
                        or stripped.startswith("/*")
                        or stripped.startswith("*")
                        or stripped == ""):
                    drop.add(prev)
                    prev -= 1
                else:
                    break

    if not drop:
        return 0

    new_lines = [ln for idx, ln in enumerate(lines) if idx not in drop]
    if apply:
        path.write_text("".join(new_lines), encoding="utf-8")
    return len(drop)


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--apply", action="store_true",
                        help="write changes to disk (default is a dry run)")
    parser.add_argument("--path", type=Path, default=DEFAULT_PATH,
                        help="directory or file to scan")
    args = parser.parse_args()

    targets: list[Path]
    if args.path.is_file():
        targets = [args.path]
    else:
        targets = sorted(args.path.rglob("*.java"))

    total_files = 0
    total_lines = 0
    for path in targets:
        removed = process_file(path, args.apply)
        if removed:
            total_files += 1
            total_lines += removed
            print(f"  {'[apply]' if args.apply else '[dry]'} "
                  f"{path.relative_to(PROJECT_ROOT)}: {removed} line(s) removed")

    print(f"\nfiles affected: {total_files}, lines removed: {total_lines}")
    if not args.apply:
        print("[dry-run] nothing written. Re-run with --apply.")


if __name__ == "__main__":
    main()
