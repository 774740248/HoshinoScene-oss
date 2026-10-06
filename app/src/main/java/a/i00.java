package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i00 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.DDRView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(com.omarea.ui.fps.DDRView dDRView, a.ey eyVar) {
        super(2, eyVar);
        this.h = dDRView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i00(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar;
        float f;
        android.graphics.Paint paint;
        float f2;
        a.dz dzVar2 = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.DDRView dDRView = this.h;
            dDRView.k = android.graphics.Bitmap.createBitmap(dDRView.getWidth(), dDRView.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = dDRView.k;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            a.r51 r51Var = dDRView.c;
            if (r51Var == null) {
                a.wv.M1("storage");
                throw null;
            }
            java.util.ArrayList v = r51Var.v(dDRView.f);
            dDRView.i = v;
            if (v.size() < 1) {
                dzVar = dzVar2;
            } else {
                java.util.ArrayList f3 = a.b20.f(0);
                java.util.Iterator it = v.iterator();
                int i2 = 4266;
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    if (!f3.contains(num)) {
                        f3.add(num);
                    }
                    a.wv.v(num, "value");
                    if (num.intValue() > i2) {
                        i2 = num.intValue();
                    }
                }
                android.graphics.Paint paint2 = dDRView.j;
                paint2.reset();
                paint2.setStrokeWidth(2.0f);
                double size = v.size() / 60.0d;
                int N = a.b20.N(dDRView, 1.0f);
                float f4 = N;
                float f5 = f4 * 8.5f;
                paint2.setTextSize(f5);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i3 = 0;
                for (int length = java.lang.String.valueOf(i2).length(); i3 < length; length = length) {
                    sb.append("9");
                    i3++;
                }
                float f6 = f4 * 4.0f;
                float measureText = paint2.measureText(sb.toString()) + f6;
                float f7 = f4 * 18.0f;
                double width = (((dDRView.getWidth() - measureText) - f7) * 1.0d) / size;
                dzVar = dzVar2;
                int i4 = N;
                float height = (float) ((((dDRView.getHeight() - f7) - f6) * 1.0d) / i2);
                float height2 = dDRView.getHeight() - f7;
                paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
                double d = size / 5;
                paint2.setStrokeWidth(1.0f);
                paint2.setStyle(android.graphics.Paint.Style.FILL);
                int i5 = 0;
                while (true) {
                    int i6 = i4;
                    float f8 = ((int) (1.0f * width)) + measureText;
                    paint2.setColor(android.graphics.Color.parseColor("#888888"));
                    dDRView.d.getClass();
                    f = i6 * 2;
                    canvas.drawText(a.gy.o(i5 * d), f8, (dDRView.getHeight() - f7) + f5 + f, paint2);
                    paint2.setColor(android.graphics.Color.parseColor("#40888888"));
                    double d2 = d;
                    int i7 = i5;
                    paint = paint2;
                    canvas.drawLine(f8, f6, f8, dDRView.getHeight() - f7, paint2);
                    if (i7 == 5) {
                        break;
                    }
                    i5 = i7 + 1;
                    paint2 = paint;
                    i4 = i6;
                    d = d2;
                }
                float f9 = 2.0f;
                paint.setStrokeWidth(2.0f);
                paint.setPathEffect(dDRView.e);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                if (i2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        paint.setColor(android.graphics.Color.parseColor("#888888"));
                        if (f3.contains(java.lang.Integer.valueOf(i8))) {
                            if (i8 > 0) {
                                canvas.drawText(java.lang.String.valueOf(i8), measureText - f, (f5 / 2.2f) + f6 + ((int) ((i2 - i8) * height)), paint);
                            }
                            paint.setStrokeWidth(i8 == 0 ? 4.0f : f9);
                            if (i8 == 0) {
                                paint.setColor(android.graphics.Color.parseColor("#888888"));
                            } else {
                                paint.setColor(android.graphics.Color.parseColor("#aa888888"));
                            }
                            float f10 = f6 + ((int) ((i2 - i8) * height));
                            f2 = f9;
                            canvas.drawLine(measureText, f10, dDRView.getWidth() - f7, f10, paint);
                        } else {
                            f2 = f9;
                        }
                        if (i8 == i2) {
                            break;
                        }
                        i8++;
                        f9 = f2;
                    }
                }
                paint.reset();
                a.vj1 vj1Var = a.du.f;
                paint.setColor(a.tg1.h());
                paint.setAntiAlias(true);
                paint.setStrokeWidth(8.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setPathEffect(null);
                java.lang.Object g2 = a.qv.g2(v);
                if (g2 == null || ((java.lang.Number) g2).intValue() < 0) {
                    g2 = 0;
                }
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(measureText, height2 - (((java.lang.Number) g2).floatValue() * height));
                java.util.Iterator it2 = v.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    java.lang.Integer num2 = (java.lang.Integer) it2.next();
                    a.wv.v(num2, "sample");
                    if (num2.intValue() < 0) {
                        num2 = 0;
                    }
                    path.lineTo(((float) ((i9 / 60.0f) * width)) + measureText, height2 - (num2.intValue() * height));
                    i9++;
                }
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(4.0f);
                canvas.drawPath(path, paint);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.h00 h00Var = new a.h00(dDRView, null);
            this.g = 1;
            java.lang.Object S1 = a.wv.S1(zx0Var, h00Var, this);
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
        return ((a.i00) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
