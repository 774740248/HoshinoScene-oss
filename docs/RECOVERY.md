# 星野Scene Gradle工程

> 类型：APK 交付工程
> 交付目录：`/workspace/hoshino-scene-recovered/`
> 还原依据：解包产物 + jadx 1.5.0 全量反编译
> 交付目标：**可编译、可继续维护的 Gradle 工程**（非逐字节源码复原）

---

## 1. 项目来源

未知来源<>
解包产物还原而来：

| 输入 | 说明 |
|------|------|
| `星野scene` APK 解包产物 | `res/`、`assets/`、`AndroidManifest.xml`、`lib/arm64-v8a/libnative-lib.so`、签名密钥 |
| jadx 1.5.0 反编译产物 | `decompiled/sources/`（`com.omarea` 自有代码 174 类 + `a` 混淆包 2555 类 + `androidx/`、`android/`） |

---

## 2. 还原方法（jadx 反编译流程）

```
APK  ──apktool 解包──▶  res/ · assets/ · AndroidManifest.xml · lib/ · *.jks
 APK  ──jadx 1.5.0──▶  decompiled/sources/
                            ├── com/omarea/**    174 .java   ← L1 自有源码（可读）
                            ├── a/**            2555 .java   ← L2 混淆依赖（黑盒）
                            ├── androidx/**       76 .java   ← 可用 Maven 替代
                            └── android/**         5 .java   ← 框架内部类实体
再经「工程骨架重建 + Manifest 清理 + R 映射 + 静态校验」形成本工程。
```

**关键命令（还原过程实际使用）**

```bash
# 1) 解包资源与 Manifest
apktool d -f -s 星野scene.apk -o SRC/星野scene

# 2) 反编译 dex → Java
jadx -d decompiled --show-bad-code --deobf 星野scene.apk

# 3) 工程重建（本工程已完成，命令见 §5）
gradle assembleDebug
```

---

## 3. 目录结构

