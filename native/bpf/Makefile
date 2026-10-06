# ============================================================================
# Makefile — 星野Scene (com.omarea.vtools) eBPF 对象构建
#
# 从还原出的 C 源码（src/）重建 3 个 BPF ELF 对象，产物名与 APK res/raw/ 内
# 原始 .o 保持一致：
#     kprobe_sys_execve.o   <- src/kprobe_sys_execve.c
#     bpf_arm64_bpfel.o     <- src/scheduler_fas_bpf.c   (注意: 源文件名与产物名不同)
#     tracepoint_thread.o   <- src/tracepoint_thread.c
#
# 原始工具链指纹（见 bpf/README.md §1、src/bpf_common.h 头注）：
#     clang -target bpf -O2 -g
# 三者均为「未 strip + 带 -g」的 ELF64 relocatable (eBPF)，BTF 段内嵌源码。
#
# 用法：
#     make            # 全量构建到 build/
#     make clean      # 删除 build/
#
# 注意：产物默认输出到 build/ 目录，避免覆盖本目录下作为「还原基准」保留的
#       原始 .o（kprobe_sys_execve.o / bpf_arm64_bpfel.o / tracepoint_thread.o）。
# ============================================================================

CLANG       ?= clang
BPF_CFLAGS  := -target bpf -O2 -g
CPPFLAGS    := -Isrc

BUILD_DIR   := build

# 三个目标：产物名与原始 .o 一致（scheduler_fas_bpf.c 的产物名为 bpf_arm64_bpfel.o）
OBJECTS := \
	$(BUILD_DIR)/kprobe_sys_execve.o \
	$(BUILD_DIR)/bpf_arm64_bpfel.o \
	$(BUILD_DIR)/tracepoint_thread.o

.PHONY: all clean

all: $(OBJECTS)

$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

# kprobe_sys_execve.c -> kprobe_sys_execve.o
$(BUILD_DIR)/kprobe_sys_execve.o: src/kprobe_sys_execve.c src/bpf_common.h | $(BUILD_DIR)
	$(CLANG) $(BPF_CFLAGS) $(CPPFLAGS) -c $< -o $@

# scheduler_fas_bpf.c -> bpf_arm64_bpfel.o （原始 .o 名，来自 APK res/raw/bpf_arm64_bpfel.o）
$(BUILD_DIR)/bpf_arm64_bpfel.o: src/scheduler_fas_bpf.c src/bpf_common.h | $(BUILD_DIR)
	$(CLANG) $(BPF_CFLAGS) $(CPPFLAGS) -c $< -o $@

# tracepoint_thread.c -> tracepoint_thread.o
$(BUILD_DIR)/tracepoint_thread.o: src/tracepoint_thread.c src/bpf_common.h | $(BUILD_DIR)
	$(CLANG) $(BPF_CFLAGS) $(CPPFLAGS) -c $< -o $@

clean:
	rm -rf $(BUILD_DIR)
