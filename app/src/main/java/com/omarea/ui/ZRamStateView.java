package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ZRamStateView extends a.xd1 {
    public int l;
    public int m;
    public float n;
    public float o;
    public final a.vj1 p;
    public final android.graphics.RectF q;
    public int r;
    public int s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZRamStateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.n = 300.0f;
        this.o = 40.0f;
        this.p = new a.vj1(new a.cd1(11, this));
        float f = this.n;
        this.q = new android.graphics.RectF(0.0f, 0.0f, f, f);
        this.t = 579373192;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.d);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.RamInfo)");
        this.l = 100 - ((int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1)));
        obtainStyledAttributes.recycle();
        initColorAccentLocal();
    }

    private final void initColorAccentLocal() {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttributes(attrsArray)");
        this.t = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }

    private final android.graphics.Paint getCyclePaint() {
        return (android.graphics.Paint) this.p.a();
    }

    public final void a(float f, float f2) {
        if (f2 == f && f == 0.0f) {
            this.l = 0;
        } else {
            this.l = 100 - ((int) ((f2 * 100.0d) / f));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.s / 2;
        float f2 = this.n;
        float f3 = 2;
        canvas.translate(f - (f2 / f3), (this.r / 2) - (f2 / f3));
        int i = this.l;
        int veryHigh = i > 89 ? getVeryHigh() : i > 80 ? getHigh() : this.t;
        getCyclePaint().setColor(android.graphics.Color.argb(35, android.graphics.Color.red(veryHigh), android.graphics.Color.green(veryHigh), android.graphics.Color.blue(veryHigh)));
        android.graphics.RectF rectF = this.q;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, getCyclePaint());
        if (this.l == 0) {
            return;
        }
        getCyclePaint().setColor(veryHigh);
        if (this.l > 50) {
            getCyclePaint().setAlpha(255);
        } else {
            getCyclePaint().setAlpha(((int) ((this.l / 100.0f) * 255)) + 127);
        }
        canvas.drawArc(rectF, -90.0f, (this.m * 3.6f) + 1.0f, false, getCyclePaint());
        int i2 = this.m;
        int i3 = this.l;
        if (i2 < i3) {
            this.m = i2 + 1;
            invalidate();
        } else if (i2 > i3) {
            this.m = i2 - 1;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s = i;
        this.r = i2;
        this.o = i * 0.15f;
        if (i > i2) {
            this.n = (int) ((i2 * 0.9d) - (i * 0.15f));
        } else {
            this.n = (int) ((i * 0.9d) - (i * 0.15f));
        }
        getCyclePaint().setStrokeWidth(this.o);
        android.graphics.RectF rectF = this.q;
        float f = this.n;
        rectF.set(0.0f, 0.0f, f, f);
    }
}
