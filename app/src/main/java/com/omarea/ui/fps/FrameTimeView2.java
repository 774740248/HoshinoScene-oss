package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FrameTimeView2 extends android.view.View {
    public java.util.ArrayList c;
    public java.lang.Double d;
    public final android.graphics.Paint e;
    public android.graphics.Bitmap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameTimeView2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = new java.util.ArrayList();
        this.d = java.lang.Double.valueOf(0.0d);
        this.e = new android.graphics.Paint();
        new a.r51(getContext());
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.f;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.oo0(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
    }
}
