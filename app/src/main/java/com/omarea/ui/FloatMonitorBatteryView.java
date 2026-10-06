package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FloatMonitorBatteryView extends a.xd1 {
    public int l;
    public int m;
    public float n;
    public float o;
    public final a.vj1 p;
    public final android.graphics.RectF q;
    public int r;
    public int s;
    public double t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatMonitorBatteryView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.n = 300.0f;
        this.o = 40.0f;
        this.p = new a.vj1(new a.cd1(9, this));
        float f = this.n;
        this.q = new android.graphics.RectF(0.0f, 0.0f, f, f);
        this.t = 35.0d;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.d);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.RamInfo)");
        this.l = 100 - ((int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1)));
        obtainStyledAttributes.recycle();
    }

    private final android.graphics.Paint getCyclePaint() {
        return (android.graphics.Paint) this.p.a();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int i;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.s / 2;
        float f2 = this.n;
        float f3 = 2;
        canvas.translate(f - (f2 / f3), (this.r / 2) - (f2 / f3));
        getCyclePaint().setColor(587202559);
        android.graphics.RectF rectF = this.q;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, getCyclePaint());
        android.graphics.Paint cyclePaint = getCyclePaint();
        double d = this.t;
        cyclePaint.setColor((d >= 48.0d || this.m < 11) ? getFull() : (d > 44.0d || (i = this.l) < 16) ? getVeryHigh() : (d > 41.0d || i < 31) ? getHigh() : d > 20.0d ? getMiddle() : getColorSecondary());
        if (this.l >= 1 || this.m > 2) {
            int i2 = this.m;
            if (i2 >= 98) {
                canvas.drawArc(rectF, -90.0f, 360.0f, false, getCyclePaint());
            } else {
                canvas.drawArc(rectF, -90.0f, i2 * 3.6f, false, getCyclePaint());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s = i;
        this.r = i2;
        this.o = a.b20.N(this, 4.0f);
        if (i > i2) {
            this.n = (int) ((i2 * 0.9d) - a.b20.N(this, 4.0f));
        } else {
            this.n = (int) ((i * 0.9d) - a.b20.N(this, 4.0f));
        }
        getCyclePaint().setStrokeWidth(this.o);
        android.graphics.RectF rectF = this.q;
        float f = this.n;
        rectF.set(0.0f, 0.0f, f, f);
    }
}
