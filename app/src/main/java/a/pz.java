package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pz extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.CpuLoadsView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(com.omarea.ui.fps.CpuLoadsView cpuLoadsView, a.ey eyVar) {
        super(2, eyVar);
        this.h = cpuLoadsView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.pz(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        android.graphics.Canvas canvas;
        float f;
        a.dz dzVar;
        int i;
        float f2;
        java.lang.String str;
        float f3;
        java.util.ArrayList arrayList;
        java.lang.Float valueOf;
        android.graphics.Canvas canvas2;
        float f4;
        a.dz dzVar2 = a.dz.c;
        int i2 = this.g;
        if (i2 == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.CpuLoadsView cpuLoadsView = this.h;
            cpuLoadsView.p = android.graphics.Bitmap.createBitmap(cpuLoadsView.getWidth(), cpuLoadsView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = cpuLoadsView.p;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas3 = new android.graphics.Canvas(bitmap);
            a.r51 r51Var = cpuLoadsView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            java.util.ArrayList q = r51Var.q(cpuLoadsView.g);
            cpuLoadsView.i = q;
            if (q.size() < 1) {
                dzVar = dzVar2;
            } else {
                android.graphics.Paint paint = cpuLoadsView.e;
                paint.reset();
                paint.setStrokeWidth(2.0f);
                int N = a.b20.N(cpuLoadsView, 1.0f);
                float f5 = N;
                float f6 = f5 * 18.0f;
                float f7 = f5 * 4.0f;
                double size = q.size() / 60.0d;
                double width = (((cpuLoadsView.getWidth() - f6) - f6) * 1.0d) / size;
                android.graphics.Canvas canvas4 = canvas3;
                float height = (float) ((((cpuLoadsView.getHeight() - f6) - f7) * 1.0d) / 100);
                float height2 = cpuLoadsView.getHeight() - f6;
                float f8 = 8.5f * f5;
                paint.setTextSize(f8);
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                float f9 = f6;
                double d = size / 5;
                paint.setStrokeWidth(1.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                int i3 = 0;
                while (true) {
                    float f10 = ((int) (1.0f * width)) + f9;
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    cpuLoadsView.d.getClass();
                    android.graphics.Canvas canvas5 = canvas4;
                    canvas5.drawText(a.gy.o(i3 * d), f10, (cpuLoadsView.getHeight() - f9) + f8 + (N * 2), paint);
                    paint.setColor(android.graphics.Color.parseColor("#40888888"));
                    float height3 = cpuLoadsView.getHeight() - f9;
                    canvas = canvas5;
                    f = f9;
                    dzVar = dzVar2;
                    int i4 = i3;
                    i = N;
                    canvas5.drawLine(f10, f7, f10, height3, paint);
                    if (i4 == 5) {
                        break;
                    }
                    i3 = i4 + 1;
                    N = i;
                    dzVar2 = dzVar;
                    canvas4 = canvas;
                    f9 = f;
                }
                float f11 = 2.0f;
                paint.setStrokeWidth(2.0f);
                paint.setPathEffect(cpuLoadsView.f);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                int i5 = 0;
                while (true) {
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    if (i5 % 10 == 0) {
                        if (i5 > 0) {
                            f4 = f;
                            canvas2 = canvas;
                            canvas2.drawText(java.lang.String.valueOf(i5), f4 - (i * 4), (f8 / 2.2f) + f7 + ((int) ((100 - i5) * height)), paint);
                        } else {
                            canvas2 = canvas;
                            f4 = f;
                        }
                        paint.setStrokeWidth(i5 == 0 ? 4.0f : f11);
                        if (i5 == 0) {
                            paint.setColor(android.graphics.Color.parseColor("#888888"));
                        } else {
                            paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                        }
                        float f12 = f7 + ((int) ((100 - i5) * height));
                        canvas = canvas2;
                        f2 = f4;
                        canvas2.drawLine(f4, f12, cpuLoadsView.getWidth() - f4, f12, paint);
                    } else {
                        f2 = f;
                    }
                    if (i5 == 100) {
                        break;
                    }
                    i5++;
                    f = f2;
                    f11 = 2.0f;
                }
                paint.reset();
                paint.setColor(cpuLoadsView.getColorAccent());
                double d2 = 0.0d;
                while (((java.lang.Iterable) a.qv.e2(q)).iterator().hasNext()) {
                    d2 += ((java.lang.Number) android.graphics.Paint.Align.CENTER.next()).floatValue();
                }
                float f13 = height2 - (((float) d2) * height);
                paint.setAntiAlias(true);
                paint.setStrokeWidth(6.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setPathEffect(null);
                java.util.ArrayList arrayList2 = cpuLoadsView.m;
                if (!arrayList2.contains(-1)) {
                    paint.setColor(cpuLoadsView.n);
                    java.util.Iterator it = q.iterator();
                    float f14 = f2;
                    float f15 = f13;
                    int i6 = 0;
                    while (it.hasNext()) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) it.next();
                        float f16 = ((float) ((i6 / 60.0f) * width)) + f2;
                        a.wv.v(arrayList3, "sample");
                        double d3 = 0.0d;
                        for (java.util.Iterator it2 = arrayList3.iterator(); it2.hasNext(); it2 = it2) {
                            d3 += ((java.lang.Number) it2.next()).floatValue();
                            i6 = i6;
                        }
                        float size2 = height2 - ((float) (height * (d3 / arrayList3.size())));
                        canvas.drawLine(f14, f15, f16, size2, paint);
                        i6++;
                        arrayList2 = arrayList2;
                        f15 = size2;
                        f14 = f16;
                    }
                }
                java.util.ArrayList arrayList4 = arrayList2;
                java.util.ArrayList arrayList5 = (java.util.ArrayList) a.qv.g2(q);
                int size3 = arrayList5 != null ? arrayList5.size() : 0;
                if (size3 + 1 > 0) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (int i7 = 0; i7 < size3; i7++) {
                        android.graphics.Path path = new android.graphics.Path();
                        if (arrayList5 == null || (valueOf = (java.lang.Float) arrayList5.get(i7)) == null) {
                            valueOf = java.lang.Float.valueOf(0.0f);
                        }
                        path.moveTo(f2, height2 - (valueOf.floatValue() * height));
                        arrayList6.add(path);
                    }
                    java.util.Iterator it3 = q.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        java.util.ArrayList arrayList7 = (java.util.ArrayList) it3.next();
                        java.util.ArrayList arrayList8 = arrayList6;
                        int i9 = i8;
                        float f17 = ((float) ((i8 / 60.0f) * width)) + f2;
                        int i10 = 0;
                        while (i10 < size3) {
                            if (arrayList4.contains(java.lang.Integer.valueOf(i10))) {
                                f3 = f2;
                                arrayList = arrayList8;
                            } else {
                                java.lang.Object obj2 = arrayList7.get(i10);
                                f3 = f2;
                                a.wv.v(obj2, "sample[i]");
                                float floatValue = height2 - (((java.lang.Number) obj2).floatValue() * height);
                                arrayList = arrayList8;
                                ((android.graphics.Path) arrayList.get(i10)).lineTo(f17, floatValue);
                            }
                            i10++;
                            arrayList8 = arrayList;
                            f2 = f3;
                        }
                        i8 = i9 + 1;
                        arrayList6 = arrayList8;
                    }
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    java.util.Iterator it4 = arrayList6.iterator();
                    int i11 = 0;
                    while (it4.hasNext()) {
                        java.lang.Object next = it4.next();
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            a.b20.p1();
                            throw null;
                        }
                        android.graphics.Path path2 = (android.graphics.Path) next;
                        java.lang.String valueOf2 = java.lang.String.valueOf(i11);
                        java.util.ArrayList arrayList9 = cpuLoadsView.k;
                        a.wv.v(arrayList9, "clusters");
                        java.util.Iterator it5 = arrayList9.iterator();
                        int i13 = 0;
                        int i14 = 0;
                        while (it5.hasNext()) {
                            java.lang.Object next2 = it5.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                a.b20.p1();
                                throw null;
                            }
                            java.lang.String[] strArr = (java.lang.String[]) next2;
                            a.wv.v(strArr, "cluster");
                            int length = strArr.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length) {
                                    str = null;
                                    break;
                                }
                                str = strArr[i16];
                                if (a.wv.e(str, valueOf2)) {
                                    break;
                                }
                                i16++;
                            }
                            if (str != null) {
                                i13 = i14;
                            }
                            i14 = i15;
                        }
                        java.lang.Object obj3 = cpuLoadsView.o.get(i13);
                        a.wv.v(obj3, "colors.get(colorIndex)");
                        paint.setColor(((java.lang.Number) obj3).intValue());
                        paint.setStrokeWidth(i13 + 1.0f);
                        canvas.drawPath(path2, paint);
                        i11 = i12;
                    }
                }
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.oz ozVar = new a.oz(cpuLoadsView, null);
            this.g = 1;
            a.dz dzVar3 = dzVar;
            if (a.wv.S1(zx0Var, ozVar, this) == dzVar3) {
                return dzVar3;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.pz) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
