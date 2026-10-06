package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cn0 implements android.os.Parcelable {

    public cn0() {
    }

    public static final android.os.Parcelable.Creator<a.cn0> CREATOR = new a.me(7);
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final android.os.Bundle l;
    public final boolean m;
    public final int n;
    public android.os.Bundle o;

    public cn0(a.gk0 gk0Var) {
        this.c = gk0Var.getClass().getName();
        this.d = gk0Var.h;
        this.e = gk0Var.p;
        this.f = gk0Var.y;
        this.g = gk0Var.z;
        this.h = gk0Var.A;
        this.i = gk0Var.D;
        this.j = gk0Var.o;
        this.k = gk0Var.C;
        this.l = gk0Var.i;
        this.m = gk0Var.B;
        this.n = gk0Var.P.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.d);
        sb.append(")}:");
        if (this.e) {
            sb.append(" fromLayout");
        }
        int i = this.g;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(i));
        }
        java.lang.String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.n);
    }

    public cn0(android.os.Parcel parcel) {
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readBundle();
        this.m = parcel.readInt() != 0;
        this.o = parcel.readBundle();
        this.n = parcel.readInt();
    }
}
