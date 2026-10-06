package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class wt1 extends a.vt1 {
    public a.ns0 m;

    public wt1(a.du1 du1Var, android.view.WindowInsets windowInsets) {
        super(du1Var, windowInsets);
        this.m = null;
    }

    @Override // a.au1
    public a.du1 b() {
        return a.du1.h(null, this.c.consumeStableInsets());
    }

    @Override // a.au1
    public a.du1 c() {
        return a.du1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // a.au1
    public final a.ns0 h() {
        if (this.m == null) {
            android.view.WindowInsets windowInsets = this.c;
            this.m = a.ns0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // a.au1
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // a.au1
    public void q(a.ns0 ns0Var) {
        this.m = ns0Var;
    }
}
