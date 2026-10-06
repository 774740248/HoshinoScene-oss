package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FrameTimeView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public final android.graphics.Paint g;
    public android.graphics.Bitmap h;
    public java.lang.Float i;
    public a.eu j;
    public java.util.List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public FrameTimeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = new android.graphics.Paint();
        this.k = a.qb0.c;
        this.c = new a.r51(getContext());
    }

    @Override // a.cn1
    public android.view.View getChartView() {
        return this;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final long getSessionId() {
        return this.f;
    }

    public java.lang.Float getTooltipPosition() {
        return this.i;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.h;
        if (bitmap != null && bitmap.getWidth() == getWidth()) {
            android.graphics.Bitmap bitmap2 = this.h;
            a.wv.s(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else if (this.f >= 1) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.mo0(this, null), 3);
        }
        java.lang.Float f = this.i;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.i;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.List list = this.k;
                if (list.isEmpty()) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = N * 8.5f;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(100).length();
                for (int i = 0; i < length; i++) {
                    sb.append("9");
                }
                android.graphics.Paint paint = this.g;
                float f4 = 4.0f * N;
                float measureText = paint.measureText(sb.toString()) + f4;
                float f5 = N * 18.0f;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                double doubleValue = ((java.lang.Number) list.get(a.gu.d(floatValue, measureText, f5, getWidth(), list.size()))).doubleValue();
                a.gu.c(canvas, floatValue, f4, getHeight() - f5, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(measureText, f4, getWidth() - f5, getHeight() - f5);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue)}, 1, "%.1fms", "format(format, *args)");
                a.vj1 vj1Var = a.du.f;
                a.gu.a(canvas, floatValue, floatValue2, rectF, l, f3, paint, a.tg1.h() | (-16777216));
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        if (a.fu.b(this, motionEvent, this.j)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSessionId(long j) {
        if (this.f != j) {
            this.f = j;
            this.h = null;
            invalidate();
        }
    }

    public final void setTooltipGroup(a.eu euVar) {
        a.eu euVar2 = this.j;
        if (euVar2 != null) {
            euVar2.c(this);
        }
        this.j = euVar;
        if (euVar != null) {
            euVar.b(this);
        }
    }

    @Override // a.cn1
    public void setTooltipPosition(java.lang.Float f) {
        if (a.wv.d(this.i, f)) {
            return;
        }
        this.i = f;
        invalidate();
    }
}
