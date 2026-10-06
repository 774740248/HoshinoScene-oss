package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class MemoryChartView extends a.xd1 {
    public int l;
    public int m;
    public float n;
    public float o;
    public int p;
    public int q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryChartView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.m = 100;
        this.n = 300.0f;
        this.o = 40.0f;
        this.r = 579373192;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.d);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.RamInfo)");
        this.l = 100 - ((int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1)));
        obtainStyledAttributes.recycle();
        initColorAccentLocal();
    }

    private final void initColorAccentLocal() {
        this.r = getContext().getColor(2131099704);
    }

    public final void a(float f, float f2, float f3) {
        if (f2 == f && f == 0.0f) {
            this.l = 0;
            this.m = 100;
        } else {
            double d = f;
            this.l = 100 - ((int) ((f2 * 100.0d) / d));
            this.m = (int) ((f3 * 100.0d) / d);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.q / 2;
        float f2 = this.n / 2;
        canvas.translate(f - f2, (this.p / 2) - f2);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.o);
        paint.setColor(579373192);
        float f3 = this.n;
        canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f3, f3), 0.0f, 360.0f, false, paint);
        int i = this.l;
        if (i == 0) {
            return;
        }
        float f4 = i / this.m;
        double d = f4;
        paint.setColor(d > 1.8d ? getFull() : d > 1.45d ? getVeryHigh() : d > 1.2d ? getHigh() : this.r);
        int i2 = (f4 > 1.0f ? (int) (((f4 - 1) / 0.8d) * 50) : 0) + 125;
        if (i2 > 175) {
            i2 = 175;
        }
        paint.setAlpha(java.lang.Integer.valueOf(i2).intValue());
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        float f5 = this.n;
        canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f5, f5), -90.0f, (this.l * 3.6f) + 1.0f, false, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.q = i;
        this.p = i2;
        this.o = i / 6;
        if (i > i2) {
            this.n = (int) ((i2 * 0.9d) - (i / 6));
        } else {
            this.n = (int) ((i * 0.9d) - (i / 6));
        }
    }
}
