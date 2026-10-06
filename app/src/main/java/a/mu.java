package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mu extends a.c {
    public static final android.os.Parcelable.Creator<a.mu> CREATOR = new a.ig1(9);
    public boolean e;

    public mu(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt() == 1;
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
