package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vt1 extends a.au1 {
    public static boolean h;
    public static java.lang.reflect.Method i;
    public static java.lang.Class j;
    public static java.lang.reflect.Field k;
    public static java.lang.reflect.Field l;
    public final android.view.WindowInsets c;
    public a.ns0[] d;
    public a.ns0 e;
    public a.du1 f;
    public a.ns0 g;

    public vt1(a.du1 du1Var, android.view.WindowInsets windowInsets) {
        super(du1Var);
        this.e = null;
        this.c = windowInsets;
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private a.ns0 r(int i2, boolean z) {
        a.ns0 ns0Var = a.ns0.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                ns0Var = a.ns0.a(ns0Var, s(i3, z));
            }
        }
        return ns0Var;
    }

    private a.ns0 t() {
        a.du1 du1Var = this.f;
        return du1Var != null ? du1Var.f107a.h() : a.ns0.e;
    }

    private a.ns0 u(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        java.lang.reflect.Method method = i;
        if (method != null && j != null && k != null) {
            try {
                java.lang.Object invoke = method.invoke(view, new java.lang.Object[0]);
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) k.get(l.get(invoke));
                if (rect != null) {
                    return a.ns0.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // a.au1
    public void d(android.view.View view) {
        a.ns0 u = u(view);
        if (u == null) {
            u = a.ns0.e;
        }
        w(u);
    }

    @Override // a.au1
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return java.util.Objects.equals(this.g, ((a.vt1) obj).g);
        }
        return false;
    }

    @Override // a.au1
    public a.ns0 f(int i2) {
        return r(i2, false);
    }

    @Override // a.au1
    public final a.ns0 j() {
        if (this.e == null) {
            android.view.WindowInsets windowInsets = this.c;
            this.e = a.ns0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // a.au1
    public a.du1 l(int i2, int i3, int i4, int i5) {
        a.du1 h2 = a.du1.h(null, this.c);
        int i6 = android.os.Build.VERSION.SDK_INT;
        a.ut1 tt1Var = i6 >= 30 ? new a.tt1(h2) : i6 >= 29 ? new a.st1(h2) : new a.qt1(h2);
        tt1Var.g(a.du1.e(j(), i2, i3, i4, i5));
        tt1Var.e(a.du1.e(h(), i2, i3, i4, i5));
        return tt1Var.b();
    }

    @Override // a.au1
    public boolean n() {
        return this.c.isRound();
    }

    @Override // a.au1
    public void o(a.ns0[] ns0VarArr) {
        this.d = ns0VarArr;
    }

    @Override // a.au1
    public void p(a.du1 du1Var) {
        this.f = du1Var;
    }

    public a.ns0 s(int i2, boolean z) {
        a.ns0 h2;
        int i3;
        if (i2 == 1) {
            return z ? a.ns0.b(0, java.lang.Math.max(t().b, j().b), 0, 0) : a.ns0.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                a.ns0 t = t();
                a.ns0 h3 = h();
                return a.ns0.b(java.lang.Math.max(t.f391a, h3.f391a), 0, java.lang.Math.max(t.c, h3.c), java.lang.Math.max(t.d, h3.d));
            }
            a.ns0 j2 = j();
            a.du1 du1Var = this.f;
            h2 = du1Var != null ? du1Var.f107a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = java.lang.Math.min(i4, h2.d);
            }
            return a.ns0.b(j2.f391a, 0, j2.c, i4);
        }
        a.ns0 ns0Var = a.ns0.e;
        if (i2 == 8) {
            a.ns0[] ns0VarArr = this.d;
            h2 = ns0VarArr != null ? ns0VarArr[a.wv.y0(8)] : null;
            if (h2 != null) {
                return h2;
            }
            a.ns0 j3 = j();
            a.ns0 t2 = t();
            int i5 = j3.d;
            if (i5 > t2.d) {
                return a.ns0.b(0, 0, 0, i5);
            }
            a.ns0 ns0Var2 = this.g;
            return (ns0Var2 == null || ns0Var2.equals(ns0Var) || (i3 = this.g.d) <= t2.d) ? ns0Var : a.ns0.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return ns0Var;
        }
        a.du1 du1Var2 = this.f;
        a.b90 e = du1Var2 != null ? du1Var2.f107a.e() : e();
        if (e == null) {
            return ns0Var;
        }
        int i6 = android.os.Build.VERSION.SDK_INT;
        android.view.DisplayCutout displayCutout = e.f34a;
        return a.ns0.b(i6 >= 28 ? a.a90.d(displayCutout) : 0, i6 >= 28 ? a.a90.f(displayCutout) : 0, i6 >= 28 ? a.a90.e(displayCutout) : 0, i6 >= 28 ? a.a90.c(displayCutout) : 0);
    }

    public void w(a.ns0 ns0Var) {
        this.g = ns0Var;
    }
}
