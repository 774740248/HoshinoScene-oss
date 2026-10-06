package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r90 extends a.c {
    public static final android.os.Parcelable.Creator<a.r90> CREATOR = new a.ig1(4);
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public r90(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
