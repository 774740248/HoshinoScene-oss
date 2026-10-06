
kprobe_sys_execve.o:	file format elf64-bpf

Disassembly of section kprobe/sys_execve:

0000000000000000 <sys_execve>:
       0:	r6 = r1
       1:	r1 = 0x0
       2:	*(u32 *)(r10 - 0x4) = r1
       3:	*(u32 *)(r10 - 0x8) = r1
       4:	*(u32 *)(r10 - 0xc) = r1
       5:	*(u32 *)(r10 - 0x10) = r1
       6:	call 0xe
       7:	*(u32 *)(r10 - 0x18) = r0
       8:	r0 >>= 0x20
       9:	*(u32 *)(r10 - 0x1c) = r0
      10:	call 0xf
      11:	*(u32 *)(r10 - 0x14) = r0
      12:	r1 = r10
      13:	r1 += -0x10
      14:	r2 = 0x10
      15:	call 0x10
      16:	r4 = r10
      17:	r4 += -0x1c
      18:	r1 = r6
      19:	r2 = 0x0 ll
      21:	r3 = 0xffffffff ll
      23:	r5 = 0x1c
      24:	call 0x19
      25:	r0 = 0x0
      26:	exit
