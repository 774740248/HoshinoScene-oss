package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dj0 extends a.rv0 {
    public android.graphics.drawable.Drawable r;
    public final android.graphics.Rect s;
    public final android.graphics.Rect t;
    public int u;
    public final boolean v;
    public boolean w;

    public dj0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = new android.graphics.Rect();
        this.t = new android.graphics.Rect();
        this.u = 119;
        this.v = true;
        this.w = false;
        int[] iArr = a.t81.k;
        a.b20.r(context, attributeSet, 0, 0);
        a.b20.u(context, attributeSet, iArr, 0, 0, new int[0]);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.u = obtainStyledAttributes.getInt(1, this.u);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.v = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = this.r;
        if (drawable != null) {
            if (this.w) {
                this.w = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.v;
                android.graphics.Rect rect = this.s;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.u;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                android.graphics.Rect rect2 = this.t;
                android.view.Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        android.graphics.drawable.Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.r.setState(getDrawableState());
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return this.r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // a.rv0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w = z | this.w;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.w = true;
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.r);
            }
            this.r = drawable;
            this.w = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.u == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.u != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.u = i;
            if (i == 119 && this.r != null) {
                this.r.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }
}
