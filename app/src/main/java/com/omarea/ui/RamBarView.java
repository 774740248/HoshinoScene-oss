package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class RamBarView extends a.xd1 {
    public int l;
    public int m;
    public android.graphics.Paint n;
    public int o;
    public int p;
    public int q;
    public float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RamBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.q = 579373192;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.d);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.RamInfo)");
        this.l = 100 - ((int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1)));
        obtainStyledAttributes.recycle();
        initColorAccentLocal();
    }

    private final void initColorAccentLocal() {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttributes(attrsArray)");
        this.q = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
    }

    public final void a(android.graphics.Canvas canvas, int i, int i2, float f) {
        android.graphics.Paint paint = this.n;
        if (paint != null) {
            paint.setColor(i2);
            float f2 = i;
            float f3 = ((f2 > 75 + this.r ? (int) ((((f2 - 75) - this.r) / 25) * 50) : 0) + 125) * f;
            paint.setAlpha((int) (f3 > 175.0f ? 175.0f : f3));
            float f4 = (this.p / 100.0f) * f2;
            int i3 = this.o;
            canvas.drawRoundRect(0.0f, 0.0f, f4, i3, i3 / 2.0f, i3 / 2.0f, paint);
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        if (f2 == f && f == 0.0f) {
            this.l = 0;
            this.m = 0;
        } else {
            double d = f;
            this.l = 100 - ((int) ((f2 * 100.0d) / d));
            this.m = 100 - ((int) ((f4 * 100.0d) / d));
        }
        this.r = f3;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(0.0f, 0.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeWidth(this.o);
        this.n = paint;
        paint.setColor(579373192);
        float f = this.p;
        float f2 = this.o;
        float f3 = f2 / 2.0f;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, paint);
        float f4 = this.l;
        float f5 = this.r;
        int full = f4 > ((float) 90) + f5 ? getFull() : f4 > ((float) 85) + f5 ? getVeryHigh() : f4 > ((float) 80) + f5 ? getHigh() : this.q;
        int i = this.m;
        if (i == 0 || i == 100) {
            a(canvas, this.l, full, 1.0f);
        } else {
            a(canvas, i, full, 0.5f);
            a(canvas, this.l, full, 0.5f);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = i;
        this.o = i2;
        a.b20.N(this, 8.0f);
        a.b20.N(this, 18.0f);
    }
}
