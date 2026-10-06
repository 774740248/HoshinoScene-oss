package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fm1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.fm1> CREATOR = new a.me(20);
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fm1(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.d = readInt;
        this.e = readInt2;
        this.f = readInt3;
        this.c = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.fm1)) {
            return false;
        }
        a.fm1 fm1Var = (a.fm1) obj;
        return this.d == fm1Var.d && this.e == fm1Var.e && this.c == fm1Var.c && this.f == fm1Var.f;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.c);
    }
}
