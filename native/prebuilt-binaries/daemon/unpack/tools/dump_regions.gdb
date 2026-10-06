# dump_regions.gdb - Runtime memory dumper for the packed `daemon` (UPX-NRV2B stub).
#
# Purpose / 目的
#   The packed `res/raw/daemon` is a self-extracting stub: at runtime it builds a
#   stage-1 loader (NRV2B path) which mmap()s the *real* daemon's LOAD segments.
#   This script attaches to qemu-aarch64-static's gdbstub, runs the program until
#   every inner-daemon region is mapped, and dumps those regions to disk.
#
# Dependencies / 依赖
#   qemu-aarch64-static, gdb-multiarch.  This is the ONLY part of the pipeline
#   that needs QEMU; `tools/rebuild_elf.py` is pure Python.
#
# Usage / 用法 (see tools/run_unpack.sh for the one-command pipeline):
#   qemu-aarch64-static -L /usr/aarch64-linux-gnu -g 1234 ./scene-daemon &
#   gdb-multiarch -q -batch -x tools/dump_regions.gdb
#
# Produced files (in /tmp/runtime/):
#   load0_<addr>.bin       inner daemon LOAD0  (r--p, image vaddr 0x0)
#   load1_<addr>.bin       inner daemon LOAD1  (r-xs /memfd:upx, page 0x2c4000)
#   rw_merged_<addr>.bin   inner daemon LOAD2+LOAD3 (rw-p, page 0x569000)

set architecture aarch64
set pagination off
set confirm off
target remote :1234

python
import gdb, re, os

os.makedirs("/tmp/runtime", exist_ok=True)

# -- locate the packed image base from the current PC ------------------------
pc = int(gdb.parse_and_eval("$pc"))
base = pc - 0x2850174                      # packed file's own entry VA
print("PACKED_BASE 0x%x" % base)

# -- run to the stub's `br x30` that transfers control to stage-1 ------------
gdb.execute("break *0x%x" % (base + 0x28502ac))
gdb.execute("continue")
s1 = int(gdb.parse_and_eval("$x30")) - 0x14     # stage-1 runtime base
print("STAGE1_BASE 0x%x" % s1)

# -- run to the stage-1 loader's final exit svc (+0x16dc) --------------------
# At that point the inner daemon's LOAD0..LOAD3 and the .bss window are mapped.
gdb.execute("break *0x%x" % (s1 + 0x16dc))
gdb.execute("continue")
print("AT_STAGE1_EXIT 0x%x" % (s1 + 0x16dc))

def mappings():
    out = gdb.execute("info proc mappings", to_string=True)
    rows = []
    for line in out.splitlines():
        m = re.match(r'\s*(0x[0-9a-f]+)\s+(0x[0-9a-f]+)\s+(0x[0-9a-f]+)\s+(0x[0-9a-f]+)\s+(\S+)\s*(.*)', line)
        if m:
            rows.append((int(m.group(1), 16), int(m.group(2), 16),
                         int(m.group(3), 16), m.group(5), m.group(6)))
    return rows

rows = mappings()
print("=== MAPPINGS ===")
for s, e, o, p, obj in rows:
    print("MAP 0x%x-0x%x (0x%x) %s %s" % (s, e, e - s, p, obj))

# -- dump the three regions of interest --------------------------------------
#   load0      : the 0x2c4000-byte r--p anonymous window
#   load1      : the 0x2a5000-byte r-xs memfd:upx window
#   rw_merged  : the large anonymous rw window holding LOAD2/LOAD3/.bss;
#                we only need bytes up to vaddr 0x6499d0 (=> 0xe1000 from base)
for s, e, o, p, obj in rows:
    size = e - s
    if size == 0x2c4000:
        fn = "/tmp/runtime/load0_%x.bin" % s
        gdb.execute("dump memory %s 0x%x 0x%x" % (fn, s, e))
        print("DUMP", fn, hex(size), p, obj)
    elif size == 0x2a5000 and 'memfd' in obj:
        fn = "/tmp/runtime/load1_%x.bin" % s
        gdb.execute("dump memory %s 0x%x 0x%x" % (fn, s, e))
        print("DUMP", fn, hex(size), p, obj)
    elif obj == '' and p.strip('-').lower().startswith('rw') and size >= 0x100000:
        need = min(size, 0xe1000)
        fn = "/tmp/runtime/rw_merged_%x.bin" % s
        gdb.execute("dump memory %s 0x%x 0x%x" % (fn, s, s + need))
        print("DUMP", fn, hex(need), p, "region_size=0x%x" % size)

print("dump complete")
end
