package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zt1 extends a.yt1 {
    public static final a.du1 q;

    static {
        android.view.WindowInsets windowInsets;
        windowInsets = android.view.WindowInsets.CONSUMED;
        q = a.du1.h(null, windowInsets);
    }

    public zt1(a.du1 du1Var, android.view.WindowInsets windowInsets) {
        super(du1Var, windowInsets);
    }

    @Override // a.vt1, a.au1
    public final void d(android.view.View view) {
    }

    @Override // a.vt1, a.au1
    public a.ns0 f(int i) {
        android.graphics.Insets insets;
        insets = this.c.getInsets(a.cu1.a(i));
        return a.ns0.c(insets);
    }
}
