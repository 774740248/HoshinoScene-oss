#!/usr/bin/env python3
"""nrv2b.py -- pure-Python NRV2B decompressor for the daemon's stage-1 loader.

This is a faithful reimplementation of the NRV2B variant embedded in
``res/raw/daemon`` (aarch64 stub @0x28502bc).  The packed stub uses it to turn
the 4221-byte stream at file offset 0x1b03c0 into the 6120-byte stage-1 ELF
loader (see the stub's self-describing table at 0x1b03b0:
``{0x1d0, 0x17e8, 0x107d, 2}``).

Correctness is pinned by two exact numbers:

    input  consumed == 0x107d (4221)   -- matches [x20+8] compressed size
    output produced == 0x17e8 (6120)   -- matches [x20+4] decompressed size

Both are reproduced below.

Why the previous version was wrong
----------------------------------
The stub is a *variant* of the well-known UCL/UPX NRV2B.  Three details differ
from the naive "coreboot nrv2b.c" transcription and were fixed here:

1. ``getbit`` (stub @0x28502fc) is a carry-based MSB-first reader over
   little-endian 32-bit words.  It is equivalent to UCL's ``GETBIT_LE32``
   (``bb`` shifted out bit31..bit0 of each dword), *not* the older ``bb<<1``
   with the carry dropped.  The bit stream is:
   ``bit31(word0) bit30(word0) ... bit0(word0) bit31(word1) ...``.

2. ``getmoff`` (stub @0x2850314) loops *while the second bit is 0*::

       w1 = 1
       loop:
           w1 = w1*2 + getbit()
           if getbit() == 1: return w1

   The previous code had the exit condition inverted.

3. The match-length bump (stub @0x285037c) is ``cmn w5,#0xd00 ; cinc w1,w1,lo``
   where ``w5`` holds the *negated* distance.  ``cinc ... lo`` increments when
   the distance is **larger** than 0xd00.  The previous code tested ``<= 0xd00``.

4. The copy loop (stub @0x2850384) is a do-while that stores **one extra byte**
   (``subs`` before ``strb``, ``b.hs`` on the pre-decrement value), i.e. it
   copies ``m_len + 1`` bytes.  Combined with the length encoding above this is
   the author's own compressor/decompressor convention and is required to hit
   the 0x17e8 output size exactly.

Usage
-----
    python3 tools/nrv2b.py app/src/main/res/raw/daemon 0x1b03c0 > stage1.bin

The default source offset (0x1b03c0) and the default input file name match the
stub's own data table, so ``python3 tools/nrv2b.py app/src/main/res/raw/daemon``
is sufficient.
"""
from __future__ import annotations

import sys
from typing import Tuple

MASK32 = 0xFFFFFFFF


def unrv2b(src: bytes, max_out: int = 1 << 26) -> Tuple[bytes, int]:
    """Decompress an NRV2B stream as produced by the daemon's stub.

    Args:
        src: buffer starting at the first bitstream byte.  The stub's ``getbit``
             reads directly from this pointer (no leading length prefix), so for
             the packed daemon this is file offset 0x1b03c0.
        max_out: safety cap for the output size.

    Returns:
        ``(out_bytes, in_bytes_consumed)``.  ``in_bytes_consumed`` is the single
        interleaved cursor shared by the bitstream words and the literal bytes,
        exactly like the stub's ``x0`` register.
    """
    ilen = 0
    out = bytearray()
    last_dist = 1                     # stub's initial w5 = -1  =>  dist = 1
    bitbuf = 0x80000000               # stub's ``mov w4, #-0x80000000``

    def getbit() -> int:
        """Return the next bit in the carry flag, mirroring the stub @0x28502fc."""
        nonlocal bitbuf, ilen
        old = bitbuf
        carry = (old >> 31) & 1
        bitbuf = (bitbuf << 1) & MASK32
        if bitbuf != 0:
            return carry
        # Refill: ``ldr w4,[x0],#4 ; adcs w4,w4,w4``.
        word = int.from_bytes(src[ilen:ilen + 4], "little")
        ilen += 4
        bitbuf = ((word << 1) | carry) & MASK32
        return (word >> 31) & 1

    def getmoff() -> int:
        """Read a match-offset prefix, mirroring the stub @0x2850314."""
        w1 = 1
        while True:
            w1 = ((w1 << 1) | getbit()) & MASK32
            if getbit():
                return w1

    while True:
        # ---- literal run: while bit==1 copy one literal byte ----------------
        while getbit():
            if len(out) >= max_out:
                raise RuntimeError("output cap exceeded")
            out.append(src[ilen])
            ilen += 1

        # ---- match offset ---------------------------------------------------
        m_off = getmoff()
        if m_off < 3:
            # m_off == 2 -> reuse the previous distance (w5 is unchanged).
            dist = last_dist
        else:
            byte = src[ilen]
            ilen += 1
            raw = (((m_off - 3) << 8) | byte) & MASK32
            if raw == MASK32:
                break                       # 0xffffffff marker = end of stream
            # w5 = ~raw = -(raw + 1) = negated distance.
            dist = (raw + 1) & MASK32
            last_dist = dist

        # ---- match length ---------------------------------------------------
        w1 = 0
        w1 = ((w1 << 1) | getbit()) & MASK32
        w1 = ((w1 << 1) | getbit()) & MASK32
        if w1 == 0:
            w1 = (getmoff() + 2) & MASK32
        # cmn w5,#0xd00 ; cinc w1,w1,lo  ->  increment when distance is LARGE.
        if dist > 0xD00:
            w1 = (w1 + 1) & MASK32

        # ---- copy match (stub copies m_len + 1 bytes) ----------------------
        count = (w1 + 1) & MASK32
        pos = len(out) - dist
        if pos < 0:
            raise RuntimeError("match distance %d exceeds output size %d"
                               % (dist, len(out)))
        for _ in range(count):
            if len(out) >= max_out:
                raise RuntimeError("output cap exceeded")
            out.append(out[pos])
            pos += 1

    return bytes(out), ilen


if __name__ == "__main__":
    path = sys.argv[1] if len(sys.argv) > 1 else "daemon"
    # Optional second arg: absolute byte offset at which the bitstream begins.
    base = int(sys.argv[2], 0) if len(sys.argv) > 2 else 0x1B03C0
    data = open(path, "rb").read()
    out, n = unrv2b(data[base:])
    sys.stderr.write("[in=%d out=%d (0x%x)]\n" % (n, len(out), len(out)))
    sys.stdout.buffer.write(out)
