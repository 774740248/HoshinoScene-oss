# native 层源码架构总览（ARCHITECTURE.md）

> 本文回答三个问题：
> 1. 「星野Scene」native 侧的原始多仓库结构长什么样（基于编译路径泄露推断）；
> 2. 每个还原产物对应原始仓库里的哪个文件（映射表）；
> 3. 交付的源码目录如何分层、还原度如何分档。
>
> 诚实原则：**还原度分「源码级 / 架构级 / 成品」三档**，daemon 是架构级还原，不做函数级/源码级表述。

---

## 1. 原始多仓库结构推断

三个 eBPF 对象的 `.BTF` debug 段内嵌了编译时的**绝对源文件路径**，是原始工程布局的直接证据：

```
/mnt/d/Android/vtools-private/          ← 主 App 私有仓库（作者构建机 1，Windows / WSL 盘 D:）
└── daemon/
    ├── kprobe_sys_execve.c             ← 证据: .BTF 内嵌路径（kprobe_sys_execve.o）
    └── scheduler_fas_bpf.c             ← 证据: .BTF 内嵌路径（bpf_arm64_bpfel.o）

/home/helloklf/scene-daemon/            ← 独立 daemon 仓库（作者构建机 2，Linux 用户 helloklf）
└── tracepoint_thread.c                 ← 证据: .BTF 内嵌路径（tracepoint_thread.o）
```

