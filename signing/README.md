# 签名材料（Signing Material）

本目录公开存放「星野Scene」的**原始签名密钥与相关材料**，随源码一同纳入版本管理。

> ⚠️ **安全提示**：密钥与口令为**明文公开**，这是刻意为之（依据用户要求，便于完整复现与继续开发）。
> 若后续要将本项目用于**正式发布**，请务必改用新的密钥并妥善保管 —— 泄露的密钥可被他人用于伪造签名。

---

## 1. 文件清单

| 文件 | 大小 | 说明 |
|------|-----:|------|
| `星野oss.jks` | 2266 B | **原始签名密钥库**（从 APK 解包产物 `original/星野oss.jks` 原样提取，MD5 未变） |
| `星野oss.txt` | 122 B | 原始密钥说明文本（证书名称 / 文件名 / 口令 / 别名 / 别名口令） |
| `hoshino.jks` | 2266 B | 与 `星野oss.jks` **字节完全相同**（MD5 一致），工程实际引用此名 |
| `signature.data` | 4096 B | 原始签名数据（APK 签名信息） |
| `AndroidManifest.original.xml` | 26044 B | 原始 Manifest 副本（未清理版，供对照） |

---

## 2. 密钥信息（明文公开）

```
证书名称：星野oss
证书文件：星野oss.jks
密码：pass1234
别名：HoshinoSCENEOPPO
别名密码：pass1234
```

| 项目 | 值 |
|------|-----|
| 密钥库类型 | JKS |
| 别名（keyAlias） | `HoshinoSCENEOPPO`（`keytool` 显示为小写 `hoshinosceneoppo`） |
| 密钥库口令 | `pass1234` |
| 别名口令 | `pass1234` |
| 条目创建日期 | 2026-10-04 |
| 证书指纹 SHA-256 | `67:A5:EA:89:BA:E9:17:CD:0D:44:2F:6A:38:AD:0A:09:2E:03:32:30:0B:B2:9E:35:D8:3F:EF:4D:5E:C8:DF:CC` |

---

## 3. 工程中的引用位置

`app/build.gradle` 的 `signingConfigs` 已同时用于 `release` 与 `debug`：

```groovy
signingConfigs {
    release {
        storeFile file('keystore/hoshino.jks')   // 即 app/keystore/hoshino.jks
        storePassword 'pass1234'
        keyAlias 'HoshinoSCENEOPPO'
        keyPassword 'pass1234'
        v1SigningEnabled true
        v2SigningEnabled true
    }
    debug {
        storeFile file('keystore/hoshino.jks')
        storePassword 'pass1234'
        keyAlias 'HoshinoSCENEOPPO'
        keyPassword 'pass1234'
        v1SigningEnabled true
        v2SigningEnabled true
    }
}
```

实际打包使用的密钥位于 `app/keystore/hoshino.jks`（与本目录 `hoshino.jks` 为同一文件）。

---

## 4. 校验方式

```bash
# 查看密钥库内容
keytool -list -keystore signing/星野oss.jks -storepass pass1234

# 校验三份副本是否为同一密钥
md5sum signing/星野oss.jks signing/hoshino.jks app/keystore/hoshino.jks
# 预期输出（三者相同）：
# 41999b923affacf7f06fc862a9a3d426  signing/星野oss.jks
# 41999b923affacf7f06fc862a9a3d426  signing/hoshino.jks
# 41999b923affacf7f06fc862a9a3d426  app/keystore/hoshino.jks
```

---

## 5. 还原说明

- 本目录材料**逐字节来自 APK 解包产物** `星野scene/original/`，未做任何转换或重新生成。
- `.jks` 使用 JKS 专有格式（`keytool` 会提示迁移到 PKCS12）。**请勿转换** —— 转换会改变密钥库文件字节，虽然密钥本身仍可用，但将无法与原始产物做字节级比对。
- `signature.data` 为原始 APK 签名数据，保留供比对 APK 签名一致性使用。
