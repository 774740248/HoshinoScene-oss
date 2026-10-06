package com.google.android.material.appbar;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e implements android.os.Parcelable.ClassLoaderCreator {

    public e() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new com.google.android.material.appbar.f(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.google.android.material.appbar.f[i];
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.material.appbar.f(parcel, null);
    }
}