| 泄露路径 | 泄露信息 |
|----------|----------|
| `/mnt/d/Android/vtools-private/daemon/kprobe_sys_execve.c` | 主 App 仓库位于 Windows 盘 `D:\Android\vtools-private\daemon\` |
| `/mnt/d/Android/vtools-private/daemon/scheduler_fas_bpf.c` | 同上，FAS 调度探针与 kprobe 同目录 |
| `/home/helloklf/scene-daemon/tracepoint_thread.c` | 作者（`helloklf`）在另一台 Linux 机上维护独立 `scene-daemon` 仓库 |

**结论（高置信）**：这三个 `.o` 跨**两个源码树 / 两个构建机**产出，最终都被打进 APK 的
`res/raw/`。`helloklf` / `omarea` 是 Scene 作者公开身份，属强证据。

> 与 daemon 二进制的关联：脱壳产物 `daemon.unpacked` 内硬编码了
> `scene7.omarea.com`（@0xc5732）与 `SCENE-DAEMON`（@0xc28d6），
> 与 `/home/helloklf/scene-daemon/` 仓库名、App 侧 `scene-daemon` 进程名一致。
> `scene7.omarea.com` 是否为 Go module path 未能从 buildinfo 确认（buildinfo 主模块为 `unknown`）。

---

## 2. 还原映射表（产物 ↔ 原始仓库/文件）

### 2.1 native 层（libnative-lib.so）

| 还原产物 | 原始二进制 | 原始仓库/文件（推断） | 还原度 |
|----------|-----------|----------------------|--------|
| `native/src/native-lib.cpp` | `lib/arm64-v8a/libnative-lib.so` | `vtools-private/app/.../native-lib.cpp`【推测，无路径泄露】 | 源码级 |
| `native/src/jni_utils.h` | （从 native-lib.cpp 拆出） | 同上 | 源码级 |
| `native/src/CMakeLists.txt` | — | 新建（构建工程化） | — |

### 2.2 eBPF 层（3 个对象）

| 还原产物（src） | 原始 .o | 原始源码路径（.BTF 泄露，确定） | 还原度 |
|----------------|---------|-------------------------------|--------|
| `bpf/src/kprobe_sys_execve.c` | `res/raw/kprobe_sys_execve.o` | `/mnt/d/Android/vtools-private/daemon/kprobe_sys_execve.c` | 源码级（~99%） |
| `bpf/src/scheduler_fas_bpf.c` | `res/raw/bpf_arm64_bpfel.o` | `/mnt/d/Android/vtools-private/daemon/scheduler_fas_bpf.c` | 源码级（~97%） |
| `bpf/src/tracepoint_thread.c` | `res/raw/tracepoint_thread.o` | `/home/helloklf/scene-daemon/tracepoint_thread.c` | 源码级·语义等价（~90%，非逐字节） |
| `bpf/src/bpf_common.h` | —（从 3 个 .o 提炼共享定义） | 两个仓库的公共头【推断】 | 源码级 |
| `bpf/Makefile` | — | 新建（构建工程化） | — |

### 2.3 daemon 层

| 还原产物 | 原始二进制 | 原始仓库/文件 | 还原度 |
|----------|-----------|--------------|--------|
| `prebuilt-binaries/daemon/unpack/daemon.unpacked` | `res/raw/daemon`（UPX-NRV2B 壳） | `/home/helloklf/scene-daemon/`（Go 工程）【推测】 | **架构级**（脱壳产物本身是成品二进制） |
| `prebuilt-binaries/daemon/unpack/daemon-modules.md` | — | 新建（模块架构还原） | 架构级 |
| `prebuilt-binaries/daemon/unpack/*.md`（attack/load-chain/qa…） | — | 脱壳取证记录 | 分析产物 |

### 2.4 成品（第三方 / 不还原）

| 产物 | 原始文件 | 处理方式 |
|------|---------|----------|
| `prebuilt-binaries/busybox/` | `assets/toolkit/busybox` | 成品（BusyBox v1.36.1，记录版本/来源） |
| `prebuilt-binaries/scripts/` | `res/raw/up`、`rish`、`up_adb_android12.sh` 等 | 源码级（shell/JSON 原文复制） |

---

## 3. 最终交付的源码目录架构

> 分层原则：**源码（可构建）与 分析/反汇编/报告 严格分离**，分析产物是证据而非源码，全部保留。

```
native/
├── ARCHITECTURE.md                     # ★ 本文件（源码架构总览）
├── README.md                           # native 层（libnative-lib.so）还原说明
│
├── src/                                # ── 源码层 ①：libnative-lib.so 的 C++ 源码 ──
│   ├── native-lib.cpp
│   ├── jni_utils.h
│   └── CMakeLists.txt
│
├── bpf/                                # ── 源码层 ②：eBPF 子系统 ──
│   ├── Makefile                        # ★ 新增：clang -target bpf 构建 3 个 .o
│   ├── src/                            #    ★ 还原 C 源码
│   │   ├── bpf_common.h
│   │   ├── kprobe_sys_execve.c
│   │   ├── scheduler_fas_bpf.c         #    → 产物 bpf_arm64_bpfel.o
│   │   └── tracepoint_thread.c
│   ├── kprobe_sys_execve.o             #    原始 .o（还原基准，勿覆盖）
│   ├── bpf_arm64_bpfel.o               #    原始 .o（还原基准，勿覆盖）
│   ├── tracepoint_thread.o             #    原始 .o（还原基准，勿覆盖）
│   ├── build/                          #    Makefile 构建输出（可删除）
│   ├── disasm/                         #    反汇编（证据）
│   ├── analysis/                       #    分析产物（BTF/symbols/relocs/验证报告）
│   └── README.md
│
├── disassembly/                        # 源码层 ① 的反汇编证据（full.asm 等）
├── docs/                               # native 层还原文档/置信度报告
│
└── prebuilt-binaries/                  # ── 预编译二进制（成品 / 架构级） ──
    ├── README.md
    ├── busybox/                        #    成品（第三方，记录来源）
    ├── scripts/                        #    源码层：shell/JSON 原文
    └── daemon/
        ├── analysis.md                 #    历史鉴定（结论已作废，留痕）
        ├── entropy-report.md
        ├── entry-disassembly.asm
        ├── strings-extract.txt
        └── unpack/                     #    ★ 脱壳产物 + 架构级还原
            ├── daemon.unpacked         #      脱壳后 Go 1.24.0 二进制（6.58MB）
            ├── daemon-modules.md       #      ★ 新增：模块架构还原
            ├── attack-report.md
            ├── load-chain.md
            ├── keystream-analysis.md
            ├── qa-validation-report.md
            └── tools/                  #      脱壳/重建工具链
```

---

## 4. 还原度分层

| 档位 | 定义 | 本目录对应产物 | 关键依据 |
|------|------|---------------|----------|
| **① 源码级** | 可读、可重新编译、可审计 | `native/src/**`（C++） | 反汇编 + rodata 交叉定位，逐指令还原 |
| | | `bpf/src/**`（eBPF C） | `.BTF` 内嵌源码 + 符号表 + maps 字节，指令流逐条一致（tracepoint 为语义等价） |
| | | `prebuilt-binaries/scripts/**`（shell/JSON） | 原文复制 |
| **② 架构级** | 功能模块/结构可还原，**不可**函数级还原 | `prebuilt-binaries/daemon/**`（Go daemon） | 字符串聚类 + ADRP/ADD 交叉引用；节头被剥、pclntab 缺失 |
| **③ 成品** | 第三方/上游产物，无需且无法还原源码 | `prebuilt-binaries/busybox/**` | BusyBox v1.36.1 上游开源 |

### 4.1 为什么 daemon 是「架构级」而非「源码级」

- **节头被壳剥离**（`e_shnum=0`）：`readelf -S` / `go tool nm` / `go tool objdump` 均不可用。
- **Go pclntab 关键符号缺失**：`_rt0_arm64_linux`、`runtime.rt0_go`、`runtime.mcall` 精确匹配 0 次，
  无法恢复函数名 / 包名 / 调用图。
- **但字符串常量完整**：12,447 条可提取字符串 + 37,763 条 ADRP 指令可交叉引用，
  足以做**功能模块聚类**（详见 `daemon-modules.md`）。
- **关键突破**：daemon 内 `ebpf:"sys_execve"` / `ebpf:"uretprobe_libgui"` 等 Go 结构体标签，
  与还原出的 3 个 eBPF C 源码的 map / program 名**逐名一致**，坐实了「daemon 加载这 3 个 .o」。

### 4.2 三档的依赖关系

```
源码级（eBPF C）──被加载──► 架构级（daemon Go）──被拉起──► 源码级（shell 脚本 up/powercfg.sh）
      ▲                          │
      └── struct tag 逐名对应 ───┘
源码级（C++ native-lib.so）────► Java 层（com.omarea.vtools SceneJNI）
成品（busybox）──────────────► shell 脚本（assets/toolkit 命令行）
```

---

## 5. 构建与验证入口

```bash
# eBPF：一键构建 3 个 .o（产物名与原始一致）
cd native/bpf && make            # → build/{kprobe_sys_execve,bpf_arm64_bpfel,tracepoint_thread}.o
make clean

# native 库：NDK 交叉编译
cmake -S native/src -B build/native \
      -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake \
      -DANDROID_ABI=arm64-v8a -DANDROID_PLATFORM=android-24
cmake --build build/native

# daemon：脱壳复现（需 QEMU，见 unpack/attack-report.md §8）
cd native/prebuilt-binaries/daemon/unpack && bash tools/run_unpack.sh
```

---

## 6. 诚实声明

1. **daemon 不声称已还原源码**：它只有「脱壳产物 + 架构级模块划分」，函数名/包名/源码均未恢复，
   也不会编造（`daemon-modules.md` 中模块名均为语义归纳，真实符号名原样标注）。
2. **路径泄露证据仅覆盖 3 个 eBPF 源文件**：`native-lib.cpp`、daemon 的 Go 源文件的原始路径
   **没有**在二进制中留下证据，其归属仓库为【推测】。
3. **分析产物 / 反汇编 / 报告一律保留**：它们是还原结论的证据链，与源码分层存放，不随工程化删除。
4. **还原度如实分档**：`kprobe_sys_execve.c` / `scheduler_fas_bpf.c` 为「指令流逐条一致」的源码级还原；
   `tracepoint_thread.c` 为「语义等价、非逐字节」的源码级还原；daemon 为架构级；busybox 为成品。
