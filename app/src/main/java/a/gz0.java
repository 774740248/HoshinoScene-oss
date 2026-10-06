package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class gz0 extends android.graphics.drawable.Drawable implements a.hh1 {
    public static final android.graphics.Paint y;
    public a.fz0 c;
    public final a.fh1[] d;
    public final a.fh1[] e;
    public final java.util.BitSet f;
    public boolean g;
    public final android.graphics.Matrix h;
    public final android.graphics.Path i;
    public final android.graphics.Path j;
    public final android.graphics.RectF k;
    public final android.graphics.RectF l;
    public final android.graphics.Region m;
    public final android.graphics.Region n;
    public a.wg1 o;
    public final android.graphics.Paint p;
    public final android.graphics.Paint q;
    public final a.ug1 r;
    public final a.pe s;
    public final a.yg1 t;
    public android.graphics.PorterDuffColorFilter u;
    public android.graphics.PorterDuffColorFilter v;
    public final android.graphics.RectF w;
    public final boolean x;

    static {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
    }

    public gz0() {
        this(new a.wg1());
    }

    public final void b(android.graphics.RectF rectF, android.graphics.Path path) {
        a.yg1 yg1Var = this.t;
        a.fz0 fz0Var = this.c;
        yg1Var.a(fz0Var.f164a, fz0Var.j, rectF, this.s, path);
        if (this.c.i != 1.0f) {
            android.graphics.Matrix matrix = this.h;
            matrix.reset();
            float f = this.c.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.graphics.Paint paint, boolean z) {
        int color;
        int d;
        if (colorStateList == null || mode == null) {
            return (!z || (d = d((color = paint.getColor()))) == color) ? null : new android.graphics.PorterDuffColorFilter(d, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        return new android.graphics.PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        float r3 = 0.0f;
        int i2;
        a.fz0 fz0Var = this.c;
        float f = fz0Var.n + fz0Var.o + fz0Var.m;
        a.ma0 ma0Var = fz0Var.b;
        if (ma0Var == null || !ma0Var.f342a || a.sv.d(i, 255) != ma0Var.d) {
            return i;
        }
        float min = (ma0Var.e <= 0.0f || f <= 0.0f) ? 0.0f : java.lang.Math.min(((((float) java.lang.Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = android.graphics.Color.alpha(i);
        int N0 = a.wv.N0(min, a.sv.d(i, 255), ma0Var.b);
        if (min > 0.0f && (i2 = ma0Var.c) != 0) {
            N0 = a.sv.b(a.sv.d(i2, a.ma0.f), N0);
        }
        return a.sv.d(N0, alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r1 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gz0.draw(android.graphics.Canvas):void");
    }

    public final void e(android.graphics.Canvas canvas) {
        if (this.f.cardinality() > 0) {
            android.util.Log.w("gz0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.c.r;
        android.graphics.Path path = this.i;
        a.ug1 ug1Var = this.r;
        if (i != 0) {
            canvas.drawPath(path, ug1Var.f593a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            a.fh1 fh1Var = this.d[i2];
            int i3 = this.c.q;
            android.graphics.Matrix matrix = a.fh1.b;
            fh1Var.a(matrix, ug1Var, i3, canvas);
            this.e[i2].a(matrix, ug1Var, this.c.q, canvas);
        }
        if (this.x) {
            a.fz0 fz0Var = this.c;
            int sin = (int) (java.lang.Math.sin(java.lang.Math.toRadians(fz0Var.s)) * fz0Var.r);
            a.fz0 fz0Var2 = this.c;
            int cos = (int) (java.lang.Math.cos(java.lang.Math.toRadians(fz0Var2.s)) * fz0Var2.r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, y);
            canvas.translate(sin, cos);
        }
    }

    public final void f(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, a.wg1 wg1Var, android.graphics.RectF rectF) {
        if (!wg1Var.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = wg1Var.f.a(rectF) * this.c.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    public void g(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.q;
        android.graphics.Path path = this.j;
        a.wg1 wg1Var = this.o;
        android.graphics.RectF rectF = this.l;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, wg1Var, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        a.fz0 fz0Var = this.c;
        if (fz0Var.p == 2) {
            return;
        }
        if (fz0Var.f164a.d(h())) {
            outline.setRoundRect(getBounds(), this.c.f164a.e.a(h()) * this.c.j);
        } else {
            android.graphics.RectF h = h();
            android.graphics.Path path = this.i;
            b(h, path);
            a.wv.z1(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.c.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        android.graphics.Rect bounds = getBounds();
        android.graphics.Region region = this.m;
        region.set(bounds);
        android.graphics.RectF h = h();
        android.graphics.Path path = this.i;
        b(h, path);
        android.graphics.Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    public final android.graphics.RectF h() {
        android.graphics.RectF rectF = this.k;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        android.graphics.Paint.Style style = this.c.u;
        return (style == android.graphics.Paint.Style.FILL_AND_STROKE || style == android.graphics.Paint.Style.STROKE) && this.q.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.content.res.ColorStateList colorStateList3;
        android.content.res.ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.c.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.c.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.c.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.c.c) != null && colorStateList4.isStateful())));
    }

    public final void j(android.content.Context context) {
        this.c.b = new a.ma0(context);
        o();
    }

    public final void k(float f) {
        a.fz0 fz0Var = this.c;
        if (fz0Var.n != f) {
            fz0Var.n = f;
            o();
        }
    }

    public final void l(android.content.res.ColorStateList colorStateList) {
        a.fz0 fz0Var = this.c;
        if (fz0Var.c != colorStateList) {
            fz0Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z;
        android.graphics.Paint paint;
        int color;
        int colorForState;
        android.graphics.Paint paint2;
        int color2;
        int colorForState2;
        if (this.c.c == null || color2 == (colorForState2 = this.c.c.getColorForState(iArr, (color2 = (paint2 = this.p).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.c.d == null || color == (colorForState = this.c.d.getColorForState(iArr, (color = (paint = this.q).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.c = new a.fz0(this.c);
        return this;
    }

    public final boolean n() {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = this.u;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        a.fz0 fz0Var = this.c;
        this.u = c(fz0Var.f, fz0Var.g, this.p, true);
        a.fz0 fz0Var2 = this.c;
        this.v = c(fz0Var2.e, fz0Var2.g, this.q, false);
        a.fz0 fz0Var3 = this.c;
        if (fz0Var3.t) {
            this.r.a(fz0Var3.f.getColorForState(getState(), 0));
        }
        return (a.x21.a(porterDuffColorFilter, this.u) && a.x21.a(porterDuffColorFilter2, this.v)) ? false : true;
    }

    public final void o() {
        a.fz0 fz0Var = this.c;
        float f = fz0Var.n + fz0Var.o;
        fz0Var.q = (int) java.lang.Math.ceil(0.75f * f);
        this.c.r = (int) java.lang.Math.ceil(f * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.g = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m(iArr) || n();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        a.fz0 fz0Var = this.c;
        if (fz0Var.l != i) {
            fz0Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.c.getClass();
        super.invalidateSelf();
    }

    @Override // a.hh1
    public final void setShapeAppearanceModel(a.wg1 wg1Var) {
        this.c.f164a = wg1Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.c.f = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        a.fz0 fz0Var = this.c;
        if (fz0Var.g != mode) {
            fz0Var.g = mode;
            n();
            super.invalidateSelf();
        }
    }

    public gz0(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(a.wg1.b(context, attributeSet, i, i2).a());
    }

    public gz0(a.wg1 wg1Var) {
        this(new a.fz0(wg1Var));
    }

    public gz0(a.fz0 fz0Var) {
        a.yg1 yg1Var;
        this.d = new a.fh1[4];
        this.e = new a.fh1[4];
        this.f = new java.util.BitSet(8);
        this.h = new android.graphics.Matrix();
        this.i = new android.graphics.Path();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.RectF();
        this.l = new android.graphics.RectF();
        this.m = new android.graphics.Region();
        this.n = new android.graphics.Region();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.q = paint2;
        this.r = new a.ug1();
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            yg1Var = a.xg1.f687a;
        } else {
            yg1Var = new a.yg1();
        }
        this.t = yg1Var;
        this.w = new android.graphics.RectF();
        this.x = true;
        this.c = fz0Var;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        n();
        m(getState());
        this.s = new a.pe(this);
    }
}
