package com.omarea.vtools;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SceneJNI {

    public SceneJNI() {
    }

    static {
        java.lang.System.loadLibrary("native-lib");
    }

    public static final native java.util.HashMap<java.lang.String, java.lang.String> getVulkanDeviceInfoMap();

    public final native long getKernelPropLong(java.lang.String str);
}
