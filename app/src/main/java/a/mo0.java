package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mo0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.FrameTimeView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(com.omarea.ui.fps.FrameTimeView frameTimeView, a.ey eyVar) {
        super(2, eyVar);
        this.h = frameTimeView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mo0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar;
        float f;
        float f2;
        java.lang.Integer[] numArr;
        a.dz dzVar2 = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.FrameTimeView frameTimeView = this.h;
            frameTimeView.h = android.graphics.Bitmap.createBitmap(frameTimeView.getWidth(), frameTimeView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = frameTimeView.h;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            a.r51 r51Var = frameTimeView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            long j = frameTimeView.f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                android.database.sqlite.SQLiteDatabase e = r51Var.e();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(j);
                android.database.Cursor rawQuery = e.rawQuery("select max_ftime from fps_record where session = ?", new java.lang.String[]{sb.toString()});
                a.wv.v(rawQuery, "database.rawQuery(\n     … sessionId)\n            )");
                while (rawQuery.moveToNext()) {
                    arrayList.add(java.lang.Double.valueOf(rawQuery.getDouble(0)));
                }
                rawQuery.close();
            } catch (java.lang.Exception unused) {
            }
            frameTimeView.k = arrayList;
            if (arrayList.isEmpty()) {
                dzVar = dzVar2;
            } else {
                android.graphics.Paint paint = frameTimeView.g;
                paint.reset();
                paint.setStrokeWidth(2.0f);
                double size = arrayList.size() / 60.0d;
                java.lang.Integer[] numArr2 = {0, 8, 16, 25, 33, 41, 50, 58, 66, 75, 83, 91, 100};
                int N = a.b20.N(frameTimeView, 1.0f);
                float f3 = N;
                float f4 = f3 * 8.5f;
                paint.setTextSize(f4);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(100).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb2.append("9");
                }
                float f5 = f3 * 4.0f;
                float measureText = paint.measureText(sb2.toString()) + f5;
                float f6 = f3 * 18.0f;
                double width = (((frameTimeView.getWidth() - measureText) - f6) * 1.0d) / size;
                dzVar = dzVar2;
                float height = (float) ((((frameTimeView.getHeight() - f6) - f5) * 1.0d) / 100);
                float height2 = frameTimeView.getHeight() - f6;
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                double d = size / 5;
                paint.setStrokeWidth(1.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                int i3 = 0;
                while (true) {
                    f = measureText;
                    float f7 = ((int) (1.0f * width)) + f;
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    frameTimeView.d.getClass();
                    f2 = N * 2;
                    canvas.drawText(a.gy.o(i3 * d), f7, (frameTimeView.getHeight() - f6) + f4 + f2, paint);
                    paint.setColor(android.graphics.Color.parseColor("#40888888"));
                    int i4 = i3;
                    double d2 = d;
                    numArr = numArr2;
                    canvas.drawLine(f7, f5, f7, frameTimeView.getHeight() - f6, paint);
                    if (i4 == 5) {
                        break;
                    }
                    i3 = i4 + 1;
                    measureText = f;
                    d = d2;
                    numArr2 = numArr;
                }
                paint.setStrokeWidth(2.0f);
                paint.setPathEffect(frameTimeView.e);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                int i5 = 0;
                while (true) {
                    paint.setColor(android.graphics.Color.parseColor("#888888"));
                    java.lang.Integer[] numArr3 = numArr;
                    if (a.op.K1(numArr3, java.lang.Integer.valueOf(i5))) {
                        if (i5 > 0) {
                            canvas.drawText(java.lang.String.valueOf(i5), f - f2, (f4 / 2.2f) + f5 + ((int) ((100 - i5) * height)), paint);
                        }
                        paint.setStrokeWidth(i5 == 0 ? 4.0f : 2.0f);
                        if (i5 == 0) {
                            paint.setColor(android.graphics.Color.parseColor("#888888"));
                        } else {
                            paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                        }
                        float f8 = f5 + ((int) ((100 - i5) * height));
                        canvas.drawLine(f, f8, frameTimeView.getWidth() - f6, f8, paint);
                    }
                    if (i5 == 100) {
                        break;
                    }
                    i5++;
                    numArr = numArr3;
                }
                paint.reset();
                paint.setPathEffect(null);
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(f, height2);
                paint.setAntiAlias(true);
                a.vj1 vj1Var = a.du.f;
                paint.setColor(a.tg1.h());
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                java.util.Iterator it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    java.lang.Double d3 = (java.lang.Double) it.next();
                    float f9 = (i6 > 0 ? (float) (((i6 - 1) / 60.0f) * width) : 0.0f) + f;
                    float f10 = ((float) ((i6 / 60.0f) * width)) + f;
                    float doubleValue = height2 - (((float) d3.doubleValue()) * height);
                    path.lineTo(f9, height2);
                    path.lineTo(f9, doubleValue);
                    path.lineTo(f10, doubleValue);
                    path.lineTo(f10, height2);
                    i6++;
                }
                path.moveTo(f, height2);
                canvas.drawPath(path, paint);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.lo0 lo0Var = new a.lo0(frameTimeView, null);
            this.g = 1;
            java.lang.Object S1 = a.wv.S1(zx0Var, lo0Var, this);
            a.dz dzVar3 = dzVar;
            if (S1 == dzVar3) {
                return dzVar3;
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
        return ((a.mo0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
