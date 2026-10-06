package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ZramWriteBackStat {
    private int backReads;
    private int backWrites;
    private int backed;
    private java.lang.String backingDev = "";

    public final int getBackReads() {
        return this.backReads;
    }

    public final int getBackWrites() {
        return this.backWrites;
    }

    public final int getBacked() {
        return this.backed;
    }

    public final java.lang.String getBackingDev() {
        return this.backingDev;
    }

    public final void setBackReads(int i) {
        this.backReads = i;
    }

    public final void setBackWrites(int i) {
        this.backWrites = i;
    }

    public final void setBacked(int i) {
        this.backed = i;
    }

    public final void setBackingDev(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.backingDev = str;
    }
}
