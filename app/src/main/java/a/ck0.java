package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ck0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.FpsJankView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(com.omarea.ui.fps.FpsJankView fpsJankView, a.ey eyVar) {
        super(2, eyVar);
        this.h = fpsJankView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ck0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar;
        float f;
        android.graphics.Canvas canvas;
        double d;
        float f2;
        float f3;
        java.lang.String str;
        float f4;
        java.lang.String str2;
        float f5;
        int i;
        a.dz dzVar2 = a.dz.c;
        int i2 = this.g;
        if (i2 == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.FpsJankView fpsJankView = this.h;
            fpsJankView.j = android.graphics.Bitmap.createBitmap(fpsJankView.getWidth(), fpsJankView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = fpsJankView.j;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmap);
            a.r51 r51Var = fpsJankView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            long j = fpsJankView.f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                android.database.sqlite.SQLiteDatabase e = r51Var.e();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(j);
                android.database.Cursor rawQuery = e.rawQuery("select jank from fps_record where session = ?", new java.lang.String[]{sb.toString()});
                a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
                while (rawQuery.moveToNext()) {
                    arrayList.add(java.lang.Integer.valueOf(rawQuery.getInt(0)));
                }
                rawQuery.close();
            } catch (java.lang.Exception unused) {
            }
            fpsJankView.g = arrayList;
            a.r51 r51Var2 = fpsJankView.c;
            if (r51Var2 == null) {
                a.wv.M1("storage");
                throw null;
            }
            long j2 = fpsJankView.f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            try {
                android.database.sqlite.SQLiteDatabase e2 = r51Var2.e();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(j2);
                android.database.Cursor rawQuery2 = e2.rawQuery("select big_jank from fps_record where session = ?", new java.lang.String[]{sb2.toString()});
                a.wv.v(rawQuery2, "database.rawQuery(\n     … sessionId)\n            )");
                while (rawQuery2.moveToNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(rawQuery2.getInt(0)));
                }
                rawQuery2.close();
            } catch (java.lang.Exception unused2) {
            }
            fpsJankView.h = arrayList2;
            java.util.ArrayList arrayList3 = fpsJankView.g;
            if (arrayList3.size() < 1 || arrayList2.size() < 1) {
                dzVar = dzVar2;
            } else {
                android.graphics.Paint paint = fpsJankView.i;
                paint.reset();
                paint.setStrokeWidth(2.0f);
                double size = arrayList3.size() / 60.0d;
                java.lang.Object n2 = a.qv.n2(arrayList3);
                a.wv.s(n2);
                int intValue = ((java.lang.Number) n2).intValue();
                int i3 = intValue > 3 ? intValue : 3;
                int N = a.b20.N(fpsJankView, 1.0f);
                float f6 = N;
                float f7 = f6 * 8.5f;
                paint.setTextSize(f7);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                int i4 = 0;
                for (int length = java.lang.String.valueOf(i3).length(); i4 < length; length = length) {
                    sb3.append("9");
                    i4++;
                }
                float f8 = f6 * 4.0f;
                float measureText = paint.measureText(sb3.toString()) + f8;
                float f9 = f6 * 18.0f;
                double width = (((fpsJankView.getWidth() - measureText) - f9) * 1.0d) / size;
                dzVar = dzVar2;
                android.graphics.Canvas canvas3 = canvas2;
                float height = (float) ((((fpsJankView.getHeight() - f9) - f8) * 1.0d) / i3);
                float height2 = fpsJankView.getHeight() - f9;
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                int i5 = i3;
                double d2 = size / 5;
                paint.setStrokeWidth(1.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                int i6 = 0;
                while (true) {
                    float f10 = ((int) (1.0f * width)) + measureText;
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    fpsJankView.d.getClass();
                    f = N * 2;
                    float height3 = (fpsJankView.getHeight() - f9) + f7 + f;
                    canvas = canvas3;
                    canvas.drawText(a.gy.o(i6 * d2), f10, height3, paint);
                    paint.setColor(android.graphics.Color.parseColor("#40888888"));
                    int i7 = N;
                    int i8 = i6;
                    d = width;
                    f2 = 2.0f;
                    f3 = measureText;
                    canvas.drawLine(f10, f8, f10, fpsJankView.getHeight() - f9, paint);
                    if (i8 == 5) {
                        break;
                    }
                    i6 = i8 + 1;
                    canvas3 = canvas;
                    measureText = f3;
                    N = i7;
                    width = d;
                }
                paint.setStrokeWidth(2.0f);
                paint.setPathEffect(fpsJankView.e);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                java.util.ArrayList f11 = i5 > 5 ? a.b20.f(0, 5, 10, 15, 20) : i5 > 3 ? a.b20.f(0, 3, 6, 9) : a.b20.f(0, 1, 2, 3);
                if (i5 >= 0) {
                    int i9 = 0;
                    while (true) {
                        paint.setColor(android.graphics.Color.parseColor("#888888"));
                        if (f11.contains(java.lang.Integer.valueOf(i9))) {
                            if (i9 > 0) {
                                canvas.drawText(java.lang.String.valueOf(i9), f3 - f, (f7 / 2.2f) + f8 + ((int) ((i5 - i9) * height)), paint);
                            }
                            paint.setStrokeWidth(i9 == 0 ? 4.0f : f2);
                            if (i9 == 0) {
                                paint.setColor(android.graphics.Color.parseColor("#888888"));
                            } else {
                                paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                            }
                            float f12 = f8 + ((int) ((i5 - i9) * height));
                            i = i9;
                            canvas.drawLine(f3, f12, fpsJankView.getWidth() - f9, f12, paint);
                        } else {
                            i = i9;
                        }
                        if (i == i5) {
                            break;
                        }
                        i9 = i + 1;
                        f2 = 2.0f;
                    }
                }
                paint.reset();
                paint.setColor(android.graphics.Color.parseColor("#8087d3ff"));
                paint.setAntiAlias(true);
                paint.setStrokeWidth(8.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setPathEffect(null);
                java.lang.Object g2 = a.qv.g2(arrayList3);
                if (g2 == null || ((java.lang.Number) g2).intValue() < 0) {
                    g2 = 0;
                }
                android.graphics.Path path = new android.graphics.Path();
                java.lang.Number number = (java.lang.Number) g2;
                path.moveTo(f3, height2 - (number.floatValue() * height));
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                java.util.Iterator it = arrayList3.iterator();
                int i10 = 0;
                while (true) {
                    str = "sample";
                    f4 = 60.0f;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    a.wv.v(num, "sample");
                    if (num.intValue() < 0) {
                        num = 0;
                    }
                    int intValue2 = num.intValue();
                    float f13 = (i10 > 0 ? (float) (((i10 - 1) / 60.0f) * d) : 0.0f) + f3;
                    float f14 = ((float) ((i10 / 60.0f) * d)) + f3;
                    float f15 = height2 - (intValue2 * height);
                    path.lineTo(f13, height2);
                    path.lineTo(f13, f15);
                    path.lineTo(f14, f15);
                    path.lineTo(f14, height2);
                    i10++;
                }
                canvas.drawPath(path, paint);
                path.reset();
                paint.setColor(android.graphics.Color.parseColor("#FDB6E2"));
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                path.moveTo(f3, height2 - (number.floatValue() * height));
                java.util.Iterator it2 = arrayList2.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    java.lang.Integer num2 = (java.lang.Integer) it2.next();
                    a.wv.v(num2, str);
                    if (num2.intValue() < 0) {
                        num2 = 0;
                    }
                    int intValue3 = num2.intValue();
                    if (i11 > 0) {
                        str2 = str;
                        f5 = (float) (((i11 - 1) / f4) * d);
                    } else {
                        str2 = str;
                        f5 = 0.0f;
                    }
                    float f16 = f5 + f3;
                    float f17 = ((float) ((i11 / f4) * d)) + f3;
                    float f18 = height2 - (intValue3 * height);
                    path.lineTo(f16, height2);
                    path.lineTo(f16, f18);
                    path.lineTo(f17, f18);
                    path.lineTo(f17, height2);
                    i11++;
                    str = str2;
                    f4 = 60.0f;
                }
                canvas.drawPath(path, paint);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.bk0 bk0Var = new a.bk0(fpsJankView, null);
            this.g = 1;
            java.lang.Object S1 = a.wv.S1(zx0Var, bk0Var, this);
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
        return ((a.ck0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
