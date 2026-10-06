package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vv0 implements android.os.Parcelable {

    public vv0() {
    }

    public static final android.os.Parcelable.Creator<a.vv0> CREATOR = new a.me(8);
    public int c;
    public int d;
    public boolean e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
