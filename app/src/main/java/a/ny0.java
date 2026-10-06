package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ny0 extends a.c {
    public static final android.os.Parcelable.Creator<a.ny0> CREATOR = new a.ig1(8);
    public boolean e;

    public ny0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            a.ny0.class.getClassLoader();
        }
        this.e = parcel.readInt() == 1;
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
