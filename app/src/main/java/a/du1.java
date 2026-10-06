package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class du1 {
    public static final a.du1 b;

    /* renamed from: a, reason: collision with root package name */
    public final a.au1 f107a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            b = a.zt1.q;
        } else {
            b = a.au1.b;
        }
    }

    public du1(android.view.WindowInsets windowInsets) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f107a = new a.zt1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f107a = new a.yt1(this, windowInsets);
        } else if (i >= 28) {
            this.f107a = new a.xt1(this, windowInsets);
        } else {
            this.f107a = new a.wt1(this, windowInsets);
        }
    }

    public static a.ns0 e(a.ns0 ns0Var, int i, int i2, int i3, int i4) {
        int max = java.lang.Math.max(0, ns0Var.f391a - i);
        int max2 = java.lang.Math.max(0, ns0Var.b - i2);
        int max3 = java.lang.Math.max(0, ns0Var.c - i3);
        int max4 = java.lang.Math.max(0, ns0Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? ns0Var : a.ns0.b(max, max2, max3, max4);
    }

    public static a.du1 h(android.view.View view, android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        a.du1 du1Var = new a.du1(windowInsets);
        if (view != null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.up1.b(view)) {
                a.du1 a2 = a.yp1.a(view);
                a.au1 au1Var = du1Var.f107a;
                au1Var.p(a2);
                au1Var.d(view.getRootView());
            }
        }
        return du1Var;
    }

    public final int a() {
        return this.f107a.j().d;
    }

    public final int b() {
        return this.f107a.j().f391a;
    }

    public final int c() {
        return this.f107a.j().c;
    }

    public final int d() {
        return this.f107a.j().b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.du1)) {
            return false;
        }
        return a.x21.a(this.f107a, ((a.du1) obj).f107a);
    }

    public final a.du1 f(int i, int i2, int i3, int i4) {
        int i5 = android.os.Build.VERSION.SDK_INT;
        a.ut1 tt1Var = i5 >= 30 ? new a.tt1(this) : i5 >= 29 ? new a.st1(this) : new a.qt1(this);
        tt1Var.g(a.ns0.b(i, i2, i3, i4));
        return tt1Var.b();
    }

    public final android.view.WindowInsets g() {
        a.au1 au1Var = this.f107a;
        if (au1Var instanceof a.vt1) {
            return ((a.vt1) au1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        a.au1 au1Var = this.f107a;
        if (au1Var == null) {
            return 0;
        }
        return au1Var.hashCode();
    }

    public du1() {
        this.f107a = new a.au1(this);
    }
}
