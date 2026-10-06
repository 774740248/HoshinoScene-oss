package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oy0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.button.MaterialButton f426a;
    public a.wg1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public android.graphics.PorterDuff.Mode i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public a.gz0 m;
    public boolean q;
    public android.graphics.drawable.RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public oy0(com.google.android.material.button.MaterialButton materialButton, a.wg1 wg1Var) {
        this.f426a = materialButton;
        this.b = wg1Var;
    }

    public final a.hh1 a() {
        android.graphics.drawable.RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (a.hh1) this.s.getDrawable(2) : (a.hh1) this.s.getDrawable(1);
    }

    public final a.gz0 b(boolean z) {
        android.graphics.drawable.RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (a.gz0) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(a.wg1 wg1Var) {
        this.b = wg1Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(wg1Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(wg1Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(wg1Var);
        }
    }

    public final void d(int i, int i2) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        com.google.android.material.button.MaterialButton materialButton = this.f426a;
        int f = a.sp1.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e = a.sp1.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        a.sp1.k(materialButton, f, (paddingTop + i) - i3, e, (paddingBottom + i2) - i4);
    }

    public final void e() {
        a.gz0 gz0Var = new a.gz0(this.b);
        com.google.android.material.button.MaterialButton materialButton = this.f426a;
        gz0Var.j(materialButton.getContext());
        a.i90.h(gz0Var, this.j);
        android.graphics.PorterDuff.Mode mode = this.i;
        if (mode != null) {
            a.i90.i(gz0Var, mode);
        }
        float f = this.h;
        android.content.res.ColorStateList colorStateList = this.k;
        gz0Var.c.k = f;
        gz0Var.invalidateSelf();
        a.fz0 fz0Var = gz0Var.c;
        if (fz0Var.d != colorStateList) {
            fz0Var.d = colorStateList;
            gz0Var.onStateChange(gz0Var.getState());
        }
        a.gz0 gz0Var2 = new a.gz0(this.b);
        gz0Var2.setTint(0);
        float f2 = this.h;
        int a0 = this.n ? a.wv.a0(materialButton, 2130968838) : 0;
        gz0Var2.c.k = f2;
        gz0Var2.invalidateSelf();
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(a0);
        a.fz0 fz0Var2 = gz0Var2.c;
        if (fz0Var2.d != valueOf) {
            fz0Var2.d = valueOf;
            gz0Var2.onStateChange(gz0Var2.getState());
        }
        a.gz0 gz0Var3 = new a.gz0(this.b);
        this.m = gz0Var3;
        a.i90.g(gz0Var3, -1);
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(a.dc1.b(this.l), new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gz0Var2, gz0Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        a.gz0 b = b(false);
        if (b != null) {
            b.k(this.t);
            b.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        a.gz0 b = b(false);
        a.gz0 b2 = b(true);
        if (b != null) {
            float f = this.h;
            android.content.res.ColorStateList colorStateList = this.k;
            b.c.k = f;
            b.invalidateSelf();
            a.fz0 fz0Var = b.c;
            if (fz0Var.d != colorStateList) {
                fz0Var.d = colorStateList;
                b.onStateChange(b.getState());
            }
            if (b2 != null) {
                float f2 = this.h;
                int a0 = this.n ? a.wv.a0(this.f426a, 2130968838) : 0;
                b2.c.k = f2;
                b2.invalidateSelf();
                android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(a0);
                a.fz0 fz0Var2 = b2.c;
                if (fz0Var2.d != valueOf) {
                    fz0Var2.d = valueOf;
                    b2.onStateChange(b2.getState());
                }
            }
        }
    }
}
