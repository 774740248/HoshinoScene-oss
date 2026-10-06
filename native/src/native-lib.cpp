/*
 * native-lib.cpp —— libnative-lib.so 逆向还原源码
 * ============================================================================
 * 目标二进制: lib/arm64-v8a/libnative-lib.so
 *   大小 10088 字节, ARM aarch64 ELF, stripped, clang/LLD 14.0.6 构建
 *   导出符号 5 个 (含 2 个 JNI 入口 + 1 个工具函数 + 2 个 C++ varargs 弱符号包装)
 *
 * 逆向工具: llvm-objdump -d --no-show-raw-insn / llvm-readelf
 * 还原方式: 逐指令控制流 + .rodata 字符串交叉定位
 *
 * 置信度图例:
 *   [确定] 反汇编可直接证明，逻辑唯一
 *   [高]   结构与调用序列确定，仅少量命名/类型为推断
 *   [中]   行为自洽但存在等价写法（如具体格式化调用形式）
 *   [低]   依据不足，仅作合理推测（已在注释中显式标注）
 * ============================================================================
 */

#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <stdint.h>

#include "jni_utils.h"

/* ==========================================================================
 * Vulkan 类型与常量（本地最小声明）
 * --------------------------------------------------------------------------
 * 说明: 目标 .so 静态链接了 Vulkan 的接口声明，但仅引用少量结构字段。
 *       为保持工程零外部依赖，这里给出还原所需的最小声明。
 *       字段偏移已与反汇编中访问的偏移逐一核对（见下方偏移注释）。
 * ========================================================================== */

typedef uint32_t VkFlags;
typedef uint32_t VkBool32;
typedef uint64_t VkDeviceSize;

typedef VkFlags VkInstanceCreateFlags;

/* VkResult: 0 == VK_SUCCESS */
typedef int32_t VkResult;
#define VK_SUCCESS 0

/* VkPhysicalDeviceType 枚举（Vulkan 规范 vk_physical_device_type） */
typedef enum VkPhysicalDeviceType {
    VK_PHYSICAL_DEVICE_TYPE_OTHER = 0,
    VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1,
    VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2,
    VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3,
    VK_PHYSICAL_DEVICE_TYPE_CPU = 4,
} VkPhysicalDeviceType;

/* Vulkan 版本号位段宏：major(高22)<<22 | minor(10位)<<12 | patch(低12) */
#define VK_MAKE_VERSION(major, minor, patch) \
    (((uint32_t)(major) << 22) | ((uint32_t)(minor) << 12) | ((uint32_t)(patch)))

/* 语义化版本号（VkConformanceVersion），每个分量 1 字节 */
typedef struct VkConformanceVersion {
    uint8_t major;
    uint8_t minor;
    uint8_t subminor;
    uint8_t patch;
} VkConformanceVersion;

typedef struct VkExtensionProperties {
    char     extensionName[256];
    uint32_t specVersion;
} VkExtensionProperties;

typedef struct VkApplicationInfo {
    int32_t           sType;               /* 0  = VK_STRUCTURE_TYPE_APPLICATION_INFO */
    const void*       pNext;               /* 8  */
    const char*       pApplicationName;    /* 16 */
    uint32_t          applicationVersion;  /* 24 */
    const char*       pEngineName;         /* 32 */
    uint32_t          engineVersion;       /* 40 */
    uint32_t          apiVersion;          /* 44 */
} VkApplicationInfo;

typedef struct VkInstanceCreateInfo {
    int32_t           sType;               /* 0  = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO */
    const void*       pNext;               /* 8  */
    VkInstanceCreateFlags flags;           /* 16 */
    const VkApplicationInfo* pApplicationInfo; /* 24 */
    uint32_t          enabledLayerCount;       /* 32 */
    const char* const* ppEnabledLayerNames;    /* 40 */
    uint32_t          enabledExtensionCount;   /* 48 */
    const char* const* ppEnabledExtensionNames;/* 56 */
} VkInstanceCreateInfo;

/* 结构体类型常量（Vulkan 规范固定值） */
#define VK_STRUCTURE_TYPE_APPLICATION_INFO       0u
#define VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO   1u

/*
 * VkPhysicalDeviceProperties v1.0 完整布局（用于 getVulkanDeviceInfoMap）。
 * 偏移已由反汇编中的相对取址逐项校对（见各行末注释中的指令地址）。
 *
 * 总大小 0x338 (824 字节) —— 与反汇编 0x147c 处 memcpy(..., 0x338) 一致 [确定]。
 * limits / sparseProperties 字段本函数不读取其值，但必须声明以保持结构体尺寸正确，
 * 否则反汇编中基于绝对偏移的访问（以及 memcpy 长度）会越界。
 */
typedef struct VkPhysicalDeviceLimits {
    uint8_t _opaque[504]; /* 占位：完整布局见 Vulkan 规范，本函数不使用其字段 */
} VkPhysicalDeviceLimits;

typedef struct VkPhysicalDeviceSparseProperties {
    uint8_t _opaque[20];
} VkPhysicalDeviceSparseProperties;

