package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class NodeInfoBase implements java.io.Serializable {
    private final java.lang.String currentPageConfigPath;
    private java.lang.String desc;
    private java.lang.String descSh;
    private final java.lang.String index;
    private java.lang.String key;
    private final java.lang.String pageConfigDir;
    private java.lang.String summary;
    private java.lang.String summarySh;
    private java.lang.String title;

    public NodeInfoBase(java.lang.String str) {
        java.lang.String str2;
        a.wv.w(str, "currentPageConfigPath");
        this.currentPageConfigPath = str;
        if (str.length() > 0) {
            str2 = new java.io.File(str).getParent();
            a.wv.v(str2, "dir");
            if (a.yi1.B2(str2, "file:/android_asset/")) {
                java.lang.String substring = str2.substring(20);
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                str2 = "file:///android_asset/".concat(substring);
            }
        } else {
            str2 = "";
        }
        this.pageConfigDir = str2;
        this.key = "";
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        a.wv.v(uuid, "randomUUID().toString()");
        this.index = uuid;
        this.title = "";
        this.desc = "";
        this.descSh = "";
        this.summary = "";
        this.summarySh = "";
    }

    public final java.lang.String getCurrentPageConfigPath() {
        return this.currentPageConfigPath;
    }

    public final java.lang.String getDesc() {
        return this.desc;
    }

    public final java.lang.String getDescSh() {
        return this.descSh;
    }

    public final java.lang.String getIndex() {
        return this.index;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getPageConfigDir() {
        return this.pageConfigDir;
    }

    public final java.lang.String getSummary() {
        return this.summary;
    }

    public final java.lang.String getSummarySh() {
        return this.summarySh;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setDesc(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.desc = str;
    }

    public final void setDescSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.descSh = str;
    }

    public final void setKey(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.key = str;
    }

    public final void setSummary(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.summary = str;
    }

    public final void setSummarySh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.summarySh = str;
    }

    public final void setTitle(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.title = str;
    }
}
