package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xm1 extends a.c {
    public static final android.os.Parcelable.Creator<a.xm1> CREATOR = new a.ig1(1);
    public int e;
    public boolean f;

    public xm1(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
        this.f = parcel.readInt() != 0;
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
