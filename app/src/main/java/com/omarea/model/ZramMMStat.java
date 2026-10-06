package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ZramMMStat {
    private boolean abnormal;
    private java.lang.String origDataSize = "";
    private java.lang.String comprDataSize = "";
    private java.lang.String memUsed = "";
    private java.lang.String memLimit = "";
    private java.lang.String memUsedMax = "";

    public final boolean getAbnormal() {
        return this.abnormal;
    }

    public final java.lang.String getComprDataSize() {
        return this.comprDataSize;
    }

    public final java.lang.String getMemLimit() {
        return this.memLimit;
    }

    public final java.lang.String getMemUsed() {
        return this.memUsed;
    }

    public final java.lang.String getMemUsedMax() {
        return this.memUsedMax;
    }

    public final java.lang.String getOrigDataSize() {
        return this.origDataSize;
    }

    public final void setAbnormal(boolean z) {
        this.abnormal = z;
    }

    public final void setComprDataSize(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.comprDataSize = str;
    }

    public final void setMemLimit(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.memLimit = str;
    }

    public final void setMemUsed(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.memUsed = str;
    }

    public final void setMemUsedMax(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.memUsedMax = str;
    }

    public final void setOrigDataSize(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.origDataSize = str;
    }
}
