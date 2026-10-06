
/root/.codebuddy/artifact/2f8a7d30-9c21-4f0b-1d3d-7ce1f50bd000/SRC/星野scene/lib/arm64-v8a/libnative-lib.so:	file format elf64-littleaarch64

Disassembly of section .text:

0000000000000e74 <.text>:
     e74:      	bti	c
     e78:      	adrp	x0, 0x5000 <__vsnprintf_chk@plt+0x3200>
     e7c:      	add	x0, x0, #0xe10
     e80:      	b	0x1cb0 <__cxa_finalize@plt>
     e84:      	bti	c
     e88:      	ret
     e8c:      	bti	c
     e90:      	b	0xe84 <.text+0x10>
     e94:      	bti	c
     e98:      	cbz	x0, 0xea4 <.text+0x30>
     e9c:      	mov	x16, x0
     ea0:      	br	x16
     ea4:      	ret
     ea8:      	bti	c
     eac:      	mov	x1, x0
     eb0:      	adrp	x0, 0x0
     eb4:      	adrp	x2, 0x5000 <__vsnprintf_chk@plt+0x3200>
     eb8:      	add	x0, x0, #0xe94
     ebc:      	add	x2, x2, #0xe10
     ec0:      	b	0x1cc0 <__cxa_atexit@plt>
     ec4:      	bti	c
     ec8:      	adrp	x3, 0x5000 <__vsnprintf_chk@plt+0x3200>
     ecc:      	add	x3, x3, #0xe10
     ed0:      	b	0x1cd0 <__register_atfork@plt>

