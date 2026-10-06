package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class fz0 extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public a.wg1 f164a;
    public a.ma0 b;
    public android.content.res.ColorStateList c;
    public android.content.res.ColorStateList d;
    public final android.content.res.ColorStateList e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public android.graphics.Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final android.graphics.Paint.Style u;

    public fz0(a.wg1 wg1Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = android.graphics.PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.f164a = wg1Var;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        a.gz0 gz0Var = new a.gz0(this);
        gz0Var.g = true;
        return gz0Var;
    }

    public fz0(a.fz0 fz0Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = android.graphics.PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.f164a = fz0Var.f164a;
        this.b = fz0Var.b;
        this.k = fz0Var.k;
        this.c = fz0Var.c;
        this.d = fz0Var.d;
        this.g = fz0Var.g;
        this.f = fz0Var.f;
        this.l = fz0Var.l;
        this.i = fz0Var.i;
        this.r = fz0Var.r;
        this.p = fz0Var.p;
        this.t = fz0Var.t;
        this.j = fz0Var.j;
        this.m = fz0Var.m;
        this.n = fz0Var.n;
        this.o = fz0Var.o;
        this.q = fz0Var.q;
        this.s = fz0Var.s;
        this.e = fz0Var.e;
        this.u = fz0Var.u;
        if (fz0Var.h != null) {
            this.h = new android.graphics.Rect(fz0Var.h);
        }
    }
}
