package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class DDRView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public java.lang.Float g;
    public a.eu h;
    public java.util.List i;
    public final android.graphics.Paint j;
    public android.graphics.Bitmap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public DDRView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.i = a.qb0.c;
        this.j = new android.graphics.Paint();
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
        android.graphics.Bitmap bitmap = this.k;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            if (this.f < 1) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.i00(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.k;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.g;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.g;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.List list = this.i;
                if (list.isEmpty()) {
                    return;
                }
                java.util.Iterator it = list.iterator();
                int i = 4266;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    if (intValue > i) {
                        i = intValue;
                    }
                }
                android.graphics.Paint paint = this.j;
                paint.reset();
                float N = a.b20.N(this, 1.0f);
                float f3 = N * 8.5f;
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
                java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(((java.lang.Number) list.get(a.gu.d(floatValue, f5, f6, getWidth(), list.size()))).intValue())}, 1, "DDR %dMHz", "format(format, *args)");
                a.gu.c(canvas, floatValue, f4, getHeight() - f6, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f5, f4, getWidth() - f6, getHeight() - f6);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                a.vj1 vj1Var = a.du.f;
                a.gu.a(canvas, floatValue, floatValue2, rectF, l, f3, paint, a.tg1.h());
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
            this.i = a.qb0.c;
            this.k = null;
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