0000000000000ed4 <_Z13jstringToCharP7_JNIEnvP8_jstring>:
     ed4:      	stp	x29, x30, [sp, #-0x40]!
     ed8:      	str	x23, [sp, #0x10]
     edc:      	mov	x29, sp
     ee0:      	stp	x22, x21, [sp, #0x20]
     ee4:      	stp	x20, x19, [sp, #0x30]
     ee8:      	ldr	x8, [x0]
     eec:      	mov	x20, x1
     ef0:      	adrp	x1, 0x0
     ef4:      	mov	x19, x0
     ef8:      	add	x1, x1, #0xa9d
     efc:      	ldr	x8, [x8, #0x30]
     f00:      	blr	x8
     f04:      	ldr	x8, [x19]
     f08:      	adrp	x1, 0x0
     f0c:      	mov	x21, x0
     f10:      	add	x1, x1, #0xc6a
     f14:      	mov	x0, x19
     f18:      	ldr	x8, [x8, #0x538]
     f1c:      	blr	x8
     f20:      	ldr	x8, [x19]
     f24:      	adrp	x2, 0x0
     f28:      	adrp	x3, 0x0
     f2c:      	mov	x22, x0
     f30:      	add	x2, x2, #0xb77
     f34:      	add	x3, x3, #0xb54
     f38:      	ldr	x8, [x8, #0x108]
     f3c:      	mov	x0, x19
     f40:      	mov	x1, x21
     f44:      	blr	x8
     f48:      	mov	x2, x0
     f4c:      	mov	x0, x19
     f50:      	mov	x1, x20
     f54:      	mov	x3, x22
     f58:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
     f5c:      	ldr	x8, [x19]
     f60:      	mov	x20, x0
     f64:      	mov	x0, x19
     f68:      	mov	x1, x20
     f6c:      	ldr	x8, [x8, #0x558]
     f70:      	blr	x8
     f74:      	ldr	x8, [x19]
     f78:      	mov	w23, w0
     f7c:      	mov	x0, x19
     f80:      	mov	x1, x20
     f84:      	mov	x2, xzr
     f88:      	ldr	x8, [x8, #0x5c0]
     f8c:      	blr	x8
     f90:      	mov	x21, x0
     f94:      	cmp	w23, #0x1
     f98:      	b.lt	0xfc0 <_Z13jstringToCharP7_JNIEnvP8_jstring+0xec>
     f9c:      	add	w0, w23, #0x1
     fa0:      	bl	0x1d00 <malloc@plt>
     fa4:      	mov	w23, w23
     fa8:      	mov	x1, x21
     fac:      	mov	x2, x23
     fb0:      	mov	x22, x0
     fb4:      	bl	0x1d10 <memcpy@plt>
     fb8:      	strb	wzr, [x22, x23]
     fbc:      	b	0xfc4 <_Z13jstringToCharP7_JNIEnvP8_jstring+0xf0>
     fc0:      	mov	x22, xzr
     fc4:      	ldr	x8, [x19]
     fc8:      	mov	x0, x19
     fcc:      	mov	x1, x20
     fd0:      	mov	x2, x21
     fd4:      	mov	w3, wzr
     fd8:      	ldr	x8, [x8, #0x600]
     fdc:      	blr	x8
     fe0:      	mov	x0, x22
     fe4:      	ldr	x23, [sp, #0x10]
     fe8:      	ldp	x20, x19, [sp, #0x30]
     fec:      	ldp	x22, x21, [sp, #0x20]
     ff0:      	ldp	x29, x30, [sp], #0x40
     ff4:      	ret

0000000000000ff8 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz>:
     ff8:      	sub	sp, sp, #0x120
     ffc:      	stp	x29, x30, [sp, #0x100]
    1000:      	add	x29, sp, #0x100
    1004:      	stp	x28, x19, [sp, #0x110]
    1008:      	stp	x3, x4, [x29, #-0x78]
    100c:      	sub	x9, x29, #0x78
    1010:      	stp	x5, x6, [x29, #-0x68]
    1014:      	mov	x11, #-0x28             // =-40
    1018:      	stur	x7, [x29, #-0x58]
    101c:      	mov	x12, sp
    1020:      	stp	q0, q1, [sp]
    1024:      	add	x9, x9, #0x28
    1028:      	stp	q2, q3, [sp, #0x20]
    102c:      	movk	x11, #0xff80, lsl #32
    1030:      	stp	q4, q5, [sp, #0x40]
    1034:      	add	x12, x12, #0x80
    1038:      	stp	q6, q7, [sp, #0x60]
    103c:      	mrs	x19, TPIDR_EL0
    1040:      	ldr	x8, [x19, #0x28]
    1044:      	sub	x10, x29, #0x28
    1048:      	sub	x3, x29, #0x50
    104c:      	stur	x8, [x29, #-0x8]
    1050:      	add	x8, x29, #0x20
    1054:      	stp	x12, x11, [x29, #-0x18]
    1058:      	stp	x8, x9, [x29, #-0x28]
    105c:      	ldr	x8, [x0]
    1060:      	ldp	q0, q1, [x10]
    1064:      	ldr	x8, [x8, #0x118]
    1068:      	stp	q0, q1, [x29, #-0x50]
    106c:      	blr	x8
    1070:      	ldr	x8, [x19, #0x28]
    1074:      	ldur	x9, [x29, #-0x8]
    1078:      	cmp	x8, x9
    107c:      	b.ne	0x1090 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz+0x98>
    1080:      	ldp	x28, x19, [sp, #0x110]
    1084:      	ldp	x29, x30, [sp, #0x100]
    1088:      	add	sp, sp, #0x120
    108c:      	ret
    1090:      	bl	0x1d20 <__stack_chk_fail@plt>

0000000000001094 <Java_com_omarea_vtools_SceneJNI_getKernelPropLong>:
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
    1124:      	stp	x29, x30, [sp, #-0x60]!
    1128:      	stp	x28, x27, [sp, #0x10]
    112c:      	mov	x29, sp
    1130:      	stp	x26, x25, [sp, #0x20]
    1134:      	stp	x24, x23, [sp, #0x30]
    1138:      	stp	x22, x21, [sp, #0x40]
    113c:      	stp	x20, x19, [sp, #0x50]
    1140:      	sub	sp, sp, #0x9b0
    1144:      	mrs	x27, TPIDR_EL0
    1148:      	adrp	x1, 0x0
    114c:      	ldr	x8, [x27, #0x28]
    1150:      	add	x1, x1, #0xb80
    1154:      	mov	x20, x0
    1158:      	stur	x8, [x29, #-0x8]
    115c:      	ldr	x8, [x0]
    1160:      	ldr	x8, [x8, #0x30]
    1164:      	blr	x8
    1168:      	cbz	x0, 0x1214 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0xf0>
    116c:      	ldr	x8, [x20]
    1170:      	mov	x22, x0
    1174:      	adrp	x2, 0x0
    1178:      	adrp	x3, 0x0
    117c:      	add	x2, x2, #0xadd
    1180:      	add	x3, x3, #0xb20
    1184:      	ldr	x8, [x8, #0x108]
    1188:      	mov	x0, x20
    118c:      	mov	x1, x22
    1190:      	blr	x8
    1194:      	ldr	x8, [x20]
    1198:      	adrp	x2, 0x0
    119c:      	adrp	x3, 0x0
    11a0:      	mov	x23, x0
    11a4:      	add	x2, x2, #0xbfe
    11a8:      	add	x3, x3, #0xc0e
    11ac:      	ldr	x8, [x8, #0x108]
    11b0:      	mov	x0, x20
    11b4:      	mov	x1, x22
    11b8:      	blr	x8
    11bc:      	mov	x19, xzr
    11c0:      	cbz	x23, 0x1b08 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x9e4>
    11c4:      	mov	x21, x0
    11c8:      	cbz	x0, 0x1b08 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x9e4>
    11cc:      	mov	x0, x20
    11d0:      	mov	x1, x22
    11d4:      	mov	x2, x23
    11d8:      	mov	w3, #0x10               // =16
    11dc:      	bl	0x1d60 <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz@plt>
    11e0:      	mov	x19, x0
    11e4:      	cbz	x0, 0x1b08 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x9e4>
    11e8:      	adrp	x1, 0x0
    11ec:      	mov	x0, xzr
    11f0:      	add	x1, x1, #0xa70
    11f4:      	str	wzr, [sp, #0x8c]
    11f8:      	bl	0x1d70 <vkGetInstanceProcAddr@plt>
    11fc:      	cbz	x0, 0x121c <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0xf8>
    1200:      	mov	x8, x0
    1204:      	add	x0, sp, #0x8c
    1208:      	blr	x8
    120c:      	ldr	w8, [sp, #0x8c]
    1210:      	b	0x1224 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x100>
    1214:      	mov	x19, xzr
    1218:      	b	0x1b08 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x9e4>
    121c:      	mov	w8, #0x400000           // =4194304
    1220:      	str	w8, [sp, #0x8c]
    1224:      	adrp	x3, 0x0
    1228:      	lsr	w4, w8, #22
    122c:      	ubfx	w5, w8, #12, #10
    1230:      	and	w6, w8, #0xfff
    1234:      	add	x3, x3, #0xc56
    1238:      	sub	x0, x29, #0x88
    123c:      	mov	w1, #0x80               // =128
    1240:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    1244:      	ldr	x8, [x20]
    1248:      	adrp	x1, 0x0
    124c:      	add	x1, x1, #0xb09
    1250:      	mov	x0, x20
    1254:      	ldr	x8, [x8, #0x538]
    1258:      	blr	x8
    125c:      	ldr	x8, [x20]
    1260:      	mov	x22, x0
    1264:      	sub	x1, x29, #0x88
    1268:      	mov	x0, x20
    126c:      	ldr	x8, [x8, #0x538]
    1270:      	blr	x8
    1274:      	mov	x23, x0
    1278:      	mov	x0, x20
    127c:      	mov	x1, x19
    1280:      	mov	x2, x21
    1284:      	mov	x3, x22
    1288:      	mov	x4, x23
    128c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1290:      	ldr	x8, [x20]
    1294:      	mov	x0, x20
    1298:      	mov	x1, x22
    129c:      	ldr	x8, [x8, #0xb8]
    12a0:      	blr	x8
    12a4:      	ldr	x8, [x20]
    12a8:      	mov	x0, x20
    12ac:      	mov	x1, x23
    12b0:      	ldr	x8, [x8, #0xb8]
    12b4:      	blr	x8
    12b8:      	add	x1, sp, #0x88
    12bc:      	mov	x0, xzr
    12c0:      	mov	x2, xzr
    12c4:      	str	wzr, [sp, #0x88]
    12c8:      	bl	0x1d80 <vkEnumerateInstanceExtensionProperties@plt>
    12cc:      	adrp	x3, 0x0
    12d0:      	ldr	w4, [sp, #0x88]
    12d4:      	add	x3, x3, #0xab2
    12d8:      	sub	x0, x29, #0x88
    12dc:      	mov	w1, #0x80               // =128
    12e0:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    12e4:      	ldr	x8, [x20]
    12e8:      	adrp	x1, 0x0
    12ec:      	add	x1, x1, #0xaca
    12f0:      	mov	x0, x20
    12f4:      	ldr	x8, [x8, #0x538]
    12f8:      	blr	x8
    12fc:      	ldr	x8, [x20]
    1300:      	mov	x22, x0
    1304:      	sub	x1, x29, #0x88
    1308:      	mov	x0, x20
    130c:      	ldr	x8, [x8, #0x538]
    1310:      	blr	x8
    1314:      	mov	x23, x0
    1318:      	mov	x0, x20
    131c:      	mov	x1, x19
    1320:      	mov	x2, x21
    1324:      	mov	x3, x22
    1328:      	mov	x4, x23
    132c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1330:      	ldr	x8, [x20]
    1334:      	mov	x0, x20
    1338:      	mov	x1, x22
    133c:      	ldr	x8, [x8, #0xb8]
    1340:      	blr	x8
    1344:      	ldr	x8, [x20]
    1348:      	mov	x0, x20
    134c:      	mov	x1, x23
    1350:      	ldr	x8, [x8, #0xb8]
    1354:      	blr	x8
    1358:      	movi	v0.2d, #0000000000000000
    135c:      	adrp	x8, 0x0
    1360:      	add	x8, x8, #0xae4
    1364:      	mov	w9, #0x1                // =1
    1368:      	add	x0, sp, #0x10
    136c:      	add	x2, sp, #0x8
    1370:      	mov	x1, xzr
    1374:      	str	xzr, [sp, #0x8]
    1378:      	str	x8, [sp, #0x70]
    137c:      	stp	q0, q0, [sp, #0x50]
    1380:      	str	x8, [sp, #0x60]
    1384:      	ldr	w8, [sp, #0x8c]
    1388:      	str	w9, [sp, #0x68]
    138c:      	stp	q0, q0, [sp, #0x10]
    1390:      	stp	w9, w8, [sp, #0x78]
    1394:      	add	x8, sp, #0x50
    1398:      	stp	q0, q0, [sp, #0x30]
    139c:      	str	w9, [sp, #0x10]
    13a0:      	str	x8, [sp, #0x28]
    13a4:      	bl	0x1d90 <vkCreateInstance@plt>
    13a8:      	cbnz	w0, 0x1484 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x360>
    13ac:      	ldr	x0, [sp, #0x8]
    13b0:      	cbz	x0, 0x1484 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x360>
    13b4:      	add	x1, sp, #0x4
    13b8:      	mov	x2, xzr
    13bc:      	str	wzr, [sp, #0x4]
    13c0:      	bl	0x1da0 <vkEnumeratePhysicalDevices@plt>
    13c4:      	ldr	w8, [sp, #0x4]
    13c8:      	cbz	w8, 0x1500 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x3dc>
    13cc:      	lsl	x0, x8, #3
    13d0:      	bl	0x1d00 <malloc@plt>
    13d4:      	cbz	x0, 0x152c <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x408>
    13d8:      	mov	x23, x0
    13dc:      	ldr	x0, [sp, #0x8]
    13e0:      	add	x1, sp, #0x4
    13e4:      	mov	x2, x23
    13e8:      	bl	0x1da0 <vkEnumeratePhysicalDevices@plt>
    13ec:      	mov	x0, x23
    13f0:      	ldr	x22, [x23]
    13f4:      	bl	0x1db0 <free@plt>
    13f8:      	add	x0, sp, #0x5e0
    13fc:      	mov	w1, wzr
    1400:      	mov	w2, #0x348              // =840
    1404:      	add	x24, sp, #0x5e0
    1408:      	bl	0x1dc0 <memset@plt>
    140c:      	mov	w8, #0xb079             // =45177
    1410:      	add	x0, sp, #0x3c8
    1414:      	movk	w8, #0x3b9b, lsl #16
    1418:      	mov	w1, wzr
    141c:      	mov	w2, #0x218              // =536
    1420:      	add	x23, sp, #0x3c8
    1424:      	str	w8, [sp, #0x5e0]
    1428:      	bl	0x1dc0 <memset@plt>
    142c:      	mov	w8, #0xc7a0             // =51104
    1430:      	adrp	x1, 0x0
    1434:      	movk	w8, #0x3b9d, lsl #16
    1438:      	ldr	x0, [sp, #0x8]
    143c:      	add	x1, x1, #0xb25
    1440:      	str	x23, [sp, #0x5e8]
    1444:      	str	w8, [sp, #0x3c8]
    1448:      	bl	0x1d70 <vkGetInstanceProcAddr@plt>
    144c:      	mov	x23, x0
    1450:      	add	x0, sp, #0x90
    1454:      	mov	w1, wzr
    1458:      	mov	w2, #0x338              // =824
    145c:      	bl	0x1dc0 <memset@plt>
    1460:      	cbz	x23, 0x1558 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x434>
    1464:      	add	x1, sp, #0x5e0
    1468:      	mov	x0, x22
    146c:      	blr	x23
    1470:      	add	x1, x24, #0x10
    1474:      	add	x0, sp, #0x90
    1478:      	mov	w2, #0x338              // =824
    147c:      	bl	0x1d10 <memcpy@plt>
    1480:      	b	0x1564 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x440>
    1484:      	ldr	x8, [x20]
    1488:      	adrp	x1, 0x0
    148c:      	add	x1, x1, #0xc47
    1490:      	mov	x0, x20
    1494:      	ldr	x8, [x8, #0x538]
    1498:      	blr	x8
    149c:      	ldr	x8, [x20]
    14a0:      	adrp	x1, 0x0
    14a4:      	mov	x22, x0
    14a8:      	add	x1, x1, #0xbc4
    14ac:      	mov	x0, x20
    14b0:      	ldr	x8, [x8, #0x538]
    14b4:      	blr	x8
    14b8:      	mov	x23, x0
    14bc:      	mov	x0, x20
    14c0:      	mov	x1, x19
    14c4:      	mov	x2, x21
    14c8:      	mov	x3, x22
    14cc:      	mov	x4, x23
    14d0:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    14d4:      	ldr	x8, [x20]
    14d8:      	mov	x0, x20
    14dc:      	mov	x1, x22
    14e0:      	ldr	x8, [x8, #0xb8]
    14e4:      	blr	x8
    14e8:      	ldr	x8, [x20]
    14ec:      	mov	x0, x20
    14f0:      	mov	x1, x23
    14f4:      	ldr	x8, [x8, #0xb8]
    14f8:      	blr	x8
    14fc:      	b	0x1b08 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x9e4>
    1500:      	ldr	x8, [x20]
    1504:      	adrp	x1, 0x0
    1508:      	add	x1, x1, #0xc47
    150c:      	mov	x0, x20
    1510:      	ldr	x8, [x8, #0x538]
    1514:      	blr	x8
    1518:      	ldr	x8, [x20]
    151c:      	adrp	x1, 0x0
    1520:      	mov	x22, x0
    1524:      	add	x1, x1, #0xbe2
    1528:      	b	0x1aac <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x988>
    152c:      	ldr	x8, [x20]
    1530:      	adrp	x1, 0x0
    1534:      	add	x1, x1, #0xc47
    1538:      	mov	x0, x20
    153c:      	ldr	x8, [x8, #0x538]
    1540:      	blr	x8
    1544:      	ldr	x8, [x20]
    1548:      	adrp	x1, 0x0
    154c:      	mov	x22, x0
    1550:      	add	x1, x1, #0xba5
    1554:      	b	0x1aac <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x988>
    1558:      	add	x1, sp, #0x90
    155c:      	mov	x0, x22
    1560:      	bl	0x1dd0 <vkGetPhysicalDeviceProperties@plt>
    1564:      	ldr	x8, [x20]
    1568:      	adrp	x1, 0x0
    156c:      	add	x1, x1, #0xb44
    1570:      	mov	x0, x20
    1574:      	add	x9, sp, #0x90
    1578:      	ldr	x8, [x8, #0x538]
    157c:      	add	x24, x9, #0x14
    1580:      	blr	x8
    1584:      	ldr	x8, [x20]
    1588:      	mov	x25, x0
    158c:      	mov	x0, x20
    1590:      	mov	x1, x24
    1594:      	ldr	x8, [x8, #0x538]
    1598:      	blr	x8
    159c:      	mov	x24, x0
    15a0:      	mov	x0, x20
    15a4:      	mov	x1, x19
    15a8:      	mov	x2, x21
    15ac:      	mov	x3, x25
    15b0:      	mov	x4, x24
    15b4:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    15b8:      	ldr	x8, [x20]
    15bc:      	mov	x0, x20
    15c0:      	mov	x1, x25
    15c4:      	ldr	x8, [x8, #0xb8]
    15c8:      	blr	x8
    15cc:      	ldr	x8, [x20]
    15d0:      	mov	x0, x20
    15d4:      	mov	x1, x24
    15d8:      	ldr	x8, [x8, #0xb8]
    15dc:      	blr	x8
    15e0:      	adrp	x24, 0x0
    15e4:      	ldr	w4, [sp, #0x98]
    15e8:      	add	x24, x24, #0xb4f
    15ec:      	sub	x0, x29, #0x88
    15f0:      	mov	w1, #0x80               // =128
    15f4:      	mov	x3, x24
    15f8:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    15fc:      	ldr	x8, [x20]
    1600:      	adrp	x1, 0x0
    1604:      	add	x1, x1, #0xbf5
    1608:      	mov	x0, x20
    160c:      	ldr	x8, [x8, #0x538]
    1610:      	blr	x8
    1614:      	ldr	x8, [x20]
    1618:      	mov	x25, x0
    161c:      	sub	x1, x29, #0x88
    1620:      	mov	x0, x20
    1624:      	ldr	x8, [x8, #0x538]
    1628:      	blr	x8
    162c:      	mov	x26, x0
    1630:      	mov	x0, x20
    1634:      	mov	x1, x19
    1638:      	mov	x2, x21
    163c:      	mov	x3, x25
    1640:      	mov	x4, x26
    1644:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1648:      	ldr	x8, [x20]
    164c:      	mov	x0, x20
    1650:      	mov	x1, x25
    1654:      	ldr	x8, [x8, #0xb8]
    1658:      	blr	x8
    165c:      	ldr	x8, [x20]
    1660:      	mov	x0, x20
    1664:      	mov	x1, x26
    1668:      	ldr	x8, [x8, #0xb8]
    166c:      	blr	x8
    1670:      	ldr	w4, [sp, #0x9c]
    1674:      	sub	x0, x29, #0x88
    1678:      	mov	w1, #0x80               // =128
    167c:      	mov	x3, x24
    1680:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    1684:      	ldr	x8, [x20]
    1688:      	adrp	x1, 0x0
    168c:      	add	x1, x1, #0xc4d
    1690:      	mov	x0, x20
    1694:      	ldr	x8, [x8, #0x538]
    1698:      	blr	x8
    169c:      	ldr	x8, [x20]
    16a0:      	mov	x24, x0
    16a4:      	sub	x1, x29, #0x88
    16a8:      	mov	x0, x20
    16ac:      	ldr	x8, [x8, #0x538]
    16b0:      	blr	x8
    16b4:      	mov	x25, x0
    16b8:      	mov	x0, x20
    16bc:      	mov	x1, x19
    16c0:      	mov	x2, x21
    16c4:      	mov	x3, x24
    16c8:      	mov	x4, x25
    16cc:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    16d0:      	ldr	x8, [x20]
    16d4:      	mov	x0, x20
    16d8:      	mov	x1, x24
    16dc:      	ldr	x8, [x8, #0xb8]
    16e0:      	blr	x8
    16e4:      	ldr	x8, [x20]
    16e8:      	mov	x0, x20
    16ec:      	mov	x1, x25
    16f0:      	ldr	x8, [x8, #0xb8]
    16f4:      	blr	x8
    16f8:      	ldr	w8, [sp, #0xa0]
    16fc:      	sub	w8, w8, #0x1
    1700:      	cmp	w8, #0x3
    1704:      	b.hi	0x171c <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x5f8>
    1708:      	adrp	x9, 0x0
    170c:      	add	x9, x9, #0xc74
    1710:      	ldrsw	x8, [x9, w8, sxtw #2]
    1714:      	add	x24, x9, x8
    1718:      	b	0x1724 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x600>
    171c:      	adrp	x24, 0x0
    1720:      	add	x24, x24, #0xbdc
    1724:      	ldr	x8, [x20]
    1728:      	adrp	x1, 0x0
    172c:      	add	x1, x1, #0xb15
    1730:      	mov	x0, x20
    1734:      	ldr	x8, [x8, #0x538]
    1738:      	blr	x8
    173c:      	ldr	x8, [x20]
    1740:      	mov	x25, x0
    1744:      	mov	x0, x20
    1748:      	mov	x1, x24
    174c:      	ldr	x8, [x8, #0x538]
    1750:      	blr	x8
    1754:      	mov	x24, x0
    1758:      	mov	x0, x20
    175c:      	mov	x1, x19
    1760:      	mov	x2, x21
    1764:      	mov	x3, x25
    1768:      	mov	x4, x24
    176c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1770:      	ldr	x8, [x20]
    1774:      	mov	x0, x20
    1778:      	mov	x1, x25
    177c:      	ldr	x8, [x8, #0xb8]
    1780:      	blr	x8
    1784:      	ldr	x8, [x20]
    1788:      	mov	x0, x20
    178c:      	mov	x1, x24
    1790:      	ldr	x8, [x8, #0xb8]
    1794:      	blr	x8
    1798:      	ldr	w8, [sp, #0x90]
    179c:      	adrp	x24, 0x0
    17a0:      	add	x24, x24, #0xc56
    17a4:      	sub	x0, x29, #0x88
    17a8:      	mov	w1, #0x80               // =128
    17ac:      	mov	x3, x24
    17b0:      	lsr	w4, w8, #22
    17b4:      	ubfx	w5, w8, #12, #10
    17b8:      	and	w6, w8, #0xfff
    17bc:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    17c0:      	ldr	x8, [x20]
    17c4:      	adrp	x1, 0x0
    17c8:      	add	x1, x1, #0xab5
    17cc:      	mov	x0, x20
    17d0:      	ldr	x8, [x8, #0x538]
    17d4:      	blr	x8
    17d8:      	ldr	x8, [x20]
    17dc:      	mov	x25, x0
    17e0:      	sub	x1, x29, #0x88
    17e4:      	mov	x0, x20
    17e8:      	ldr	x8, [x8, #0x538]
    17ec:      	blr	x8
    17f0:      	mov	x26, x0
    17f4:      	mov	x0, x20
    17f8:      	mov	x1, x19
    17fc:      	mov	x2, x21
    1800:      	mov	x3, x25
    1804:      	mov	x4, x26
    1808:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    180c:      	ldr	x8, [x20]
    1810:      	mov	x0, x20
    1814:      	mov	x1, x25
    1818:      	ldr	x8, [x8, #0xb8]
    181c:      	blr	x8
    1820:      	ldr	x8, [x20]
    1824:      	mov	x0, x20
    1828:      	mov	x1, x26
    182c:      	ldr	x8, [x8, #0xb8]
    1830:      	blr	x8
    1834:      	ldr	w8, [sp, #0x94]
    1838:      	sub	x0, x29, #0x88
    183c:      	mov	w1, #0x80               // =128
    1840:      	mov	x3, x24
    1844:      	lsr	w4, w8, #22
    1848:      	ubfx	w5, w8, #12, #10
    184c:      	and	w6, w8, #0xfff
    1850:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    1854:      	ldr	x8, [x20]
    1858:      	adrp	x1, 0x0
    185c:      	add	x1, x1, #0xa8f
    1860:      	mov	x0, x20
    1864:      	ldr	x8, [x8, #0x538]
    1868:      	blr	x8
    186c:      	ldr	x8, [x20]
    1870:      	mov	x24, x0
    1874:      	sub	x1, x29, #0x88
    1878:      	mov	x0, x20
    187c:      	ldr	x8, [x8, #0x538]
    1880:      	blr	x8
    1884:      	mov	x25, x0
    1888:      	mov	x0, x20
    188c:      	mov	x1, x19
    1890:      	mov	x2, x21
    1894:      	mov	x3, x24
    1898:      	mov	x4, x25
    189c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    18a0:      	ldr	x8, [x20]
    18a4:      	mov	x0, x20
    18a8:      	mov	x1, x24
    18ac:      	ldr	x8, [x8, #0xb8]
    18b0:      	blr	x8
    18b4:      	ldr	x8, [x20]
    18b8:      	mov	x0, x20
    18bc:      	mov	x1, x25
    18c0:      	ldr	x8, [x8, #0xb8]
    18c4:      	blr	x8
    18c8:      	cbz	x23, 0x1a58 <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0x934>
    18cc:      	ldr	x8, [x20]
    18d0:      	adrp	x1, 0x0
    18d4:      	add	x1, x1, #0xabf
    18d8:      	mov	x0, x20
    18dc:      	add	x25, sp, #0x3c8
    18e0:      	ldr	x8, [x8, #0x538]
    18e4:      	add	x23, x25, #0x14
    18e8:      	blr	x8
    18ec:      	ldr	x8, [x20]
    18f0:      	mov	x24, x0
    18f4:      	mov	x0, x20
    18f8:      	mov	x1, x23
    18fc:      	ldr	x8, [x8, #0x538]
    1900:      	blr	x8
    1904:      	mov	x23, x0
    1908:      	mov	x0, x20
    190c:      	mov	x1, x19
    1910:      	mov	x2, x21
    1914:      	mov	x3, x24
    1918:      	mov	x4, x23
    191c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1920:      	ldr	x8, [x20]
    1924:      	mov	x0, x20
    1928:      	mov	x1, x24
    192c:      	ldr	x8, [x8, #0xb8]
    1930:      	blr	x8
    1934:      	ldr	x8, [x20]
    1938:      	mov	x0, x20
    193c:      	mov	x1, x23
    1940:      	ldr	x8, [x8, #0xb8]
    1944:      	blr	x8
    1948:      	ldr	x8, [x20]
    194c:      	adrp	x1, 0x0
    1950:      	add	x1, x1, #0xc5f
    1954:      	mov	x0, x20
    1958:      	add	x23, x25, #0x114
    195c:      	ldr	x8, [x8, #0x538]
    1960:      	blr	x8
    1964:      	ldr	x8, [x20]
    1968:      	mov	x24, x0
    196c:      	mov	x0, x20
    1970:      	mov	x1, x23
    1974:      	ldr	x8, [x8, #0x538]
    1978:      	blr	x8
    197c:      	mov	x23, x0
    1980:      	mov	x0, x20
    1984:      	mov	x1, x19
    1988:      	mov	x2, x21
    198c:      	mov	x3, x24
    1990:      	mov	x4, x23
    1994:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1998:      	ldr	x8, [x20]
    199c:      	mov	x0, x20
    19a0:      	mov	x1, x24
    19a4:      	ldr	x8, [x8, #0xb8]
    19a8:      	blr	x8
    19ac:      	ldr	x8, [x20]
    19b0:      	mov	x0, x20
    19b4:      	mov	x1, x23
    19b8:      	ldr	x8, [x8, #0xb8]
    19bc:      	blr	x8
    19c0:      	adrp	x3, 0x0
    19c4:      	ldrb	w4, [sp, #0x5dc]
    19c8:      	ldrb	w5, [sp, #0x5dd]
    19cc:      	add	x3, x3, #0xc02
    19d0:      	ldrb	w6, [sp, #0x5df]
    19d4:      	sub	x0, x29, #0x88
    19d8:      	ldrb	w7, [sp, #0x5de]
    19dc:      	mov	w1, #0x80               // =128
    19e0:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    19e4:      	ldr	x8, [x20]
    19e8:      	adrp	x1, 0x0
    19ec:      	add	x1, x1, #0xb92
    19f0:      	mov	x0, x20
    19f4:      	ldr	x8, [x8, #0x538]
    19f8:      	blr	x8
    19fc:      	ldr	x8, [x20]
    1a00:      	mov	x23, x0
    1a04:      	sub	x1, x29, #0x88
    1a08:      	mov	x0, x20
    1a0c:      	ldr	x8, [x8, #0x538]
    1a10:      	blr	x8
    1a14:      	mov	x24, x0
    1a18:      	mov	x0, x20
    1a1c:      	mov	x1, x19
    1a20:      	mov	x2, x21
    1a24:      	mov	x3, x23
    1a28:      	mov	x4, x24
    1a2c:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1a30:      	ldr	x8, [x20]
    1a34:      	mov	x0, x20
    1a38:      	mov	x1, x23
    1a3c:      	ldr	x8, [x8, #0xb8]
    1a40:      	blr	x8
    1a44:      	ldr	x8, [x20]
    1a48:      	mov	x0, x20
    1a4c:      	mov	x1, x24
    1a50:      	ldr	x8, [x8, #0xb8]
    1a54:      	blr	x8
    1a58:      	mov	x2, sp
    1a5c:      	mov	x0, x22
    1a60:      	mov	x1, xzr
    1a64:      	mov	x3, xzr
    1a68:      	str	wzr, [sp]
    1a6c:      	bl	0x1de0 <vkEnumerateDeviceExtensionProperties@plt>
    1a70:      	adrp	x3, 0x0
    1a74:      	ldr	w4, [sp]
    1a78:      	add	x3, x3, #0xab2
    1a7c:      	sub	x0, x29, #0x88
    1a80:      	mov	w1, #0x80               // =128
    1a84:      	bl	0x1bdc <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x9c>
    1a88:      	ldr	x8, [x20]
    1a8c:      	adrp	x1, 0x0
    1a90:      	add	x1, x1, #0xaeb
    1a94:      	mov	x0, x20
    1a98:      	ldr	x8, [x8, #0x538]
    1a9c:      	blr	x8
    1aa0:      	ldr	x8, [x20]
    1aa4:      	mov	x22, x0
    1aa8:      	sub	x1, x29, #0x88
    1aac:      	ldr	x8, [x8, #0x538]
    1ab0:      	mov	x0, x20
    1ab4:      	blr	x8
    1ab8:      	mov	x23, x0
    1abc:      	mov	x0, x20
    1ac0:      	mov	x1, x19
    1ac4:      	mov	x2, x21
    1ac8:      	mov	x3, x22
    1acc:      	mov	x4, x23
    1ad0:      	bl	0x1cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>
    1ad4:      	ldr	x8, [x20]
    1ad8:      	mov	x0, x20
    1adc:      	mov	x1, x22
    1ae0:      	ldr	x8, [x8, #0xb8]
    1ae4:      	blr	x8
    1ae8:      	ldr	x8, [x20]
    1aec:      	mov	x0, x20
    1af0:      	mov	x1, x23
    1af4:      	ldr	x8, [x8, #0xb8]
    1af8:      	blr	x8
    1afc:      	ldr	x0, [sp, #0x8]
    1b00:      	mov	x1, xzr
    1b04:      	bl	0x1df0 <vkDestroyInstance@plt>
    1b08:      	ldr	x8, [x27, #0x28]
    1b0c:      	ldur	x9, [x29, #-0x8]
    1b10:      	cmp	x8, x9
    1b14:      	b.ne	0x1b3c <Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap+0xa18>
    1b18:      	mov	x0, x19
    1b1c:      	add	sp, sp, #0x9b0
    1b20:      	ldp	x20, x19, [sp, #0x50]
    1b24:      	ldp	x22, x21, [sp, #0x40]
    1b28:      	ldp	x24, x23, [sp, #0x30]
    1b2c:      	ldp	x26, x25, [sp, #0x20]
    1b30:      	ldp	x28, x27, [sp, #0x10]
    1b34:      	ldp	x29, x30, [sp], #0x60
    1b38:      	ret
    1b3c:      	bl	0x1d20 <__stack_chk_fail@plt>

0000000000001b40 <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz>:
    1b40:      	sub	sp, sp, #0x120
    1b44:      	stp	x29, x30, [sp, #0x100]
    1b48:      	add	x29, sp, #0x100
    1b4c:      	stp	x28, x19, [sp, #0x110]
    1b50:      	stp	x3, x4, [x29, #-0x78]
    1b54:      	sub	x9, x29, #0x78
    1b58:      	stp	x5, x6, [x29, #-0x68]
    1b5c:      	mov	x11, #-0x28             // =-40
    1b60:      	stur	x7, [x29, #-0x58]
    1b64:      	mov	x12, sp
    1b68:      	stp	q0, q1, [sp]
    1b6c:      	add	x9, x9, #0x28
    1b70:      	stp	q2, q3, [sp, #0x20]
    1b74:      	movk	x11, #0xff80, lsl #32
    1b78:      	stp	q4, q5, [sp, #0x40]
    1b7c:      	add	x12, x12, #0x80
    1b80:      	stp	q6, q7, [sp, #0x60]
    1b84:      	mrs	x19, TPIDR_EL0
    1b88:      	ldr	x8, [x19, #0x28]
    1b8c:      	sub	x10, x29, #0x28
    1b90:      	sub	x3, x29, #0x50
    1b94:      	stur	x8, [x29, #-0x8]
    1b98:      	add	x8, x29, #0x20
    1b9c:      	stp	x12, x11, [x29, #-0x18]
    1ba0:      	stp	x8, x9, [x29, #-0x28]
    1ba4:      	ldr	x8, [x0]
    1ba8:      	ldp	q0, q1, [x10]
    1bac:      	ldr	x8, [x8, #0xe8]
    1bb0:      	stp	q0, q1, [x29, #-0x50]
    1bb4:      	blr	x8
    1bb8:      	ldr	x8, [x19, #0x28]
    1bbc:      	ldur	x9, [x29, #-0x8]
    1bc0:      	cmp	x8, x9
    1bc4:      	b.ne	0x1bd8 <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x98>
    1bc8:      	ldp	x28, x19, [sp, #0x110]
    1bcc:      	ldp	x29, x30, [sp, #0x100]
    1bd0:      	add	sp, sp, #0x120
    1bd4:      	ret
    1bd8:      	bl	0x1d20 <__stack_chk_fail@plt>
    1bdc:      	sub	sp, sp, #0x110
    1be0:      	stp	x29, x30, [sp, #0xf0]
    1be4:      	add	x29, sp, #0xf0
    1be8:      	stp	x28, x19, [sp, #0x100]
    1bec:      	stp	x5, x6, [x29, #-0x68]
    1bf0:      	sub	x10, x29, #0x70
    1bf4:      	stur	x4, [x29, #-0x70]
    1bf8:      	mov	x12, #-0x20             // =-32
    1bfc:      	stur	x7, [x29, #-0x58]
    1c00:      	mov	x13, sp
    1c04:      	stp	q0, q1, [sp]
    1c08:      	add	x10, x10, #0x20
    1c0c:      	stp	q2, q3, [sp, #0x20]
    1c10:      	movk	x12, #0xff80, lsl #32
    1c14:      	stp	q4, q5, [sp, #0x40]
    1c18:      	add	x13, x13, #0x80
    1c1c:      	stp	q6, q7, [sp, #0x60]
    1c20:      	mrs	x19, TPIDR_EL0
    1c24:      	ldr	x9, [x19, #0x28]
    1c28:      	sub	x11, x29, #0x28
    1c2c:      	mov	x8, x3
    1c30:      	mov	x3, x1
    1c34:      	sub	x5, x29, #0x50
    1c38:      	mov	w1, #0x80               // =128
    1c3c:      	stur	x9, [x29, #-0x8]
    1c40:      	add	x9, x29, #0x20
    1c44:      	stp	x13, x12, [x29, #-0x18]
    1c48:      	mov	w2, wzr
    1c4c:      	mov	x4, x8
    1c50:      	stp	x9, x10, [x29, #-0x28]
    1c54:      	ldp	q0, q1, [x11]
    1c58:      	stp	q0, q1, [x29, #-0x50]
    1c5c:      	bl	0x1e00 <__vsnprintf_chk@plt>
    1c60:      	ldr	x8, [x19, #0x28]
    1c64:      	ldur	x9, [x29, #-0x8]
    1c68:      	cmp	x8, x9
    1c6c:      	b.ne	0x1c80 <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz+0x140>
    1c70:      	ldp	x28, x19, [sp, #0x100]
    1c74:      	ldp	x29, x30, [sp, #0xf0]
    1c78:      	add	sp, sp, #0x110
    1c7c:      	ret
    1c80:      	bl	0x1d20 <__stack_chk_fail@plt>

Disassembly of section .plt:

0000000000001c90 <.plt>:
    1c90:      	stp	x16, x30, [sp, #-0x10]!
    1c94:      	adrp	x16, 0x5000 <__vsnprintf_chk@plt+0x3200>
    1c98:      	ldr	x17, [x16, #0xfe8]
    1c9c:      	add	x16, x16, #0xfe8
    1ca0:      	br	x17
    1ca4:      	nop
    1ca8:      	nop
    1cac:      	nop

0000000000001cb0 <__cxa_finalize@plt>:
    1cb0:      	adrp	x16, 0x5000 <__vsnprintf_chk@plt+0x3200>
    1cb4:      	ldr	x17, [x16, #0xff0]
    1cb8:      	add	x16, x16, #0xff0
    1cbc:      	br	x17

0000000000001cc0 <__cxa_atexit@plt>:
    1cc0:      	adrp	x16, 0x5000 <__vsnprintf_chk@plt+0x3200>
    1cc4:      	ldr	x17, [x16, #0xff8]
    1cc8:      	add	x16, x16, #0xff8
    1ccc:      	br	x17

0000000000001cd0 <__register_atfork@plt>:
    1cd0:      	adrp	x16, 0x6000
    1cd4:      	ldr	x17, [x16]
    1cd8:      	add	x16, x16, #0x0
    1cdc:      	br	x17

0000000000001ce0 <_Z13jstringToCharP7_JNIEnvP8_jstring@plt>:
    1ce0:      	adrp	x16, 0x6000
    1ce4:      	ldr	x17, [x16, #0x8]
    1ce8:      	add	x16, x16, #0x8
    1cec:      	br	x17

0000000000001cf0 <_ZN7_JNIEnv16CallObjectMethodEP8_jobjectP10_jmethodIDz@plt>:
    1cf0:      	adrp	x16, 0x6000
    1cf4:      	ldr	x17, [x16, #0x10]
    1cf8:      	add	x16, x16, #0x10
    1cfc:      	br	x17

0000000000001d00 <malloc@plt>:
    1d00:      	adrp	x16, 0x6000
    1d04:      	ldr	x17, [x16, #0x18]
    1d08:      	add	x16, x16, #0x18
    1d0c:      	br	x17

0000000000001d10 <memcpy@plt>:
    1d10:      	adrp	x16, 0x6000
    1d14:      	ldr	x17, [x16, #0x20]
    1d18:      	add	x16, x16, #0x20
    1d1c:      	br	x17

0000000000001d20 <__stack_chk_fail@plt>:
    1d20:      	adrp	x16, 0x6000
    1d24:      	ldr	x17, [x16, #0x28]
    1d28:      	add	x16, x16, #0x28
    1d2c:      	br	x17

0000000000001d30 <fopen@plt>:
    1d30:      	adrp	x16, 0x6000
    1d34:      	ldr	x17, [x16, #0x30]
    1d38:      	add	x16, x16, #0x30
    1d3c:      	br	x17

0000000000001d40 <fscanf@plt>:
    1d40:      	adrp	x16, 0x6000
    1d44:      	ldr	x17, [x16, #0x38]
    1d48:      	add	x16, x16, #0x38
    1d4c:      	br	x17

0000000000001d50 <fclose@plt>:
    1d50:      	adrp	x16, 0x6000
    1d54:      	ldr	x17, [x16, #0x40]
    1d58:      	add	x16, x16, #0x40
    1d5c:      	br	x17

0000000000001d60 <_ZN7_JNIEnv9NewObjectEP7_jclassP10_jmethodIDz@plt>:
    1d60:      	adrp	x16, 0x6000
    1d64:      	ldr	x17, [x16, #0x48]
    1d68:      	add	x16, x16, #0x48
    1d6c:      	br	x17

0000000000001d70 <vkGetInstanceProcAddr@plt>:
    1d70:      	adrp	x16, 0x6000
    1d74:      	ldr	x17, [x16, #0x50]
    1d78:      	add	x16, x16, #0x50
    1d7c:      	br	x17

0000000000001d80 <vkEnumerateInstanceExtensionProperties@plt>:
    1d80:      	adrp	x16, 0x6000
    1d84:      	ldr	x17, [x16, #0x58]
    1d88:      	add	x16, x16, #0x58
    1d8c:      	br	x17

0000000000001d90 <vkCreateInstance@plt>:
    1d90:      	adrp	x16, 0x6000
    1d94:      	ldr	x17, [x16, #0x60]
    1d98:      	add	x16, x16, #0x60
    1d9c:      	br	x17

0000000000001da0 <vkEnumeratePhysicalDevices@plt>:
    1da0:      	adrp	x16, 0x6000
    1da4:      	ldr	x17, [x16, #0x68]
    1da8:      	add	x16, x16, #0x68
    1dac:      	br	x17

0000000000001db0 <free@plt>:
    1db0:      	adrp	x16, 0x6000
    1db4:      	ldr	x17, [x16, #0x70]
    1db8:      	add	x16, x16, #0x70
    1dbc:      	br	x17

0000000000001dc0 <memset@plt>:
    1dc0:      	adrp	x16, 0x6000
    1dc4:      	ldr	x17, [x16, #0x78]
    1dc8:      	add	x16, x16, #0x78
    1dcc:      	br	x17

0000000000001dd0 <vkGetPhysicalDeviceProperties@plt>:
    1dd0:      	adrp	x16, 0x6000
    1dd4:      	ldr	x17, [x16, #0x80]
    1dd8:      	add	x16, x16, #0x80
    1ddc:      	br	x17

0000000000001de0 <vkEnumerateDeviceExtensionProperties@plt>:
    1de0:      	adrp	x16, 0x6000
    1de4:      	ldr	x17, [x16, #0x88]
    1de8:      	add	x16, x16, #0x88
    1dec:      	br	x17

0000000000001df0 <vkDestroyInstance@plt>:
    1df0:      	adrp	x16, 0x6000
    1df4:      	ldr	x17, [x16, #0x90]
    1df8:      	add	x16, x16, #0x90
    1dfc:      	br	x17

0000000000001e00 <__vsnprintf_chk@plt>:
    1e00:      	adrp	x16, 0x6000
    1e04:      	ldr	x17, [x16, #0x98]
    1e08:      	add	x16, x16, #0x98
    1e0c:      	br	x17
