package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class AppInfo extends a.tg {
    public com.omarea.model.AppInfo.AppType appType;
    public java.lang.CharSequence desc;
    public java.lang.Boolean enabled;
    public int minSdkVersion;
    public java.lang.Boolean suspended;
    public int targetSdkVersion;
    public java.lang.Boolean updated;
    public int versionCode;
    public java.lang.String versionName;
    public java.lang.CharSequence stateTags = "";
    public java.lang.CharSequence path = "";
    public java.lang.CharSequence dir = "";

    /* loaded from: /tmp/jadx-10340276197810293799.dex */
    public enum AppType {
        UNKNOW,
        USER,
        SYSTEM,
        BACKUPFILE
    }

    public AppInfo() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.enabled = bool;
        this.suspended = bool;
        this.updated = bool;
        this.versionName = "";
        this.versionCode = 0;
        this.appType = com.omarea.model.AppInfo.AppType.UNKNOW;
    }

    public static com.omarea.model.AppInfo getItem() {
        return new com.omarea.model.AppInfo();
    }
}
