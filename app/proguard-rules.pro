# proguard-rules.pro — 星野Scene 还原工程
# 还原工程不混淆（minifyEnabled=false），本文件仅作占位与必要保留规则。
# 若未来开启混淆，需保留以下条目以防运行时反射/ViewBinding 失效。

# ---- 自有入口与组件 ----
-keep class com.omarea.Scene { *; }
-keep class com.omarea.vtools.activities.** { *; }
-keep class com.omarea.vtools.services.** { *; }
-keep class com.omarea.vtools.**Provider { *; }
-keep class com.omarea.vtools.Receiver* { *; }
-keep class com.omarea.scene_mode.** { *; }

# ---- L2 黑盒依赖：a 包被自有代码 FQN 引用/继承，禁止混淆 ----
-keep class a.** { *; }
-dontwarn a.**

# ---- ViewBinding 生成的绑定类（保留字段名，对齐 a.d81 描述符）----
-keep class * implements androidx.viewbinding.ViewBinding { *; }

# ---- Native ----
-keepclasseswithmembernames class * {
    native <methods>;
}
-keep class com.omarea.vtools.SceneJNI { *; }

# ---- 数据模型（如被反射/序列化）----
-keep class com.omarea.model.** { *; }

# ---- 反编译产物中的 JADX 残留注解/告警不阻断构建 ----
-dontwarn javax.annotation.**
-dontwarn org.jetbrains.annotations.**
-dontwarn kotlin.**