```
hoshino-scene-recovered/
├── settings.gradle                      # 工程声明 + 仓库
├── build.gradle                         # 根脚本（AGP 8.13.0）
├── gradle.properties                    # AndroidX / R 开关 / JVM
├── local.properties                     # sdk.dir=/opt/android-sdk（不入库）
├── .gitignore
├── gradle/wrapper/
│   ├── gradle-wrapper.jar
│   └── gradle-wrapper.properties        # Gradle 8.13（AGP 8.13 匹配）
│
├── app/
│   ├── build.gradle                     # 模块脚本（compileSdk 36 / Java 17 / ViewBinding）
│   ├── proguard-rules.pro
│   ├── keystore/hoshino.jks             # 签名密钥（口令 pass1234）
│   └── src/main/
│       ├── AndroidManifest.xml          # 已清理（50 Activity / 7 Service / 5 Receiver / 4 Provider）
│       ├── java/
│       │   ├── com/omarea/**            # ★ L1 自有源码 174 .java
│       │   ├── a/**                     # ★ L2 混淆依赖 2554 .java（package a; 平铺）
│       │   ├── androidx/**              # 15 .java（R8 内部类，其余由 app/libs/*.jar 提供）
│       │   ├── com/google/android/material/**  # 15 .java（R8 内部类）
│       │   ├── de/robv/android/xposed/**       # 7 .java（Xposed API 编译期 stub）
│       │   └── android/**               # 5 .java
│       ├── res/                         # 1514 文件（layout 332 + drawable 738 + values 多语言）
│       └── assets/                      # 217 文件（kr-script / toolkit / dexopt）
│   ├── libs/*.jar                       # 45 个库 classes.jar（AAR 提取，规避资源冲突）
│   └── src/main/jniLibs/arm64-v8a/libnative-lib.so   # 运行基准（原样保留）
│
├── native/                              # ★ native 层逆向还原（本次新增）
│   ├── README.md                        # native 层还原说明
│   ├── src/
│   │   ├── native-lib.cpp               # ★ 还原的 C++ 源码（主交付物）
│   │   ├── jni_utils.h                  # jstringToChar 声明
│   │   └── CMakeLists.txt               # 可编译的 CMake 配置
│   ├── disassembly/                     # 反汇编产物
│   │   ├── full.asm                     # 完整反汇编
│   │   ├── getKernelPropLong.asm
│   │   ├── getVulkanDeviceInfoMap.asm
│   │   └── jstringToChar.asm
│   ├── prebuilt-binaries/               # ★ 预编译二进制鉴定（本次新增）
│   │   ├── busybox/
│   │   │   ├── analysis.md              # 版本/来源/工具链/applet/复现方式
│   │   │   └── applets.txt              # 69 个 applet 清单
│   │   ├── daemon/
│   │   │   ├── analysis.md              # ⚠️ 旧结论（已作废）
│   │   │   ├── entropy-report.md        # 熵值 + 段映射异常分析
│   │   │   ├── entry-disassembly.asm    # 入口 stub 反汇编
│   │   │   ├── strings-extract.txt      # strings -a 提取结果
│   │   │   └── unpack/                  # ★★ 脱壳产物（本次攻克）
│   │   │       ├── daemon.unpacked      # ★ 脱壳结果：Go 1.24.0 ELF（6.58MB）
│   │   │       ├── attack-report.md     # 总报告
│   │   │       ├── qa-validation-report.md  # ★ QA 独立复核
│   │   │       ├── load-chain.md        # 加载链还原
│   │   │       ├── keystream-analysis.md   # 加密假设否定
│   │   │       └── tools/               # nrv2b.py + run_unpack.sh 等
│   │   └── scripts/                     # ★ 已还原 shell 脚本源码（① 档）
│   │       ├── README.md                # 脚本清单与逐个功能说明
│   │       ├── res_raw/                 # res/raw 脚本文本
│   │       ├── res_raw_json/            # res/raw JSON 配置
│   │       └── assets_toolkit/          # assets/toolkit 脚本文本
│   └── docs/
│       ├── reverse-engineering-notes.md # 逆向过程与地址映射
│       ├── api-surface.md               # 导出/导入符号、依赖库清单
│       ├── confidence-report.md         # 逐函数还原置信度
│       └── validation-report.md         # 语法 + 符号对照验证报告
│
├── native/bpf/                          # ★★ eBPF 内核程序还原（本次补齐）
│   ├── README.md                        # 鉴定报告（三档结论 + 已确证/未能确证分开）
│   ├── kprobe_sys_execve.o              # 原始基准（MD5 同源于 res/raw）
│   ├── tracepoint_thread.o              # 原始基准
│   ├── bpf_arm64_bpfel.o                # 原始基准
│   ├── src/                             # ★ 还原的可编译 C 源码
│   │   ├── bpf_common.h                 # 共享 map/struct/宏定义
│   │   ├── kprobe_sys_execve.c          # ≈100% 逐字节等价
│   │   ├── scheduler_fas_bpf.c          # ≈100% 逐字节等价
│   │   └── tracepoint_thread.c          # ~95% 语义等价
│   ├── disasm/*.asm                     # llvm-objdump 反汇编
│   └── analysis/                        # 节头/符号/重定位/字符串/BTF + btf_dump.py
│       ├── validation-report.md         # 工程师自验证（含 R1 修复记录）
│       └── qa-validation-report.md      # ★ QA 独立复核（发现并修正 1 处功能缺陷）
│
├── signing/                             # ★ 签名/密钥资料（按项目作者要求公开入库）
│   ├── README.md                        # 公开说明：来源、口令、复现签名命令
│   ├── 星野oss.jks                      # 原始密钥库（原始文件名，2266 B）
│   ├── hoshino.jks                      # 同内容副本（与 app/keystore/ 一致）
│   ├── 星野oss.txt                      # 原始口令备注文件
│   ├── signature.data                   # 原始签名块（4096 B，META-INF 提取）
│   └── AndroidManifest.original.xml     # 未清理的原始 Manifest（对照用）
│
├── tools/                               # 还原辅助脚本（非业务代码）
│   ├── gen_r_map.py                     # public.xml → r-id-map.json
│   ├── apply_r_map.py                   # 数字 R → 具名 R（--dry-run / --apply）
│   ├── validate_project.py              # 静态完整性校验
│   ├── collect_a_refs.py                # a 包引用清单
│   ├── restore_androidx_internals.py    # 还原 R8 内部库类
│   ├── rewire_library_a_refs.py         # 重写库类中的 a.* 引用
│   ├── fix_jadx_type_inference.py       # 修复 jadx ?? 类型占位
│   ├── fix_bridge_methods.py            # 去除重复 bridge 方法
│   ├── fix_xposed_refs.py               # 修复 de.robv.* 被 a.de 遮蔽问题
│   ├── r-id-map.json                    # 8866 条映射（生成物）
│   └── r-name-map.json                  # 反向映射（生成物）
│
├── docs/
│   ├── REcovery-notes.md                # 还原过程记录
│   ├── validation-report.md             # 静态完整性校验报告
│   ├── r-resource-map.md                # R 资源映射表（人类可读）
│   └── obfuscation-dependency-list.md   # 混淆依赖清单
│
└── README.md
```

