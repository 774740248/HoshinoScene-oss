package com.omarea.ui.charge;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ChargeCurveView extends android.view.View {
    public final a.au c;
    public final android.graphics.DashPathEffect d;
    public int e;
    public final a.vj1 f;
    public android.graphics.Bitmap g;
    public boolean h;
    public final a.pm i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeCurveView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = a.au.e();
        this.d = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.f = new a.vj1(new a.cd1(12, this));
        this.h = true;
        this.i = new a.pm(24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        if (r2 < 6) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.omarea.ui.charge.ChargeCurveView r31, android.graphics.Canvas r32) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.charge.ChargeCurveView.a(com.omarea.ui.charge.ChargeCurveView, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011e A[LOOP:2: B:29:0x011c->B:30:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.omarea.ui.charge.ChargeCurveView r23, android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.charge.ChargeCurveView.b(com.omarea.ui.charge.ChargeCurveView, android.graphics.Canvas):void");
    }

    private final a.du getChartStyles() {
        return (a.du) this.f.a();
    }

    public final double c(java.util.ArrayList arrayList, float f, android.graphics.Canvas canvas, android.graphics.Paint paint) {
        char c;
        char c2;
        float N = a.b20.N(this, 1.0f) * 8.5f;
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(N);
        boolean z = false;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        com.omarea.model.ChargeStatRecord chargeStatRecord = (com.omarea.model.ChargeStatRecord) a.qv.g2(arrayList);
        java.lang.Long valueOf = chargeStatRecord != null ? java.lang.Long.valueOf(chargeStatRecord.time) : null;
        com.omarea.model.ChargeStatRecord chargeStatRecord2 = (com.omarea.model.ChargeStatRecord) a.qv.m2(arrayList);
        double longValue = (valueOf == null || (chargeStatRecord2 != null ? java.lang.Long.valueOf(chargeStatRecord2.time) : null) == null) ? 5.0d : (java.lang.Long.valueOf(chargeStatRecord2.time).longValue() - valueOf.longValue()) / 60000.0d;
        a.pm pmVar = this.i;
        a.gm1 t = pmVar.t(longValue);
        double d = t.f183a;
        int i = t.b;
        double d2 = d / i;
        double width = (((getWidth() - f) - f) * 1.0d) / d;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                double d3 = i2 * d2;
                int i3 = i;
                float f2 = ((int) (d3 * width)) + f;
                if (i2 % t.d == 0) {
                    getChartStyles().c(paint);
                    ((a.gy) pmVar.d).getClass();
                    canvas.drawText(a.gy.o(d3), f2, (getHeight() - f) + N + (a.b20.N(this, 1.0f) * 2), paint);
                }
                getChartStyles().a(i2, i2 % t.c == 0 ? true : z, paint);
                int i4 = i2;
                canvas.drawLine(f2, f, f2, getHeight() - f, paint);
                if (i4 == i3) {
                    break;
                }
                i2 = i4 + 1;
                i = i3;
                z = false;
            }
        }
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        if (valueOf != null) {
            float height = getHeight() - f;
            float height2 = (float) ((((getHeight() - f) - f) * 1.0d) / 101);
            com.omarea.model.ChargeStatRecord chargeStatRecord3 = (com.omarea.model.ChargeStatRecord) a.qv.e2(arrayList);
            com.omarea.model.ChargeStatRecord chargeStatRecord4 = (com.omarea.model.ChargeStatRecord) a.qv.l2(arrayList);
            float longValue2 = ((float) ((((float) (chargeStatRecord4.time - valueOf.longValue())) / 60000.0f) * width)) + f;
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(((float) ((((float) (chargeStatRecord3.time - valueOf.longValue())) / 60000.0f) * width)) + f, height - (chargeStatRecord3.capacity * height2));
            int i5 = 4;
            java.lang.Integer[] numArr = {20, 40, 60, 80};
            java.util.Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                com.omarea.model.ChargeStatRecord chargeStatRecord5 = (com.omarea.model.ChargeStatRecord) it.next();
                float longValue3 = ((float) ((((float) (chargeStatRecord5.time - valueOf.longValue())) / 60000.0f) * width)) + f;
                float f3 = height - (chargeStatRecord5.capacity * height2);
                path.lineTo(longValue3, f3);
                int i7 = chargeStatRecord5.capacity;
                if (i6 != i7) {
                    if (a.op.K1(numArr, java.lang.Integer.valueOf(i7))) {
                        java.lang.Integer[] numArr2 = new java.lang.Integer[i5];
                        c = 20;
                        numArr2[0] = 20;
                        c2 = '(';
                        numArr2[1] = 40;
                        numArr2[2] = 60;
                        numArr2[3] = 80;
                        if (a.op.K1(numArr2, java.lang.Integer.valueOf(i7))) {
                            canvas.drawCircle(longValue3, f3, 4.0f, paint);
                            canvas.drawText(i7 + "%", longValue3, f3, paint);
                        }
                    } else {
                        c = 20;
                        c2 = '(';
                    }
                    i6 = i7;
                    i5 = 4;
                }
            }
            path.lineTo(longValue2, height - (chargeStatRecord4.capacity * height2));
            getChartStyles().getClass();
            paint.reset();
            paint.setColor(((java.lang.Number) a.du.h.a()).intValue());
            paint.setAntiAlias(true);
            paint.setStrokeWidth(8.0f);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setPathEffect(null);
            canvas.drawPath(path, paint);
        }
        paint.reset();
        return width;
    }

    public final void d(int i) {
        if (getWidth() < 1 || getHeight() < 1) {
            return;
        }
        this.e = i;
        android.graphics.Bitmap bitmap = this.g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.g = null;
        this.g = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ut(this, null), 3);
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        a.wv.w(canvas, "originCanvas");
        super.onDraw(canvas);
        if (getHeight() < 0 || getWidth() < 0 || (bitmap = this.g) == null) {
            return;
        }
        a.wv.s(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
    }
}
