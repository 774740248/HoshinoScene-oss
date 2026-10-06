#!/usr/bin/env bash
# =============================================================================
# build_obf_classes.sh — 混淆层 (a/ + lib 内联类) smali → jar 重建脚本
# -----------------------------------------------------------------------------
# 背景：本还原工程的 `a/**`（2561+ 混淆类）与少量 androidx/material 内联类
#       属于「反编译产物」，其 Java 源存在大量 javac 无法消化的语义缺陷
#       （类型推断失败、合成方法、protected 访问等），且属长尾，逐文件修复
#       边际收益极低。
#
# 方案（混合构建 X）：
#   1. 直接以 smali 字节码参与构建（smali 是反编译的真值来源，零语义损失）；
#   2. apktool(smali 3.x 汇编器) 把 smali 树汇编成 classes.dex；
#   3. dex2jar 把 classes.dex 翻译成含真实字节码的 jar；
#   4. 该 jar 既作为 javac 的 classpath（符号解析），又作为 AGP 依赖
#      （AGP 会把 jar 内 class 打入最终 APK 的 dex）。
#
# 依赖（离线环境已就绪，缺失时脚本会给出指引）：
#   - apktool 2.9.3        : /tmp/apktool.jar（内含 smali 汇编器）
#   - dex2jar 2.4 (dex-tools): /tmp/dex-tools-ext/dex-tools-v2.4
#   - smali 树             : /tmp/build-src/smali
#
# 用法：tools/build_obf_classes.sh [--smali-dir DIR] [--out JAR]
# =============================================================================
set -euo pipefail

PROJ_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SMALI_SRC="${SMALI_SRC:-/tmp/build-src/smali}"
APKTOOL_JAR="${APKTOOL_JAR:-/tmp/apktool.jar}"
DEX2JAR="${DEX2JAR:-/tmp/dex-tools-ext/dex-tools-v2.4/d2j-dex2jar.sh}"
OUT_JAR="${OUT_JAR:-$PROJ_ROOT/app/libs/a-classes.jar}"
WORK_DIR="${WORK_DIR:-/tmp/hybrid-build}"
# 参与「字节码注入」的包：a/（混淆实体）+ android/androidx/com.google 的内联类
# （这些类在公开 AAR 中不存在，仅存在于反编译产物中）
INCLUDE_PKGS="${INCLUDE_PKGS:-a android androidx com/google}"

log() { echo "[build_obf_classes] $*"; }

for f in "$SMALI_SRC" "$APKTOOL_JAR" "$DEX2JAR"; do
    if [ ! -e "$f" ]; then
        echo "ERROR: 缺少依赖：$f" >&2
        exit 1
    fi
done

log "清理工作目录 $WORK_DIR"
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR/smali"

log "拷贝 smali 包：$INCLUDE_PKGS"
for pkg in $INCLUDE_PKGS; do
    src="$SMALI_SRC/$pkg"
    if [ -d "$src" ]; then
        mkdir -p "$WORK_DIR/smali/$(dirname "$pkg")"
        cp -r "$src" "$WORK_DIR/smali/$pkg"
    else
        log "  skip 缺失包：$pkg"
    fi
done

# apktool 需要的极小工程脚手架
cat > "$WORK_DIR/apktool.yml" <<'EOF'
version: 2.9.3
apkFileName: obf.apk
isFrameworkApk: false
usesFramework:
  ids:
  - 1
sdkInfo:
  minSdkVersion: '26'
  targetSdkVersion: '36'
EOF
cat > "$WORK_DIR/AndroidManifest.xml" <<'EOF'
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.omarea.hybrid.obf" android:versionCode="1" android:versionName="1.0" />
EOF

log "smali → dex（apktool / smali 3.x）"
java -jar "$APKTOOL_JAR" b "$WORK_DIR" -o "$WORK_DIR/obf.apk" --use-aapt2

log "解出 classes.dex"
rm -f "$WORK_DIR/classes.dex"
unzip -o -q "$WORK_DIR/obf.apk" classes.dex -d "$WORK_DIR"

log "dex → jar（dex2jar 2.4）"
JAVA_OPTS="-Xmx4g" bash "$DEX2JAR" "$WORK_DIR/classes.dex" -o "$OUT_JAR" --force

cls_count="$(unzip -l "$OUT_JAR" | grep -cE '\.class$' || true)"
log "完成：$OUT_JAR（${cls_count} 个 class）"
