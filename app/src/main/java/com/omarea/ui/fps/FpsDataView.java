package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FpsDataView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.Paint e;
    public final android.graphics.DashPathEffect f;
    public a.yj0 g;
    public long h;
    public java.lang.Float i;
    public a.eu j;
    public java.util.List k;
    public java.util.List l;
    public java.util.List m;
    public java.util.List n;
    public java.util.List o;
    public android.graphics.Bitmap p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public FpsDataView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = (a.yj0) a.op.N1(a.yj0.values());
        a.qb0 qb0Var = a.qb0.c;
        this.k = qb0Var;
        this.l = qb0Var;
        this.m = qb0Var;
        this.n = qb0Var;
        this.o = qb0Var;
        this.c = new a.r51(getContext());
    }

    @Override // a.cn1
    public android.view.View getChartView() {
        return this;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final a.yj0 getRightDimension() {
        return this.g;
    }

    public final long getSessionId() {
        return this.h;
    }

    public java.lang.Float getTooltipPosition() {
        return this.i;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        java.lang.Float f;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.p;
        if (bitmap != null && bitmap.getWidth() == getWidth()) {
            android.graphics.Bitmap bitmap2 = this.p;
            a.wv.s(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else if (this.h >= 1) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ak0(this, null), 3);
        }
        java.lang.Float f2 = this.i;
        if (f2 != null) {
            f2.floatValue();
            java.lang.Float f3 = this.i;
            if (f3 != null) {
                float floatValue = f3.floatValue();
                java.util.List list = this.k;
                if (list.size() < 1) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f4 = 18.0f * N;
                float f5 = 4.0f * N;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                int d = a.gu.d(floatValue, f4, f4, getWidth(), list.size());
                if (d < 0 || d >= list.size()) {
                    return;
                }
                android.graphics.Paint paint = this.e;
                a.gu.c(canvas, floatValue, f5, getHeight() - f4, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f4, f5, getWidth() - f4, getHeight() - f4);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f5;
                float floatValue3 = ((java.lang.Number) list.get(d)).floatValue();
                float f6 = N * 8.5f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String format = java.lang.String.format("FPS %.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue3)}, 1));
                a.wv.v(format, "format(format, *args)");
                arrayList.add(format);
                arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#808080")));
                int ordinal = this.g.ordinal();
                if (ordinal == 0) {
                    java.lang.Float f7 = (java.lang.Float) a.qv.h2(this.l, d);
                    if (f7 != null) {
                        java.lang.String format2 = java.lang.String.format("TEMP %.1f℃", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f7.floatValue())}, 1));
                        a.wv.v(format2, "format(format, *args)");
                        arrayList.add(format2);
                        arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FF7E00")));
                    }
                } else if (ordinal == 1) {
                    java.lang.Double d2 = (java.lang.Double) a.qv.h2(this.n, d);
                    if (d2 != null) {
                        java.lang.String format3 = java.lang.String.format("CPU %.0f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d2.doubleValue())}, 1));
                        a.wv.v(format3, "format(format, *args)");
                        arrayList.add(format3);
                        arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fc6bc5")));
                    }
                    java.lang.Float f8 = (java.lang.Float) a.qv.h2(this.o, d);
                    if (f8 != null) {
                        java.lang.String format4 = java.lang.String.format("GPU %.0f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f8.floatValue())}, 1));
                        a.wv.v(format4, "format(format, *args)");
                        arrayList.add(format4);
                        arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#87d3ff")));
                    }
                } else if (ordinal == 2 && (f = (java.lang.Float) a.qv.h2(this.m, d)) != null) {
                    java.lang.String format5 = java.lang.String.format("BAT %.0f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f.floatValue())}, 1));
                    a.wv.v(format5, "format(format, *args)");
                    arrayList.add(format5);
                    arrayList2.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#87d3ff")));
                }
                a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList, f6, paint, arrayList2, 0, 768);
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

    public final void setRightDimension(a.yj0 yj0Var) {
        a.wv.w(yj0Var, "rightDIMENSION");
        if (this.g != yj0Var) {
            this.g = yj0Var;
            this.p = null;
            invalidate();
        }
    }

    public final void setSessionId(long j) {
        if (this.h != j) {
            this.h = j;
            this.p = null;
            a.qb0 qb0Var = a.qb0.c;
            this.k = qb0Var;
            this.l = qb0Var;
            this.m = qb0Var;
            this.n = qb0Var;
            this.o = qb0Var;
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
