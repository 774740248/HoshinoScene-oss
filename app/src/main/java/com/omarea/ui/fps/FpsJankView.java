package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FpsJankView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public java.util.ArrayList g;
    public java.util.ArrayList h;
    public final android.graphics.Paint i;
    public android.graphics.Bitmap j;
    public java.lang.Float k;
    public a.eu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public FpsJankView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = new android.graphics.Paint();
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
        return this.k;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.j;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            if (this.f < 1) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ck0(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.j;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.k;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.k;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.ArrayList arrayList = this.g;
                java.util.ArrayList arrayList2 = this.h;
                if (arrayList.size() < 1 || arrayList2.size() < 1) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = N * 8.5f;
                android.graphics.Paint paint = this.i;
                paint.setTextSize(f3);
                java.lang.Object n2 = a.qv.n2(arrayList);
                a.wv.s(n2);
                int intValue = ((java.lang.Number) n2).intValue();
                int i = intValue > 3 ? intValue : 3;
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
                a.gu.c(canvas, floatValue, f4, getHeight() - f6, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f5, f4, getWidth() - f6, getHeight() - f6);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                int intValue2 = ((java.lang.Number) ((d < 0 || d > a.b20.d0(arrayList)) ? 0 : arrayList.get(d))).intValue();
                int intValue3 = ((java.lang.Number) ((d < 0 || d > a.b20.d0(arrayList2)) ? 0 : arrayList2.get(d))).intValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add("JANK " + intValue2);
                arrayList3.add("BIG " + intValue3);
                a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList3, f3, paint, a.b20.z0(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#87d3ff")), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FDB6E2"))), 0, 768);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        if (a.fu.b(this, motionEvent, this.l)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSessionId(long j) {
        if (j >= 1 && this.f != j) {
            this.f = j;
            this.j = null;
            this.g = new java.util.ArrayList();
            this.h = new java.util.ArrayList();
        }
    }

    public final void setTooltipGroup(a.eu euVar) {
        a.eu euVar2 = this.l;
        if (euVar2 != null) {
            euVar2.c(this);
        }
        this.l = euVar;
        if (euVar != null) {
            euVar.b(this);
        }
    }

    @Override // a.cn1
    public void setTooltipPosition(java.lang.Float f) {
        if (a.wv.d(this.k, f)) {
            return;
        }
        this.k = f;
        invalidate();
    }
}