---

## 4. 还原程度分层说明

本项目严格区分三个还原层级，**不承诺 L2/L3 的可读性**：

### L1 — 完整还原层（可读、可维护）✅

| 内容 | 规模 | 还原方式 |
|------|------|----------|
| `com.omarea.*` 自有 Java | **174 .java** | jadx 产物直采，**类名/方法名/字段名完整保留** |
| `res/` 资源 | **1514 文件** | 原样迁移（layout 332、drawable 738、values 含 2139 条中文 strings） |
| `AndroidManifest.xml` | 已清理 | 组件 100% 保留，剔除反编译乱码 |
| `assets/` | **217 文件** | 原样迁移（kr-script shell 体系 / toolkit / dexopt） |
| **native `libnative-lib.so`** | **1 .so → 源码** | **已逆向还原 C++ 源码**（见 `native/`），3 个导出符号 + 13 个 HashMap 键全部还原 |
| **eBPF 内核程序 ×3** | **3 .o → 源码** | ★ **已逆向还原 C 源码**（见 `native/bpf/`），2 份逐字节等价 + 1 份语义等价，均可 `clang -target bpf` 编译 |
| **预编译二进制 & 脚本鉴定** | `daemon` + `busybox` + 脚本 | **已鉴定**（见 §4.5 / `native/prebuilt-binaries/`）：shell/JSON 脚本**已还原**；`busybox` 属第三方成品；`daemon` **加壳不可静态还原** |
| 构建脚本 | 重建 | 依据 Manifest / 依赖 / SDK 证据人工重建 Gradle 配置 |

> **L1 是本项目交付价值的全部所在**：它保证「代码找回来了、能跑、能改」。

### L2 — 依赖保留层（黑盒，可编译不可读）⚠️

| 内容 | 规模 | 处理方式 |
|------|------|----------|
| `a/**` R8 混淆类 | **2554 .java** | 源码形式整体保留，`package a;` 平铺，**禁止改名/挪位** |
| **R8 内部库类（`androidx`/`material`）** | **30 .java** | 由 `tools/restore_androidx_internals.py` 从反编译产物按需还原（公有 AAR 不含的 R8 重命名内部类，如 `androidx.recyclerview.widget.a` = obf. `RecyclerView.LayoutManager`），并用 `tools/rewire_library_a_refs.py` 重写其 `a.*` 引用 |
| 公有库类 | 由 `app/libs/*.jar` 提供 | 61 个反编译重复实现已删除，改用 AAR `classes.jar`（避免资源重复冲突） |
| `android/**` | 5 .java | 框架内部类实体保留 |

- `a` 包**无法区分原始第三方库**（Retrofit / OkHttp / Jetpack / 自研混合），只能作为
  一个不可读依赖块。后续若需升级/替换某库，成本极高。
- 被 `com.omarea` **继承**的黑盒基类（`a.p5 → a.ml → a.kk0 → androidx.ComponentActivity`）
  是 Activity 公共基类契约，属维护瓶颈。

### L3 — 不可还原项（明确不承诺）❌

