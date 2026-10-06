package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e1 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.ActionBarContainer f114a;

    public e1(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.f114a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f114a;
        if (actionBarContainer.mIsSplit) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.mSplitBackground;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.mBackground;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable3 = actionBarContainer.mStackedBackground;
        if (drawable3 == null || !actionBarContainer.mIsStacked) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f114a;
        if (actionBarContainer.mIsSplit) {
            if (actionBarContainer.mSplitBackground != null) {
                actionBarContainer.mBackground.getOutline(outline);
            }
        } else {
            android.graphics.drawable.Drawable drawable = actionBarContainer.mBackground;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
