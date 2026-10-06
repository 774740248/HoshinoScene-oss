
bpf_arm64_bpfel.o:	file format elf64-bpf

Disassembly of section uretprobe/libgui:

0000000000000000 <uretprobe_libgui>:
       0:	r6 = r1
       1:	r1 = 0x0
       2:	*(u32 *)(r10 - 0xc) = r1
       3:	call 0x7d
       4:	r1 = 0xffffffff ll
       6:	*(u32 *)(r10 - 0x4) = r1
       7:	*(u32 *)(r10 - 0x8) = r0
       8:	r2 = r10
       9:	r2 += -0xc
      10:	r1 = 0x0 ll
      12:	call 0x1
      13:	if r0 == 0x0 goto +0xf <LBB0_6>
      14:	r1 = *(u32 *)(r0 + 0x0)
      15:	if r1 == 0x0 goto +0xd <LBB0_6>
      16:	r2 = r10
      17:	r2 += -0xc
      18:	r1 = 0x0 ll
      20:	call 0x1
      21:	if r0 == 0x0 goto +0x7 <LBB0_6>
      22:	r1 = *(u64 *)(r0 + 0x0)
      23:	r1 += 0x1
      24:	r2 = 0x4
      25:	if r2 > r1 goto +0x1 <LBB0_5>
      26:	r1 = 0x4

00000000000000d8 <LBB0_5>:
      27:	*(u64 *)(r0 + 0x0) = r1
      28:	*(u32 *)(r10 - 0x4) = r1

00000000000000e8 <LBB0_6>:
      29:	r4 = r10
      30:	r4 += -0x8
      31:	r1 = r6
      32:	r2 = 0x0 ll
      34:	r3 = 0xffffffff ll
      36:	r5 = 0x8
      37:	call 0x19
      38:	r0 = 0x0
      39:	exit

Disassembly of section uretprobe/libgui_acquire:

0000000000000000 <uretprobe_libgui_acquire>:
       0:	r1 = 0x0
       1:	*(u32 *)(r10 - 0x4) = r1
       2:	r2 = r10
       3:	r2 += -0x4
       4:	r1 = 0x0 ll
       6:	call 0x1
       7:	if r0 == 0x0 goto +0x4 <LBB1_3>
       8:	r1 = *(u64 *)(r0 + 0x0)
       9:	if r1 == 0x0 goto +0x2 <LBB1_3>
      10:	r1 += -0x1
      11:	*(u64 *)(r0 + 0x0) = r1

0000000000000060 <LBB1_3>:
      12:	r0 = 0x0
      13:	exit
