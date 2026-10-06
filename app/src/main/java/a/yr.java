package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yr extends android.graphics.drawable.Drawable {
    public final android.graphics.Paint b;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public a.wg1 o;
    public android.content.res.ColorStateList p;

    /* renamed from: a, reason: collision with root package name */
    public final a.yg1 f717a = a.xg1.f687a;
    public final android.graphics.Path c = new android.graphics.Path();
    public final android.graphics.Rect d = new android.graphics.Rect();
    public final android.graphics.RectF e = new android.graphics.RectF();
    public final android.graphics.RectF f = new android.graphics.RectF();
    public final a.cl g = new a.cl(this, 0);
    public boolean n = true;

    public yr(a.wg1 wg1Var) {
        this.o = wg1Var;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.b = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z = this.n;
        android.graphics.Paint paint = this.b;
        android.graphics.Rect rect = this.d;
        if (z) {
            copyBounds(rect);
            float height = this.h / rect.height();
            paint.setShader(new android.graphics.LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{a.sv.b(this.i, this.m), a.sv.b(this.j, this.m), a.sv.b(a.sv.d(this.j, 0), this.m), a.sv.b(a.sv.d(this.l, 0), this.m), a.sv.b(this.l, this.m), a.sv.b(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        android.graphics.RectF rectF = this.e;
        rectF.set(rect);
        a.qy qyVar = this.o.e;
        android.graphics.RectF rectF2 = this.f;
        rectF2.set(getBounds());
        float min = java.lang.Math.min(qyVar.a(rectF2), rectF.width() / 2.0f);
        a.wg1 wg1Var = this.o;
        rectF2.set(getBounds());
        if (wg1Var.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        a.wg1 wg1Var = this.o;
        android.graphics.RectF rectF = this.f;
        rectF.set(getBounds());
        if (wg1Var.d(rectF)) {
            a.qy qyVar = this.o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), qyVar.a(rectF));
            return;
        }
        android.graphics.Rect rect = this.d;
        copyBounds(rect);
        android.graphics.RectF rectF2 = this.e;
        rectF2.set(rect);
        a.yg1 yg1Var = this.f717a;
        a.wg1 wg1Var2 = this.o;
        android.graphics.Path path = this.c;
        yg1Var.a(wg1Var2, 1.0f, rectF2, null, path);
        a.wv.z1(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        a.wg1 wg1Var = this.o;
        android.graphics.RectF rectF = this.f;
        rectF.set(getBounds());
        if (!wg1Var.d(rectF)) {
            return true;
        }
        int round = java.lang.Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
