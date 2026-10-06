package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ExchangeResponse implements java.io.Serializable {
    private boolean activated;
    private boolean exchanged;
    private boolean found;
    private int number;
    private int used;
    private java.lang.String devices = "";
    private java.lang.String error = "";
    private java.lang.String deviceCode = "";
    private java.lang.String sign = "";
    private java.lang.String sign2 = "";
    private java.lang.String detail = "";

    public final boolean getActivated() {
        return this.activated;
    }

    public final java.lang.String getCodeStr() {
        if (this.deviceCode.length() <= 0 || this.sign.length() <= 0) {
            return "";
        }
        if (this.sign2.length() <= 0) {
            return a.ii1.f(this.deviceCode, "|", this.sign);
        }
        return this.deviceCode + "|" + this.sign + "|" + this.sign2;
    }

    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final java.lang.String getDeviceCode() {
        return this.deviceCode;
    }

    public final java.lang.String getDevices() {
        return this.devices;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final boolean getExchanged() {
        return this.exchanged;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final int getNumber() {
        return this.number;
    }

    public final java.lang.String getSign() {
        return this.sign;
    }

    public final java.lang.String getSign2() {
        return this.sign2;
    }

    public final int getUsed() {
        return this.used;
    }

    public final void setActivated(boolean z) {
        this.activated = z;
    }

    public final void setDetail(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detail = str;
    }

    public final void setDeviceCode(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.deviceCode = str;
    }

    public final void setDevices(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.devices = str;
    }

    public final void setError(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.error = str;
    }

    public final void setExchanged(boolean z) {
        this.exchanged = z;
    }

    public final void setFound(boolean z) {
        this.found = z;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setSign(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.sign = str;
    }

    public final void setSign2(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.sign2 = str;
    }

    public final void setUsed(int i) {
        this.used = i;
    }
}
