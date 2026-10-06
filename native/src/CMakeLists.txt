# ============================================================================
# CMakeLists.txt —— native 层构建配置（逆向还原工程）
#
# 目标：从还原出的 native-lib.cpp 重新构建 libnative-lib.so，
#       使其导出符号与原始 .so 保持一致。
#
# 原始 .so 由 clang/LLD 14.0.6 (Android NDK) 构建，ARM aarch64。
# 本文件保留相同的产物名 "native-lib" 与 ABI arm64-v8a。
# ============================================================================
cmake_minimum_required(VERSION 3.22.1)

project(native-lib LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(native-lib SHARED
        native-lib.cpp
)

# 头文件搜索路径：jni_utils.h 所在目录
target_include_directories(native-lib PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}
)

# 链接原始 .so 所依赖/导入的库（见 docs/api-surface.md）
#   libvulkan.so  —— Vulkan 运行时（vk* 符号）
#   liblog.so     —— Android NDK 日志（原 .so 声明依赖，代码中未实际调用）
#   libm.so       —— 数学库
#   libdl.so      —— dlopen/dlsym（vkGetInstanceProcAddr 解析链）
#   libc.so       —— 由 NDK 自动加入
find_library(log-lib log)

target_link_libraries(native-lib
        ${log-lib}
        vulkan
        m
        dl
)

# 保持与原始 .so 相同的导出可见性：仅 JNIEXPORT / 显式 extern "C" 符号导出
# （不设置 -fvisibility=hidden，因为 jstringToChar 也是可见导出符号）
