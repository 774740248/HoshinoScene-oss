package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oo0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.fps.FrameTimeView2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(com.omarea.ui.fps.FrameTimeView2 frameTimeView2, a.ey eyVar) {
        super(2, eyVar);
        this.h = frameTimeView2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.oo0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar;
        a.dz dzVar2 = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.fps.FrameTimeView2 frameTimeView2 = this.h;
            frameTimeView2.f = android.graphics.Bitmap.createBitmap(frameTimeView2.getWidth(), frameTimeView2.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Bitmap bitmap = frameTimeView2.f;
            a.wv.s(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            java.util.ArrayList arrayList = frameTimeView2.c;
            int size = arrayList.size();
            if (arrayList.size() < 1) {
                dzVar = dzVar2;
            } else {
                android.graphics.Paint paint = frameTimeView2.e;
                paint.reset();
                paint.setStrokeWidth(2.0f);
                java.lang.Integer[] numArr = size >= 127 ? new java.lang.Integer[]{0, 7, 14, 21, 28} : size >= 100 ? new java.lang.Integer[]{0, 8, 16, 25, 33} : size >= 70 ? new java.lang.Integer[]{0, 11, 22, 33, 44} : new java.lang.Integer[]{0, 8, 16, 25, 33, 41};
                int N = a.b20.N(frameTimeView2, 1.0f);
                float f = N;
                float f2 = 8.5f * f;
                paint.setTextSize(f2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = java.lang.String.valueOf(50).length();
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("9");
                }
                float f3 = f * 4.0f;
                float measureText = paint.measureText(sb.toString()) + f3;
                float f4 = f * 18.0f;
                double width = (((frameTimeView2.getWidth() - measureText) - f4) * 1.0d) / 1000000000;
                dzVar = dzVar2;
                float height = (float) ((((frameTimeView2.getHeight() - f4) - f3) * 1.0d) / 50);
                float height2 = frameTimeView2.getHeight() - f4;
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                paint.setStrokeWidth(1.0f);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(android.graphics.Color.parseColor("#55ffffff"));
                int i3 = 0;
                int i4 = 11;
                while (i3 < i4) {
                    float f5 = f2;
                    java.lang.Integer[] numArr2 = numArr;
                    double d = width;
                    float f6 = ((int) (i3 * width * 100000000)) + measureText;
                    canvas.drawText(i3 == 0 ? "0ms" : java.lang.String.valueOf(i3 * 100), f6, (frameTimeView2.getHeight() - f4) + f5 + (N * 2), paint);
                    canvas.drawLine(f6, f3, f6, frameTimeView2.getHeight() - f4, paint);
                    i3++;
                    numArr = numArr2;
                    f2 = f5;
                    N = N;
                    i4 = 11;
                    width = d;
                    arrayList = arrayList;
                    height2 = height2;
                }
                float f7 = height2;
                int i5 = N;
                java.lang.Integer[] numArr3 = numArr;
                java.util.ArrayList arrayList2 = arrayList;
                double d2 = width;
                float f8 = f2;
                paint.setStrokeWidth(2.0f);
                paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                int i6 = 0;
                while (true) {
                    if (a.op.K1(numArr3, java.lang.Integer.valueOf(i6))) {
                        if (i6 > 0) {
                            paint.setColor(android.graphics.Color.parseColor("#ffffff"));
                            canvas.drawText(java.lang.String.valueOf(i6), measureText - (i5 * 2), (f8 / 2.2f) + ((int) ((50 - i6) * height)) + f3, paint);
                        }
                        paint.setStrokeWidth(2.0f);
                        if (i6 != 0) {
                            paint.setColor(android.graphics.Color.parseColor("#55ffffff"));
                        }
                        float f9 = f3 + ((int) ((50 - i6) * height));
                        canvas.drawLine(measureText, f9, frameTimeView2.getWidth() - f4, f9, paint);
                    }
                    if (i6 == 50) {
                        break;
                    }
                    i6++;
                }
                paint.reset();
                paint.setPathEffect(null);
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(measureText, f7);
                path.setFillType(android.graphics.Path.FillType.WINDING);
                paint.setAntiAlias(true);
                paint.setColor(android.graphics.Color.parseColor("#8887d3ff"));
                paint.setStyle(android.graphics.Paint.Style.FILL);
                java.util.Iterator it = arrayList2.iterator();
                float f10 = measureText;
                while (it.hasNext()) {
                    java.lang.Double d3 = (java.lang.Double) it.next();
                    a.wv.v(d3, "sample");
                    float doubleValue = (float) ((d3.doubleValue() * d2) + f10);
                    float doubleValue2 = f7 - ((((float) d3.doubleValue()) / 1000000) * height);
                    path.lineTo(f10, f7);
                    path.lineTo(f10, doubleValue2);
                    path.lineTo(doubleValue, doubleValue2);
                    path.lineTo(doubleValue, f7);
                    f10 = doubleValue;
                }
                path.moveTo(measureText, f7);
                path.close();
                paint.setColor(android.graphics.Color.parseColor("#83d81e06"));
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setStrokeWidth(0.0f);
                canvas.drawPath(path, paint);
                paint.setColor(android.graphics.Color.parseColor("#B3d81e06"));
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                canvas.drawPath(path, paint);
                paint.setTextSize(f8);
                paint.setColor(android.graphics.Color.parseColor("#d81e06"));
                paint.setTextAlign(android.graphics.Paint.Align.CENTER);
                canvas.drawText(a.ai1.l(new java.lang.Object[]{frameTimeView2.d}, 1, "FPS: %.1f", "format(format, *args)"), frameTimeView2.getWidth() / 2.0f, f8, paint);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.no0 no0Var = new a.no0(frameTimeView2, null);
            this.g = 1;
            java.lang.Object S1 = a.wv.S1(zx0Var, no0Var, this);
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
        return ((a.oo0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
