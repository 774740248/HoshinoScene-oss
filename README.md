# 星野Scene (HoshinoScene)

> 专业的安卓性能调度工具 🎛️

**星野Scene** 是一款专业的安卓性能调度工具，深度适配 **高通骁龙** 与 **联发科天玑** 处理器。提供 **CPU/GPU 调频、温控管理、帧率监控** 等核心功能，让性能尽在掌控。

---

## ✨ 功能特性

| 功能 | 说明 |
|------|------|
| ⚡ CPU/GPU 调频 | 频率、调速器、核心在线控制，性能模式一键切换 |
| 🌡️ 温控管理 | 温度监控与热限频策略，性能与功耗平衡 |
| 📊 帧率监控 | 实时 FPS 统计，配合性能曲线定位卡顿 |
| 🔧 深度适配 | 高通骁龙 / 联发科天玑平台专项适配 |

## 📦 最新产物

最新版本 APK 已随仓库发布，见 **[Releases](../../releases)** 页面下载：

- `星野SCENEN1A12.apk`（`release/` 目录内同步归档）
- 最新 Release：**v1.1-N1A12** · 包名：`com.omarea.vtools`（versionCode 1）
- 架构：arm64-v8a · 最低支持：Android 8.0（minSdk 26）· targetSdk 36

## 🛠️ 从源码构建

### 环境要求

- **JDK 17**
- **Android SDK**（compileSdk 36，可在 `local.properties` 中配置 `sdk.dir`）
- Gradle 8.13（已内置 `gradle/wrapper`）· AGP 8.13.0

### 构建步骤

```bash
# Debug 构建
./gradlew assembleDebug

# Release 构建（使用工程内置签名）
./gradlew assembleRelease
```

> ⚠️ 若网络环境不佳，`settings.gradle` 已预置腾讯云 Maven 镜像，可自动加速依赖拉取。

## 📁 目录结构

```
HoshinoScene/
├── app/                    # 主模块（compileSdk 36 / Java 17 / ViewBinding）
│   ├── keystore/           # 工程签名密钥 hoshino.jks
│   ├── libs/               # 本地依赖库
│   └── src/main/           # 源码 / 资源 / assets / jniLibs
├── native/                 # Native 层（BPF / disassembly / prebuilt）
├── signing/                # 原始签名材料与说明
├── tools/                  # 辅助工具脚本
├── docs/                   # 工程还原说明（RECOVERY.md）
└── release/                # 版本产物归档
```

## 🔐 签名说明

本工程为开源分发，签名密钥依据发布策略**随源码公开**（`signing/` 与 `app/keystore/`，口令见 `app/build.gradle`）。生产环境请务必替换为自己的密钥。

## ⚠️ 免责声明

1. 本工具涉及系统级性能调度，**需要 Root 权限**，不当使用可能导致设备过热、耗电异常甚至硬件损伤；
2. 本项目仅供**学习交流**使用，请于下载后 24 小时内自行评估是否保留；
3. 使用本软件产生的任何后果由使用者自行承担，作者不承担任何责任。

## 📄 开源许可

本项目基于 [MIT License](LICENSE) 开源发布。

---

⭐ 如果这个项目对你有帮助，欢迎点个 Star 支持喵～
