package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f00 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.bench.CyclesPowerView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(com.omarea.ui.bench.CyclesPowerView cyclesPowerView, a.ey eyVar) {
        super(2, eyVar);
        this.h = cyclesPowerView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f00(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object r15 = null;
        java.lang.Integer valueOf;
        android.graphics.Canvas canvas;
        float f;
        android.graphics.Canvas canvas2;
        float f2;
        float f3;
        a.dz dzVar;
        java.lang.String str;
        a.dz dzVar2 = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.bench.CyclesPowerView cyclesPowerView = this.h;
            cyclesPowerView.i = android.graphics.Bitmap.createBitmap(cyclesPowerView.getWidth(), cyclesPowerView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = cyclesPowerView.i;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas3 = new android.graphics.Canvas(bitmap);
            android.graphics.Paint paint = cyclesPowerView.c;
            paint.reset();
            paint.setStrokeWidth(2.0f);
            new a.ls();
            java.util.ArrayList d = a.ls.d();
            a.wv.v(d, "cpuUtils.clusterInfo");
            java.lang.Object l2 = a.qv.l2(d);
            a.wv.v(l2, "cpuUtils.clusterInfo.last()");
            a.wv.v(a.op.Q1((java.lang.Object[]) l2), "cpuUtils.clusterInfo.last().last()");
            double h = (a.ls.h(java.lang.Integer.parseInt((java.lang.String) android.graphics.Paint.Align.CENTER)) / 1000) * 1.5d;
            java.util.Iterator it = cyclesPowerView.h.iterator();
            if (it.hasNext()) {
                valueOf = java.lang.Integer.valueOf(((a.g61) it.next()).c);
                while (it.hasNext()) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((a.g61) it.next()).c);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            int i2 = 0;
            int max = java.lang.Math.max(valueOf != null ? valueOf.intValue() : 0, 6000);
            int i3 = 2500;
            if (cyclesPowerView.g) {
                java.util.Iterator it2 = cyclesPowerView.h.iterator();
                while (it2.hasNext()) {
                    java.util.Iterator it3 = ((a.g61) it2.next()).b().iterator();
                    while (it3.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) it3.next();
                        a.wv.v(num, "value");
                        if (num.intValue() > i3) {
                            i3 = num.intValue();
                        }
                    }
                }
            } else {
                java.util.Iterator it4 = cyclesPowerView.h.iterator();
                while (it4.hasNext()) {
                    java.util.Iterator it5 = ((a.g61) it4.next()).a().iterator();
                    while (it5.hasNext()) {
                        java.lang.Integer num2 = (java.lang.Integer) it5.next();
                        a.wv.v(num2, "value");
                        if (num2.intValue() > i3) {
                            canvas = canvas3;
                            if (num2.intValue() < h) {
                                i3 = num2.intValue();
                            }
                        } else {
                            canvas = canvas3;
                        }
                        canvas3 = canvas;
                    }
                }
            }
            android.graphics.Canvas canvas4 = canvas3;
            int i4 = i3;
            float N = a.b20.N(cyclesPowerView, 1.0f);
            float f4 = N * 8.5f;
            paint.setTextSize(f4);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = java.lang.String.valueOf(i4).length();
            for (int i5 = 0; i5 < length; i5++) {
                sb.append("9");
            }
            float f5 = N * 4.0f;
            float measureText = paint.measureText(sb.toString()) + f5;
            float f6 = N * 18.0f;
            double d2 = max;
            double width = (((cyclesPowerView.getWidth() - measureText) - f6) * 1.0d) / d2;
            float height = (float) ((((cyclesPowerView.getHeight() - f6) - f5) * 1.0d) / i4);
            float height2 = cyclesPowerView.getHeight() - f6;
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            double d3 = d2 / 10;
            paint.setStrokeWidth(1.0f);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            int i6 = 0;
            while (true) {
                f = height;
                float f7 = ((int) (1.0f * width)) + measureText;
                paint.setColor(android.graphics.Color.parseColor("#888888"));
                canvas2 = canvas4;
                canvas2.drawText(java.lang.String.valueOf((int) (i6 * d3)), f7, (cyclesPowerView.getHeight() - f6) + f4 + (r15 * 2), paint);
                paint.setColor(android.graphics.Color.parseColor("#40888888"));
                double d4 = d3;
                f2 = f4;
                f3 = N;
                canvas2.drawLine(f7, f5, f7, cyclesPowerView.getHeight() - f6, paint);
                if (i6 == 10) {
                    break;
                }
                i6++;
                height = f;
                N = f3;
                f4 = f2;
                d3 = d4;
                canvas4 = canvas2;
            }
            paint.setStrokeWidth(2.0f);
            paint.setPathEffect(cyclesPowerView.d);
            paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
            java.util.ArrayList f8 = i4 > 4400 ? a.b20.f(0, 400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000, 4400, java.lang.Integer.valueOf(i4)) : i4 > 3300 ? a.b20.f(0, 400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000, 4400) : a.b20.f(0, 300, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300);
            if (i4 >= 0) {
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (f8.contains(java.lang.Integer.valueOf(i8)) || (i8 == i4 && i8 - i7 > 100)) {
                        paint.setColor(android.graphics.Color.parseColor("#888888"));
                        if (i8 > 0) {
                            canvas2.drawText(java.lang.String.valueOf(i8), measureText - (f3 * 3.5f), (f2 / 2.2f) + f5 + ((int) ((i4 - i8) * f)), paint);
                        }
                        paint.setStrokeWidth(i8 == 0 ? 4.0f : 2.0f);
                        if (i8 == 0) {
                            paint.setColor(android.graphics.Color.parseColor("#888888"));
                        } else {
                            paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                        }
                        float f9 = f5 + ((int) ((i4 - i8) * f));
                        canvas2.drawLine(measureText, f9, cyclesPowerView.getWidth() - f6, f9, paint);
                        i7 = i8;
                    }
                    if (i8 == i4) {
                        break;
                    }
                    i8++;
                }
            }
            paint.reset();
            paint.setColor(cyclesPowerView.getColorAccent());
            paint.setAntiAlias(true);
            paint.setStrokeWidth(8.0f);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setPathEffect(null);
            a.g61 g61Var = (a.g61) a.qv.g2(cyclesPowerView.h);
            int size = g61Var != null ? g61Var.a().size() : 0;
            if (size > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList.add(new android.graphics.Path());
                }
                int size2 = arrayList.size();
                int[] iArr = new int[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    iArr[i10] = 0;
                }
                java.util.Iterator it6 = arrayList.iterator();
                int i11 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    java.lang.String valueOf3 = java.lang.String.valueOf(i11);
                    java.util.ArrayList arrayList2 = cyclesPowerView.e;
                    a.wv.v(arrayList2, "clusters");
                    java.util.Iterator it7 = arrayList2.iterator();
                    int i13 = 0;
                    int i14 = 0;
                    while (it7.hasNext()) {
                        java.lang.Object next2 = it7.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            a.b20.p1();
                            throw null;
                        }
                        java.util.Iterator it8 = it6;
                        java.lang.String[] strArr = (java.lang.String[]) next2;
                        int i16 = i12;
                        a.wv.v(strArr, "cluster");
                        int length2 = strArr.length;
                        java.util.Iterator it9 = it7;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                str = null;
                                break;
                            }
                            int i18 = length2;
                            str = strArr[i17];
                            if (a.wv.e(str, valueOf3)) {
                                break;
                            }
                            i17++;
                            length2 = i18;
                        }
                        if (str != null) {
                            i13 = i14;
                        }
                        i12 = i16;
                        i14 = i15;
                        it6 = it8;
                        it7 = it9;
                    }
                    java.lang.Object obj2 = cyclesPowerView.f.get(i13);
                    a.wv.v(obj2, "colors.get(colorIndex)");
                    iArr[i11] = ((java.lang.Number) obj2).intValue();
                    i11 = i12;
                    it6 = it6;
                }
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setAlpha(128);
                java.util.Iterator it10 = cyclesPowerView.h.iterator();
                while (it10.hasNext()) {
                    a.g61 g61Var2 = (a.g61) it10.next();
                    int size3 = g61Var2.a().size();
                    int i19 = 0;
                    while (i19 < size) {
                        java.lang.Integer num3 = size3 > i19 ? (java.lang.Integer) (cyclesPowerView.g ? g61Var2.b() : g61Var2.a()).get(i19) : 0;
                        a.wv.v(num3, "if (valuesCount > i) {\n …  0\n                    }");
                        int intValue = num3.intValue();
                        a.g61 g61Var3 = g61Var2;
                        int i20 = size3;
                        float f10 = ((float) (g61Var2.c * width)) + measureText;
                        a.dz dzVar3 = dzVar2;
                        if (intValue < h && intValue >= 0) {
                            if (((android.graphics.Path) arrayList.get(i19)).isEmpty()) {
                                ((android.graphics.Path) arrayList.get(i19)).moveTo(f10, height2 - (intValue * f));
                            }
                            float f11 = height2 - (intValue * f);
                            ((android.graphics.Path) arrayList.get(i19)).lineTo(f10, f11);
                            paint.setColor(iArr[i19]);
                            canvas2.drawCircle(f10, f11, 6.0f, paint);
                        }
                        i19++;
                        dzVar2 = dzVar3;
                        g61Var2 = g61Var3;
                        size3 = i20;
                    }
                }
                dzVar = dzVar2;
                paint.setAlpha(255);
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(3.0f);
                java.util.Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    java.lang.Object next3 = it11.next();
                    int i21 = i2 + 1;
                    if (i2 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    paint.setColor(iArr[i2]);
                    canvas2.drawPath((android.graphics.Path) next3, paint);
                    i2 = i21;
                }
            } else {
                dzVar = dzVar2;
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.e00 e00Var = new a.e00(cyclesPowerView, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, e00Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.f00) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
