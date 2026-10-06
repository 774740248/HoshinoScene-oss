package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cm0 implements android.os.Parcelable {

    public cm0() {
    }

    public static final android.os.Parcelable.Creator<a.cm0> CREATOR = new a.me(6);
    public java.util.ArrayList c;
    public java.util.ArrayList d;
    public a.dq[] e;
    public int f;
    public java.lang.String g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.j);
    }
}
