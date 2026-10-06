package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PageMenuOption extends com.omarea.krscript.model.RunnableNode {
    private boolean isFab;
    private java.lang.String mime;
    private java.lang.String suffix;
    private java.lang.String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageMenuOption(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
        this.type = "";
        this.mime = "";
        this.suffix = "";
    }

    public final java.lang.String getMime() {
        return this.mime;
    }

    public final java.lang.String getSuffix() {
        return this.suffix;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final boolean isFab() {
        return this.isFab;
    }

    public final void setFab(boolean z) {
        this.isFab = z;
    }

    public final void setMime(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.mime = str;
    }

    public final void setSuffix(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.suffix = str;
    }

    public final void setType(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.type = str;
    }
}
