package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class LoginResponse implements java.io.Serializable {
    private boolean activated;
    private boolean pass;
    private java.lang.String error = "";
    private java.lang.String detail = "";

    public final boolean getActivated() {
        return this.activated;
    }

    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final boolean getPass() {
        return this.pass;
    }

    public final void setActivated(boolean z) {
        this.activated = z;
    }

    public final void setDetail(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detail = str;
    }

    public final void setError(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.error = str;
    }

    public final void setPass(boolean z) {
        this.pass = z;
    }
}
