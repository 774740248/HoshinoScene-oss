package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class MagiskModuleUnofficial extends a.d11 implements java.io.Serializable {
    private long uploadTime;
    private java.lang.String downloadUrl = "";
    private java.lang.String detailUrl = "";
    private java.lang.String detailContent = "";
    private java.lang.String uid = "";

    public final java.lang.String getDetailContent() {
        return this.detailContent;
    }

    public final java.lang.String getDetailUrl() {
        return this.detailUrl;
    }

    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final java.lang.String getUid() {
        return this.uid;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public final void setDetailContent(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detailContent = str;
    }

    public final void setDetailUrl(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detailUrl = str;
    }

    public final void setDownloadUrl(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setUid(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.uid = str;
    }

    public final void setUploadTime(long j) {
        this.uploadTime = j;
    }
}
