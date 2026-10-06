package com.omarea.ui.bench;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CyclesPowerView extends android.view.View {
    public final android.graphics.Paint c;
    public final android.graphics.DashPathEffect d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public boolean g;
    public java.util.ArrayList h;
    public android.graphics.Bitmap i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyclesPowerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = new android.graphics.Paint();
        this.d = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        new a.ls();
        this.e = a.ls.d();
        this.f = new a.p4().j();
        this.h = new java.util.ArrayList();
        new a.r51(getContext());
    }

    public static final void setSamples$lambda$0(com.omarea.ui.bench.CyclesPowerView cyclesPowerView) {
        a.wv.w(cyclesPowerView, "this$0");
        cyclesPowerView.b();
    }

    public final void b() {
        a.wv.M0(a.wv.b(a.z80.f728a), null, new a.f00(this, null), 3);
    }

    public final java.util.ArrayList<java.lang.String[]> getClusters() {
        return this.e;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return this.f;
    }

    public final boolean getShowFreq() {
        return this.g;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.i;
        if (bitmap != null) {
            a.wv.s(bitmap);
            if (bitmap.getWidth() == getWidth()) {
                android.graphics.Bitmap bitmap2 = this.i;
                a.wv.s(bitmap2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
                return;
            }
        }
        b();
    }

    public final void setSamples(java.util.ArrayList<a.g61> arrayList) {
        a.wv.w(arrayList, "samples");
        this.h = arrayList;
        post(new a.fw(20, this));
    }

    public final void setShowFreq(boolean z) {
        this.g = z;
        b();
    }
}
