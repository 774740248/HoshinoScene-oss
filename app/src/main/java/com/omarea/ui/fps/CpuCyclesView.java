package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CpuCyclesView extends android.view.View implements a.cn1 {
    public final a.r51 c;
    public final a.gy d;
    public final android.graphics.Paint e;
    public final android.graphics.DashPathEffect f;
    public a.hz g;
    public long h;
    public java.lang.Float i;
    public a.eu j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;
    public final java.util.ArrayList m;
    public android.graphics.Bitmap n;
    public java.util.ArrayList o;
    public java.util.ArrayList p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.gy, java.lang.Object] */
    public CpuCyclesView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.d = new a.gy();
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.g = (a.hz) a.op.N1(a.hz.values());
        new a.ls();
        this.k = a.ls.d();
        this.l = new java.util.ArrayList();
        this.m = new a.p4().j();
        this.o = new java.util.ArrayList();
        this.p = new java.util.ArrayList();
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
        return this.m;
    }

    public final java.util.ArrayList<java.lang.Integer> getExcludedCores() {
        return this.l;
    }

    public final a.hz getRightDimension() {
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
        android.graphics.Paint paint;
        java.util.Iterator it;
        int h;
        java.lang.String str;
        java.util.ArrayList arrayList;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.n;
        if (bitmap == null || bitmap.getWidth() != getWidth()) {
            if (this.h < 1) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.jz(this, null), 3);
            return;
        }
        android.graphics.Bitmap bitmap2 = this.n;
        a.wv.s(bitmap2);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        java.lang.Float f = this.i;
        if (f != null) {
            f.floatValue();
            java.lang.Float f2 = this.i;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                java.util.ArrayList arrayList2 = this.o;
                java.util.ArrayList arrayList3 = this.p;
                if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                    return;
                }
                float N = a.b20.N(this, 1.0f);
                float f3 = 8.5f * N;
                android.graphics.Paint paint2 = this.e;
                paint2.setTextSize(f3);
                new a.ls();
                java.util.ArrayList d = a.ls.d();
                a.wv.v(d, "cpuFrequencyUtils.clusterInfo");
                java.lang.Object l2 = a.qv.l2(d);
                a.wv.v(l2, "cpuFrequencyUtils.clusterInfo.last()");
                a.wv.v(a.op.Q1((java.lang.Object[]) l2), "cpuFrequencyUtils.clusterInfo.last().last()");
                double h2 = (a.ls.h(java.lang.Integer.parseInt((java.lang.String) a.op.Q1((java.lang.Object[]) l2))) / 1000) * 1.5d;
                java.util.Iterator it2 = arrayList2.iterator();
                int i = 2100;
                while (it2.hasNext()) {
                    java.util.Iterator it3 = ((java.util.ArrayList) it2.next()).iterator();
                    while (it3.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) it3.next();
                        a.wv.v(num, "value");
                        if (num.intValue() > i) {
                            arrayList = arrayList2;
                            if (num.intValue() < h2) {
                                i = num.intValue();
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                        arrayList2 = arrayList;
                    }
                }
                java.util.ArrayList arrayList4 = arrayList2;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(i).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("9");
                }
                float f4 = 4.0f * N;
                float measureText = paint2.measureText(sb.toString()) + f4;
                float f5 = N * 18.0f;
                android.graphics.DashPathEffect dashPathEffect = a.gu.f192a;
                a.gu.c(canvas, floatValue, f4, getHeight() - f5, paint2);
                android.graphics.RectF rectF = new android.graphics.RectF(measureText, f4, getWidth() - f5, getHeight() - f5);
                java.lang.Float a2 = a.fu.a(this);
                if (a2 != null) {
                    f4 = a2.floatValue();
                }
                int size = arrayList4.size();
                if (size < 1) {
                    return;
                }
                int d2 = a.gu.d(floatValue, measureText, f5, getWidth(), size);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.ArrayList arrayList7 = (java.util.ArrayList) a.qv.h2(arrayList4, d2);
                if (arrayList7 != null) {
                    java.util.Iterator it4 = arrayList7.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        java.lang.Object next = it4.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            a.b20.p1();
                            throw null;
                        }
                        int intValue = ((java.lang.Number) next).intValue();
                        if (this.l.contains(java.lang.Integer.valueOf(i3))) {
                            paint = paint2;
                            it = it4;
                        } else {
                            java.lang.String valueOf = java.lang.String.valueOf(i3);
                            java.util.ArrayList arrayList8 = this.k;
                            a.wv.v(arrayList8, "clusters");
                            java.util.Iterator it5 = arrayList8.iterator();
                            int i5 = 0;
                            int i6 = 0;
                            while (it5.hasNext()) {
                                java.lang.Object next2 = it5.next();
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    a.b20.p1();
                                    throw null;
                                }
                                java.util.Iterator it6 = it5;
                                java.lang.String[] strArr = (java.lang.String[]) next2;
                                java.util.Iterator it7 = it4;
                                a.wv.v(strArr, "cluster");
                                int length2 = strArr.length;
                                android.graphics.Paint paint3 = paint2;
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
                                it4 = it7;
                                i6 = i7;
                                it5 = it6;
                                paint2 = paint3;
                            }
                            paint = paint2;
                            it = it4;
                            java.lang.Integer num2 = (java.lang.Integer) a.qv.h2(this.m, i5);
                            if (num2 != null) {
                                h = num2.intValue();
                            } else {
                                a.vj1 vj1Var = a.du.f;
                                h = a.tg1.h();
                            }
                            arrayList5.add("CPU" + i3 + " " + intValue);
                            arrayList6.add(java.lang.Integer.valueOf(h));
                        }
                        i3 = i4;
                        it4 = it;
                        paint2 = paint;
                    }
                }
                android.graphics.Paint paint4 = paint2;
                java.lang.Double d3 = (java.lang.Double) a.qv.h2(arrayList3, d2);
                if (d3 != null) {
                    java.lang.String format = java.lang.String.format("TEMP %.1f℃", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((float) d3.doubleValue())}, 1));
                    a.wv.v(format, "format(format, *args)");
                    arrayList5.add(format);
                    a.vj1 vj1Var2 = a.du.f;
                    arrayList6.add(java.lang.Integer.valueOf(a.tg1.h()));
                }
                if (!arrayList5.isEmpty()) {
                    a.gu.b(canvas, floatValue, f4, rectF, arrayList5, f3, paint4, arrayList6, 0, 768);
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

    public final void setRightDimension(a.hz hzVar) {
        a.wv.w(hzVar, "rightDIMENSION");
        if (this.g != hzVar) {
            this.g = hzVar;
            this.n = null;
            invalidate();
        }
    }

    public final void setSessionId(long j) {
        if (this.h != j) {
            this.h = j;
            this.n = null;
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
