package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class to1 extends android.graphics.drawable.Drawable {
    public android.graphics.drawable.Drawable c;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
