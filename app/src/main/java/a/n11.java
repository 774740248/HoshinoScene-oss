package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n11 implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.n11> CREATOR = new a.me(19);
    public final java.util.Calendar c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public java.lang.String i;

    public n11(java.util.Calendar calendar) {
        calendar.set(5, 1);
        java.util.Calendar b = a.so1.b(calendar);
        this.c = b;
        this.d = b.get(2);
        this.e = b.get(1);
        this.f = b.getMaximum(7);
        this.g = b.getActualMaximum(5);
        this.h = b.getTimeInMillis();
    }

    public static a.n11 r(int i, int i2) {
        java.util.Calendar d = a.so1.d(null);
        d.set(1, i);
        d.set(2, i2);
        return new a.n11(d);
    }

    public static a.n11 s(long j) {
        java.util.Calendar d = a.so1.d(null);
        d.setTimeInMillis(j);
        return new a.n11(d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.c.compareTo(((a.n11) obj).c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.n11)) {
            return false;
        }
        a.n11 n11Var = (a.n11) obj;
        return this.d == n11Var.d && this.e == n11Var.e;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e)});
    }

    public final java.lang.String t() {
        if (this.i == null) {
            this.i = a.so1.a("yMMMM", java.util.Locale.getDefault()).format(new java.util.Date(this.c.getTimeInMillis()));
        }
        return this.i;
    }

    public final int u(a.n11 n11Var) {
        if (!(this.c instanceof java.util.GregorianCalendar)) {
            throw new java.lang.IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (n11Var.d - this.d) + ((n11Var.e - this.e) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
    }
}
