package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nz extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.CpuFrequencyView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(com.omarea.ui.fps.CpuFrequencyView cpuFrequencyView, a.ey eyVar) {
        super(2, eyVar);
        this.h = cpuFrequencyView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.nz(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object r9 = null;
        a.dz dzVar;
        float f;
        double d;
        int i;
        java.lang.String str;
        a.dz dzVar2 = a.dz.c;
        int i2 = this.g;
        if (i2 == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.CpuFrequencyView cpuFrequencyView = this.h;
            cpuFrequencyView.m = android.graphics.Bitmap.createBitmap(cpuFrequencyView.getWidth(), cpuFrequencyView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = cpuFrequencyView.m;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            a.r51 r51Var = cpuFrequencyView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            java.util.ArrayList p = r51Var.p(cpuFrequencyView.g);
            cpuFrequencyView.n = p;
            if (p.size() < 1) {
                dzVar = dzVar2;
            } else {
                android.graphics.Paint paint = cpuFrequencyView.e;
                paint.reset();
                paint.setStrokeWidth(2.0f);
                double size = p.size() / 60.0d;
                java.util.Iterator it = p.iterator();
                int i3 = 2100;
                while (it.hasNext()) {
                    java.util.Iterator it2 = ((java.util.ArrayList) it.next()).iterator();
                    while (it2.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) it2.next();
                        a.wv.v(num, "value");
                        if (num.intValue() > i3) {
                            i3 = num.intValue();
                        }
                    }
                }
                float N = a.b20.N(cpuFrequencyView, 1.0f);
                float f2 = 8.5f * N;
                paint.setTextSize(f2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(i3).length();
                for (int i4 = 0; i4 < length; i4++) {
                    sb.append("9");
                }
                float f3 = N * 4.0f;
                float measureText = paint.measureText(sb.toString()) + f3;
                float f4 = 18.0f * N;
                dzVar = dzVar2;
                double width = (((cpuFrequencyView.getWidth() - measureText) - f4) * 1.0d) / size;
                float height = (float) ((((cpuFrequencyView.getHeight() - f4) - f3) * 1.0d) / i3);
                float height2 = cpuFrequencyView.getHeight() - f4;
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                int i5 = i3;
                double d2 = size / 5;
                paint.setStrokeWidth(1.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                int i6 = 0;
                while (true) {
                    float f5 = ((int) (1.0f * width)) + measureText;
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    cpuFrequencyView.d.getClass();
                    canvas.drawText(a.gy.o(i6 * d2), f5, (cpuFrequencyView.getHeight() - f4) + f2 + (r9 * 2), paint);
                    paint.setColor(android.graphics.Color.parseColor("#40888888"));
                    f = f2;
                    d = width;
                    i = i5;
                    canvas.drawLine(f5, f3, f5, cpuFrequencyView.getHeight() - f4, paint);
                    if (i6 == 5) {
                        break;
                    }
                    i6++;
                    i5 = i;
                    f2 = f;
                    width = d;
                }
                paint.setStrokeWidth(2.0f);
                paint.setPathEffect(cpuFrequencyView.f);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                java.util.ArrayList f6 = i > 4400 ? a.b20.f(0, 400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000, 4400, java.lang.Integer.valueOf(i)) : i > 3300 ? a.b20.f(0, 400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 3600, 4000, 4400) : a.b20.f(0, 300, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300);
                if (i >= 0) {
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (f6.contains(java.lang.Integer.valueOf(i8)) || (i8 == i && i8 - i7 > 100)) {
                            paint.setColor(android.graphics.Color.parseColor("#888888"));
                            if (i8 > 0) {
                                canvas.drawText(java.lang.String.valueOf(i8), measureText - (N * 3.5f), (f / 2.2f) + ((int) ((i - i8) * height)) + f3, paint);
                            }
                            paint.setStrokeWidth(i8 == 0 ? 4.0f : 2.0f);
                            if (i8 == 0) {
                                paint.setColor(android.graphics.Color.parseColor("#888888"));
                            } else {
                                paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                            }
                            float f7 = f3 + ((int) ((i - i8) * height));
                            canvas.drawLine(measureText, f7, cpuFrequencyView.getWidth() - f4, f7, paint);
                            i7 = i8;
                        }
                        if (i8 == i) {
                            break;
                        }
                        i8++;
                    }
                }
                paint.reset();
                paint.setColor(cpuFrequencyView.getColorAccent());
                paint.setAntiAlias(true);
                paint.setStrokeWidth(8.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setPathEffect(null);
                java.util.ArrayList arrayList = (java.util.ArrayList) a.qv.g2(p);
                int size2 = arrayList != null ? arrayList.size() : 0;
                if (size2 > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i9 = 0; i9 < size2; i9++) {
                        android.graphics.Path path = new android.graphics.Path();
                        a.wv.s(arrayList);
                        path.moveTo(measureText, height2 - (((java.lang.Number) arrayList.get(i9)).floatValue() * height));
                        arrayList2.add(path);
                    }
                    java.util.Iterator it3 = p.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) it3.next();
                        float f8 = ((float) ((i10 / 60.0f) * d)) + measureText;
                        int i11 = 0;
                        while (i11 < size2) {
                            if (!cpuFrequencyView.k.contains(java.lang.Integer.valueOf(i11))) {
                                a.wv.v(arrayList3.size() > i11 ? (java.lang.Integer) arrayList3.get(i11) : 0, "if (sample.size > i) {\n …                        }");
                                ((android.graphics.Path) arrayList2.get(i11)).lineTo(f8, height2 - (r10.intValue() * height));
                            }
                            i11++;
                        }
                        i10++;
                    }
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    java.util.Iterator it4 = arrayList2.iterator();
                    int i12 = 0;
                    while (it4.hasNext()) {
                        java.lang.Object next = it4.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            a.b20.p1();
                            throw null;
                        }
                        android.graphics.Path path2 = (android.graphics.Path) next;
                        java.lang.String valueOf = java.lang.String.valueOf(i12);
                        java.util.ArrayList arrayList4 = cpuFrequencyView.j;
                        a.wv.v(arrayList4, "clusters");
                        java.util.Iterator it5 = arrayList4.iterator();
                        int i14 = 0;
                        int i15 = 0;
                        while (it5.hasNext()) {
                            java.lang.Object next2 = it5.next();
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                a.b20.p1();
                                throw null;
                            }
                            java.lang.String[] strArr = (java.lang.String[]) next2;
                            a.wv.v(strArr, "cluster");
                            int length2 = strArr.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= length2) {
                                    str = null;
                                    break;
                                }
                                str = strArr[i17];
                                if (a.wv.e(str, valueOf)) {
                                    break;
                                }
                                i17++;
                            }
                            if (str != null) {
                                i14 = i15;
                            }
                            i15 = i16;
                        }
                        java.lang.Object obj2 = cpuFrequencyView.l.get(i14);
                        a.wv.v(obj2, "colors.get(colorIndex)");
                        paint.setColor(((java.lang.Number) obj2).intValue());
                        paint.setStrokeWidth(i14 + 1.0f);
                        canvas.drawPath(path2, paint);
                        i12 = i13;
                    }
                }
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.mz mzVar = new a.mz(cpuFrequencyView, null);
            this.g = 1;
            java.lang.Object S1 = a.wv.S1(zx0Var, mzVar, this);
            a.dz dzVar3 = dzVar;
            if (S1 == dzVar3) {
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
        return ((a.nz) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
