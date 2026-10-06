package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class AccountPointsResponse implements java.io.Serializable {
    private int consume;
    private int free;
    private int total;
    private boolean unbind;
    private java.lang.String error = "";
    private com.omarea.model.AccountPoints[] records = new com.omarea.model.AccountPoints[0];
    private java.lang.String detail = "";

    public final int getConsume() {
        return this.consume;
    }

    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final int getFree() {
        return this.free;
    }

    public final com.omarea.model.AccountPoints[] getRecords() {
        return this.records;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean getUnbind() {
        return this.unbind;
    }

    public final void setConsume(int i) {
        this.consume = i;
    }

    public final void setDetail(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.detail = str;
    }

    public final void setError(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.error = str;
    }

    public final void setFree(int i) {
        this.free = i;
    }

    public final void setRecords(com.omarea.model.AccountPoints[] accountPointsArr) {
        a.wv.w(accountPointsArr, "<set-?>");
        this.records = accountPointsArr;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public final void setUnbind(boolean z) {
        this.unbind = z;
    }
}
