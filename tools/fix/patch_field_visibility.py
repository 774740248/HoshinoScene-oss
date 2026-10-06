#!/usr/bin/env python3
"""Make package-private / protected / private *fields* of selected classes
public inside a jar.

The decompiled app code (package ``a`` etc.) accesses library fields that R8
made public in the original obfuscated build, but which are package-private in
the pristine upstream jar (e.g. ``TabLayout.tabSelectedIndicator``,
``SearchView.mSearchSrcTextView``).  Widening field access to ``public`` restores
what the original build had and lets the app source compile.

Minimal, dependency-free class-file editor: walk the constant pool, then the
fields table, and OR ``ACC_PUBLIC`` into each field's access_flags.  The class
file layout keeps the 2-byte access_flags slot in place, so no offset fixups are
needed.

Usage:
    patch_field_visibility.py <in.jar> -o <out.jar> [--classes FILE]
"""

from __future__ import annotations

import argparse
import struct
import sys
import zipfile
from typing import List, Optional, Set, Tuple

ACC_PUBLIC = 0x0001
ACC_PRIVATE = 0x0002
ACC_PROTECTED = 0x0004
CP_UTF8 = 1
_SIZES = {3: 4, 4: 4, 5: 8, 6: 8, 7: 2, 8: 2, 9: 4, 10: 4, 11: 4, 12: 4,
          15: 3, 16: 2, 17: 4, 18: 4, 19: 2, 20: 2}


def parse_cp(data: bytes, count: int) -> Tuple[int, List[str]]:
    """Return (offset after constant pool, utf8 strings indexed by cp index)."""
    utf8: List[str] = [""] * count
    off = 10
    i = 1
    while i < count:
        tag = data[off]
        off += 1
        if tag == CP_UTF8:
            ln = struct.unpack_from(">H", data, off)[0]
            off += 2
            utf8[i] = data[off:off + ln].decode("utf-8", "replace")
            off += ln
        else:
            off += _SIZES[tag]
        i += 2 if tag in (5, 6) else 1
    return off, utf8


def patch_class(data: bytes, only: Set[str]) -> bytes:
    if len(data) < 10 or data[:4] != b"\xca\xfe\xba\xbe":
        return data
    cp_count = struct.unpack_from(">H", data, 8)[0]
    off, utf8 = parse_cp(data, cp_count)

    # access_flags, this_class, super_class
    off += 6
    ifc_count = struct.unpack_from(">H", data, off)[0]
    off += 2 + 2 * ifc_count

    # this class internal name
    # (this_class index is at off-6+2; re-read)
    this_idx = struct.unpack_from(">H", data, off - 2 - 2 * ifc_count - 2)[0]
    this_name = utf8[this_idx] if this_idx < len(utf8) else ""

    fields_count = struct.unpack_from(">H", data, off)[0]
    off += 2

    buf = bytearray(data)
    pos = off
    apply_cls = (not only) or (this_name in only)
    for _ in range(fields_count):
        f_access = struct.unpack_from(">H", data, pos)[0]
        f_name_idx = struct.unpack_from(">H", data, pos + 2)[0]
        name = utf8[f_name_idx] if f_name_idx < len(utf8) else ""
        if apply_cls and (f_access & ACC_PUBLIC) == 0:
            new = (f_access | ACC_PUBLIC) & ~ACC_PRIVATE & ~ACC_PROTECTED
            struct.pack_into(">H", buf, pos, new)
        pos += 6
        attr_count = struct.unpack_from(">H", buf, pos)[0]
        pos += 2
        for _a in range(attr_count):
            a_len = struct.unpack_from(">I", buf, pos + 2)[0]
            pos += 6 + a_len

    # methods table follows the fields table
    methods_count = struct.unpack_from(">H", buf, pos)[0]
    pos += 2
    for _ in range(methods_count):
        m_access = struct.unpack_from(">H", buf, pos)[0]
        if apply_cls and (m_access & ACC_PUBLIC) == 0 and not (m_access & 0x1000):  # not synthetic-bridge
            new = (m_access | ACC_PUBLIC) & ~ACC_PRIVATE & ~ACC_PROTECTED
            struct.pack_into(">H", buf, pos, new)
        pos += 6
        attr_count = struct.unpack_from(">H", buf, pos)[0]
        pos += 2
        for _a in range(attr_count):
            a_len = struct.unpack_from(">I", buf, pos + 2)[0]
            pos += 6 + a_len
    return bytes(buf)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("jar")
    ap.add_argument("-o", "--out", required=True)
    ap.add_argument("--classes", default="",
                    help="file with dotted or slashed internal names, one per line")
    args = ap.parse_args()

    only: Set[str] = set()
    if args.classes:
        for line in open(args.classes):
            s = line.strip()
            if s:
                only.add(s.replace(".", "/"))

    zin = zipfile.ZipFile(args.jar)
    with zipfile.ZipFile(args.out, "w", zipfile.ZIP_DEFLATED) as zout:
        for item in zin.infolist():
            data = zin.read(item.filename)
            if item.filename.endswith(".class"):
                data = patch_class(data, only)
            zout.writestr(item, data)
    zin.close()
    print(f"patched fields -> {args.out} (classes filter: {len(only) or 'all'})")
    return 0


if __name__ == "__main__":
    sys.exit(main())
