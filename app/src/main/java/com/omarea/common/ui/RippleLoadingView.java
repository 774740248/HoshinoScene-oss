package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class RippleLoadingView extends android.view.View {
    public static final /* synthetic */ int k = 0;
    public final android.graphics.Paint c;
    public android.animation.ValueAnimator d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleLoadingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.c = paint;
        this.e = 3;
        this.f = 1400;
        this.g = 0.1f;
        this.h = (int) ((2.5f * getResources().getDisplayMetrics().density) + 0.5f);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…roid.R.attr.colorAccent))");
        int color = obtainStyledAttributes.getColor(0, -15436572);
        obtainStyledAttributes.recycle();
        this.i = color;
        android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, a.j81.d, 0, 0);
        a.wv.v(obtainStyledAttributes2, "context.obtainStyledAttr…ingView, defStyleAttr, 0)");
        try {
            this.i = obtainStyledAttributes2.getColor(0, this.i);
            this.e = obtainStyledAttributes2.getInteger(1, this.e);
            this.f = obtainStyledAttributes2.getInteger(2, this.f);
            this.h = obtainStyledAttributes2.getDimensionPixelSize(4, this.h);
            this.g = obtainStyledAttributes2.getFloat(3, this.g);
            obtainStyledAttributes2.recycle();
            paint.setColor(this.i);
            paint.setStrokeWidth(this.h);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            this.j = 0.33f;
            invalidate();
        } else {
            if (this.d != null) {
                return;
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(this.f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.addUpdateListener(new a.pr1(this, 1, ofFloat));
            ofFloat.start();
            this.d = ofFloat;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.d = null;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = java.lang.Math.min(width, height) - (this.h / 2.0f);
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            float f = (this.j + (i2 / this.e)) % 1.0f;
            float f2 = this.g;
            float f3 = ((1.0f - f2) * f) + f2;
            int i3 = (int) ((1.0f - f) * 255);
            if (i3 > 0) {
                android.graphics.Paint paint = this.c;
                paint.setAlpha(i3);
                canvas.drawCircle(width, height, f3 * min, paint);
            }
        }
    }
}
