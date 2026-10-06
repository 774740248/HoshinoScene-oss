package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ProgressCircle extends android.view.View {
    public final int c;
    public float d;
    public float e;
    public int f;
    public android.graphics.Paint g;
    public android.graphics.Paint h;
    public android.graphics.Paint i;
    public final int j;
    public int k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = 300.0f;
        this.e = 10.0f;
        this.f = 20;
        this.j = -7829368;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j81.c);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr….styleable.ProgressState)");
        this.c = (int) ((obtainStyledAttributes.getInteger(0, 1) * 100.0d) / obtainStyledAttributes.getInteger(1, 1));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.l / 2;
        float f2 = this.d;
        float f3 = 2;
        canvas.translate(f - (f2 / f3), (this.k / 2) - (f2 / f3));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.g;
        a.wv.s(paint2);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        paint2.setStyle(style);
        android.graphics.Paint paint3 = this.g;
        a.wv.s(paint3);
        paint3.setStrokeWidth(this.e);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.h = paint4;
        paint4.setAntiAlias(true);
        android.graphics.Paint paint5 = this.h;
        a.wv.s(paint5);
        paint5.setColor(this.j);
        android.graphics.Paint paint6 = this.h;
        a.wv.s(paint6);
        paint6.setStyle(style);
        android.graphics.Paint paint7 = this.h;
        a.wv.s(paint7);
        paint7.setStrokeWidth(1.0f);
        android.graphics.Paint paint8 = this.h;
        a.wv.s(paint8);
        paint8.setTextSize(this.f);
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.i = paint9;
        paint9.setAntiAlias(true);
        android.graphics.Paint paint10 = this.i;
        a.wv.s(paint10);
        paint10.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint11 = this.i;
        a.wv.s(paint11);
        paint11.setStrokeWidth(20.0f);
        android.graphics.Paint paint12 = this.g;
        a.wv.s(paint12);
        paint12.setColor(579373192);
        float f4 = this.d;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f4, f4);
        android.graphics.Paint paint13 = this.g;
        a.wv.s(paint13);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint13);
        android.graphics.Paint paint14 = this.g;
        a.wv.s(paint14);
        paint14.setColor(android.graphics.Color.rgb(255, 15, 0));
        android.graphics.Paint paint15 = this.g;
        a.wv.s(paint15);
        paint15.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        if (this.c < 1) {
            return;
        }
        float f5 = this.d;
        android.graphics.Paint paint16 = this.g;
        a.wv.s(paint16);
        canvas.drawArc(new android.graphics.RectF(0.0f, 0.0f, f5, f5), -90.0f, 0 * 3.6f, false, paint16);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l = i;
        this.k = i2;
        android.content.Context context = getContext();
        a.wv.v(context, "context");
        this.e = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        android.content.Context context2 = getContext();
        a.wv.v(context2, "context");
        this.f = (int) ((18.0f * context2.getResources().getDisplayMetrics().density) + 0.5f);
        if (i > i2) {
            this.d = (int) ((i2 * 0.9d) - this.e);
        } else {
            this.d = (int) ((i * 0.9d) - this.e);
        }
    }
}
