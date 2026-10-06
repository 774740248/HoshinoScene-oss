package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ThreadCPUView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public java.lang.Float d;
    public java.util.List e;
    public a.eu f;
    public final a.gy g;
    public final android.graphics.Paint h;
    public final android.graphics.DashPathEffect i;
    public long j;
    public a.bm1 k;
    public a.v01 l;
    public final java.util.ArrayList m;
    public final java.util.ArrayList n;
    public android.graphics.Bitmap o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.gy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.bm1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.v01, java.lang.Object] */
    public ThreadCPUView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.e = a.qb0.c;
        this.g = new a.gy();
        this.h = new android.graphics.Paint();
        this.i = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.k = new a.bm1();
        this.l = new a.v01();
        new a.ls();
        this.m = a.ls.d();
        this.n = new a.p4().j();
        this.c = new a.r51(getContext());
    }

    @Override // a.cn1
    public android.view.View getChartView() {
        return this;
    }

    public final java.util.ArrayList<java.lang.String[]> getClusters() {
        return this.m;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return this.n;
    }

    public final long getSessionId() {
        return this.j;
    }

    public final a.eu getTooltipGroup() {
        return this.f;
    }

    public java.lang.Float getTooltipPosition() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.o;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            if (this.j < 1) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ul1(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.o;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.d;
        if (f != null) {
            float floatValue = f.floatValue();
            if (this.e.isEmpty()) {
                return;
            }
            float N = a.b20.N(this, 1.0f);
            float f2 = 7.5f * N;
            float f3 = 10.0f * N;
            float f4 = 9.0f * N;
            float f5 = N * 0.0f;
            android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
            int d = a.gu.d(floatValue, f3, f3, getWidth(), this.e.size());
            if (d < 0 || d >= this.e.size()) {
                return;
            }
            a.am1 am1Var = (a.am1) this.e.get(d);
            a.v01 v01Var = this.l;
            long j = v01Var.b;
            long j2 = v01Var.f616a;
            getHeight();
            getHeight();
            float width = ((float) ((((float) (am1Var.b - j2)) / 60.0f) * ((((getWidth() - f3) - f3) * 1.0d) / (((j - j2) + 1) / 60.0d)))) + f3;
            android.graphics.Paint paint = this.h;
            a.gu.c(canvas, width, f5, getHeight() - f4, paint);
            android.graphics.RectF rectF = new android.graphics.RectF(f3, f5, getWidth() - f3, getHeight() - f4);
            java.lang.Float a2 = a.fu.a(this);
            if (a2 != null) {
                f5 = a2.floatValue();
            }
            double d2 = (am1Var.b - j2) / 60.0d;
            java.lang.String[] strArr = new java.lang.String[4];
            java.lang.String format = java.lang.String.format("%.1f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(am1Var.f)}, 1));
            a.wv.v(format, "format(format, *args)");
            strArr[0] = "LOAD ".concat(format);
            int i = am1Var.d;
            strArr[1] = " CPU " + (i == -1 ? "?" : java.lang.Integer.valueOf(i));
            strArr[2] = a.ai1.g("CPUS ", am1Var.c);
            this.g.getClass();
            strArr[3] = a.ai1.g("TIME ", a.gy.o(d2));
            a.gu.b(canvas, width, f5, rectF, a.b20.z0(strArr), f2, paint, null, 0, 896);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        return a.fu.b(this, motionEvent, this.f);
    }

    public final void setTooltipGroup(a.eu euVar) {
        a.eu euVar2 = this.f;
        if (euVar2 != null) {
            euVar2.c(this);
        }
        this.f = euVar;
        if (euVar != null) {
            euVar.b(this);
        }
    }

    @Override // a.cn1
    public void setTooltipPosition(java.lang.Float f) {
        this.d = f;
        invalidate();
    }
}
