package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BatteryIOView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public final android.graphics.Paint g;
    public android.graphics.Bitmap h;
    public java.lang.Float i;
    public a.eu j;
    public java.util.List k;
    public java.util.List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public BatteryIOView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = new android.graphics.Paint();
        a.qb0 qb0Var = a.qb0.c;
        this.k = qb0Var;
        this.l = qb0Var;
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
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ar(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.h;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.i;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.i;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.List list = this.k;
                java.util.List list2 = this.l;
                if (list.isEmpty()) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = 8.5f * N;
                android.graphics.Paint paint = this.g;
                paint.setTextSize(f3);
                java.lang.Long l = (java.lang.Long) a.qv.n2(list);
                long longValue = l != null ? l.longValue() : 0L;
                int i = longValue > 4000 ? 5000 : longValue > 3000 ? 4000 : longValue > 2500 ? 3000 : longValue > 2000 ? 2500 : longValue > 1500 ? 2000 : longValue > 1000 ? 1500 : 1000;
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
                int d = a.gu.d(floatValue, f5, f6, getWidth(), list.size());
                a.gu.c(canvas, floatValue, f4, getHeight() - f6, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f5, f4, getWidth() - f6, getHeight() - f6);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.lang.Long l2 = (java.lang.Long) a.qv.h2(list, d);
                long longValue2 = l2 != null ? l2.longValue() : 0L;
                java.lang.Float f7 = (java.lang.Float) a.qv.h2(list2, d);
                float floatValue3 = f7 != null ? f7.floatValue() : 0.0f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String format = java.lang.String.format("I/O %dmA", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(longValue2)}, 1));
                a.wv.v(format, "format(format, *args)");
                arrayList.add(format);
                java.lang.String format2 = java.lang.String.format("Capacity %.0f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue3)}, 1));
                a.wv.v(format2, "format(format, *args)");
                arrayList.add(format2);
                a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList, f3, paint, null, 0, 896);
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
            a.qb0 qb0Var = a.qb0.c;
            this.k = qb0Var;
            this.l = qb0Var;
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
