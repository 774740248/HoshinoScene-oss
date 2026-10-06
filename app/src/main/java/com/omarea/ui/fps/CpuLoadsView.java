package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuLoadsView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.Paint e;
    public final android.graphics.DashPathEffect f;
    public long g;
    public java.lang.Float h;
    public java.util.ArrayList i;
    public a.eu j;
    public final java.util.ArrayList k;
    public final int l;
    public final java.util.ArrayList m;
    public final int n;
    public final java.util.ArrayList o;
    public android.graphics.Bitmap p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public CpuLoadsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.i = new java.util.ArrayList();
        new a.ls();
        this.k = a.ls.d();
        new a.ls();
        this.l = a.ls.f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(-1);
        this.m = arrayList;
        a.vj1 vj1Var = a.du.f;
        this.n = a.tg1.h();
        this.o = new a.p4().j();
        this.c = new a.r51(getContext());
    }

    @Override // a.cn1
    public android.view.View getChartView() {
        return this;
    }

    public final java.util.ArrayList<java.lang.String[]> getClusters() {
        return this.k;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return this.o;
    }

    public final int getCoreCount() {
        return this.l;
    }

    public final java.util.ArrayList<java.lang.Integer> getExcludedCores() {
        return this.m;
    }

    public final int getMainColor() {
        return this.n;
    }

    public final long getSessionId() {
        return this.g;
    }

    public java.lang.Float getTooltipPosition() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        java.util.Iterator it;
        java.lang.String str;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.p;
        if (bitmap != null && bitmap.getWidth() == getWidth()) {
            android.graphics.Bitmap bitmap2 = this.p;
            a.wv.s(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else if (this.g >= 1) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.pz(this, null), 3);
        }
        java.lang.Float f = this.h;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.h;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.ArrayList arrayList = this.i;
                if (arrayList.isEmpty()) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = 18.0f * N;
                float f4 = 4.0f * N;
                float f5 = 8.5f * N;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                int d = a.gu.d(floatValue, f3, f3, getWidth(), arrayList.size());
                if (d < 0 || d >= arrayList.size()) {
                    return;
                }
                android.graphics.Paint paint = this.e;
                a.gu.c(canvas, floatValue, f4, getHeight() - f3, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(f3, f4, getWidth() - f3, getHeight() - f3);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.lang.Object obj = arrayList.get(d);
                a.wv.v(obj, "fullSamples[index]");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = ((java.util.ArrayList) obj).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    java.lang.Object next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    float floatValue3 = ((java.lang.Number) next).floatValue();
                    if (this.m.contains(java.lang.Integer.valueOf(i))) {
                        it = it2;
                    } else {
                        java.lang.String valueOf = java.lang.String.valueOf(i);
                        java.util.ArrayList arrayList4 = this.k;
                        a.wv.v(arrayList4, "clusters");
                        java.util.Iterator it3 = arrayList4.iterator();
                        int i3 = 0;
                        int i4 = 0;
                        while (it3.hasNext()) {
                            java.lang.Object next2 = it3.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                a.b20.p1();
                                throw null;
                            }
                            java.lang.String[] strArr = (java.lang.String[]) next2;
                            java.util.Iterator it4 = it3;
                            a.wv.v(strArr, "cluster");
                            int length = strArr.length;
                            java.util.Iterator it5 = it2;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    str = null;
                                    break;
                                }
                                int i7 = length;
                                str = strArr[i6];
                                if (a.wv.e(str, valueOf)) {
                                    break;
                                }
                                i6++;
                                length = i7;
                            }
                            if (str != null) {
                                i3 = i4;
                            }
                            it3 = it4;
                            i4 = i5;
                            it2 = it5;
                        }
                        it = it2;
                        java.lang.Integer num = (java.lang.Integer) a.qv.h2(this.o, i3);
                        int intValue = num != null ? num.intValue() : this.n;
                        arrayList2.add("CPU" + i + " " + a.ai1.l(new java.lang.Object[]{java.lang.Float.valueOf(floatValue3)}, 1, "%.0f", "format(format, *args)") + "%");
                        arrayList3.add(java.lang.Integer.valueOf(intValue));
                    }
                    i = i2;
                    it2 = it;
                }
                if (!arrayList2.isEmpty()) {
                    a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList2, f5, paint, arrayList3, 0, 768);
                }
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
        if (this.g != j) {
            this.g = j;
            this.i = new java.util.ArrayList();
            this.p = null;
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
        if (a.wv.d(this.h, f)) {
            return;
        }
        this.h = f;
        invalidate();
    }
}
