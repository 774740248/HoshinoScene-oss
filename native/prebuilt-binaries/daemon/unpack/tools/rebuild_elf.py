#!/usr/bin/env python3
"""rebuild_elf.py - Reassemble the unpacked daemon ELF from dumped runtime regions.

Background / 背景
-----------------
The packed ``res/raw/daemon`` is a UPX-NRV2B self-extracting stub.  At runtime
the inner (real) daemon is mmap'ed by the stage-1 loader.  ``tools/dump_regions.gdb``
dumps those memory regions via QEMU + gdb.  This script puts them back into a
single, spec-conformant AArch64 ELF.

Regions produced by the gdb script (page-aligned mmap windows):
    load0_<base>.bin         inner daemon LOAD0, r--p, runtime vaddr 0x0
    load1_<base>.bin         inner daemon LOAD1, r-xs, runtime page base 0x2c4000
    rw_merged_<base>.bin     inner daemon LOAD2+LOAD3+..bss, rw-p,
                             runtime page base 0x569000

Correct file layout (from the inner daemon's own program headers)
-----------------------------------------------------------------
    LOAD0  p_offset=0x000000  p_vaddr=0x000000  filesz=0x2c36c0  R
    LOAD1  p_offset=0x2c36c0  p_vaddr=0x2c46c0  filesz=0x2a40a0  R E
    LOAD2  p_offset=0x567760  p_vaddr=0x569760  filesz=0x0be610  RW
    LOAD3  p_offset=0x625d70  p_vaddr=0x628d70  filesz=0x020c60  RW (memsz huge = .bss)

The packer keeps ``p_vaddr - p_offset == 0x1000`` for LOAD1/2/3.  An ELF file's
bytes must therefore live at ``p_offset`` -- **never** at ``p_vaddr``.  Writing
the runtime bytes at ``p_vaddr`` shifts every segment by +0x1000 and leaves the
entry point (``e_entry == p_vaddr`` of LOAD1) sitting on zero padding.  That was
the original defect this script now fixes.

Mapping rule (per segment)
--------------------------
    read_off  = p_vaddr - dump_base_vaddr          # offset inside the dump file
    file[p_offset : p_offset + p_filesz] = dump[read_off : read_off + p_filesz]

Only ``p_filesz`` bytes are ever written; ``p_memsz`` (the .bss tail) is left to
the loader to zero, so no multi-MB runs of zeros are poured into the artifact.

Usage / 用法
------------
    python3 rebuild_elf.py load0_*.bin load1_*.bin rw_merged_*.bin out.elf

The runtime base VAs are taken from the numeric suffix of each dumped file name
(``..._<hexaddr>.bin``) and the known page relationships, so the command is
stable and reproducible.
"""
from __future__ import annotations

import glob
import os
import re
import struct
import sys
from typing import Dict, List, Optional

PT_LOAD = 1

# Runtime page bases of the dumped regions, expressed as offsets from the
# inner-daemon image base (i.e. their vaddr).  These are fixed properties of
# the daemon's mmap layout and are what the gdb dumper observes:
#   load0       -> vaddr 0x0
#   load1       -> vaddr 0x2c4000   (page containing p_vaddr 0x2c46c0)
#   rw_merged   -> vaddr 0x569000   (page containing p_vaddr 0x569760)
DUMP_VADDR = {
    "load0": 0x0,
    "load1": 0x2C4000,
    "rw_merged": 0x569000,
}


def parse_phdrs(img: bytes) -> List[Dict[str, int]]:
    """Parse the ELF program header table from the raw image bytes."""
    e_phoff = struct.unpack_from("<Q", img, 0x20)[0]
    e_phentsize = struct.unpack_from("<H", img, 0x36)[0]
    e_phnum = struct.unpack_from("<H", img, 0x38)[0]
    phdrs: List[Dict[str, int]] = []
    for i in range(e_phnum):
        off = e_phoff + i * e_phentsize
        (p_type, p_flags, p_offset, p_vaddr, p_paddr,
         p_filesz, p_memsz, p_align) = struct.unpack_from("<IIQQQQQQ", img, off)
        phdrs.append(dict(type=p_type, flags=p_flags, offset=p_offset,
                          vaddr=p_vaddr, paddr=p_paddr, filesz=p_filesz,
                          memsz=p_memsz, align=p_align))
    return phdrs


