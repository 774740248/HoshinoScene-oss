package com.google.android.material.appbar;
import a.c;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f extends c {

    public f() {
        this(null, false);
    }
    public static final android.os.Parcelable.Creator<com.google.android.material.appbar.f> CREATOR = new android.os.Parcelable.Creator();
    public boolean e;
    public boolean f;
    public int g;
    public float h;
    public boolean i;

    public f(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readByte() != 0;
    }

    @Override // c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
    }
}
