package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ClickableNode extends com.omarea.krscript.model.NodeInfoBase {
    private java.lang.Boolean allowShortcut;
    private java.lang.String iconPath;
    private java.lang.String lockShell;
    private boolean locked;
    private java.lang.String logoPath;
    private int maxSdkVersion;
    private int minSdkVersion;
    private int targetSdkVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentPageConfigPath");
        this.iconPath = "";
        this.logoPath = "";
        this.lockShell = "";
        this.maxSdkVersion = 100;
    }

    public final java.lang.Boolean getAllowShortcut() {
        return this.allowShortcut;
    }

    public final java.lang.String getIconPath() {
        return this.iconPath;
    }

    public final java.lang.String getLockShell() {
        return this.lockShell;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final java.lang.String getLogoPath() {
        return this.logoPath;
    }

    public final int getMaxSdkVersion() {
        return this.maxSdkVersion;
    }

    public final int getMinSdkVersion() {
        return this.minSdkVersion;
    }

    public final int getTargetSdkVersion() {
        return this.targetSdkVersion;
    }

    public final void setAllowShortcut(java.lang.Boolean bool) {
        this.allowShortcut = bool;
    }

    public final void setIconPath(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.iconPath = str;
    }

    public final void setLockShell(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.lockShell = str;
    }

    public final void setLocked(boolean z) {
        this.locked = z;
    }

    public final void setLogoPath(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.logoPath = str;
    }

    public final void setMaxSdkVersion(int i) {
        this.maxSdkVersion = i;
    }

    public final void setMinSdkVersion(int i) {
        this.minSdkVersion = i;
    }

    public final void setTargetSdkVersion(int i) {
        this.targetSdkVersion = i;
    }
}
