package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PowerView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public java.lang.Float g;
    public a.eu h;
    public final android.graphics.Paint i;
    public android.graphics.Bitmap j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public PowerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.i = new android.graphics.Paint();
        this.k = new java.util.ArrayList();
        this.l = new java.util.ArrayList();
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
        return this.g;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.j;
        if (bitmap != null && bitmap.getWidth() == getWidth()) {
            android.graphics.Bitmap bitmap2 = this.j;
            a.wv.s(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else if (this.f >= 1) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.r61(this, null), 3);
        }
        java.lang.Float f = this.g;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.g;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.ArrayList arrayList = this.k;
                if (arrayList.isEmpty()) {
                    return;
                }
                java.lang.Double o2 = a.qv.o2(arrayList);
                a.wv.s(o2);
                double doubleValue = o2.doubleValue();
                int i = doubleValue > 25.0d ? 30 : doubleValue > 20.0d ? 25 : doubleValue > 15.0d ? 20 : doubleValue > 10.0d ? 15 : doubleValue > 8.0d ? 10 : doubleValue > 7.0d ? 8 : doubleValue > 6.0d ? 7 : doubleValue > 5.0d ? 6 : 5;
                float N = a.b20.N(this, 1.0f);
                float f3 = N * 8.5f;
                android.graphics.Paint paint = this.i;
                paint.setTextSize(f3);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(i).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("9");
                }
                float measureText = paint.measureText(sb.toString());
                float f4 = 4.0f * N;
                float f5 = measureText + f4;
                float f6 = N * 18.0f;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                int d = a.gu.d(floatValue, f5, f6, getWidth(), arrayList.size());
                java.lang.Object obj = arrayList.get(d);
                a.wv.v(obj, "powerData[index]");
                double doubleValue2 = ((java.lang.Number) obj).doubleValue();
                a.gu.c(canvas, floatValue, f4, getHeight() - f6, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f5, f4, getWidth() - f6, getHeight() - f6);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.String format = java.lang.String.format("Power %.2fW", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue2)}, 1));
                a.wv.v(format, "format(format, *args)");
                arrayList2.add(format);
                a.vj1 vj1Var = a.du.f;
                arrayList3.add(java.lang.Integer.valueOf(a.tg1.g()));
                java.util.ArrayList arrayList4 = this.l;
                if (d < arrayList4.size()) {
                    java.lang.String format2 = java.lang.String.format("Capacity %.0f%%", java.util.Arrays.copyOf(new java.lang.Object[]{arrayList4.get(d)}, 1));
                    a.wv.v(format2, "format(format, *args)");
                    arrayList2.add(format2);
                    arrayList3.add(java.lang.Integer.valueOf(a.tg1.h()));
                }
                a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList2, f3, paint, arrayList3, 0, 768);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        if (a.fu.b(this, motionEvent, this.h)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSessionId(long j) {
        if (this.f != j) {
            this.f = j;
            this.j = null;
            this.k = new java.util.ArrayList();
            this.l = new java.util.ArrayList();
            invalidate();
        }
    }

    public final void setTooltipGroup(a.eu euVar) {
        a.eu euVar2 = this.h;
        if (euVar2 != null) {
            euVar2.c(this);
        }
        this.h = euVar;
        if (euVar != null) {
            euVar.b(this);
        }
    }

    @Override // a.cn1
    public void setTooltipPosition(java.lang.Float f) {
        if (a.wv.d(this.g, f)) {
            return;
        }
        this.g = f;
        invalidate();
    }
}
