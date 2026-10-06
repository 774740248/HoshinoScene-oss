package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sk1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.ColorStateList f528a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final android.content.res.ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public android.graphics.Typeface n;

    public sk1(android.content.Context context, int i) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a.t81.C);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = a.wv.c0(context, obtainStyledAttributes, 3);
        a.wv.c0(context, obtainStyledAttributes, 4);
        a.wv.c0(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f528a = a.wv.c0(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, a.t81.t);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        java.lang.String str;
        android.graphics.Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = android.graphics.Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = android.graphics.Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = android.graphics.Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = android.graphics.Typeface.DEFAULT;
            } else {
                this.n = android.graphics.Typeface.MONOSPACE;
            }
            this.n = android.graphics.Typeface.create(this.n, i);
        }
    }

    public final android.graphics.Typeface b(android.content.Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface a2 = a.wb1.a(context, this.l);
                this.n = a2;
                if (a2 != null) {
                    this.n = android.graphics.Typeface.create(a2, this.c);
                }
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            } catch (java.lang.Exception e) {
                android.util.Log.d("TextAppearance", "Error loading font " + this.b, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(android.content.Context context, a.b20 b20Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            b20Var.M0(this.n, true);
            return;
        }
        try {
            a.qk1 qk1Var = new a.qk1(this, b20Var);
            java.lang.ThreadLocal threadLocal = a.wb1.f656a;
            if (context.isRestricted()) {
                qk1Var.l(-4);
            } else {
                a.wb1.b(context, i, new android.util.TypedValue(), 0, qk1Var, false, false);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
            this.m = true;
            b20Var.K0(1);
        } catch (java.lang.Exception e) {
            android.util.Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.m = true;
            b20Var.K0(-3);
        }
    }

    public final boolean d(android.content.Context context) {
        int i = this.l;
        android.graphics.Typeface typeface = null;
        if (i != 0) {
            java.lang.ThreadLocal threadLocal = a.wb1.f656a;
            if (!context.isRestricted()) {
                typeface = a.wb1.b(context, i, new android.util.TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(android.content.Context context, android.text.TextPaint textPaint, a.b20 b20Var) {
        f(context, textPaint, b20Var);
        android.content.res.ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        android.content.res.ColorStateList colorStateList2 = this.f528a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(android.content.Context context, android.text.TextPaint textPaint, a.b20 b20Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new a.rk1(this, context, textPaint, b20Var));
    }

    public final void g(android.content.Context context, android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface C0 = a.b20.C0(context.getResources().getConfiguration(), typeface);
        if (C0 != null) {
            typeface = C0;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
