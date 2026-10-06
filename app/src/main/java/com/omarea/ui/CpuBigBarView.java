package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuBigBarView extends a.xd1 {
    public android.graphics.Paint l;
    public float m;
    public final int n;
    public final java.util.concurrent.LinkedBlockingQueue o;
    public float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpuBigBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.n = 10;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        for (int i = 0; i < 10; i++) {
            linkedBlockingQueue.add(0);
        }
        this.o = linkedBlockingQueue;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float intValue;
        float f;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        if (this.l == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.l = paint;
            this.p = getWidth() / this.n;
            android.graphics.Paint paint2 = this.l;
            a.wv.s(paint2);
            paint2.setStrokeWidth(0.0f);
        }
        float f2 = this.p;
        java.util.Iterator it = this.o.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            android.graphics.Paint paint3 = this.l;
            a.wv.s(paint3);
            a.wv.v(num, "ratio");
            paint3.setColor(num.intValue() > 85 ? getVeryHigh() : num.intValue() > 65 ? getHigh() : getColorAccent());
            paint3.setAlpha(((int) (((num.intValue() / 100.0f) / 2) * 255)) + 35);
            if (num.intValue() <= 2) {
                intValue = this.m - 10.0f;
            } else if (num.intValue() >= 98) {
                f = 0.0f;
                float f3 = i * f2;
                float f4 = this.m;
                android.graphics.Paint paint4 = this.l;
                a.wv.s(paint4);
                canvas.drawRoundRect((0.05f * f2) + f3, f, (0.95f * f2) + f3, f4, 5.0f, 5.0f, paint4);
                i++;
            } else {
                intValue = ((100 - num.intValue()) * this.m) / 100;
            }
            f = intValue;
            float f32 = i * f2;
            float f42 = this.m;
            android.graphics.Paint paint42 = this.l;
            a.wv.s(paint42);
            canvas.drawRoundRect((0.05f * f2) + f32, f, (0.95f * f2) + f32, f42, 5.0f, 5.0f, paint42);
            i++;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m = i2;
    }
}
