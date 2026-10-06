package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jt1 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final a.os0 f270a;
    public a.du1 b;

    public jt1(android.view.View view, a.os0 os0Var) {
        a.du1 du1Var;
        this.f270a = os0Var;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.du1 a2 = a.yp1.a(view);
        if (a2 != null) {
            int i = android.os.Build.VERSION.SDK_INT;
            du1Var = (i >= 30 ? new a.tt1(a2) : i >= 29 ? new a.st1(a2) : new a.qt1(a2)).b();
        } else {
            du1Var = null;
        }
        this.b = du1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        a.au1 au1Var;
        if (!view.isLaidOut()) {
            this.b = a.du1.h(view, windowInsets);
            return a.kt1.i(view, windowInsets);
        }
        a.du1 h = a.du1.h(view, windowInsets);
        if (this.b == null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            this.b = a.yp1.a(view);
        }
        if (this.b == null) {
            this.b = h;
            return a.kt1.i(view, windowInsets);
        }
        a.os0 j = a.kt1.j(view);
        if (j != null && java.util.Objects.equals(j.f420a, windowInsets)) {
            return a.kt1.i(view, windowInsets);
        }
        a.du1 du1Var = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            au1Var = h.f107a;
            if (i > 256) {
                break;
            }
            if (!au1Var.f(i).equals(du1Var.f107a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return a.kt1.i(view, windowInsets);
        }
        a.du1 du1Var2 = this.b;
        a.ot1 ot1Var = new a.ot1(i2, (i2 & 8) != 0 ? au1Var.f(8).d > du1Var2.f107a.f(8).d ? a.kt1.e : a.kt1.f : a.kt1.g, 160L);
        ot1Var.f423a.d(0.0f);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ot1Var.f423a.a());
        a.ns0 f = au1Var.f(i2);
        a.ns0 f2 = du1Var2.f107a.f(i2);
        int min = java.lang.Math.min(f.f391a, f2.f391a);
        int i3 = f.b;
        int i4 = f2.b;
        int min2 = java.lang.Math.min(i3, i4);
        int i5 = f.c;
        int i6 = f2.c;
        int min3 = java.lang.Math.min(i5, i6);
        int i7 = f.d;
        int i8 = i2;
        int i9 = f2.d;
        a.pm pmVar = new a.pm(a.ns0.b(min, min2, min3, java.lang.Math.min(i7, i9)), 5, a.ns0.b(java.lang.Math.max(f.f391a, f2.f391a), java.lang.Math.max(i3, i4), java.lang.Math.max(i5, i6), java.lang.Math.max(i7, i9)));
        a.kt1.f(view, windowInsets, false);
        duration.addUpdateListener(new a.ht1(ot1Var, h, du1Var2, i8, view));
        duration.addListener(new a.qr1(this, ot1Var, view, 1));
        a.k31.a(view, new a.it1(view, ot1Var, pmVar, duration));
        this.b = h;
        return a.kt1.i(view, windowInsets);
    }
}
