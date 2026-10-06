package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivationCodeResponse implements java.io.Serializable {
    private boolean expired;
    private long expiry_time;
    private boolean pass;
    private java.lang.String error = "";
    private java.lang.String code = "";
    private java.lang.String sign = "";
    private java.lang.String sign2 = "";
    private java.lang.String type = "";
    private java.lang.String detail = "";
    private java.lang.String account = "";

    public final java.lang.String getAccount() {
        return this.account;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getCodeStr() {
        if (this.sign2.length() <= 0) {
            return a.ii1.f(this.code, "|", this.sign);
        }
        return this.code + "|" + this.sign + "|" + this.sign2;
    }

    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    public final long getExpiry_time() {
        return this.expiry_time;
    }

    public final boolean getPass() {
        return this.pass;
    }

    public final java.lang.String getSign() {
        return this.sign;
    }

    public final java.lang.String getSign2() {
        return this.sign2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final void setAccount(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.account = str;
    }

    public final void setCode(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.code = str;
    }

    public final void setDetail(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detail = str;
    }

    public final void setError(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.error = str;
    }

    public final void setExpired(boolean z) {
        this.expired = z;
    }

    public final void setExpiry_time(long j) {
        this.expiry_time = j;
    }

    public final void setPass(boolean z) {
        this.pass = z;
    }

    public final void setSign(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.sign = str;
    }

    public final void setSign2(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.sign2 = str;
    }

    public final void setType(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.type = str;
    }
}
