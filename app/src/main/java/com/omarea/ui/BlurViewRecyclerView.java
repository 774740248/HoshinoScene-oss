package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BlurViewRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    public final a.wr N0;
    public boolean O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.N0 = new a.wr(this);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.N0.b();
        super.computeScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.O0) {
            return;
        }
        this.N0.a();
        this.O0 = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        if (a.wr.f != null) {
            android.graphics.Paint paint = a.wr.k;
            float strokeWidth = paint.getStrokeWidth() / 2;
            float f = a.wr.l;
            canvas.drawRoundRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, f, f, paint);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.N0.b();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.O0) {
            this.N0.a();
            this.O0 = true;
        }
        super.onViewAdded(view);
    }
}
