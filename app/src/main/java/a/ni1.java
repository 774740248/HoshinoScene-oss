package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ni1 implements android.os.Parcelable {

    public ni1() {
    }

    public static final android.os.Parcelable.Creator<a.ni1> CREATOR = new a.me(10);
    public int c;
    public int d;
    public int e;
    public int[] f;
    public int g;
    public int[] h;
    public java.util.List i;
    public boolean j;
    public boolean k;
    public boolean l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.g);
        if (this.g > 0) {
            parcel.writeIntArray(this.h);
        }
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeList(this.i);
    }
}
