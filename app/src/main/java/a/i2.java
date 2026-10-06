package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i2 extends androidx.appcompat.widget.AppCompatImageView implements a.k2 {
    public final /* synthetic */ a.j2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(a.j2 j2Var, android.content.Context context) {
        super(context, null, 2130968607);
        this.f = j2Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a.dn1.a(this, getContentDescription());
        setOnTouchListener(new a.h2(this, this, j2Var, 0));
    }

    @Override // a.k2
    public final boolean b() {
        return false;
    }

    @Override // a.k2
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            a.i90.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
