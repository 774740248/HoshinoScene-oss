package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuChartView extends a.xd1 {
    public static final /* synthetic */ int t = 0;
    public int l;
    public int m;
    public float n;
    public float o;
    public android.graphics.Paint p;
    public int q;
    public int r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpuChartView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.n = 300.0f;
        this.o = 40.0f;
        this.s = 579373192;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.d);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.RamInfo)");
        this.l = 100 - ((int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1)));
        obtainStyledAttributes.recycle();
        initColorAccentLocal();
    }

    private final void initColorAccentLocal() {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttributes(attrsArray)");
        this.s = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f, float f2) {
        int i = 100 - ((int) ((f2 * 100.0d) / 100.0f));
        this.l = i;
        if (java.lang.Math.abs(i - this.m) <= 10) {
            this.m = this.l;
            invalidate();
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.m, this.l);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.addUpdateListener(new a.z90(1, this));
        ofInt.start();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.r / 2;
        float f2 = this.n;
        float f3 = 2;
        canvas.translate(f - (f2 / f3), (this.q / 2) - (f2 / f3));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.p = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.p;
        a.wv.s(paint2);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint3 = this.p;
        a.wv.s(paint3);
        paint3.setStrokeWidth(this.o);
        android.graphics.Paint paint4 = this.p;
        if (paint4 != null) {
            paint4.setColor(579373192);
            float f4 = this.n;
            canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f4, f4), 0.0f, 360.0f, false, paint4);
            int i = this.l;
            paint4.setColor(i > 85 ? getVeryHigh() : i > 65 ? getHigh() : this.s);
            int i2 = this.l;
            paint4.setAlpha(i2 <= 50 ? ((int) ((i2 / 100.0f) * 255)) + 127 : 255);
            paint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            if (this.l >= 1 || this.m > 2) {
                if (this.m >= 98) {
                    float f5 = this.n;
                    canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f5, f5), -90.0f, 360.0f, false, paint4);
                } else {
                    float f6 = this.n;
                    canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f6, f6), -90.0f, this.m * 3.6f, false, paint4);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r = i;
        this.q = i2;
        this.o = i / 7;
        a.b20.N(this, 18.0f);
        if (i > i2) {
            this.n = (int) ((i2 * 0.9d) - (i / 7));
        } else {
            this.n = (int) ((i * 0.9d) - (i / 7));
        }
    }
}
