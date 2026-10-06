package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class PowerStatRecord {
    public int capacity;
    public boolean charging;
    public long endTime;
    public boolean fuzzy;
    public long io;
    public java.lang.String packageName;
    public boolean screenOn;
    public long startTime;

    public java.lang.String toString() {
        return "PowerHistory{io=" + this.io + ", capacity=" + this.capacity + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", screenOn=" + this.screenOn + ", charging=" + this.charging + ", packageName=" + this.packageName + '}';
    }
}