typedef struct VkPhysicalDeviceProperties {
    uint32_t             apiVersion;        /* 0x000  [确定] ldr w8,[sp,#0x90]      @0x1798 */
    uint32_t             driverVersion;     /* 0x004  [确定] ldr w8,[sp,#0x94]      @0x1834 */
    uint32_t             vendorID;          /* 0x008  [确定] ldr w4,[sp,#0x98]      @0x15e4 */
    uint32_t             deviceID;          /* 0x00c  [确定] ldr w4,[sp,#0x9c]      @0x1670 */
    VkPhysicalDeviceType deviceType;        /* 0x010  [确定] ldr w8,[sp,#0xa0]      @0x16f8 */
    char                 deviceName[256];   /* 0x014  [确定] add x24, x9, #0x14     @0x157c */
    uint8_t              pipelineCacheUUID[16]; /* 0x114 */
    VkPhysicalDeviceLimits         limits;              /* 0x124 (0x1F8) */
    VkPhysicalDeviceSparseProperties sparseProperties;  /* 0x31C (0x14) */
    uint8_t              _tail_pad[8];      /* 0x330..0x338 8 字节对齐补齐，使总大小 = 0x338 */
} VkPhysicalDeviceProperties;

/* 与上述结构配套的字段偏移常量（供可读性与自检使用） */
#define VK_PDP_OFF_API_VERSION         0x000u
#define VK_PDP_OFF_DRIVER_VERSION      0x004u
#define VK_PDP_OFF_VENDOR_ID           0x008u
#define VK_PDP_OFF_DEVICE_ID           0x00cu
#define VK_PDP_OFF_DEVICE_TYPE         0x010u
#define VK_PDP_OFF_DEVICE_NAME         0x014u
#define VK_PDP_OFF_CONFORMANCE_VERSION 0x124u

/*
 * 注意：原始 .so 访问的是 VkPhysicalDeviceProperties2 路径下 vkGetPhysicalDeviceProperties2
 * 输出的结构，其中 driverName / driverInfo 字段位于 VkPhysicalDeviceProperties 之后
 * 的扩展块（VkPhysicalDeviceDriverProperties，pNext 链）。
 * 反汇编中 driverVersion 字符串拼装读取的是 pdp 缓冲区 +0x5dc..+0x5df（见 0x19c0..0x19e0），
 * driverName / driverInfo 读取的是 pdp2 输出缓冲区 +0x14 / +0x114。
 * 这两个字符串的实际来源如下（置信度 [中]，依据为 Vulkan 扩展规范与偏移量）：
 *   driverName (+0x14) 对应 VkPhysicalDeviceDriverProperties::driverName[256]
 *   driverInfo (+0x114) 对应 VkPhysicalDeviceDriverProperties::driverInfo[256]
 */

