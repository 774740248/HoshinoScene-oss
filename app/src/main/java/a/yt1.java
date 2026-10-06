package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class yt1 extends a.xt1 {
    public a.ns0 n;
    public a.ns0 o;
    public a.ns0 p;

    public yt1(a.du1 du1Var, android.view.WindowInsets windowInsets) {
        super(du1Var, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // a.au1
    public a.ns0 g() {
        android.graphics.Insets mandatorySystemGestureInsets;
        if (this.o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.o = a.ns0.c(mandatorySystemGestureInsets);
        }
        return this.o;
    }

    @Override // a.au1
    public a.ns0 i() {
        android.graphics.Insets systemGestureInsets;
        if (this.n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.n = a.ns0.c(systemGestureInsets);
        }
        return this.n;
    }

    @Override // a.au1
    public a.ns0 k() {
        android.graphics.Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.p = a.ns0.c(tappableElementInsets);
        }
        return this.p;
    }

    @Override // a.vt1, a.au1
    public a.du1 l(int i, int i2, int i3, int i4) {
        android.view.WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return a.du1.h(null, inset);
    }

    @Override // a.wt1, a.au1
    public void q(a.ns0 ns0Var) {
    }
}
