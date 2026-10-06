#!/usr/bin/env bash
# run_unpack.sh - One-command, reproducible unpack of res/raw/daemon.
#
# Pipeline:
#   1. run the packed daemon under qemu-aarch64-static with a gdbstub,
#   2. dump the inner daemon's runtime memory regions (tools/dump_regions.gdb),
#   3. rebuild a spec-conformant AArch64 ELF from those regions
#      (tools/rebuild_elf.py), writing every LOAD byte at its p_offset,
#   4. verify the result (file/readelf/entry disassembly/sha256).
#
# Dependencies (explicitly requires a QEMU user-mode environment):
#   qemu-aarch64-static, gdb-multiarch, llvm-objdump, readelf, python3.
# No aarch64 sysroot is needed: the stub uses raw syscalls and stops at the
# final ``execve(/system/bin/linker64)`` failure (exit 127), which is exactly
# the anchor point where every inner-daemon region is already mapped.
#
# Usage:
#   cd native/prebuilt-binaries/daemon/unpack
#   bash tools/run_unpack.sh
#
# Output: ./daemon.unpacked  (deterministic sha256; see attack-report.md)
set -euo pipefail

HERE="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
UNPACK_DIR="$(cd "$HERE/.." && pwd)"
# unpack -> daemon -> prebuilt-binaries -> native -> repo root
RAW="$UNPACK_DIR/../../../../app/src/main/res/raw/daemon"   # packed input
RAW="$(cd "$(dirname "$RAW")" && pwd)/$(basename "$RAW")"

TARGET=/tmp/scene-daemon
RUNTIME=/tmp/runtime
OUT="$UNPACK_DIR/daemon.unpacked"
GDBSTUB_PORT=1234

if [[ ! -f "$RAW" ]]; then
  echo "error: packed input not found: $RAW" >&2
  exit 1
fi

echo "== [1/5] staging packed daemon =="
cp -f "$RAW" "$TARGET"
chmod +x "$TARGET"
echo "packed sha256: $(sha256sum "$TARGET" | cut -d' ' -f1)"

echo "== [2/5] runtime dump via qemu gdbstub =="
rm -rf "$RUNTIME"
mkdir -p "$RUNTIME"

qemu-aarch64-static -g "$GDBSTUB_PORT" "$TARGET" >/tmp/qemu.log 2>&1 &
QPID=$!
trap 'kill -9 "$QPID" 2>/dev/null || true' EXIT
sleep 2

gdb-multiarch -q -batch -x "$HERE/dump_regions.gdb"
kill -9 "$QPID" 2>/dev/null || true
wait "$QPID" 2>/dev/null || true
trap - EXIT

ls -l "$RUNTIME"

echo "== [3/5] rebuilding ELF (p_offset-correct layout) =="
python3 "$HERE/rebuild_elf.py" \
    "$RUNTIME"/load0_*.bin \
    "$RUNTIME"/load1_*.bin \
    "$RUNTIME"/rw_merged_*.bin \
    "$OUT"

echo "== [4/5] verification =="
sha256sum "$OUT"
stat -c 'size=%s bytes' "$OUT"
readelf -h "$OUT" | grep -E 'Type:|Machine:|Entry point'
readelf -lW "$OUT" | grep -E 'LOAD|INTERP'

echo "== [5/5] entry point disassembly (first 20 instructions) =="
ENTRY_HEX=$(readelf -h "$OUT" | awk '/Entry point/{print $4}')
llvm-objdump -d --start-address="$ENTRY_HEX" \
    --stop-address=$((ENTRY_HEX + 0x50)) "$OUT" 2>/dev/null \
    | sed -n '/<PT_LOAD/,$p' | head -24

echo "done: $OUT"
