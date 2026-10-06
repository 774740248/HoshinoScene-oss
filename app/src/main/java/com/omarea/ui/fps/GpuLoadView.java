package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class GpuLoadView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.Paint e;
    public final android.graphics.DashPathEffect f;
    public long g;
    public java.lang.Float h;
    public a.eu i;
    public final int j;
    public final int k;
    public android.graphics.Bitmap l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public GpuLoadView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        a.vj1 vj1Var = a.du.f;
        this.j = a.tg1.h();
        this.k = a.tg1.g();
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
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
        return this.g;
    }

    public java.lang.Float getTooltipPosition() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.l;
        if (bitmap != null && bitmap.getWidth() == getWidth()) {
            android.graphics.Bitmap bitmap2 = this.l;
            a.wv.s(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else if (this.g >= 1) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.vq0(this, null), 3);
        }
        java.lang.Float f = this.h;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.h;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.ArrayList arrayList = this.m;
                java.util.ArrayList arrayList2 = this.n;
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = N * 8.5f;
                android.graphics.Paint paint = this.e;
                paint.setTextSize(f3);
                java.lang.Integer num = (java.lang.Integer) a.qv.n2(arrayList);
                int intValue = num != null ? num.intValue() : 600;
                int i = intValue > 600 ? ((intValue / 100) * 100) + (intValue % 100 <= 0 ? 0 : 100) : 600;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(i).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("9");
                }
                float f4 = 4.0f * N;
                float measureText = paint.measureText(sb.toString()) + f4;
                float f5 = N * 18.0f;
                int size = arrayList.isEmpty() ^ true ? arrayList.size() : arrayList2.size();
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                int d = a.gu.d(floatValue, measureText, f5, getWidth(), size);
                a.gu.c(canvas, floatValue, f4, getHeight() - f5, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(measureText, f4, getWidth() - f5, getHeight() - f5);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.Integer num2 = (java.lang.Integer) a.qv.h2(arrayList, d);
                if (num2 != null) {
                    arrayList3.add("GPU Freq " + a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(num2.intValue())}, 1, "%d", "format(format, *args)") + "MHz");
                    arrayList4.add(java.lang.Integer.valueOf(this.j));
                }
                java.lang.Float f6 = (java.lang.Float) a.qv.h2(arrayList2, d);
                if (f6 != null) {
                    arrayList3.add("GPU Load " + a.ai1.l(new java.lang.Object[]{java.lang.Float.valueOf(f6.floatValue())}, 1, "%.0f", "format(format, *args)") + "%");
                    arrayList4.add(java.lang.Integer.valueOf(this.k));
                }
                if (!arrayList3.isEmpty()) {
                    a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList3, f3, paint, arrayList4, 0, 768);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        if (a.fu.b(this, motionEvent, this.i)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSessionId(long j) {
        if (this.g != j) {
            this.g = j;
            this.l = null;
            invalidate();
        }
    }

    public final void setTooltipGroup(a.eu euVar) {
        a.eu euVar2 = this.i;
        if (euVar2 != null) {
            euVar2.c(this);
        }
        this.i = euVar;
        if (euVar != null) {
            euVar.b(this);
        }
    }

    @Override // a.cn1
    public void setTooltipPosition(java.lang.Float f) {
        if (a.wv.d(this.h, f)) {
            return;
        }
        this.h = f;
        invalidate();
    }
}
