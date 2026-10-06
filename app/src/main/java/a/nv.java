package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nv {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public boolean C;
    public android.graphics.Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final android.text.TextPaint N;
    public final android.text.TextPaint O;
    public android.animation.TimeInterpolator P;
    public android.animation.TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public android.content.res.ColorStateList U;
    public float V;
    public float W;
    public float X;
    public android.text.StaticLayout Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f397a;
    public float a0;
    public float b;
    public float b0;
    public final android.graphics.Rect c;
    public java.lang.CharSequence c0;
    public final android.graphics.Rect d;
    public final android.graphics.RectF e;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public android.graphics.Typeface r;
    public android.graphics.Typeface s;
    public android.graphics.Typeface t;
    public android.graphics.Typeface u;
    public android.graphics.Typeface v;
    public android.graphics.Typeface w;
    public android.graphics.Typeface x;
    public a.xs y;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final android.text.TextUtils.TruncateAt z = android.text.TextUtils.TruncateAt.END;
    public final boolean D = true;
    public final int d0 = 1;
    public final float e0 = 1.0f;
    public final int f0 = 1;

    public nv(android.view.View view) {
        this.f397a = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.N = textPaint;
        this.O = new android.text.TextPaint(textPaint);
        this.d = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.e = new android.graphics.RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb(java.lang.Math.round((android.graphics.Color.alpha(i2) * f) + (android.graphics.Color.alpha(i) * f2)), java.lang.Math.round((android.graphics.Color.red(i2) * f) + (android.graphics.Color.red(i) * f2)), java.lang.Math.round((android.graphics.Color.green(i2) * f) + (android.graphics.Color.green(i) * f2)), java.lang.Math.round((android.graphics.Color.blue(i2) * f) + (android.graphics.Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return a.el.a(f, f2, f3);
    }

    public final boolean b(java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean z = a.sp1.d(this.f397a) == 1;
        if (this.D) {
            return (z ? a.wk1.d : a.wk1.c).e(charSequence, charSequence.length());
        }
        return z;
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        android.graphics.Typeface typeface;
        boolean z2;
        android.text.Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.c.width();
        if (java.lang.Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.i;
            f3 = this.V;
            this.F = 1.0f;
            typeface = this.r;
        } else {
            float f4 = this.h;
            float f5 = this.W;
            android.graphics.Typeface typeface2 = this.u;
            if (java.lang.Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f, this.Q) / this.h;
            }
            float f6 = this.i / this.h;
            width = (!z && width2 * f6 > width) ? java.lang.Math.min(width / f6, width2) : width2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        android.text.TextPaint textPaint = this.N;
        if (width > 0.0f) {
            boolean z3 = this.G != f2;
            boolean z4 = this.X != f3;
            boolean z5 = this.x != typeface;
            android.text.StaticLayout staticLayout = this.Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.M;
            this.G = f2;
            this.X = f3;
            this.x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.B == null || z2) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.x);
            textPaint.setLetterSpacing(this.X);
            boolean b = b(this.A);
            this.C = b;
            int i = this.d0;
            if (i <= 1 || b) {
                i = 1;
            }
            if (i == 1) {
                alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.f, b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.C ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL : this.C ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_CENTER;
            }
            a.ui1 ui1Var = new a.ui1(this.A, textPaint, (int) width);
            ui1Var.l = this.z;
            ui1Var.k = b;
            ui1Var.e = alignment;
            ui1Var.j = false;
            ui1Var.f = i;
            float f7 = this.e0;
            ui1Var.g = 0.0f;
            ui1Var.h = f7;
            ui1Var.i = this.f0;
            android.text.StaticLayout a2 = ui1Var.a();
            a2.getClass();
            this.Y = a2;
            this.B = a2.getText();
        }
    }

    public final float d() {
        android.text.TextPaint textPaint = this.O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.graphics.Typeface typeface = this.t;
            if (typeface != null) {
                this.s = a.b20.C0(configuration, typeface);
            }
            android.graphics.Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.v = a.b20.C0(configuration, typeface2);
            }
            android.graphics.Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.t;
            }
            this.r = typeface3;
            android.graphics.Typeface typeface4 = this.v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z) {
        float measureText;
        android.text.StaticLayout staticLayout;
        android.view.View view = this.f397a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z) {
            return;
        }
        c(1.0f, z);
        java.lang.CharSequence charSequence = this.B;
        android.text.TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.c0 = android.text.TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.z);
        }
        java.lang.CharSequence charSequence2 = this.c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
        int i = absoluteGravity & 112;
        android.graphics.Rect rect = this.d;
        if (i == 48) {
            this.m = rect.top;
        } else if (i != 80) {
            this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.o = rect.centerX() - (this.Z / 2.0f);
        } else if (i2 != 5) {
            this.o = rect.left;
        } else {
            this.o = rect.right - this.Z;
        }
        c(0.0f, z);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        android.text.StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.d0 <= 1) {
            java.lang.CharSequence charSequence3 = this.B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        android.text.StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        android.graphics.Rect rect2 = this.c;
        if (i3 == 48) {
            this.l = rect2.top;
        } else if (i3 != 80) {
            this.l = rect2.centerY() - (height / 2.0f);
        } else {
            this.l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.n = rect2.left;
        } else {
            this.n = rect2.right - measureText;
        }
        android.graphics.Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.b);
        float f = this.b;
        float f2 = f(rect2.left, rect.left, f, this.P);
        android.graphics.RectF rectF = this.e;
        rectF.left = f2;
        rectF.top = f(this.l, this.m, f, this.P);
        rectF.right = f(rect2.right, rect.right, f, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.P);
        this.p = f(this.n, this.o, f, this.P);
        this.q = f(this.l, this.m, f, this.P);
        l(f);
        a.hd0 hd0Var = a.el.b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, hd0Var);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.k(view);
        this.b0 = f(1.0f, 0.0f, f, hd0Var);
        a.rp1.k(view);
        android.content.res.ColorStateList colorStateList = this.k;
        android.content.res.ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(f(f4, f3, f, hd0Var));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.H = f(0.0f, this.R, f, null);
        this.I = f(0.0f, this.S, f, null);
        this.J = f(0.0f, this.T, f, null);
        int a2 = a(f, e(null), e(this.U));
        this.K = a2;
        textPaint.setShadowLayer(this.H, this.I, this.J, a2);
        a.rp1.k(view);
    }

    public final void i(android.content.res.ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(android.graphics.Typeface typeface) {
        a.xs xsVar = this.y;
        if (xsVar != null) {
            xsVar.G = true;
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        android.graphics.Typeface C0 = a.b20.C0(this.f397a.getContext().getResources().getConfiguration(), typeface);
        this.s = C0;
        if (C0 == null) {
            C0 = this.t;
        }
        this.r = C0;
        return true;
    }

    public final void k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.b) {
            this.b = f;
            float f2 = this.c.left;
            android.graphics.Rect rect = this.d;
            float f3 = f(f2, rect.left, f, this.P);
            android.graphics.RectF rectF = this.e;
            rectF.left = f3;
            rectF.top = f(this.l, this.m, f, this.P);
            rectF.right = f(r1.right, rect.right, f, this.P);
            rectF.bottom = f(r1.bottom, rect.bottom, f, this.P);
            this.p = f(this.n, this.o, f, this.P);
            this.q = f(this.l, this.m, f, this.P);
            l(f);
            a.hd0 hd0Var = a.el.b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, hd0Var);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            android.view.View view = this.f397a;
            a.rp1.k(view);
            this.b0 = f(1.0f, 0.0f, f, hd0Var);
            a.rp1.k(view);
            android.content.res.ColorStateList colorStateList = this.k;
            android.content.res.ColorStateList colorStateList2 = this.j;
            android.text.TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.V;
            float f5 = this.W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, f, hd0Var));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.H = f(0.0f, this.R, f, null);
            this.I = f(0.0f, this.S, f, null);
            this.J = f(0.0f, this.T, f, null);
            int a2 = a(f, e(null), e(this.U));
            this.K = a2;
            textPaint.setShadowLayer(this.H, this.I, this.J, a2);
            a.rp1.k(view);
        }
    }

    public final void l(float f) {
        c(f, false);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.k(this.f397a);
    }

    public final void m(android.graphics.Typeface typeface) {
        boolean z;
        boolean j = j(typeface);
        if (this.w != typeface) {
            this.w = typeface;
            android.graphics.Typeface C0 = a.b20.C0(this.f397a.getContext().getResources().getConfiguration(), typeface);
            this.v = C0;
            if (C0 == null) {
                C0 = this.w;
            }
            this.u = C0;
            z = true;
        } else {
            z = false;
        }
        if (j || z) {
            h(false);
        }
    }
}
