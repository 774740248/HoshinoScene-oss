package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class st1 extends a.ut1 {
    public final android.view.WindowInsets.Builder c;

    public st1() {
        this.c = a.rt1.b();
    }

    @Override // a.ut1
    public a.du1 b() {
        android.view.WindowInsets build;
        a();
        build = this.c.build();
        a.du1 h = a.du1.h(null, build);
        h.f107a.o(this.b);
        return h;
    }

    @Override // a.ut1
    public void d(a.ns0 ns0Var) {
        this.c.setMandatorySystemGestureInsets(ns0Var.d());
    }

    @Override // a.ut1
    public void e(a.ns0 ns0Var) {
        this.c.setStableInsets(ns0Var.d());
    }

    @Override // a.ut1
    public void f(a.ns0 ns0Var) {
        this.c.setSystemGestureInsets(ns0Var.d());
    }

    @Override // a.ut1
    public void g(a.ns0 ns0Var) {
        this.c.setSystemWindowInsets(ns0Var.d());
    }

    @Override // a.ut1
    public void h(a.ns0 ns0Var) {
        this.c.setTappableElementInsets(ns0Var.d());
    }

    public st1(a.du1 du1Var) {
        super(du1Var);
        android.view.WindowInsets.Builder b;
        android.view.WindowInsets g = du1Var.g();
        if (g != null) {
            b = a.rt1.c(g);
        } else {
            b = a.rt1.b();
        }
        this.c = b;
    }
}
