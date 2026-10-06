package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xl0 implements android.os.Parcelable {

    public xl0() {
    }

    public static final android.os.Parcelable.Creator<a.xl0> CREATOR = new a.me(5);
    public java.lang.String c;
    public int d;

    public xl0(java.lang.String str, int i) {
        this.c = str;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }
}
