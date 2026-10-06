package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class xt1 extends a.wt1 {
    public xt1(a.du1 du1Var, android.view.WindowInsets windowInsets) {
        super(du1Var, windowInsets);
    }

    @Override // a.au1
    public a.du1 a() {
        android.view.WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return a.du1.h(null, consumeDisplayCutout);
    }

    @Override // a.au1
    public a.b90 e() {
        android.view.DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new a.b90(displayCutout);
    }

    @Override // a.vt1, a.au1
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.xt1)) {
            return false;
        }
        a.xt1 xt1Var = (a.xt1) obj;
        return java.util.Objects.equals(this.c, xt1Var.c) && java.util.Objects.equals(this.g, xt1Var.g);
    }

    @Override // a.au1
    public int hashCode() {
        return this.c.hashCode();
    }
}
