package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ps implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.ps> CREATOR = new a.me(17);
    public final a.n11 c;
    public final a.n11 d;
    public final a.os e;
    public final a.n11 f;
    public final int g;
    public final int h;
    public final int i;

    public ps(a.n11 n11Var, a.n11 n11Var2, a.os osVar, a.n11 n11Var3, int i) {
        java.util.Objects.requireNonNull(n11Var, "start cannot be null");
        java.util.Objects.requireNonNull(n11Var2, "end cannot be null");
        java.util.Objects.requireNonNull(osVar, "validator cannot be null");
        this.c = n11Var;
        this.d = n11Var2;
        this.f = n11Var3;
        this.g = i;
        this.e = osVar;
        if (n11Var3 != null && n11Var.c.compareTo(n11Var3.c) > 0) {
            throw new java.lang.IllegalArgumentException("start Month cannot be after current Month");
        }
        if (n11Var3 != null && n11Var3.c.compareTo(n11Var2.c) > 0) {
            throw new java.lang.IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > a.so1.d(null).getMaximum(7)) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.i = n11Var.u(n11Var2) + 1;
        this.h = (n11Var2.e - n11Var.e) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.ps)) {
            return false;
        }
        a.ps psVar = (a.ps) obj;
        return this.c.equals(psVar.c) && this.d.equals(psVar.d) && a.x21.a(this.f, psVar.f) && this.g == psVar.g && this.e.equals(psVar.e);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.c, this.d, this.f, java.lang.Integer.valueOf(this.g), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.g);
    }
}
