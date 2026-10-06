package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class BlurViewLinearLayout extends android.widget.LinearLayout {
    public float c;
    public final a.wr d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        android.graphics.Bitmap bitmap = a.wr.f;
        this.c = a.wr.l;
        this.d = new a.wr(this);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.d.b();
        super.computeScroll();
    }

    public final float getBorderRadius() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (!this.e) {
            this.d.a();
            this.e = true;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        if (a.wr.f != null) {
            android.graphics.Paint paint = a.wr.k;
            float strokeWidth = paint.getStrokeWidth() / 2;
            float f = this.c;
            canvas.drawRoundRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, f, f, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.d.b();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.e) {
            this.d.a();
            this.e = true;
        }
        super.onViewAdded(view);
    }

    public final void setBorderRadius(float f) {
        this.c = f;
    }
}