见 `docs/REcovery-notes.md` §5。要点：原始包名/类名、代码注释、调试行号、
局部变量名、Kotlin 语言特征、Git 历史**不可还原**。
（注：native 源码已于本次补齐还原，见 `native/` 目录；仅少量位段语义标注为推测。）

此外，`res/raw/daemon`（自研壳 + 加密 payload）属**运行时才能脱壳**的目标，
**静态不可还原**（详见 §4.5 与 `native/prebuilt-binaries/daemon/`）。

---

## 4.5 预编译二进制与脚本（本次补齐）★

除 Java 层与 `libnative-lib.so` 外，APK 还包含两个**原生二进制**与一批**脚本**。
本次对它们做了**可还原性鉴定**，并**如实**区分三档结论。
详细报告见 `native/prebuilt-binaries/README.md` 及各子目录。

| 文件 | 类型 | 是否可还原 | 还原结论 |
|------|------|:----------:|----------|
| `res/raw/daemon` | ELF aarch64（UPX-NRV2B 自解压壳） | **是（已脱壳）** | **② 已脱壳 → Go 1.24.0 程序**：非加密，是 UPX-NRV2B 压缩壳（`memfd_create("upx")`+`unrv2b`）。脱壳产物 `native/prebuilt-binaries/daemon/unpack/daemon.unpacked`（6.58MB，合法 AArch64 Go 动态可执行）。功能 = Scene 特权守护进程（TCP `:8765`，含 eBPF/FAS 帧率引擎） |
| `assets/toolkit/busybox` | ELF aarch64 静态可执行 | **不需要** | **② 第三方成品**：**BusyBox v1.36.1**（NDK r25c，static，**69 applet**）；源码在上游，记录版本即可复现 |
| `res/raw/up` `rish` `up_adb_android12.sh` | shell 脚本 | **是** | **① 已还原**：daemon 启动保活 / Shizuku / ADB 模式 |
| `res/raw/change_mac_1` `_2` `install_apk` `install_image` `module_system_prop` | shell 脚本/文本 | **是** | **① 已还原**：MAC 修改 / 静默装 APK / 烧镜像 / prop 模板 |
| `res/raw/perf_*.json`(6) `static_ops*.json`(2) | JSON | **是** | **① 已还原**：性能调度参数模板 / AppOps 清单 |
| `assets/toolkit/binary_exist.sh` `item_exist.sh` `kr_install_busybox.sh` `pipe` `run` | shell 脚本 | **是** | **① 已还原**：探测 / busybox 安装 / daemon 管道 / 脚本派发 |

**三档结论**：

- **① 已还原源码** —— `libnative-lib.so`（逆向 C++）+ 全部 shell/JSON 脚本（文本即源码）+ 3 个 eBPF `.o`（→C 源码）
- **② 第三方/成品** —— `busybox`（记录版本即可复现）；`daemon` 已脱壳为 Go 1.24.0 程序（见 §4.7）
- **③ 不可静态还原** —— `sched_ext.o`（0 字节丢失）、`scene.json`（0 字节）

---

## 4.6 eBPF 内核程序还原（本次补齐）★★

除上述 3 个 ELF 外，APK 还含 **3 个 eBPF 目标文件**（`ELF 64-bit LSB relocatable, eBPF`）。
它们是 Scene 的**内核级追踪子系统**，此前遗漏，本次已**完整逆向还原为可编译 C 源码**。

**重大有利条件**：这 3 个 `.o` **未被 strip**，且因编译时带 `-g`，BTF 段内**内嵌了原始源码字符串**
（含函数体逐行代码、结构体字段、map 名），甚至保留了**原作者开发机路径**——因此还原度极高。

| 原始 `.o` | 还原源码 | 挂载点 | 功能 | 还原度 |
|-----------|----------|--------|------|:------:|
| `res/raw/kprobe_sys_execve.o` | `native/bpf/src/kprobe_sys_execve.c` | `kprobe/sys_execve` | **进程创建审计**：记录 execve 的 pid/tid/uid/comm 上报 | **≈100%**（逐字节等价）|
| `res/raw/bpf_arm64_bpfel.o` | `native/bpf/src/scheduler_fas_bpf.c` | `uretprobe/libgui` ×2 | **帧率感知调度（FAS）**：探 libgui 帧队列 pending 数 | **≈100%**（逐字节等价）|
| `res/raw/tracepoint_thread.o` | `native/bpf/src/tracepoint_thread.c` | `tracepoint/sched/sched_switch` | **线程运行时追踪**：统计/超时/突刺/运行中指数告警 | **~95%**（语义等价）|
| `res/raw/sched_ext.o` | — | — | sched_ext 调度器 | ❌ **0 字节**（内容已丢失）|

