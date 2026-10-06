// 反汇编片段: Java_com_omarea_vtools_SceneJNI_getKernelPropLong
// 范围 0x1094..0x1120

    1094:      	sub	sp, sp, #0x30
    1098:      	stp	x29, x30, [sp, #0x10]
    109c:      	add	x29, sp, #0x10
    10a0:      	stp	x20, x19, [sp, #0x20]
    10a4:      	mrs	x20, TPIDR_EL0
    10a8:      	mov	x1, x2
    10ac:      	ldr	x8, [x20, #0x28]
    10b0:      	str	x8, [sp, #0x8]
    10b4:      	bl	0x1ce0 <_Z13jstringToCharP7_JNIEnvP8_jstring@plt>
    10b8:      	adrp	x1, 0x0
    10bc:      	add	x1, x1, #0xbb3
    10c0:      	bl	0x1d30 <fopen@plt>
    10c4:      	cbz	x0, 0x10fc <Java_com_omarea_vtools_SceneJNI_getKernelPropLong+0x68>
    10c8:      	adrp	x1, 0x0
    10cc:      	mov	x2, sp
    10d0:      	add	x1, x1, #0xaae
    10d4:      	mov	x19, x0
    10d8:      	str	xzr, [sp]
    10dc:      	bl	0x1d40 <fscanf@plt>
    10e0:      	cmp	w0, #0x1
    10e4:      	b.eq	0x10ec <Java_com_omarea_vtools_SceneJNI_getKernelPropLong+0x58>
    10e8:      	str	xzr, [sp]
    10ec:      	mov	x0, x19
    10f0:      	bl	0x1d50 <fclose@plt>
    10f4:      	ldr	x0, [sp]
    10f8:      	b	0x1100 <Java_com_omarea_vtools_SceneJNI_getKernelPropLong+0x6c>
    10fc:      	mov	x0, #-0x1               // =-1
    1100:      	ldr	x8, [x20, #0x28]
    1104:      	ldr	x9, [sp, #0x8]
    1108:      	cmp	x8, x9
    110c:      	b.ne	0x1120 <Java_com_omarea_vtools_SceneJNI_getKernelPropLong+0x8c>
    1110:      	ldp	x20, x19, [sp, #0x20]
    1114:      	ldp	x29, x30, [sp, #0x10]
    1118:      	add	sp, sp, #0x30
    111c:      	ret
    1120:      	bl	0x1d20 <__stack_chk_fail@plt>

0000000000001124 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap>:
