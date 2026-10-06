package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ns0 {
    public static final a.ns0 e = new a.ns0(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f391a;
    public final int b;
    public final int c;
    public final int d;

    public ns0(int i, int i2, int i3, int i4) {
        this.f391a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static a.ns0 a(a.ns0 ns0Var, a.ns0 ns0Var2) {
        return b(java.lang.Math.max(ns0Var.f391a, ns0Var2.f391a), java.lang.Math.max(ns0Var.b, ns0Var2.b), java.lang.Math.max(ns0Var.c, ns0Var2.c), java.lang.Math.max(ns0Var.d, ns0Var2.d));
    }

    public static a.ns0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new a.ns0(i, i2, i3, i4);
    }

    public static a.ns0 c(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final android.graphics.Insets d() {
        return a.ms0.a(this.f391a, this.b, this.c, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.ns0.class != obj.getClass()) {
            return false;
        }
        a.ns0 ns0Var = (a.ns0) obj;
        return this.d == ns0Var.d && this.f391a == ns0Var.f391a && this.c == ns0Var.c && this.b == ns0Var.b;
    }

    public final int hashCode() {
        return (((((this.f391a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.f391a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