**还原验证（QA 独立复核）**：

| 项 | 结果 |
|----|------|
| 三份源码 `clang -target bpf -O2 -g` 编译 | ✅ 全部通过 |
| `maps` 段字节（9 个 map / 45 字段）与原始比对 | ✅ 全部逐一吻合 |
| `kprobe` / `scheduler` 指令流 | ✅ 逐条一致（25 / 48 insn，diff=0）|
| `tracepoint` 指令流 | ⚠️ 语义等价（7512 vs 7744，差异为尾块合并/寄存器重分配，无功能损失）|
| 常量反推（`SLOT_SYSTEM` 等 6 个） | ✅ 已修正 1 处错误（见下）|

**已修正的真实缺陷**：`SLOT_SYSTEM` 初版还原为 `0x80000000`（bit 31），QA 经反汇编证实原始为
**`0x100000000`（bit 32，`>>= 0x1f`）**——二者读写不同位、行为不同。已修正并复验（4 处 `>>= 0x1f`，0 处 `>>= 0x1e`）。

**原始路径泄露（证据保留）**：
```
/mnt/d/Android/vtools-private/daemon/kprobe_sys_execve.c
/mnt/d/Android/vtools-private/daemon/scheduler_fas_bpf.c
/home/helloklf/scene-daemon/tracepoint_thread.c
```
跨两台作者构建机；`helloklf` 为原作者标识。`kprobe` 的 license 段为非标准串 `JNKLMOP`，按原样保留。

> ⚠️ **诚实声明**：这三个 `.o` 的**运行时加载链路未能从 Java 层完全确证**（Java 侧零命中）。
> 已确证的是：`res/raw/` 下的 `.o` 与 `native/bpf/` 内基准 **MD5 同源**。
> 详见 `native/bpf/README.md`（严格区分「已确证 / 未能确证」）与 `native/bpf/analysis/qa-validation-report.md`。

---

## 4.7 daemon 脱壳（本次攻克）★★★

**此前（§4.5 旧结论）判定 `res/raw/daemon` 为「自研壳 + 全量加密、不可静态还原」，该结论已被推翻。**
经作者提示「当时就加密了一下，强度不高」后重新取证，真相是：**它根本没加密，只是加了个 UPX-NRV2B 压缩壳**。

| 项 | 旧结论（已作废） | 新结论（QA 已验证） |
|----|------------------|---------------------|
| 方案 | 自研壳 + 全量加密 | **UPX-NRV2B 自解压壳（压缩，非加密）** |
| 密钥 | 密钥不在文件内 | **无密码学密钥**（`memfd_create("upx")` + `unrv2b` 解压） |
| 能否还原 | 静态不可还原 | **✅ 已成功脱壳** |

**旧结论错在哪**：仅凭「熵 7.999884 ≈ 8.0」就判定"加密"。**这是关键推理错误** ——
**熵≈8.0 无法区分「压缩」与「加密」**（高质量压缩的输出同样接近随机）。
而文件里其实有**明文 ELF 头 + 明文 trailer `!@#$%T00…`**，本可直接反证"非加密"。

**脱壳产物**：

| 文件 | 说明 |
|------|------|
| `native/prebuilt-binaries/daemon/unpack/daemon.unpacked` | **脱壳产物**：6,580,688 B，合法 AArch64 **Go 1.24.0** 动态可执行，entry `0x2c46c0`，sha256 `b3ececf6…` |
| `unpack/attack-report.md` | 总报告（方案定性 / 加载链 / 产物校验） |
| `unpack/qa-validation-report.md` | ★ QA 独立复核（发现并促使修复 off-by-0x1000 错位） |
| `unpack/load-chain.md` | 加载链完整还原（`up`→stub→NRV2B→stage-1 loader→真实 daemon） |
| `unpack/keystream-analysis.md` | 线 C 统计检验（否定全部加密假设） |
| `unpack/tools/` | 可复现脚本（`nrv2b.py` 纯静态解压 + `run_unpack.sh` 一键脱壳） |

