package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w90 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public android.graphics.drawable.Drawable c;
    public boolean d;

    public final void a(android.graphics.Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.c.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.d) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z) {
        a.h90.e(this.c, z);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
        return this.c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        return this.c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z) {
        this.c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return a.h90.d(this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.c.isStateful();
    }

    public final void j(float f, float f2) {
        a.i90.e(this.c, f, f2);
    }

    public final void k(int i, int i2, int i3, int i4) {
        a.i90.f(this.c, i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i) {
        a.i90.g(this.c, i);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        a.i90.h(this.c, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        a.i90.i(this.c, mode);
    }

    public final boolean o(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.d) {
            j(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.d) {
            k(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.d) {
            return this.c.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.d) {
            return o(z, z2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
