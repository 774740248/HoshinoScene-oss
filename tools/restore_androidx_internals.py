#!/usr/bin/env python3
"""Restore R8-internal library classes required by the obfuscated app sources.

Background
----------
The APK was processed with R8, which obfuscated the application code **together
with its bundled library classes** into a single unit.  jadx therefore emitted two
kinds of ``androidx/**`` (and other library package) sources:

  * Group A - R8-internal / package-private classes that R8 renamed to ``a``,
    ``b``, ``c`` ... inside library packages.  Examples:

        androidx.recyclerview.widget.a   ==  obfuscated RecyclerView.LayoutManager
        androidx.lifecycle.a             ==  obfuscated LifecycleRegistry
        androidx.fragment.app.a          ==  obfuscated BackStackRecord
        com.google.android.material.datepicker.c  ==  obfuscated internal

    These classes are NOT part of the public AAR API, so they do NOT exist inside
    the ``app/libs/*.jar`` files that we compile against.  They must be restored,
    otherwise the obfuscated application package ``a/**`` cannot resolve them.

  * Group B - public library classes (``RecyclerView``, ``ComponentActivity``,
    ``Toolbar`` ...).  These DO exist (unobfuscated) inside the AAR jars.  Keeping
    the decompiled duplicates produced "cyclic inheritance" / "duplicate class"
    errors, so they must remain removed.

Rule
----
For every decompiled source file located under a *library* package
(``androidx/``, ``com/google/android/material/``, ``android/support/``), copy it
back into ``app/src/main/java`` **iff** the fully-qualified class it declares is
absent from every ``app/libs/*.jar``.  Application packages (``a/``,
``com/omarea/``) are never touched here - they are already present and are handled
by the rest of the pipeline.

Usage:
    python3 tools/restore_androidx_internals.py            # dry run (report)
    python3 tools/restore_androidx_internals.py --apply    # copy files back
"""
from __future__ import annotations

import argparse
import shutil
import zipfile
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parent.parent
ORIG_SOURCES = Path(
    "/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000/"
    "decompiled/sources"
)
BACKUP_DIR = PROJECT_ROOT / "tools" / "removed-androidx-src"
TARGET_DIR = PROJECT_ROOT / "app" / "src" / "main" / "java"
LIBS_DIR = PROJECT_ROOT / "app" / "libs"

# Library package prefixes whose R8-internal classes may be restored from the
# decompiled tree.  Application packages are deliberately excluded.
LIBRARY_PREFIXES: tuple[str, ...] = (
    "androidx/",
    "com/google/android/material/",
    "android/support/",
)


def collect_jar_classes() -> set[str]:
    """Return the set of fully-qualified class names present in app/libs/*.jar."""
    classes: set[str] = set()
    if not LIBS_DIR.is_dir():
        return classes
    for jar in sorted(LIBS_DIR.glob("*.jar")):
        try:
            with zipfile.ZipFile(jar) as zf:
                for name in zf.namelist():
                    if name.endswith(".class"):
                        classes.add(name[:-len(".class")].replace("/", "."))
        except zipfile.BadZipFile:
            continue
    return classes


def fqcn_for(rel_path: Path) -> str:
    """Derive the fully qualified class name from a source path relative to
    ORIG_SOURCES (or BACKUP_DIR)."""
    return ".".join(rel_path.with_suffix("").parts)


def iter_candidate_sources() -> list[Path]:
    """Collect decompiled library sources from the backup AND the original tree.

    The backup only contains the ``androidx`` subset that was removed earlier.
    Some R8-internal library classes live in other packages (e.g.
    ``com/google/android/material/datepicker/c.java``) and were never moved, so
    they are still present in the original decompiled tree and are picked up here.
    """
    candidates: dict[str, Path] = {}

    # (1) files previously moved to the backup directory
    if BACKUP_DIR.is_dir():
        for src in BACKUP_DIR.rglob("*.java"):
            rel = src.relative_to(BACKUP_DIR)
            candidates[fqcn_for(rel)] = src

    # (2) files in the original decompiled tree under a library package
    if ORIG_SOURCES.is_dir():
        for src in ORIG_SOURCES.rglob("*.java"):
            rel = src.relative_to(ORIG_SOURCES)
            rel_posix = rel.as_posix()
            if not rel_posix.startswith(LIBRARY_PREFIXES):
                continue
            candidates.setdefault(fqcn_for(rel), src)

    return [candidates[k] for k in sorted(candidates)]


def original_relative(candidate: Path) -> Path:
    """Return the source path of ``candidate`` relative to the original tree."""
    if BACKUP_DIR in candidate.parents:
        return candidate.relative_to(BACKUP_DIR)
    return candidate.relative_to(ORIG_SOURCES)


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--apply", action="store_true",
                        help="actually copy the files (default is a dry run)")
    args = parser.parse_args()

    jar_classes = collect_jar_classes()
    print(f"classes found in app/libs jars : {len(jar_classes)}")

    candidates = iter_candidate_sources()
    restore: list[Path] = []
    skip: list[Path] = []
    for src in candidates:
        if fqcn_for(original_relative(src)) in jar_classes:
            skip.append(src)
        else:
            restore.append(src)

    print(f"library sources scanned        : {len(candidates)}")
    print(f"  -> present in jars (skip)    : {len(skip)}")
    print(f"  -> missing, must restore     : {len(restore)}")
    print()
    print("RESTORE list:")
    for src in restore:
        print(f"  + {fqcn_for(original_relative(src))}")
    print()
    print("SKIP list (already provided by AAR jars):")
    for src in skip:
        print(f"  - {fqcn_for(original_relative(src))}")

    if not args.apply:
        print("\n[dry-run] nothing copied. Re-run with --apply to restore.")
        return

    restored = 0
    for src in restore:
        rel = original_relative(src)
        dst = TARGET_DIR / rel
        dst.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(src, dst)
        restored += 1
    print(f"\n[apply] restored {restored} file(s) into {TARGET_DIR}")


if __name__ == "__main__":
    main()