**真实 daemon 是什么**：一个 **Go 语言守护进程**（Scene 特权守护进程，TCP `:8765`），
功能含 eBPF 引擎（`bpf_arm64_bpfel.o` 正是它加载的）、FAS 帧率引擎（`fas_engine`/`currentFPS`）、
CPU/GPU 调频、cgroup 管理。关键串：`scene7.omarea.com`、`SCENE-DAEMON`、`/dev/scene`、
`com.omarea.vtools/files/scene-daemon`。

> **遗留（诚实声明）**：壳剥离了节头（`readelf -S`/`nm` 不可用）与 Go buildinfo 魔数，
> 属符号级信息缺失，**不影响代码/数据本身**——`daemon.unpacked` 可正常反汇编出完整 Go 运行时与业务逻辑。
> 真实 daemon 的 mode-14 自定义 range-coder 尚未纯静态化（stage-1 loader 已纯静态解出）。

---

## 5. 构建方法

### 5.1 环境要求

| 项 | 要求 |
|----|------|
| JDK | **17+**（AGP 8.13 要求；本环境为 JDK 20） |
| Android SDK | **platforms;android-36** + **build-tools;36.0.0** |
| Gradle | **8.13**（wrapper 已锁定；AGP 8.13 匹配） |
| AGP | **8.13.0** |

### 5.2 步骤

```bash
cd /workspace/hoshino-scene-recovered

# 1) 配置 SDK 路径（若未自动识别）
echo "sdk.dir=/opt/android-sdk" > local.properties

# 2) 构建 debug 包
./gradlew assembleDebug          # 或：gradle --offline assembleDebug

# 3) 产物位置
#    app/build/outputs/apk/debug/app-debug.apk
```

> 本环境已验证 `gradle -p . tasks` 配置阶段 **BUILD SUCCESSFUL**（AGP 成功加载）；
> 资源阶段（`mergeDebugResources` / `processDebugResources` / `dataBindingGenBaseClassesDebug`）
> 亦通过；`compileDebugJavaWithJavac` 因 R8 混淆还原缺口未通过。
> 完整实测结论见 `docs/validation-report.md` §7 与 `docs/REcovery-notes.md` §7。

### 5.3 R 映射（可选，P1）

```bash
python3 tools/gen_r_map.py            # 生成 r-id-map.json（8866 条）
python3 tools/apply_r_map.py --dry-run # 试运行查看可替换点
python3 tools/apply_r_map.py --apply   # 实际替换为 R.xxx（自动备份 .bak）
```

> 架构师结论：数字资源 ID 本身是合法 Java int，**不映射也能编译**，R 映射是
> P1 可读性优化，非 P0 阻塞项。

---

## 6. 签名信息（密钥已公开入库）

| 项 | 值 |
|----|----|
| 密钥库（工程引用） | `app/keystore/hoshino.jks` |
| 密钥库（原始公开副本） | `signing/星野oss.jks` |
| Key Alias | `HoshinoSCENEOPPO` |
| Store Password | `pass1234` |
| Key Password | `pass1234` |
| 签名算法 | v1 + v2 开启 |
| SHA-256 指纹 | `67:A5:EA:89:BA:E9:17:CD:0D:44:2F:6A:38:AD:0A:09:2E:03:32:30:0B:B2:9E:35:D8:3F:EF:4D:5E:C8:DF:CC` |

**密钥材料已随源码公开**（依据用户要求），完整公开于 `signing/` 目录：

| 文件 | 说明 |
|------|------|
| `signing/星野oss.jks` | 原始签名密钥库（逐字节来自 APK 解包产物） |
| `signing/hoshino.jks` | 同上的副本，工程实际引用名 |
| `signing/星野oss.txt` | 原始密钥说明文本 |
| `signing/signature.data` | 原始 APK 签名数据 |
| `signing/AndroidManifest.original.xml` | 原始 Manifest 副本（未清理版） |

