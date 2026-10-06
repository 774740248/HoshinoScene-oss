package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tc0 extends a.c {
    public static final android.os.Parcelable.Creator<a.tc0> CREATOR = new a.ig1(11);
    public final a.rh1 e;

    public tc0(android.os.Parcelable parcelable) {
        super(parcelable);
        this.e = new a.rh1();
    }

    public final java.lang.String toString() {
        return "ExtendableSavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " states=" + this.e + "}";
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        a.rh1 rh1Var = this.e;
        int i2 = rh1Var.e;
        parcel.writeInt(i2);
        java.lang.String[] strArr = new java.lang.String[i2];
        android.os.Bundle[] bundleArr = new android.os.Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (java.lang.String) rh1Var.h(i3);
            bundleArr[i3] = (android.os.Bundle) rh1Var.j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public tc0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        java.lang.String[] strArr = new java.lang.String[readInt];
        parcel.readStringArray(strArr);
        android.os.Bundle[] bundleArr = new android.os.Bundle[readInt];
        parcel.readTypedArray(bundleArr, android.os.Bundle.CREATOR);
        this.e = new a.rh1(readInt);
        for (int i = 0; i < readInt; i++) {
            this.e.put(strArr[i], bundleArr[i]);
        }
    }
}
