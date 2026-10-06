package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuTemperatureView extends android.view.View implements a.cn1 {
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
    public CpuTemperatureView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            if (this.f < 1) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.rz(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.h;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.i;
        if (f != null) {
            f.floatValue();
            java.util.List list = this.k;
            if (this.i == null || list.size() < 1) {
                return;
            }
            float N = a.b20.N(this, 1.0f);
            float f2 = N * 8.5f;
            android.graphics.Paint paint = this.g;
            paint.setTextSize(f2);
            java.lang.Double o2 = a.qv.o2(list);
            a.wv.s(o2);
            double doubleValue = o2.doubleValue();
            int i = doubleValue > 130.0d ? 150 : doubleValue > 120.0d ? 130 : doubleValue > 110.0d ? 120 : doubleValue > 100.0d ? 110 : 100;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = java.lang.String.valueOf(i).length();
            for (int i2 = 0; i2 < length; i2++) {
                sb.append("9");
            }
            float measureText = paint.measureText(sb.toString());
            float f3 = 4.0f * N;
            float f4 = measureText + f3;
            float f5 = N * 18.0f;
            android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
            java.lang.Float f6 = this.i;
            a.wv.s(f6);
            double doubleValue2 = ((java.lang.Number) list.get(a.gu.d(f6.floatValue(), f4, f5, getWidth(), list.size()))).doubleValue();
            java.lang.Float f7 = this.i;
            a.wv.s(f7);
            a.gu.c(canvas, f7.floatValue(), f3, getHeight() - f5, paint);
            android.graphics.RectF rectF = new android.graphics.RectF(f4, f3, getWidth() - f5, getHeight() - f5);
            java.lang.Float a2 = a.fu.a(this);
            float floatValue = a2 != null ? a2.floatValue() : f3;
            java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue2)}, 1, "CPU %.1f℃", "format(format, *args)");
            java.lang.Float f8 = this.i;
            a.wv.s(f8);
            float floatValue2 = f8.floatValue();
            a.vj1 vj1Var = a.du.f;
            a.gu.a(canvas, floatValue2, floatValue, rectF, l, f2, paint, a.tg1.h());
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
            this.k = a.qb0.c;
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