三份 `.jks`（`signing/星野oss.jks`、`signing/hoshino.jks`、`app/keystore/hoshino.jks`）
**MD5 完全一致**（`41999b923affacf7f06fc862a9a3d426`），均为**原始密钥**，可复现与原 APK 相同的签名。

> `.gitignore` 已调整为**不再排除**签名材料，确保密钥随源码一同入库。
>
> ⚠️ **安全提示**：密钥与口令明文公开意味着任何人可伪造本应用签名。
> 若后续要正式发布，请**更换新密钥并妥善保管**。详见 `signing/README.md`。

---

## 7. 已知问题

1. **【P0，最重要】`assembleDebug` 未通过 `compileDebugJavaWithJavac`**（诚实记录，未伪造成功）。
   资源阶段（`mergeDebugResources` / `processDebugResources` / `dataBindingGenBaseClassesDebug`）
   **全部通过**，仅 Java 编译因 **R8 混淆 + jadx 还原缺口** 失败，稳定在约 **200 条**报错，
   全部集中在 L2 黑盒 `a/**`（尤以 `a/fa0.java` 64 条、`a/fs1.java` 50 条为甚）：
   - 94 条 `call to this must be first statement in constructor`
     （R8 把「按参数 switch 的内联构造器」合并，jadx 误还原为构造器体内的 `this(N)`）；
   - 58 条 `cannot find symbol`（缺失的被内联/匿名化合成类，如 `a.b31/a.v81/a.r1/a.r5/a.n40/a.lm/a.a80`，
     以及 jadx 丢失的局部变量 `r0`、`DateTimeView` 等）；
   - 12 条 `Enum is abstract`、10 条 `constructor cc1 cannot be applied`（jadx 丢失 R8 合成构造器）、
     若干泛型/类型不兼容。
   - **L1 自有代码（`com.omarea.*`）本体仅 2 处真实报错**，其余为生成绑定类，说明 L1 已基本健全。
   - 根因：缺少原始 R8 `mapping.txt`，无法把混淆名同构回原库/原类型。**属 PRD R1/R2 预测的顶层风险。**
2. **`a` 包 5 个文件含 `JADX ERROR`**（`a/q10.java`、`a/vk0.java`、`a/i70.java`、
   `a/ka0.java`、`a/ao0.java`）——jadx 对 R8 产物还原缺口，属 L2 黑盒。
3. **35 个 `a.XXX` 引用在 `a/` 目录下无对应文件**——多为 jadx 内联/匿名内部类还原缺口，
   或仅在字符串/注释中出现的伪引用（解析率 93.0%，463/498）。
4. **15 个库布局在 APK 资源还原中损坏为 `<x />`**（如 `custom_dialog.xml`、`m3_*`、`design_*`），
   已用 `tools:viewBindingIgnore` 占位并禁用 ViewBinding，属 L3 不可还原项。
5. **`minSdk=26` 为推断值**（U-1）——Manifest 无 `uses-sdk` 节点，依据 TileService（API 24+）、
   `FOREGROUND_SERVICE_SPECIAL_USE`（API 34）等证据推断，待运行期验证。
6. **`scene.json` 为 0 字节**——疑似运行时生成或丢失（R9）。
7. **native `libnative-lib.so` 已 stripped**——本次已通过 `llvm-objdump` 逆向还原出
   **完整 C++ 源码**（`native/src/native-lib.cpp`），3 个导出符号与全部 13 个 HashMap 键
   精确恢复；语法检查与符号对照均通过（`native/docs/validation-report.md`）。
   遗留少量**推测项**（如 conformanceVersion 分量语义）已在置信度报告中标注。
   `.so` 原文件保留于 `app/src/main/jniLibs/arm64-v8a/` 作为运行基准。
8. **`res` 实测 1514 < PRD 基线 1573**——差异为基线含 `original/` 副本与部分目录计数口径不同，
   核心资源（layout/drawable/values）完整。