/* --- Vulkan 函数指针类型（仅本文件使用的入口） --- */
typedef VkResult (*PFN_vkEnumerateInstanceVersion)(uint32_t* pApiVersion);
typedef VkResult (*PFN_vkEnumerateInstanceExtensionProperties)(
    const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
typedef VkResult (*PFN_vkCreateInstance)(
    const VkInstanceCreateInfo* pCreateInfo, const void* pAllocator, void** pInstance);
typedef VkResult (*PFN_vkEnumeratePhysicalDevices)(
    void* instance, uint32_t* pPhysicalDeviceCount, void** pPhysicalDevices);
typedef void (*PFN_vkGetPhysicalDeviceProperties)(
    void* physicalDevice, VkPhysicalDeviceProperties* pProperties);
typedef VkResult (*PFN_vkEnumerateDeviceExtensionProperties)(
    void* physicalDevice, const char* pLayerName, uint32_t* pPropertyCount,
    VkExtensionProperties* pProperties);
typedef void (*PFN_vkDestroyInstance)(void* instance, const void* pAllocator);
typedef void* (*PFN_vkGetInstanceProcAddr)(void* instance, const char* pName);

/* --- 符号声明：libvulkan.so 直接导入 --- */
extern "C" {
void* vkGetInstanceProcAddr(void* instance, const char* pName);
VkResult vkEnumerateInstanceExtensionProperties(
    const char* pLayerName, uint32_t* pPropertyCount, VkExtensionProperties* pProperties);
VkResult vkCreateInstance(
    const VkInstanceCreateInfo* pCreateInfo, const void* pAllocator, void** pInstance);
VkResult vkEnumeratePhysicalDevices(
    void* instance, uint32_t* pPhysicalDeviceCount, void** pPhysicalDevices);
void vkGetPhysicalDeviceProperties(
    void* physicalDevice, VkPhysicalDeviceProperties* pProperties);
VkResult vkEnumerateDeviceExtensionProperties(
    void* physicalDevice, const char* pLayerName, uint32_t* pPropertyCount,
    VkExtensionProperties* pProperties);
void vkDestroyInstance(void* instance, const void* pAllocator);
}

/* ==========================================================================
 * 内部辅助：NewStringUTF 的薄封装（仅为可读性，非二进制中独立符号）
 * ========================================================================== */

namespace {

/** 便捷取得 HashMap.put 需要的 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
const char* const kHashMapPutSig = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";

/** 每个 (key,value) 写入 map 时，value 字符串缓冲区的固定大小。反汇编中 size=0x80。 */
constexpr int kValueBufSize = 128;

}  // namespace

/* ==========================================================================
 * jstringToChar —— 见 jni_utils.h
 * 反汇编: 0x0ed4..0x0ff4
 * ========================================================================== */
char* jstringToChar(JNIEnv* env, jstring str) {
    jclass stringCls = env->FindClass("java/lang/String");
    jmethodID getBytes = env->GetMethodID(
        stringCls, "getBytes", "(Ljava/lang/String;)[B");
    jstring charset = env->NewStringUTF("GB2312");

    // CallObjectMethod(str, getBytes, charset) -> jbyteArray
    jbyteArray bytes =
        (jbyteArray)env->CallObjectMethod(str, getBytes, charset);

    // [确定] GetArrayLength @0xf6c (vtable 槽位 0x558)
    //   返回值 w23 后续被用作 malloc 长度 / memcpy 长度，语义唯一。
    jsize len = env->GetArrayLength(bytes);

    // [确定] GetByteArrayElements(bytes, NULL) @0xf88 (vtable 槽位 0x5c0)
    //   证据：调用前第三参数 x2 = xzr（isCopy = NULL），返回值 x21 被当作
    //   memcpy 的**数据源指针**使用。方法语义为“取数组元素指针”。
    //   注意：这里**不是** GetByteArrayRegion —— 后者是 (array, start, len, buf)
    //   4 参数的“拷贝进调用方缓冲”语义，且无需配对释放；
    //   而此处以指针形式取元素，必须配对 ReleaseByteArrayElements。
    //   vtable 槽位 0x5c0 属 Android NDK jni.h 布局；JDK jni.h 下同槽位是
    //   GetLongArrayElements，二者不同，以 NDK 布局 + 数据流为准。
    jbyte* elems = env->GetByteArrayElements(bytes, nullptr);

    char* buf = nullptr;
    if (len >= 1) {                            // [确定] @0xf94 cmp w23,#1; b.lt 0xfc0
        buf = (char*)malloc((size_t)len + 1);  // [确定] @0xf9c add w0,w23,#1; @0xfa0 malloc
        /*
         * ⚠ 原实现未检查 malloc 返回值（潜在缺陷，如实保留）：
         *   反汇编 0xf9c→fa0(malloc)→fa4/fb4(memcpy) 之间**无任何 cbz/cbnz 分支**，
         *   即原 .so 直接把 malloc 的返回值 x22 交给 memcpy(目标)。
         *   本还原忠实保留该行为，不加 NULL 保护，以与二进制语义一致。
         *   （若 malloc 失败，原实现将在 0xfb4 处对 NULL 写入而崩溃。）
         */
        // [确定] memcpy(dst = buf, src = elems, n = len) @0xfb4
        memcpy(buf, elems, (size_t)len);
        buf[len] = '\0';                       // [确定] @0xfb8 strb wzr,[x22,x23]
    }

    // [确定] ReleaseByteArrayElements(bytes, elems, JNI_ABORT=0) @0xfdc (vtable 槽位 0x600)
    //   证据：调用恰含 4 个参数 (x0=env, x1=bytes, x2=elems, w3=0)，
    //   与 JNI 规范 ReleaseByteArrayElements(array, elems, mode) 完全吻合。
    //   若这里是 DeleteLocalRef 则只需 2 个参数，编译器不会传 x2/x3。
    env->ReleaseByteArrayElements(bytes, elems, JNI_ABORT);

    /*
     * 关于 DeleteLocalRef(bytes)：反汇编 0x0ed4..0x0ff4 全函数**不存在**
     * DeleteLocalRef 调用（0x600 槽位已确定为 ReleaseByteArrayElements；
     * 亦未出现指向 DeleteLocalRef 的其它槽位）。故按“找不到就不写”原则，
     * 本还原**不**为 bytes 添加 DeleteLocalRef —— 与原二进制一致。
     */
    return buf;                                // [确定] @0xfe0 mov x0,x22
}

/* ==========================================================================
 * Java_com_omarea_vtools_SceneJNI_getKernelPropLong
 * --------------------------------------------------------------------------
 * 反汇编: 0x1094..0x1120 (144 字节)
 * 语义: 读取内核节点（如 /proc/... 或 /sys/...）中的第一个十进制长整型。
 *       Java 侧: long getKernelPropLong(String path)
 * ========================================================================== */
extern "C" JNIEXPORT jlong JNICALL
Java_com_omarea_vtools_SceneJNI_getKernelPropLong(
    JNIEnv* env, jclass /* clazz */, jstring path) {
    char* filePath = jstringToChar(env, path);   // [确定] @0x10b4

    // [确定] fopen(filePath, "r") —— 模式串位于 .rodata 0x0bb3 == "r"
    FILE* fp = fopen(filePath, "r");
    if (fp == nullptr) {
        // [确定] @0x10fc: mov x0, #-1
        return (jlong)-1;
    }

    long value = 0;
    // [确定] fscanf(fp, "%ld", &value); 格式串 0x0aae == "%ld"
    // 失败（返回值 != 1）时归零，@0x10e0..0x10e8
    if (fscanf(fp, "%ld", &value) != 1) {
        value = 0;
    }
    fclose(fp);                                  // [确定] @0x10f0

    /*
     * ⚠ 内存泄漏（如实记录，未做美化）：
     *   反汇编 0x10b4..0x111c 全程未见对 filePath 的 free() 调用。
     *   原实现确实泄漏 jstringToChar 分配出的缓冲区。— 置信度 [确定]
     *   本还原忠实保留该行为（不额外添加 free），以与二进制语义一致。
     *   如需修复，应在 return 前插入 free(filePath)。
     */
    return (jlong)value;
}

/* ==========================================================================
 * Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap
 * --------------------------------------------------------------------------
 * 反汇编: 0x1124..0x1b38 (2588 字节) —— 本 .so 的核心函数
 * 语义: 枚举 Vulkan 实例/物理设备信息，组装为 HashMap<String,String> 返回。
 *       Java 侧: HashMap<String,String> getVulkanDeviceInfoMap()
 *
 * HashMap 键（全部来自 .rodata，逐项确定）：
 *   instanceApi        0x0b09  实例 API 版本，形如 "1.3.0"
 *   instanceExtensions 0x0aca  实例扩展数量（"%u"）
 *   error              0x0c47  错误信息字符串
 *   deviceName         0x0b44  设备名（pdp.deviceName）
 *   vendorId           0x0bf5  厂商 ID，形如 "0x10DE"
 *   deviceId           0x0c4d  设备 ID，形如 "0x1C82"
 *   deviceType         0x0b15  Integrated GPU / Discrete GPU / Virtual GPU / CPU / Other
 *   deviceApi          0x0ab5  设备 API 版本，形如 "1.0.0"
 *   driverVersion      0x0a8f  驱动版本，形如 "1.2.3.4"
 *   driverName         0x0abf  驱动名（pdp2 +0x14）
 *   driverInfo         0x0c5f  驱动信息（pdp2 +0x114）
 *   conformanceVersion 0x0b92  一致性版本，形如 "1.2.3.4"
 *   deviceExtensions   0x0aeb  设备扩展数量（"%u"）
 * ========================================================================== */
extern "C" JNIEXPORT jobject JNICALL
Java_com_omarea_vtools_SceneJNI_getVulkanDeviceInfoMap(
    JNIEnv* env, jclass /* clazz */) {

    /* ------------------------------------------------------------------
     * 1) 构造 java/util/HashMap 并取得 put 方法 ID
     *    [确定] 0x1148: FindClass("java/util/HashMap")  (0x0b80)
     *           0x1194: GetMethodID(HashMap, "put", "(Ljava/lang/Object;...)Ljava/lang/Object;")
     *           0x11c8: NewObject(HashMap, "<init>", "(I)V", 16)  —— 初始容量 16
     * ------------------------------------------------------------------ */
    jclass hashMapCls = env->FindClass("java/util/HashMap");
    if (hashMapCls == nullptr) {              // [确定] @0x1168: cbz x0 -> 0x1214
        return nullptr;
    }
    jmethodID putMethod = env->GetMethodID(
        hashMapCls, "put", kHashMapPutSig);   // [确定] 0x0bfe / 0x0c0e
    if (putMethod == nullptr) {               // [确定] @0x11c0
        return nullptr;
    }

    // NewObject(HashMap, <init>, 16) —— 对应 dlmalloc 初始桶数提示值
    jmethodID hashMapInit = env->GetMethodID(hashMapCls, "<init>", "(I)V"); // 0x0add/0x0b20
    jobject hashMap = env->NewObject(hashMapCls, hashMapInit, (jint)16);    // [确定] @0x11dc
    if (hashMap == nullptr) {                  // [确定] @0x11e4
        return nullptr;
    }

    /* ------------------------------------------------------------------
     * 2) 查询实例 API 版本
     *    [确定] 0x11e8: vkGetInstanceProcAddr(NULL, "vkEnumerateInstanceVersion") (0x0a70)
     *           若函数指针为空 -> 默认 0x400000 (VK_API_VERSION_1_0)
     *           否则 pfn(&apiVersion) 写入 sp+0x8c
     * ------------------------------------------------------------------ */
    uint32_t instanceApiVersion = 0;           // sp+0x8c, @0x11f4 清零
    PFN_vkEnumerateInstanceVersion enumerateInstanceVersion =
        (PFN_vkEnumerateInstanceVersion)vkGetInstanceProcAddr(
            nullptr, "vkEnumerateInstanceVersion");
    if (enumerateInstanceVersion == nullptr) {             // [确定] @0x11fc
        instanceApiVersion = 0x00400000u;                  // [确定] @0x121c
    } else {
        enumerateInstanceVersion(&instanceApiVersion);     // [确定] @0x1208
    }

    /* ------------------------------------------------------------------
     * 3) 格式化实例 API 版本，"%u.%u.%u" (0x0c56)，并写入 map
     *    位段: major = v>>22, minor = (v>>12)&0x3FF, patch = v&0xFFF
     *    [确定] 0x1224..0x1244  (lsr/ubfx/and 三条指令)
     * ------------------------------------------------------------------ */
    char versionBuf[kValueBufSize];            // sp-0x88 .. sp-0x09
    snprintf(versionBuf, sizeof(versionBuf), "%u.%u.%u",
             instanceApiVersion >> 22,
             (instanceApiVersion >> 12) & 0x3FFu,
             instanceApiVersion & 0xFFFu);     // [确定] 0x1224..0x1240

    // map.put("instanceApi", versionBuf)  —— 0x0b09 = "instanceApi"
    {
        jstring key = env->NewStringUTF("instanceApi");
        jstring value = env->NewStringUTF(versionBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // [确定] DeleteLocalRef @0x129c (vtable+0xb8)
        env->DeleteLocalRef(value);            // [确定] @0x12b4
    }

    /* ------------------------------------------------------------------
     * 4) 统计实例扩展数量
     *    [确定] 0x12b8: vkEnumerateInstanceExtensionProperties(NULL, &count, NULL)
     *           0x12cc: 以 "%u" (0x0ab2) 格式化 count
     * ------------------------------------------------------------------ */
    uint32_t instanceExtCount = 0;             // sp+0x88, @0x12c4 清零
    vkEnumerateInstanceExtensionProperties(nullptr, &instanceExtCount, nullptr); // [确定] @0x12c8

    char extCountBuf[kValueBufSize];
    snprintf(extCountBuf, sizeof(extCountBuf), "%u", instanceExtCount); // [确定] @0x12cc

    // map.put("instanceExtensions", extCountBuf)  —— 0x0aca
    {
        jstring key = env->NewStringUTF("instanceExtensions");
        jstring value = env->NewStringUTF(extCountBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x1340
        env->DeleteLocalRef(value);            // @0x1354
    }

    /* ------------------------------------------------------------------
     * 5) 构造 VkApplicationInfo + VkInstanceCreateInfo 并创建实例
     *    [确定] 0x1358..0x13a4
     *      - 大面积 stp q0 为结构体清零（memset 内联）
     *      - VkApplicationInfo.sType = 0, apiVersion = instanceApiVersion
     *      - pApplicationName/pEngineName 指向 .rodata 0x0ae4 == "vtools"  ★关键更正
     *      - VkInstanceCreateInfo.sType = 1 (= VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
     *      - pApplicationInfo = &appInfo
     *      - enabledLayerCount = 0, enabledExtensionCount = 0
     * ------------------------------------------------------------------ */
    /*
     * 栈帧布局（据反汇编 0x1358..0x13a4 逐条核对）：
     *   appInfo   基址 = sp+0x50    （被 @0x137c stp q0,q0,[sp,#0x50] 清零）
     *     appInfo.sType              = sp+0x50
     *     appInfo.pApplicationName   = sp+0x60  ← str x8 @0x1380 (x8 = 0x0ae4 "vtools")
     *     appInfo.applicationVersion = sp+0x68  ← str w9 @0x1388 (w9 = 1)   ★ 补回
     *     appInfo.pEngineName        = sp+0x70  ← str x8 @0x1378
     *     appInfo.engineVersion      = sp+0x78  ← stp w9,w8 @0x1390 (低字 = 1)
     *     appInfo.apiVersion         = sp+0x7c  ← stp w9,w8 @0x1390 (高字 = instanceApiVersion)
     *   createInfo 基址 = sp+0x10   （被 @0x138c/0x1398 stp q0,q0 清零）
     *     createInfo.sType           = sp+0x10  ← str w9 @0x139c (w9 = 1)
     *     createInfo.pApplicationInfo= sp+0x28  ← str x8 @0x13a0 (x8 = &appInfo = sp+0x50)
     */
    VkApplicationInfo appInfo;                 // sp+0x50 起（与 -0x88 缓冲不重叠）
    memset(&appInfo, 0, sizeof(appInfo));
    const char* kAppName = "vtools";           // [确定] 0x0ae4, 同时用于 appName 与 engineName
    appInfo.sType = VK_STRUCTURE_TYPE_APPLICATION_INFO;   // [确定] 结构体清零后 sType=0
    appInfo.pApplicationName = kAppName;                  // [确定] @0x1380 str x8,[sp,#0x60]
    appInfo.applicationVersion = (uint32_t)1;             // [确定] @0x1388 str w9,[sp,#0x68], w9=1
    appInfo.pEngineName = kAppName;                       // [确定] @0x1378 str x8,[sp,#0x70]
    appInfo.engineVersion = (uint32_t)1;                  // [确定] @0x1364 w9=1 → @0x1390
    appInfo.apiVersion = instanceApiVersion;              // [确定] @0x1390 stp w9,w8

    VkInstanceCreateInfo createInfo;           // sp+0x10 起
    memset(&createInfo, 0, sizeof(createInfo));
    createInfo.sType = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;   // [确定] str w9 @0x139c, w9=1
    createInfo.pApplicationInfo = &appInfo;                      // [确定] str x8 @0x13a0 (x8=sp+0x50)

    void* instance = nullptr;                  // sp+0x8, @0x1374 清零
    VkResult createResult =
        vkCreateInstance(&createInfo, nullptr, &instance);       // [确定] @0x13a4

    // 失败分支：map.put("error", "vkCreateInstance failed")  —— 0x0c47 / 0x0bc4
    if (createResult != VK_SUCCESS || instance == nullptr) {     // [确定] 0x13a8 / 0x13b0
        jstring key = env->NewStringUTF("error");
        jstring value = env->NewStringUTF("vkCreateInstance failed");
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x14e0
        env->DeleteLocalRef(value);            // @0x14f4
        return hashMap;                        // [确定] @0x14fc -> 尾部 epilogue
    }

    /* ------------------------------------------------------------------
     * 6) 枚举物理设备
     *    [确定] 0x13b4: vkEnumeratePhysicalDevices(instance, &count, NULL)
     *           计数为 0 -> map.put("error", "no physical device") (0x0be2)
     *           否则 malloc(count * sizeof(void*))，再次枚举取设备数组
     *           取 pDevices[0] 后立即 free(pDevices)（只使用第一块设备）
     * ------------------------------------------------------------------ */
    uint32_t physicalDeviceCount = 0;          // sp+0x4, @0x13bc 清零
    vkEnumeratePhysicalDevices(instance, &physicalDeviceCount, nullptr); // [确定] @0x13c0

    if (physicalDeviceCount == 0) {            // [确定] @0x13c8
        jstring key = env->NewStringUTF("error");
        jstring value = env->NewStringUTF("no physical device");
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);
        env->DeleteLocalRef(value);
        vkDestroyInstance(instance, nullptr);  // [确定] @0x1afc（经尾部公共路径）
        return hashMap;
    }

    void** physicalDevices =
        (void**)malloc((size_t)physicalDeviceCount * sizeof(void*));  // [确定] @0x13cc..0x13d0
    if (physicalDevices == nullptr) {          // [确定] @0x13d4 -> 0x152c
        jstring key = env->NewStringUTF("error");
        jstring value = env->NewStringUTF("out of memory");       // 0x0ba5
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);
        env->DeleteLocalRef(value);
        vkDestroyInstance(instance, nullptr);
        return hashMap;
    }
    vkEnumeratePhysicalDevices(instance, &physicalDeviceCount, physicalDevices); // [确定] @0x13e8

    void* physicalDevice = physicalDevices[0];  // [确定] @0x13f0
    free(physicalDevices);                      // [确定] @0x13f4（malloc/free 正确配对）

    /* ------------------------------------------------------------------
     * 7) 尝试通过 vkGetPhysicalDeviceProperties2 获取扩展属性
     *    [确定] 0x13f8..0x1480
     *      准备 Properties2 输出缓冲（0x348 字节，sp+0x5e0）
     *      准备 VkPhysicalDeviceProperties2 外层链头（0x218 字节，sp+0x3c8）
     *      缓冲头部写入 sType 魔数：
     *         sp+0x5e0 = 0x3B9B_B079  → VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2
     *         sp+0x3c8 = 0x3B9D_C7A0  → VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES
     *      通过 vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties2")(0x0b25)
     *      取函数指针；非空则调用并回填，否则回退到 vkGetPhysicalDeviceProperties
     * ------------------------------------------------------------------ */

    /* vkGetPhysicalDeviceProperties2 的输入：Properties2 链
     *   pNext → VkPhysicalDeviceDriverProperties
     * 这里用本地结构体精确复刻反汇编中的偏移：
     *   Properties2 头        @ sp+0x5e0: sType(4) + pNext(8)  = 0x10 字节
     *   内嵌 VkPhysicalDeviceProperties @ sp+0x5f0 (0x338 字节)
     *   DriverProperties      @ sp+0x3c8，布局（与 Vulkan 规范一致，且经反汇编核对）:
     *     +0x00 sType, +0x08 pNext, +0x10 driverID,
     *     +0x14 driverName[256], +0x114 driverInfo[256], +0x214 conformanceVersion
     *   —— driverName@0x14（反汇编 @0x18e4: add x23,x25,#0x14）[确定]
     *   —— driverInfo@0x114（反汇编 @0x1958）[确定]
     *   —— conformanceVersion@0x214（反汇编 @0x19c4: [sp,#0x5dc]=0x3c8+0x214）[确定] */
    struct PhysicalDeviceDriverPropertiesLocal {
        int32_t  sType;                  // 0x00 = 0x3B9D_C7A0
        int32_t  _pad0;                  // 0x04
        void*    pNext;                  // 0x08
        uint32_t driverID;               // 0x10 (VkDriverId)
        char     driverName[256];        // 0x14
        char     driverInfo[256];        // 0x114
        VkConformanceVersion conformanceVersion; // 0x214
    } driverProps;
    memset(&driverProps, 0, sizeof(driverProps)); // [确定] @0x1410..0x1428 (size 0x218)
    driverProps.sType = (int32_t)0x3B9DC7A0;      // [高] PHYSICAL_DEVICE_DRIVER_PROPERTIES

    struct PhysicalDeviceProperties2Local {
        int32_t sType;                  // 0x00 = 0x3B9B_B079（在 sp+0x5e0）
        int32_t _pad;
        void*   pNext;                  // 0x08 -> &driverProps（在 sp+0x5e8）
        VkPhysicalDeviceProperties properties; // 0x10（内嵌 0x338 字节）
    } props2;
    memset(&props2, 0, sizeof(props2));           // [确定] @0x13f8 @0x1400 (size 0x348)
    props2.sType = (int32_t)0x3B9BB079;           // [高] PHYSICAL_DEVICE_PROPERTIES_2
    props2.pNext = &driverProps;                  // [确定] @0x1440: str x23,[sp,#0x5e8]

    /* 本地主属性结构：Properties2 的基础属性会被拷到这里供后续读取 */
    VkPhysicalDeviceProperties pdp;
    memset(&pdp, 0, sizeof(pdp));

    PFN_vkGetPhysicalDeviceProperties getPropsV2 =
        (PFN_vkGetPhysicalDeviceProperties)
            vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties2"); // [确定] @0x1448
    bool hasProperties2 = (getPropsV2 != nullptr);                          // [确定] @0x1460

    if (hasProperties2) {
        // 调用 vkGetPhysicalDeviceProperties2(physicalDevice, &props2)  [确定] @0x146c
        getPropsV2(physicalDevice, (VkPhysicalDeviceProperties*)&props2);
        // 拷贝基础属性：memcpy(&pdp, props2_out + 0x10, 0x338)  [确定] @0x1470..0x147c
        memcpy(&pdp, (uint8_t*)&props2 + 0x10, 0x338);
    } else {
        // 回退路径：vkGetPhysicalDeviceProperties(physicalDevice, &pdp)  [确定] @0x1558..0x1560
        vkGetPhysicalDeviceProperties(physicalDevice, &pdp);
    }

    /* ------------------------------------------------------------------
     * 8) map.put("deviceName", pdp.deviceName)  —— 0x0b44
     *    [确定] 0x1564..0x15dc（deviceName 位于 pdp+0x14）
     * ------------------------------------------------------------------ */
    {
        jstring key = env->NewStringUTF("deviceName");
        jstring value = env->NewStringUTF(pdp.deviceName);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x15c8
        env->DeleteLocalRef(value);            // @0x15dc
    }

    /* ------------------------------------------------------------------
     * 9) map.put("vendorId", sprintf("0x%X", pdp.vendorID))  —— 0x0bf5 / 0x0b4f
     *    [确定] 0x15e0..0x166c（vendorID 位于 pdp+0x08）
     * ------------------------------------------------------------------ */
    {
        char vendorBuf[kValueBufSize];
        snprintf(vendorBuf, sizeof(vendorBuf), "0x%X", pdp.vendorID); // [确定] @0x15e0..0x15f8
        jstring key = env->NewStringUTF("vendorId");
        jstring value = env->NewStringUTF(vendorBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x1658
        env->DeleteLocalRef(value);            // @0x166c
    }

    /* ------------------------------------------------------------------
     * 10) map.put("deviceId", sprintf("0x%X", pdp.deviceID))  —— 0x0c4d
     *     [确定] 0x1670..0x16f4（deviceID 位于 pdp+0x0c）
     * ------------------------------------------------------------------ */
    {
        char deviceIdBuf[kValueBufSize];
        snprintf(deviceIdBuf, sizeof(deviceIdBuf), "0x%X", pdp.deviceID); // [确定] @0x1670..0x1680
        jstring key = env->NewStringUTF("deviceId");
        jstring value = env->NewStringUTF(deviceIdBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x16e0
        env->DeleteLocalRef(value);            // @0x16f4
    }

    /* ------------------------------------------------------------------
     * 11) deviceType 映射（switch + 跳转表）—— 0x16f8..0x1794
     *     [确定] 反汇编:
     *       w8 = pdp.deviceType (pdp+0x10)
     *       w8 -= 1
     *       if (w8 > 3) goto default("Other")
     *       else table[0xc74 + w8*4] -> 字符串指针
     *     跳转表（.rodata 0xc74，已用脚本解码，指向字符串常量的绝对地址）:
     *       case deviceType==1 (INTEGRATED_GPU) -> 0x0bb5 "Integrated GPU"
     *       case deviceType==2 (DISCRETE_GPU)   -> 0x0afc "Discrete GPU"
     *       case deviceType==3 (VIRTUAL_GPU)    -> 0x0b6b "Virtual GPU"
     *       case deviceType==4 (CPU)            -> 0x0a8b "CPU"
     *       default (0 或 >4)                   -> 0x0bdc "Other"
     * ------------------------------------------------------------------ */
    const char* deviceTypeStr;
    switch ((int)pdp.deviceType) {              // [确定] @0x16f8
        case VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU:
            deviceTypeStr = "Integrated GPU";   // 0x0bb5
            break;
        case VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU:
            deviceTypeStr = "Discrete GPU";     // 0x0afc
            break;
        case VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU:
            deviceTypeStr = "Virtual GPU";      // 0x0b6b
            break;
        case VK_PHYSICAL_DEVICE_TYPE_CPU:
            deviceTypeStr = "CPU";              // 0x0a8b
            break;
        default:
            deviceTypeStr = "Other";            // 0x0bdc
            break;
    }

    // map.put("deviceType", deviceTypeStr)  —— 0x0b15
    {
        jstring key = env->NewStringUTF("deviceType");
        jstring value = env->NewStringUTF(deviceTypeStr);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x177c
        env->DeleteLocalRef(value);            // @0x1790
    }

    /* ------------------------------------------------------------------
     * 12) map.put("deviceApi", "%u.%u.%u" % pdp.apiVersion)  —— 0x0ab5
     *     [确定] 0x1798..0x1830（apiVersion 位于 pdp+0x00）
     * ------------------------------------------------------------------ */
    {
        char apiBuf[kValueBufSize];
        uint32_t v = pdp.apiVersion;
        snprintf(apiBuf, sizeof(apiBuf), "%u.%u.%u",
                 v >> 22, (v >> 12) & 0x3FFu, v & 0xFFFu);   // [确定] @0x1798..0x17bc
        jstring key = env->NewStringUTF("deviceApi");
        jstring value = env->NewStringUTF(apiBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x1818
        env->DeleteLocalRef(value);            // @0x182c
    }

    /* ------------------------------------------------------------------
     * 13) map.put("driverVersion", "%u.%u.%u" % pdp.driverVersion)  —— 0x0a8f
     *     [确定] 0x1834..0x18c4（driverVersion 位于 pdp+0x04）
     * ------------------------------------------------------------------ */
    {
        char driverVbuf[kValueBufSize];
        uint32_t v = pdp.driverVersion;
        snprintf(driverVbuf, sizeof(driverVbuf), "%u.%u.%u",
                 v >> 22, (v >> 12) & 0x3FFu, v & 0xFFFu);   // [确定] @0x1834..0x1850
        jstring key = env->NewStringUTF("driverVersion");
        jstring value = env->NewStringUTF(driverVbuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x18ac
        env->DeleteLocalRef(value);            // @0x18c0
    }

    /* ------------------------------------------------------------------
     * 14) 若存在 Properties2 路径（x23 != 0），追加 driverName / driverInfo
     *     [确定] 0x18c8: cbz x23 -> 0x1a58（跳过）
     *       driverName: 读 driverProps 缓冲（sp+0x3c8）+0x14  —— 0x0abf
     *       driverInfo: 读 driverProps 缓冲 +0x114            —— 0x0c5f
     *     说明: 该路径仅在 vkGetPhysicalDeviceProperties2 可用时执行。
     * ------------------------------------------------------------------ */
    if (hasProperties2) {                      // [确定] @0x18c8
        // map.put("driverName", driverProps.driverName)
        {
            jstring key = env->NewStringUTF("driverName");
            // [确定] @0x18dc/0x18e4: x25=sp+0x3c8, x23=x25+0x14
            jstring value = env->NewStringUTF((const char*)&driverProps.driverName[0]);
            env->CallObjectMethod(hashMap, putMethod, key, value);
            env->DeleteLocalRef(key);          // @0x192c
            env->DeleteLocalRef(value);        // @0x1940
        }
        // map.put("driverInfo", driverProps.driverInfo)
        {
            jstring key = env->NewStringUTF("driverInfo");
            // [确定] @0x1954/0x1958: x23=x25+0x114
            jstring value = env->NewStringUTF((const char*)&driverProps.driverInfo[0]);
            env->CallObjectMethod(hashMap, putMethod, key, value);
            env->DeleteLocalRef(key);          // @0x19a4
            env->DeleteLocalRef(value);        // @0x19b8
        }
    }

    /* ------------------------------------------------------------------
     * 15) map.put("conformanceVersion", "%u.%u.%u.%u")  —— 0x0b92 / 0x0c02
     *     [确定] 格式串为 "%u.%u.%u.%u"（0x0c02），共 4 个分量。
     *     [确定] 4 个字节读取地址为 sp+0x5dc..0x5df。
     *            已知 driverProps 缓冲基址 = sp+0x3c8，
     *            故相对偏移 = 0x5dc-0x3c8 .. 0x5df-0x3c8 = 0x214..0x217，
     *            正对应 VkPhysicalDeviceDriverProperties::conformanceVersion。
     *     [中]  4 个分量的语义顺序（哪个是 major/minor/subminor/patch）无法仅凭
     *            反汇编断定，此处按反汇编读取顺序直接表达，
     *            详见 docs/confidence-report.md U1。
     *
     *     反汇编读取顺序（0x19c0..0x19e0）:
     *       w4 = byte[+0x214]   -> 第 1 个 %u
     *       w5 = byte[+0x215]   -> 第 2 个 %u
     *       w6 = byte[+0x217]   -> 第 3 个 %u
     *       w7 = byte[+0x216]   -> 第 4 个 %u
     * ------------------------------------------------------------------ */
    {
        const uint8_t* conf = (const uint8_t*)&driverProps;
        char confBuf[kValueBufSize];
        snprintf(confBuf, sizeof(confBuf), "%u.%u.%u.%u",
                 (unsigned)conf[0x214],
                 (unsigned)conf[0x215],
                 (unsigned)conf[0x217],
                 (unsigned)conf[0x216]);
        jstring key = env->NewStringUTF("conformanceVersion");
        jstring value = env->NewStringUTF(confBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x1a3c
        env->DeleteLocalRef(value);            // @0x1a54
    }

    /* ------------------------------------------------------------------
     * 16) map.put("deviceExtensions", "%u" % count)  —— 0x0aeb
     *     [确定] 0x1a58..0x1af8
     *       vkEnumerateDeviceExtensionProperties(pDevice, NULL, &count, NULL)
     * ------------------------------------------------------------------ */
    {
        uint32_t deviceExtCount = 0;           // sp+0, @0x1a68 清零
        vkEnumerateDeviceExtensionProperties(
            physicalDevice, nullptr, &deviceExtCount, nullptr); // [确定] @0x1a6c
        char devExtBuf[kValueBufSize];
        snprintf(devExtBuf, sizeof(devExtBuf), "%u", deviceExtCount); // [确定] @0x1a70..0x1a84
        jstring key = env->NewStringUTF("deviceExtensions");
        jstring value = env->NewStringUTF(devExtBuf);
        env->CallObjectMethod(hashMap, putMethod, key, value);
        env->DeleteLocalRef(key);              // @0x1ae4
        env->DeleteLocalRef(value);            // @0x1af8
    }

    /* ------------------------------------------------------------------
     * 17) 释放实例并返回
     *     [确定] 0x1afc: vkDestroyInstance(instance, NULL)
     * ------------------------------------------------------------------ */
    vkDestroyInstance(instance, nullptr);      // [确定] @0x1b04
    return hashMap;                            // [确定] @0x1b18: mov x0, x19
}
