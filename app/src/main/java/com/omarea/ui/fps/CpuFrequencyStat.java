package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuFrequencyStat extends android.view.View {
    public final a.r51 c;
    public final android.graphics.Paint d;
    public final android.graphics.DashPathEffect e;
    public long f;
    public final a.ls g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public final java.util.ArrayList j;
    public android.graphics.Bitmap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpuFrequencyStat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new android.graphics.Paint();
        this.e = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = new a.ls();
        java.util.ArrayList d = a.ls.d();
        this.h = d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.wv.v(d, "clusters");
        java.util.Iterator it = d.iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it.next();
            if (strArr.length > 1) {
                int length = strArr.length;
                for (int i = 1; i < length; i++) {
                    java.lang.String str = strArr[i];
                    a.wv.s(str);
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                }
            }
        }
        this.i = arrayList;
        this.j = new a.p4().j();
        this.c = new a.r51(getContext());
    }

    public final void a() {
        if (this.f >= 1 && getWidth() > 0) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.lz(this, null), 3);
        }
    }

    public final java.util.ArrayList<java.lang.String[]> getClusters() {
        return this.h;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return this.j;
    }

    public final a.ls getCpuUtils() {
        return this.g;
    }

    public final java.util.ArrayList<java.lang.Integer> getExcludedCores() {
        return this.i;
    }

    public final long getSessionId() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.k;
        if (bitmap != null) {
            a.wv.s(bitmap);
            if (bitmap.getWidth() == getWidth()) {
                android.graphics.Bitmap bitmap2 = this.k;
                a.wv.s(bitmap2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
                return;
            }
        }
        a();
    }

    public final void setSessionId(long j) {
        if (this.f != j) {
            this.f = j;
            this.k = null;
            invalidate();
        }
    }
}