9. **【已解决，本次攻克】`res/raw/daemon` 实为 UPX-NRV2B 自解压壳，非加密**——
   旧结论（自研壳+全量加密）**已作废**。经作者提示重新取证 + QA 独立验证，已**成功脱壳**
   为 Go 1.24.0 程序（`native/prebuilt-binaries/daemon/unpack/daemon.unpacked`，6.58MB）。
   详见 §4.7。旧报告 `native/prebuilt-binaries/daemon/analysis.md` 顶部已标注作废。
10. **`assets/toolkit/busybox` 为第三方成品（BusyBox 1.36.1）**——无需逆向，
    记录版本/工具链/69 applet 即可复现。详见 `native/prebuilt-binaries/busybox/analysis.md`。
11. **【已解决，本次补齐】3 个 eBPF 目标文件此前遗漏**——已完整还原 C 源码（`native/bpf/`）。
    `kprobe_sys_execve.c` 与 `scheduler_fas_bpf.c` **逐字节等价**，`tracepoint_thread.c` **语义等价**
    （7512 vs 7744 指令，差异为尾块合并，无功能损失）。还原过程中由 QA 发现并修正 1 处真实功能缺陷
    （`SLOT_SYSTEM` 应为 `0x100000000`/bit 32，初版误作 `0x80000000`/bit 31）。
12. **`res/raw/sched_ext.o` 为 0 字节**——sched_ext 调度器 BPF 对象，**内容已丢失**，
    无法还原（与 `scene.json` 同类的缺失项）。
13. **eBPF 三个 `.o` 的运行时加载链路未能从 Java 层完全确证**——Java 侧零命中（daemon 加壳、payload 密文）。
    已确证的仅：`res/raw/*.o` 与 `native/bpf/` 基准 **MD5 同源**。详见 `native/bpf/README.md`。
14. **全工程原生 ELF 经扫描共 6 个**（`libnative-lib.so` / `daemon` / `busybox` / 3 个 `.o`），
    经 `file` 全量扫描确认**无第 7 个被遗漏的原生二进制**。

---

## 8. 文档索引

| 文档 | 内容 |
|------|------|
| `docs/REcovery-notes.md` | 还原过程记录、jadx 命令、混淆依赖与 R 映射说明 |
| `docs/validation-report.md` | 静态完整性校验结果（计数 / 组件 / 引用解析率） |
| `docs/r-resource-map.md` | 8866 条 R 资源 ID ↔ 具名常量映射 |
| `docs/obfuscation-dependency-list.md` | `a` 包被引用清单与解析情况 |
| `native/prebuilt-binaries/README.md` | **预编译二进制与脚本鉴定总览（三档结论）** |
| `native/prebuilt-binaries/busybox/analysis.md` | busybox 版本/来源/复现 |
| `native/prebuilt-binaries/daemon/analysis.md` | ⚠️ 旧结论（已作废，见顶部标注） |
| `native/prebuilt-binaries/daemon/unpack/attack-report.md` | ★ **daemon 脱壳总报告（UPX-NRV2B，非加密）** |
| `native/prebuilt-binaries/daemon/unpack/qa-validation-report.md` | ★ **QA 独立复核（发现并促使修复 off-by-0x1000 错位）** |
| `native/prebuilt-binaries/daemon/unpack/load-chain.md` | 加载链完整还原 |
| `native/prebuilt-binaries/daemon/unpack/daemon-modules.md` | ★ **daemon 功能模块架构还原（13 模块 + Mermaid 图）** |
| `native/ARCHITECTURE.md` | ★ **源码架构总览（原始多仓库推断 + 还原映射 + 目录架构）** |
| `native/prebuilt-binaries/scripts/README.md` | 已还原 shell 脚本清单与说明 |
| `native/bpf/README.md` | ★ **eBPF 内核程序还原鉴定（3 份 C 源码 + 功能说明）** |
| `native/bpf/analysis/qa-validation-report.md` | ★ **QA 独立复核报告（发现 `SLOT_SYSTEM` 功能缺陷）** |
| `signing/README.md` | **签名/密钥公开说明（口令、来源、复现签名命令）** |

---

*本工程为「功能等价 + 自有代码可维护」的还原交付，非逐字节源码复原。*
