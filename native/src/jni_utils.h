/*
 * jni_utils.h —— jstringToChar 及 JNI 辅助工具声明
 *
 * 本头文件对应 libnative-lib.so 中导出的符号：
 *   _Z13jstringToCharP7_JNIEnvP8_jstring
 *     == char* jstringToChar(JNIEnv*, jstring)   @ 偏移 0x0ed4
 *
 * 逆向依据：llvm-objdump -d --no-show-raw-insn 反汇编，
 *           详见 ../disassembly/jstringToChar.asm 与 ../docs/reverse-engineering-notes.md
 */
#ifndef HOSHINO_SCENE_JNI_UTILS_H
#define HOSHINO_SCENE_JNI_UTILS_H

#include <jni.h>

/*
 * ⚠ 符号可见性说明（U7，已修正）：
 *   原 .so 导出的符号是 C++ mangled 名 `_Z13jstringToCharP7_JNIEnvP8_jstring`，
 *   即 c++filt 后的 `char* jstringToChar(JNIEnv*, jstring)`。
 *   这说明**原实现没有用 extern "C" 包裹**该函数（有 extern "C" 会得到无修饰的
 *   C 符号 `jstringToChar`）。因此此处**刻意不加 extern "C"**，以保持与原
 *   二进制符号级一致。
 *
 *   （注：JNI 入口函数 `Java_com_omarea_vtools_SceneJNI_*` 必须用 extern "C"，
 *    它们本身就是 C 风格符号，这一点与原 .so 一致，见 native-lib.cpp。）
 *
 *   本机 JDK 的 jni.h 中类型名为 `JNIEnv_`，NDK 中为 `_JNIEnv`，故本地编译得到的
 *   mangled 名形如 `_Z13jstringToCharP7JNIEnv_P8_jstring`，与原始
 *   `_Z13jstringToCharP7_JNIEnvP8_jstring` 仅差类型名——这是工具链差异，
 *   用 NDK 编译即完全一致。
 */

/**
 * 将 Java 字符串以 GB2312 编码转换为 C 风格 NUL 结尾字符串。
 *
 * 实现要点（自 .so 反汇编 0x0ed4..0x0ff4 还原）：
 *   1. FindClass("java/lang/String")                        // rodata 0x0a9d
 *   2. GetMethodID(String, "getBytes", "(Ljava/lang/String;)[B")  // 0x0b77 / 0x0b54
 *   3. NewStringUTF("GB2312")                               // rodata 0x0c6a
 *   4. CallObjectMethod(str, getBytes, charset) -> jbyteArray
 *   5. GetArrayLength(bytes) -> len
 *   6. jbyte* elems = GetByteArrayElements(bytes, NULL)     // 取元素指针（非 Region 拷贝）
 *   7. 若 len >= 1：malloc(len + 1)，memcpy(buf, elems, len)，buf[len] = '\0'
 *      （原实现未检查 malloc 返回值 — 如实保留）
 *      若 len <  1：返回 NULL（不分配）
 *   8. ReleaseByteArrayElements(bytes, elems, JNI_ABORT)   // 配对释放（最终元素指针）
 *      原二进制全函数不存在 DeleteLocalRef 调用。
 *
 * ⚠ 内存所有权：返回值由调用方负责 free()。
 *
 * @param env  JNI 环境指针
 * @param str  待转换的 Java 字符串
 * @return 新分配的 NUL 结尾缓冲区；当字符串长度为 0 时返回 NULL
 */
char* jstringToChar(JNIEnv* env, jstring str);

#endif  // HOSHINO_SCENE_JNI_UTILS_H
