package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zu extends a.gz0 implements android.graphics.drawable.Drawable.Callback, a.xk1 {
    public static final int[] I0 = {android.R.attr.state_enabled};
    public static final android.graphics.drawable.ShapeDrawable J0 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
    public android.content.res.ColorStateList A;
    public int[] A0;
    public float B;
    public boolean B0;
    public float C;
    public android.content.res.ColorStateList C0;
    public android.content.res.ColorStateList D;
    public java.lang.ref.WeakReference D0;
    public float E;
    public android.text.TextUtils.TruncateAt E0;
    public android.content.res.ColorStateList F;
    public boolean F0;
    public java.lang.CharSequence G;
    public int G0;
    public boolean H;
    public boolean H0;
    public android.graphics.drawable.Drawable I;
    public android.content.res.ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public android.graphics.drawable.Drawable N;
    public android.graphics.drawable.RippleDrawable O;
    public android.content.res.ColorStateList P;
    public float Q;
    public android.text.SpannableStringBuilder R;
    public boolean S;
    public boolean T;
    public android.graphics.drawable.Drawable U;
    public android.content.res.ColorStateList V;
    public a.p11 W;
    public a.p11 X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final android.content.Context g0;
    public final android.graphics.Paint h0;
    public final android.graphics.Paint.FontMetrics i0;
    public final android.graphics.RectF j0;
    public final android.graphics.PointF k0;
    public final android.graphics.Path l0;
    public final a.yk1 m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public android.graphics.ColorFilter w0;
    public android.graphics.PorterDuffColorFilter x0;
    public android.content.res.ColorStateList y0;
    public android.content.res.ColorStateList z;
    public android.graphics.PorterDuff.Mode z0;

    public zu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968764, 2132018206);
        this.C = -1.0f;
        this.h0 = new android.graphics.Paint(1);
        this.i0 = new android.graphics.Paint.FontMetrics();
        this.j0 = new android.graphics.RectF();
        this.k0 = new android.graphics.PointF();
        this.l0 = new android.graphics.Path();
        this.v0 = 255;
        this.z0 = android.graphics.PorterDuff.Mode.SRC_IN;
        this.D0 = new java.lang.ref.WeakReference(null);
        j(context);
        this.g0 = context;
        a.yk1 yk1Var = new a.yk1(this);
        this.m0 = yk1Var;
        this.G = "";
        yk1Var.f712a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I0;
        setState(iArr);
        if (!java.util.Arrays.equals(this.A0, iArr)) {
            this.A0 = iArr;
            if (U()) {
                x(getState(), iArr);
            }
        }
        this.F0 = true;
        int[] iArr2 = a.dc1.f94a;
        J0.setTint(-1);
    }

    public static void V(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(android.content.res.ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(android.graphics.drawable.Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && (drawable = this.U) != null && this.S) {
                a.i90.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z) {
        if (this.T != z) {
            boolean S = S();
            this.T = z;
            boolean S2 = S();
            if (S != S2) {
                if (S2) {
                    p(this.U);
                } else {
                    V(this.U);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void C(float f) {
        if (this.C != f) {
            this.C = f;
            a.vg1 e = this.c.f164a.e();
            e.e = new a.d(f);
            e.f = new a.d(f);
            e.g = new a.d(f);
            e.h = new a.d(f);
            setShapeAppearanceModel(e.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.I;
        if (drawable3 != null) {
            boolean z = drawable3 instanceof a.lu1;
            drawable2 = drawable3;
            if (z) {
                ((a.mu1) ((a.lu1) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r = r();
            this.I = drawable != null ? drawable.mutate() : null;
            float r2 = r();
            V(drawable2);
            if (T()) {
                p(this.I);
            }
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }

    public final void E(float f) {
        if (this.K != f) {
            float r = r();
            this.K = f;
            float r2 = r();
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }

    public final void F(android.content.res.ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (T()) {
                a.i90.h(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.H != z) {
            boolean T = T();
            this.H = z;
            boolean T2 = T();
            if (T != T2) {
                if (T2) {
                    p(this.I);
                } else {
                    V(this.I);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void H(android.content.res.ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.H0) {
                a.fz0 fz0Var = this.c;
                if (fz0Var.d != colorStateList) {
                    fz0Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void I(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.H0) {
                this.c.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.N;
        if (drawable3 != null) {
            boolean z = drawable3 instanceof a.lu1;
            drawable2 = drawable3;
            if (z) {
                ((a.mu1) ((a.lu1) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float s = s();
            this.N = drawable != null ? drawable.mutate() : null;
            int[] iArr = a.dc1.f94a;
            this.O = new android.graphics.drawable.RippleDrawable(a.dc1.b(this.F), this.N, J0);
            float s2 = s();
            V(drawable2);
            if (U()) {
                p(this.N);
            }
            invalidateSelf();
            if (s != s2) {
                w();
            }
        }
    }

    public final void K(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void L(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void M(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void N(android.content.res.ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (U()) {
                a.i90.h(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.M != z) {
            boolean U = U();
            this.M = z;
            boolean U2 = U();
            if (U != U2) {
                if (U2) {
                    p(this.N);
                } else {
                    V(this.N);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void P(float f) {
        if (this.a0 != f) {
            float r = r();
            this.a0 = f;
            float r2 = r();
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }

    public final void Q(float f) {
        if (this.Z != f) {
            float r = r();
            this.Z = f;
            float r2 = r();
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }

    public final void R(android.content.res.ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.C0 = this.B0 ? a.dc1.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean S() {
        return this.T && this.U != null && this.t0;
    }

    public final boolean T() {
        return this.H && this.I != null;
    }

    public final boolean U() {
        return this.M && this.N != null;
    }

    @Override // a.xk1
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        android.graphics.RectF rectF;
        int i2;
        int i3;
        int i4;
        android.graphics.RectF rectF2;
        int i5;
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.v0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.H0;
        android.graphics.Paint paint = this.h0;
        android.graphics.RectF rectF3 = this.j0;
        if (!z) {
            paint.setColor(this.n0);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (!this.H0) {
            paint.setColor(this.o0);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.ColorFilter colorFilter = this.w0;
            if (colorFilter == null) {
                colorFilter = this.x0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (this.H0) {
            super.draw(canvas);
        }
        if (this.E > 0.0f && !this.H0) {
            paint.setColor(this.q0);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            if (!this.H0) {
                android.graphics.ColorFilter colorFilter2 = this.w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.x0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.E / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.C - (this.E / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.r0);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.H0) {
            android.graphics.RectF rectF4 = new android.graphics.RectF(bounds);
            android.graphics.Path path = this.l0;
            a.yg1 yg1Var = this.t;
            a.fz0 fz0Var = this.c;
            yg1Var.a(fz0Var.f164a, fz0Var.j, rectF4, this.s, path);
            f(canvas, paint, path, this.c.f164a, h());
        } else {
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (T()) {
            q(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.I.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.I.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (S()) {
            q(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.U.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.U.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.F0 || this.G == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            android.graphics.PointF pointF = this.k0;
            pointF.set(0.0f, 0.0f);
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            java.lang.CharSequence charSequence = this.G;
            a.yk1 yk1Var = this.m0;
            if (charSequence != null) {
                float r = r() + this.Y + this.b0;
                if (a.j90.a(this) == 0) {
                    pointF.x = bounds.left + r;
                } else {
                    pointF.x = bounds.right - r;
                    align = android.graphics.Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                android.text.TextPaint textPaint = yk1Var.f712a;
                android.graphics.Paint.FontMetrics fontMetrics = this.i0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.G != null) {
                float r2 = r() + this.Y + this.b0;
                float s = s() + this.f0 + this.c0;
                if (a.j90.a(this) == 0) {
                    rectF3.left = bounds.left + r2;
                    rectF3.right = bounds.right - s;
                } else {
                    rectF3.left = bounds.left + s;
                    rectF3.right = bounds.right - r2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            a.sk1 sk1Var = yk1Var.f;
            android.text.TextPaint textPaint2 = yk1Var.f712a;
            if (sk1Var != null) {
                textPaint2.drawableState = getState();
                yk1Var.f.e(this.g0, textPaint2, yk1Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = java.lang.Math.round(yk1Var.a(this.G.toString())) > java.lang.Math.round(rectF3.width());
            if (z2) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            java.lang.CharSequence charSequence2 = this.G;
            if (z2 && this.E0 != null) {
                charSequence2 = android.text.TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.E0);
            }
            java.lang.CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f8 = pointF.x;
            float f9 = pointF.y;
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence3, 0, length, f8, f9, textPaint2);
            if (z2) {
                canvas.restoreToCount(i5);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f10 = this.f0 + this.e0;
                if (a.j90.a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.Q;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.Q;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.Q;
                float f14 = exactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.N.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = a.dc1.f94a;
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.v0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return java.lang.Math.min(java.lang.Math.round(s() + this.m0.a(this.G.toString()) + r() + this.Y + this.b0 + this.c0 + this.f0), this.G0);
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(this.v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        a.sk1 sk1Var;
        android.content.res.ColorStateList colorStateList;
        return u(this.z) || u(this.A) || u(this.D) || (this.B0 && u(this.C0)) || (!((sk1Var = this.m0.f) == null || (colorStateList = sk1Var.j) == null || !colorStateList.isStateful()) || ((this.T && this.U != null && this.S) || v(this.I) || v(this.U) || u(this.y0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (T()) {
            onLayoutDirectionChanged |= a.j90.b(this.I, i);
        }
        if (S()) {
            onLayoutDirectionChanged |= a.j90.b(this.U, i);
        }
        if (U()) {
            onLayoutDirectionChanged |= a.j90.b(this.N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (T()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (S()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (U()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.A0);
    }

    public final void p(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.j90.b(drawable, a.j90.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            a.i90.h(drawable, this.P);
            return;
        }
        android.graphics.drawable.Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            a.i90.h(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f = this.Y + this.Z;
            android.graphics.drawable.Drawable drawable = this.t0 ? this.U : this.I;
            float f2 = this.K;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (a.j90.a(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            android.graphics.drawable.Drawable drawable2 = this.t0 ? this.U : this.I;
            float f5 = this.K;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) java.lang.Math.ceil(a.wv.T(this.g0, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float r() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f = this.Z;
        android.graphics.drawable.Drawable drawable = this.t0 ? this.U : this.I;
        float f2 = this.K;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.a0;
    }

    public final float s() {
        if (U()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            android.content.res.ColorStateList colorStateList = this.y0;
            this.x0 = (colorStateList == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (T()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (S()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.H0 ? this.c.f164a.e.a(h()) : this.C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        a.yu yuVar = (a.yu) this.D0.get();
        if (yuVar != null) {
            com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) yuVar;
            chip.onRtlPropertiesChanged(chip.minTouchTargetSize);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean x(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        android.content.res.ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        android.content.res.ColorStateList colorStateList2 = this.z;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.n0) : 0);
        boolean z3 = true;
        if (this.n0 != d) {
            this.n0 = d;
            onStateChange = true;
        }
        android.content.res.ColorStateList colorStateList3 = this.A;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o0) : 0);
        if (this.o0 != d2) {
            this.o0 = d2;
            onStateChange = true;
        }
        int b = a.sv.b(d2, d);
        if ((this.p0 != b) | (this.c.c == null)) {
            this.p0 = b;
            l(android.content.res.ColorStateList.valueOf(b));
            onStateChange = true;
        }
        android.content.res.ColorStateList colorStateList4 = this.D;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState) {
            this.q0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.C0 == null || !a.dc1.c(iArr)) ? 0 : this.C0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState2) {
            this.r0 = colorForState2;
            if (this.B0) {
                onStateChange = true;
            }
        }
        a.sk1 sk1Var = this.m0.f;
        int colorForState3 = (sk1Var == null || (colorStateList = sk1Var.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState3) {
            this.s0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.S) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.t0 == z || this.U == null) {
            z2 = false;
        } else {
            float r = r();
            this.t0 = z;
            if (r != r()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        android.content.res.ColorStateList colorStateList5 = this.y0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState4) {
            this.u0 = colorForState4;
            android.content.res.ColorStateList colorStateList6 = this.y0;
            android.graphics.PorterDuff.Mode mode = this.z0;
            this.x0 = (colorStateList6 == null || mode == null) ? null : new android.graphics.PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z3 = onStateChange;
        }
        if (v(this.I)) {
            z3 |= this.I.setState(iArr);
        }
        if (v(this.U)) {
            z3 |= this.U.setState(iArr);
        }
        if (v(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            java.lang.System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.N.setState(iArr3);
        }
        int[] iArr4 = a.dc1.f94a;
        if (v(this.O)) {
            z3 |= this.O.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            w();
        }
        return z3;
    }

    public final void y(boolean z) {
        if (this.S != z) {
            this.S = z;
            float r = r();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float r2 = r();
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }

    public final void z(android.graphics.drawable.Drawable drawable) {
        if (this.U != drawable) {
            float r = r();
            this.U = drawable;
            float r2 = r();
            V(this.U);
            p(this.U);
            invalidateSelf();
            if (r != r2) {
                w();
            }
        }
    }
}
