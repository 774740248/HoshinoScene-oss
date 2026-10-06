package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuFrequencyView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.Paint e;
    public final android.graphics.DashPathEffect f;
    public long g;
    public java.lang.Float h;
    public a.eu i;
    public final java.util.ArrayList j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;
    public android.graphics.Bitmap m;
    public java.util.List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.gy, java.lang.Object] */
    public CpuFrequencyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        new a.ls();
        java.util.ArrayList d = a.ls.d();
        this.j = d;
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
        this.k = arrayList;
        this.l = new a.p4().j();
        this.n = a.qb0.c;
        this.c = new a.r51(getContext());
    }

    public final void a() {
        if (this.g >= 1 && getWidth() > 0) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.nz(this, null), 3);
        }
    }

    @Override // a.cn1
    public android.view.View getChartView() {
        return this;
    }

    public final java.util.ArrayList<java.lang.String[]> getClusters() {
        return this.j;
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return this.l;
    }

    public final java.util.ArrayList<java.lang.Integer> getExcludedCores() {
        return this.k;
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
        int h;
        java.lang.String str;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.m;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            a();
            return;
        }
        android.graphics.Bitmap bitmap2 = this.m;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.h;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.h;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.List list = this.n;
                int size = list.size();
                if (size < 1) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = 8.5f * N;
                android.graphics.Paint paint = this.e;
                paint.setTextSize(f3);
                java.util.Iterator it2 = list.iterator();
                int i = 2100;
                while (it2.hasNext()) {
                    java.util.Iterator it3 = ((java.util.List) it2.next()).iterator();
                    while (it3.hasNext()) {
                        int intValue = ((java.lang.Number) it3.next()).intValue();
                        if (intValue > i) {
                            i = intValue;
                        }
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(i).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("9");
                }
                float f4 = 4.0f * N;
                float measureText = paint.measureText(sb.toString()) + f4;
                float f5 = N * 18.0f;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                int d = a.gu.d(floatValue, measureText, f5, getWidth(), size);
                if (d < 0 || d >= size) {
                    return;
                }
                a.gu.c(canvas, floatValue, f4, getHeight() - f5, paint);
                android.graphics.RectF rectF = new android.graphics.RectF(measureText, f4, getWidth() - f5, getHeight() - f5);
                java.lang.Float a2 = a.fu.a(this);
                float floatValue2 = a2 != null ? a2.floatValue() : f4;
                java.util.List list2 = (java.util.List) list.get(d);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it4 = list2.iterator();
                int i3 = 0;
                while (it4.hasNext()) {
                    java.lang.Object next = it4.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    int intValue2 = ((java.lang.Number) next).intValue();
                    if (this.k.contains(java.lang.Integer.valueOf(i3))) {
                        it = it4;
                    } else {
                        java.lang.String valueOf = java.lang.String.valueOf(i3);
                        java.util.ArrayList arrayList3 = this.j;
                        a.wv.v(arrayList3, "clusters");
                        java.util.Iterator it5 = arrayList3.iterator();
                        int i5 = 0;
                        int i6 = 0;
                        while (it5.hasNext()) {
                            java.lang.Object next2 = it5.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                a.b20.p1();
                                throw null;
                            }
                            java.lang.String[] strArr = (java.lang.String[]) next2;
                            java.util.Iterator it6 = it4;
                            a.wv.v(strArr, "cluster");
                            int length2 = strArr.length;
                            java.util.Iterator it7 = it5;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length2) {
                                    str = null;
                                    break;
                                }
                                int i9 = length2;
                                str = strArr[i8];
                                if (a.wv.e(str, valueOf)) {
                                    break;
                                }
                                i8++;
                                length2 = i9;
                            }
                            if (str != null) {
                                i5 = i6;
                            }
                            it4 = it6;
                            i6 = i7;
                            it5 = it7;
                        }
                        it = it4;
                        java.lang.Integer num = (java.lang.Integer) a.qv.h2(this.l, i5);
                        if (num != null) {
                            h = num.intValue();
                        } else {
                            a.vj1 vj1Var = a.du.f;
                            h = a.tg1.h();
                        }
                        arrayList.add("CPU" + i3 + " " + intValue2 + "MHz");
                        arrayList2.add(java.lang.Integer.valueOf(h));
                    }
                    i3 = i4;
                    it4 = it;
                }
                if (!arrayList.isEmpty()) {
                    a.gu.b(canvas, floatValue, floatValue2, rectF, arrayList, f3, paint, arrayList2, 0, 768);
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
            this.m = null;
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
