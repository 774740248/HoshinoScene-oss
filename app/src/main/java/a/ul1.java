package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ul1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.ThreadCPUView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul1(com.omarea.ui.fps.ThreadCPUView threadCPUView, a.ey eyVar) {
        super(2, eyVar);
        this.h = threadCPUView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ul1(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        float r7 = 0.0f;
        float r10 = 0.0f;
        android.graphics.Canvas canvas;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        a.dz dzVar;
        android.graphics.Canvas canvas2;
        a.no1 no1Var;
        int i2;
        java.lang.Integer num;
        java.lang.String str;
        a.dz dzVar2 = a.dz.c;
        int i3 = this.g;
        a.no1 no1Var2 = a.no1.f387a;
        if (i3 == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.ThreadCPUView threadCPUView = this.h;
            a.r51 r51Var = threadCPUView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            long j = threadCPUView.j;
            a.bm1 bm1Var = threadCPUView.k;
            java.util.ArrayList g = r51Var.g(bm1Var.f46a, j, bm1Var.a());
            threadCPUView.e = g;
            if (!g.isEmpty()) {
                threadCPUView.o = android.graphics.Bitmap.createBitmap(threadCPUView.getWidth(), threadCPUView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Bitmap bitmap = threadCPUView.o;
                a.wv.s(bitmap);
                android.graphics.Canvas canvas3 = new android.graphics.Canvas(bitmap);
                if (threadCPUView.e.isEmpty()) {
                    dzVar = dzVar2;
                    no1Var = no1Var2;
                } else {
                    android.graphics.Paint paint = threadCPUView.h;
                    paint.reset();
                    paint.setStrokeWidth(2.0f);
                    a.v01 v01Var = threadCPUView.l;
                    long j2 = v01Var.b;
                    long j3 = v01Var.f616a;
                    double d = ((j2 - j3) + 1) / 60.0d;
                    float N = a.b20.N(threadCPUView, 1.0f);
                    float f5 = N * 1.0f;
                    float f6 = N * 7.5f;
                    paint.setTextSize(f6);
                    float f7 = 10.0f * N;
                    float f8 = 9.0f * N;
                    float f9 = 0.0f * N;
                    android.graphics.Canvas canvas4 = canvas3;
                    double width = (((threadCPUView.getWidth() - f7) - f7) * 1.0d) / d;
                    float f10 = N;
                    float height = (float) ((((threadCPUView.getHeight() - f8) - f9) * 1.0d) / 100);
                    float height2 = threadCPUView.getHeight() - f8;
                    paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                    double d2 = d / 5;
                    paint.setStrokeWidth(1.0f);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i4 = 0;
                    while (true) {
                        float f11 = f6;
                        float f12 = ((int) (1.0f * width)) + f7;
                        paint.setColor(android.graphics.Color.parseColor("#a0888888"));
                        threadCPUView.g.getClass();
                        canvas = canvas4;
                        canvas.drawText(a.gy.o(i4 * d2), f12, (threadCPUView.getHeight() - f8) + f11 + 2, paint);
                        paint.setColor(android.graphics.Color.parseColor("#40888888"));
                        int i5 = i4;
                        double d3 = d2;
                        f = f10;
                        f2 = height2;
                        f3 = height;
                        canvas.drawLine(f12, f9, f12, threadCPUView.getHeight() - f8, paint);
                        if (i5 == 5) {
                            break;
                        }
                        i4 = i5 + 1;
                        height2 = f2;
                        height = f3;
                        f6 = f11;
                        canvas4 = canvas;
                        f10 = f;
                        d2 = d3;
                    }
                    paint.setStrokeWidth(2.0f);
                    paint.setPathEffect(threadCPUView.i);
                    paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                    float f13 = f2;
                    java.util.ArrayList f14 = a.b20.f(0, 25, 50, 75, 100);
                    int i6 = 0;
                    while (true) {
                        if (f14.contains(java.lang.Integer.valueOf(i6))) {
                            paint.setColor(android.graphics.Color.parseColor("#80888888"));
                            float f15 = f9 + ((int) ((100 - i6) * f3));
                            i = i6;
                            f4 = f13;
                            canvas.drawLine(f7, f15, threadCPUView.getWidth() - f7, f15, paint);
                        } else {
                            i = i6;
                            f4 = f13;
                        }
                        if (i == 100) {
                            break;
                        }
                        i6 = i + 1;
                        f13 = f4;
                    }
                    paint.reset();
                    paint.setColor(threadCPUView.getColorAccent());
                    paint.setAntiAlias(true);
                    paint.setStrokeWidth(5.0f);
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    paint.setPathEffect(null);
                    paint.setStrokeWidth(f * 1.2f);
                    a.am1 am1Var = (a.am1) a.qv.e2(threadCPUView.e);
                    a.bm1 bm1Var2 = threadCPUView.k;
                    double d4 = bm1Var2.c;
                    double d5 = bm1Var2.e;
                    paint.setColor(threadCPUView.getContext().getColor((d4 > 90.0d || (d4 > 86.0d && d5 > 95.0d)) ? 2131099714 : (d4 > 80.0d || (d4 > 75.0d && d5 > 90.0d)) ? 2131099719 : (d4 > 70.0d || (d4 > 60.0d && d5 > 80.0d)) ? 2131099715 : (d4 > 50.0d || (d4 > 35.0d && d5 > 65.0d)) ? 2131099717 : (d4 > 25.0d || (d4 > 15.0d && d5 > 35.0d)) ? 2131099716 : 2131099718));
                    android.graphics.Path path = new android.graphics.Path();
                    long j4 = am1Var.b;
                    float f16 = ((float) ((((float) (j4 - j3)) / 60.0f) * width)) + f7;
                    dzVar = dzVar2;
                    double d6 = f3;
                    float f17 = f4 - ((float) (am1Var.f * d6));
                    a.am1 am1Var2 = am1Var;
                    if (j4 != threadCPUView.l.f616a) {
                        canvas2 = canvas;
                        canvas2.drawCircle(f16, f17, f, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    a.am1 am1Var3 = (a.am1) a.qv.l2(threadCPUView.e);
                    no1Var = no1Var2;
                    if (am1Var3.b != threadCPUView.l.b) {
                        canvas2.drawCircle(((float) ((((float) (r7 - j3)) / 60.0f) * width)) + f7, f4 - ((float) (am1Var3.f * d6)), f, paint);
                    }
                    path.moveTo(f16, f17);
                    threadCPUView = threadCPUView;
                    for (a.am1 am1Var4 : (Iterable<a.am1>) threadCPUView.e) {
                        long j5 = am1Var4.b;
                        long j6 = j5 - j3;
                        if (j5 - am1Var2.b > 2) {
                            float f18 = (float) (f4 - (0.0d * d6));
                            path.lineTo(((float) ((((float) (r10 - j3)) / 60.0f) * width)) + f7, f18);
                            path.lineTo(((float) ((((float) (j6 - 1)) / 60.0f) * width)) + f7, f18);
                        }
                        path.lineTo(((float) ((((float) j6) / 60.0f) * width)) + f7, (float) (f4 - (am1Var4.f * d6)));
                        am1Var2 = am1Var4;
                    }
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    canvas2.drawPath(path, paint);
                    paint.reset();
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    int i7 = 0;
                    paint.setAntiAlias(false);
                    int parseColor = android.graphics.Color.parseColor("#80888888");
                    a.am1 am1Var5 = null;
                    for (a.am1 am1Var6 : (Iterable<a.am1>) threadCPUView.e) {
                        long j7 = am1Var6.b;
                        long j8 = j7 - j3;
                        float f19 = ((float) ((((float) j8) / 60.0f) * width)) + f7;
                        float f20 = ((float) ((((float) (j8 + 1)) / 60.0f) * width)) + f7;
                        if (am1Var5 != null) {
                            if (j7 - am1Var5.b > 1) {
                                paint.setColor(parseColor);
                                canvas2.drawRect(((float) ((((float) ((r9 - j3) + 1)) / 60.0f) * width)) + f7, f4 - f5, f19, f4, paint);
                            }
                        }
                        java.lang.String valueOf = java.lang.String.valueOf(am1Var6.d);
                        java.util.ArrayList arrayList = threadCPUView.m;
                        a.wv.v(arrayList, "clusters");
                        java.util.Iterator it = arrayList.iterator();
                        int i8 = -1;
                        int i9 = i7;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                a.b20.p1();
                                throw null;
                            }
                            java.lang.String[] strArr = (java.lang.String[]) next;
                            a.wv.v(strArr, "cluster");
                            int length = strArr.length;
                            int i11 = i7;
                            while (true) {
                                if (i11 >= length) {
                                    str = null;
                                    break;
                                }
                                str = strArr[i11];
                                if (a.wv.e(str, valueOf)) {
                                    break;
                                }
                                i11++;
                            }
                            if (str != null) {
                                i8 = i9;
                            }
                            i9 = i10;
                            i7 = 0;
                        }
                        if (i8 < 0 || (num = (java.lang.Integer) a.qv.h2(threadCPUView.n, i8)) == null) {
                            i2 = parseColor;
                        } else {
                            int intValue = num.intValue();
                            i2 = android.graphics.Color.argb(128, android.graphics.Color.red(intValue), android.graphics.Color.green(intValue), android.graphics.Color.blue(intValue));
                        }
                        paint.setColor(i2);
                        canvas2.drawRect(f19, f4 - f5, f20, f4, paint);
                        am1Var5 = am1Var6;
                        i7 = 0;
                    }
                }
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.tl1 tl1Var = new a.tl1(threadCPUView, null);
                this.g = 2;
                java.lang.Object S1 = a.wv.S1(zx0Var, tl1Var, this);
                a.dz dzVar3 = dzVar;
                return S1 == dzVar3 ? dzVar3 : no1Var;
            }
            a.u20 u20Var2 = a.z80.f728a;
            a.zx0 zx0Var2 = a.by0.f57a;
            a.sl1 sl1Var = new a.sl1(threadCPUView, null);
            this.g = 1;
            if (a.wv.S1(zx0Var2, sl1Var, this) == dzVar2) {
                return dzVar2;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return no1Var2;
            }
            a.b20.q1(obj);
        }
        return no1Var2;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ul1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
