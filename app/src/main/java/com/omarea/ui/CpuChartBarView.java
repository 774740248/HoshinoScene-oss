package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuChartBarView extends a.xd1 {
    public android.graphics.Paint l;
    public float m;
    public int n;
    public int o;
    public int p;
    public final java.util.concurrent.LinkedBlockingQueue q;
    public float r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpuChartBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.n = 5;
        this.o = 35;
        this.p = 255;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            linkedBlockingQueue.add(0);
        }
        this.q = linkedBlockingQueue;
        this.s = 579373192;
        initColorAccentLocal();
    }

    private final void initColorAccentLocal() {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttributes(attrsArray)");
        this.s = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f, float f2) {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.q;
        linkedBlockingQueue.put(java.lang.Integer.valueOf(100 - ((int) ((f2 * 100.0d) / 100.0f))));
        if (linkedBlockingQueue.size() > this.n) {
            linkedBlockingQueue.poll();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float intValue;
        float f;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        if (this.l == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.l = paint;
            paint.setAntiAlias(true);
            android.graphics.Paint paint2 = this.l;
            a.wv.s(paint2);
            paint2.setStyle(android.graphics.Paint.Style.FILL);
            this.r = getWidth() / this.n;
            android.graphics.Paint paint3 = this.l;
            a.wv.s(paint3);
            paint3.setStrokeWidth(0.0f);
        }
        float f2 = this.r;
        java.util.Iterator it = this.q.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            java.lang.Integer num = (java.lang.Integer) it.next();
            android.graphics.Paint paint4 = this.l;
            a.wv.s(paint4);
            a.wv.v(num, "ratio");
            paint4.setColor(num.intValue() > 85 ? getVeryHigh() : num.intValue() > 65 ? getHigh() : this.s);
            android.graphics.Paint paint5 = this.l;
            if (paint5 != null) {
                paint5.setAlpha(java.lang.Math.min(this.o + ((int) (((num.intValue() / 100.0f) / 2) * 255)), this.p));
            }
            if (num.intValue() <= 5) {
                float f3 = this.m;
                intValue = f3 - (f3 / 20);
            } else if (num.intValue() >= 98) {
                f = 0.0f;
                float f4 = i * f2;
                float f5 = this.m;
                android.graphics.Paint paint6 = this.l;
                a.wv.s(paint6);
                canvas.drawRoundRect((0.05f * f2) + f4, f, (0.95f * f2) + f4, f5, 5.0f, 5.0f, paint6);
                i = i2;
            } else {
                intValue = ((100 - num.intValue()) * this.m) / 100;
            }
            f = intValue;
            float f42 = i * f2;
            float f52 = this.m;
            android.graphics.Paint paint62 = this.l;
            a.wv.s(paint62);
            canvas.drawRoundRect((0.05f * f2) + f42, f, (0.95f * f2) + f42, f52, 5.0f, 5.0f, paint62);
            i = i2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m = i2;
    }

    public final void setAccentColor(int i) {
        this.s = i;
    }

    public final void setData(java.lang.Integer[] numArr) {
        a.wv.w(numArr, "data");
        this.n = numArr.length;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.q;
        linkedBlockingQueue.clear();
        a.pv.a2(linkedBlockingQueue, numArr);
        invalidate();
    }

    public final void setMaxAlpha(int i) {
        this.p = i;
    }

    public final void setMaxHistory(int i) {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue;
        this.n = i;
        while (true) {
            linkedBlockingQueue = this.q;
            if (linkedBlockingQueue.size() >= i) {
                break;
            } else {
                linkedBlockingQueue.put(0);
            }
        }
        while (linkedBlockingQueue.size() > i) {
            linkedBlockingQueue.poll();
        }
        this.r = getWidth() / i;
    }

    public final void setMinAlpha(int i) {
        this.o = i;
    }
}
