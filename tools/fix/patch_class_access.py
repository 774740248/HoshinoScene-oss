#!/usr/bin/env python3
"""Widen library CLASS access flags to ``public`` inside a jar.

The R8-processed build of the app had every referenced library class public
(the original obfuscated dex exposes them), but the pristine upstream jars ship
many helper/inner classes as package-private (e.g. ``AlertController`` and
``AlertController$RecycleListView``).  The recovered ``a/`` sources legitimately
reference those classes by their fully-qualified names, so javac rejects them
with ``cannot find symbol: class X ... location: package y``.

This tool rewrites the class-file ``access_flags`` slot to OR in ``ACC_PUBLIC``
while clearing ``ACC_PRIVATE`` / ``ACC_PROTECTED`` (a class cannot be both).
Field and method access flags are left untouched (handled elsewhere).

Class-file layout note: ``access_flags`` is a fixed 2-byte slot located right
after the constant pool, so the rewrite needs no offset fix-ups.
"""

from __future__ import annotations

import argparse
import struct
import sys
import zipfile
from typing import List, Tuple

ACC_PUBLIC = 0x0001
ACC_PRIVATE = 0x0002
ACC_PROTECTED = 0x0004
CP_UTF8 = 1
_SIZES = {3: 4, 4: 4, 5: 8, 6: 8, 7: 2, 8: 2, 9: 4, 10: 4, 11: 4, 12: 4,
          15: 3, 16: 2, 17: 4, 18: 4, 19: 2, 20: 2}


def class_access_offset(data: bytes) -> int:
    """Return the byte offset of the class ``access_flags`` slot."""
    cp_count = struct.unpack_from(">H", data, 8)[0]
    off = 10
    i = 1
    while i < cp_count:
        tag = data[off]
        off += 1
        if tag == CP_UTF8:
            ln = struct.unpack_from(">H", data, off)[0]
            off += 2 + ln
        else:
            off += _SIZES[tag]
        i += 2 if tag in (5, 6) else 1
    return off


def patch(data: bytes) -> Tuple[bytes, bool]:
    if len(data) < 10 or data[:4] != b"\xca\xfe\xba\xbe":
        return data, False
    off = class_access_offset(data)
    af = struct.unpack_from(">H", data, off)[0]
    if af & ACC_PUBLIC:
        return data, False
    new = (af | ACC_PUBLIC) & ~ACC_PRIVATE & ~ACC_PROTECTED
    buf = bytearray(data)
    struct.pack_into(">H", buf, off, new)
    return bytes(buf), True


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("jar")
    ap.add_argument("-o", "--out", required=True)
    args = ap.parse_args()

    changed = 0
    total = 0
    zin = zipfile.ZipFile(args.jar)
    with zipfile.ZipFile(args.out, "w", zipfile.ZIP_DEFLATED) as zout:
        for item in zin.infolist():
            data = zin.read(item.filename)
            if item.filename.endswith(".class"):
                total += 1
                data, ch = patch(data)
                changed += int(ch)
            zout.writestr(item, data)
    zin.close()
    print(f"{changed}/{total} classes widened -> {args.out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
