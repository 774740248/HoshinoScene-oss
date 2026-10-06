package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class AccountPoints implements java.io.Serializable {
    private java.lang.String device_id;
    private int integral;
    private java.lang.String remark = "";
    private java.lang.String serial_id;
    private java.lang.String serial_no;
    private long time;

    public final java.lang.String getDevice_id() {
        return this.device_id;
    }

    public final int getIntegral() {
        return this.integral;
    }

    public final java.lang.String getRemark() {
        return this.remark;
    }

    public final java.lang.String getSerial_id() {
        return this.serial_id;
    }

    public final java.lang.String getSerial_no() {
        return this.serial_no;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setDevice_id(java.lang.String str) {
        this.device_id = str;
    }

    public final void setIntegral(int i) {
        this.integral = i;
    }

    public final void setRemark(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.remark = str;
    }

    public final void setSerial_id(java.lang.String str) {
        this.serial_id = str;
    }

    public final void setSerial_no(java.lang.String str) {
        this.serial_no = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
