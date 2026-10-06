package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nc1 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f377a;
    public final android.graphics.Paint b;
    public final android.graphics.RectF c;
    public final android.graphics.Rect d;
    public float e;
    public android.content.res.ColorStateList h;
    public android.graphics.PorterDuffColorFilter i;
    public android.content.res.ColorStateList j;
    public boolean f = false;
    public boolean g = true;
    public android.graphics.PorterDuff.Mode k = android.graphics.PorterDuff.Mode.SRC_IN;

    public nc1(float f, android.content.res.ColorStateList colorStateList) {
        this.f377a = f;
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.b = paint;
        colorStateList = colorStateList == null ? android.content.res.ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.c = new android.graphics.RectF();
        this.d = new android.graphics.Rect();
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        android.graphics.RectF rectF = this.c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f) {
            rect2.inset((int) java.lang.Math.ceil(a.oc1.a(this.e, this.f377a, this.g)), (int) java.lang.Math.ceil(a.oc1.b(this.e, this.f377a, this.g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        android.graphics.Paint paint = this.b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        android.graphics.RectF rectF = this.c;
        float f = this.f377a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.d, this.f377a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.content.res.ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        android.graphics.Paint paint = this.b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        android.content.res.ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