def load_region(pattern: str) -> bytes:
    """Return the bytes of the single file matching ``pattern``."""
    matches = sorted(glob.glob(pattern))
    if not matches:
        raise FileNotFoundError("no dump file matches %r" % pattern)
    if len(matches) > 1:
        raise RuntimeError("ambiguous dump: %r -> %r" % (pattern, matches))
    with open(matches[0], "rb") as fh:
        return fh.read()


def pick_dump_for_vaddr(dumps: Dict[str, bytes], vaddr: int) -> Optional[bytes]:
    """Choose the dump whose window contains ``vaddr``.

    Prefers the dump with the largest base <= vaddr that still covers it.
    """
    best: Optional[bytes] = None
    best_base = -1
    for name, data in dumps.items():
        base = DUMP_VADDR.get(name)
        if base is None:
            continue
        if base <= vaddr < base + len(data):
            if base > best_base:
                best_base = base
                best = data
    return best


def main(argv: List[str]) -> int:
    if len(argv) != 5:
        print(__doc__)
        print("usage: rebuild_elf.py <load0.bin> <load1.bin> <rw_merged.bin> <out.elf>",
              file=sys.stderr)
        return 2

    load0_path, load1_path, rw_path, out_path = argv[1], argv[2], argv[3], argv[4]

    with open(load0_path, "rb") as fh:
        load0 = fh.read()

    # Program headers come from the inner daemon itself (they live at the very
    # start of LOAD0, file offset 0 == runtime vaddr 0).
    phdrs = parse_phdrs(load0)
    loads = [p for p in phdrs if p["type"] == PT_LOAD]
    if len(loads) < 2:
        raise RuntimeError("expected >= 2 PT_LOAD segments, got %d" % len(loads))

    dumps: Dict[str, bytes] = {
        "load0": load0,
        "load1": load_region(load1_path),
        "rw_merged": load_region(rw_path),
    }

    # Total file size = end of the last LOAD segment's *file-backed* content.
    top = max(p["offset"] + p["filesz"] for p in loads)
    img = bytearray(top)

    for p in sorted(loads, key=lambda q: q["offset"]):
        base = pick_dump_for_vaddr(dumps, p["vaddr"])
        if base is None:
            raise RuntimeError("no dump covers vaddr 0x%x" % p["vaddr"])
        # Determine the dump's own base vaddr.
        dump_name = next(n for n, d in dumps.items() if d is base)
        dump_base = DUMP_VADDR[dump_name]
        read_off = p["vaddr"] - dump_base
        if read_off < 0 or read_off + p["filesz"] > len(base):
            raise RuntimeError(
                "segment vaddr 0x%x (filesz 0x%x) not fully inside dump %s "
                "(base 0x%x, size 0x%x)" % (
                    p["vaddr"], p["filesz"], dump_name, dump_base, len(base)))
        img[p["offset"]:p["offset"] + p["filesz"]] = \
            base[read_off:read_off + p["filesz"]]

    # The packer stripped section headers; keep them zeroed for self-consistency.
    struct.pack_into("<Q", img, 0x28, 0)   # e_shoff
    struct.pack_into("<H", img, 0x3C, 0)   # e_shnum
    struct.pack_into("<H", img, 0x3E, 0)   # e_shstrndx

    with open(out_path, "wb") as fh:
        fh.write(img)

    e_entry = struct.unpack_from("<Q", img, 0x18)[0]
    # Report the entry's file offset for immediate self-check.
    entry_fileoff = None
    for p in loads:
        if p["vaddr"] <= e_entry < p["vaddr"] + p["filesz"]:
            entry_fileoff = p["offset"] + (e_entry - p["vaddr"])
            break
    print("wrote %s (%d bytes, 0x%x)" % (out_path, len(img), len(img)))
    print("e_entry=0x%x -> file offset 0x%x" % (e_entry, entry_fileoff or 0))
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv))
