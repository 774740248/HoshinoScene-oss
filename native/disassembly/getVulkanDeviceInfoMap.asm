// 反汇编片段: Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap
// 范围 0x1124..0x1b38（2588 字节）

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
