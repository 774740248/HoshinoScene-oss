package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BlurViewRelativeLayout extends android.widget.RelativeLayout {
    public final a.wr c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.c = new a.wr(this);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.c.b();
        super.computeScroll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (a.wr.f != null) {
            android.graphics.Paint paint = a.wr.k;
            float strokeWidth = paint.getStrokeWidth() / 2;
            float f = a.wr.l;
            canvas.drawRoundRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, f, f, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (!this.d) {
            this.c.a();
            this.d = true;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.c.b();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.d) {
            this.c.a();
            this.d = true;
        }
        super.onViewAdded(view);
    }
}
