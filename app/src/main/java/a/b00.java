package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b00 extends a.fz0 {
    public final android.graphics.RectF v;

    public b00(a.wg1 wg1Var, android.graphics.RectF rectF) {
        super(wg1Var);
        this.v = rectF;
    }

    @Override // a.fz0, android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        a.d00 d00Var = new a.c00(this);
        d00Var.invalidateSelf();
        return d00Var;
    }

    public b00(a.b00 b00Var) {
        super(b00Var);
        this.v = b00Var.v;
    }
}
