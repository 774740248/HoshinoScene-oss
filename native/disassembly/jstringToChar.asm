// 反汇编片段: jstringToChar(JNIEnv*, jstring)
// mangled: _Z13jstringToCharP7_JNIEnvP8_jstring  范围 0x0ed4..0x0ff4
//
// ★ 槽位语义（据 NDK jni.h 布局 + 参数个数/数据流交叉验证，2024 修正）:
//   0x30  = FindClass
//   0x108 = GetMethodID
//   0x538 = NewStringUTF
//   0x558 = GetArrayLength              ; 返回值作“长度”
//   0x5c0 = GetByteArrayElements        ; 调用前 x2=xzr(isCopy)，返回值作 memcpy 源 —— 非 Region
//   0x600 = ReleaseByteArrayElements    ; 恰 4 参数 (env,array,elems,JNI_ABORT=0) —— 非 DeleteLocalRef
//   本函数内无 DeleteLocalRef 调用。

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
