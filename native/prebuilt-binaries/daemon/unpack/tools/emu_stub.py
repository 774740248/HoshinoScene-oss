#!/usr/bin/env python3
"""emu_stub.py - DEPRECATED.  Early Unicorn-based attempt at the daemon's stub.

DEPRECATED / 已废弃
--------------------
This script tried to emulate the packed daemon's plaintext AArch64 stub with
Unicorn to capture the stage-1 bytes.  It is superseded and must NOT be used as
the reproduction path:

  * stage-1 静态解压 -> 请用 `tools/nrv2b.py`（纯 Python，输出精确 6120B）
  * 完整 daemon 脱壳 -> 请用 `tools/run_unpack.sh`（QEMU+gdb，确定性 sha256）

The old Unicorn approach captured 0 bytes (``UC_ERR_FETCH_UNMAPPED``) because the
stub's syscall/``br`` semantics were not faithfully modelled.  Kept only for
historical reference.

目的 / Purpose (historical):
    静态判定 packed daemon 的引导 stub 行为: 它用 memfd_create("upx") 建匿名文件,
    写入 NRV2B 压缩流, mmap 一段可执行内存后 br 过去。

依赖 / Deps (historical):
    pip install unicorn        (ARM64 cpu)

用法 / Usage (historical):
    python3 emu_stub.py /path/to/res/raw/daemon
"""
import struct
import sys

from unicorn import (
    Uc, UC_ARCH_ARM64, UC_MODE_ARM,
    UC_HOOK_CODE, UC_HOOK_MEM_WRITE,
)
from unicorn.arm64_const import (
    UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2, UC_ARM64_REG_X3,
    UC_ARM64_REG_X4, UC_ARM64_REG_X8, UC_ARM64_REG_SP, UC_ARM64_REG_PC,
    UC_ARM64_REG_LR,
)

# 非重叠映射区 (避免 UC_ERR_MAP)
EXE_VA = 0x100000000          # packed 文件映像
EXE_SZ = 0x400000
STACK_VA = 0x20000000
STACK_SZ = 0x100000
SCRATCH_VA = 0x30000000
SCRATCH_SZ = 0x100000
DATA_VA = 0x40000000          # memfd 写入 + mmap 目标
DATA_SZ = 0x100000

ENTRY = 0x2850174             # packed 文件入口 (LOAD2 vaddr)
UNRV2B = 0x28502BC            # sub_28502bc: unrv2b(src,len,dst,ilen_p,mode)
SVC = 0xD4000001


def main() -> int:
    path = sys.argv[1] if len(sys.argv) > 1 else "daemon"
    packed = open(path, "rb").read()

    mu = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
    mu.mem_map(EXE_VA, EXE_SZ)
    mu.mem_map(STACK_VA, STACK_SZ)
    mu.mem_map(SCRATCH_VA, SCRATCH_SZ)
    mu.mem_map(DATA_VA, DATA_SZ)

    # 把整个 packed 文件按 vaddr 0 放置 (stub 段 vaddr=0x26a0000 已是文件内绝对偏移)
    mu.mem_write(EXE_VA, packed.ljust(EXE_SZ, b"\x00")[:EXE_SZ])
    mu.reg_write(UC_ARM64_REG_SP, STACK_VA + STACK_SZ - 0x100)
    mu.reg_write(UC_ARM64_REG_PC, EXE_VA + ENTRY)

    out = {"stage1": b"", "stage1_addr": DATA_VA}

    def on_mem_write(uc, access, addr, size, value, user):
        return True

    def on_code(uc, addr, size, user):
        # 命中 svc 指令 -> 手工模拟 syscall (Unicorn 不执行 svc)
        code = uc.mem_read(addr, 4)
        if struct.unpack("<I", code)[0] == SVC:
            x8 = uc.reg_read(UC_ARM64_REG_X8)
            if x8 == 279:      # memfd_create
                return
            if x8 == 64:       # write
                fd = uc.reg_read(UC_ARM64_REG_X0)
                buf = uc.reg_read(UC_ARM64_REG_X1)
                n = uc.reg_read(UC_ARM64_REG_X2)
                out["stage1"] += bytes(uc.mem_read(buf, n))
                uc.reg_write(UC_ARM64_REG_X0, n)
                # 跳过 svc
                uc.reg_write(UC_ARM64_REG_PC, addr + 4)

    mu.hook_add(UC_HOOK_CODE, on_code)
    mu.hook_add(UC_HOOK_MEM_WRITE, on_mem_write)

    try:
        mu.emu_start(EXE_VA + ENTRY, EXE_VA + ENTRY + 0x4000, count=200000)
    except Exception as exc:  # noqa: BLE001
        print("emu stopped:", exc)

    print("stage-1 captured: %d bytes" % len(out["stage1"]))
    if out["stage1"]:
        open("/tmp/payload_stage1.bin", "wb").write(out["stage1"])
        print("saved /tmp/payload_stage1.bin")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
