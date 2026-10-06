package com.omarea.ui.charge;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ChargeTempView extends android.view.View {
    public final a.au c;
    public int d;
    public final a.vj1 e;
    public final a.pm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeTempView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = a.au.e();
        this.e = new a.vj1(new a.cd1(13, this));
        this.f = new a.pm(24);
    }

    private final a.du getChartStyles() {
        return (a.du) this.e.a();
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        float f;
        double d;
        float f2;
        int i;
        boolean z;
        boolean z2;
        java.lang.String str;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        int i2 = this.d;
        a.au auVar = this.c;
        auVar.m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) auVar.d).rawQuery("select capacity, temperature, time from records where session = ?", new java.lang.String[]{"" + i2});
            while (rawQuery.moveToNext()) {
                arrayList.add(new a.xt(2, rawQuery));
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        int N = a.b20.N(this, 1.0f);
        android.graphics.Path path = new android.graphics.Path();
        float f3 = getChartStyles().c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf(((com.omarea.model.ChargeStatRecord) it.next()).temperature));
        }
        a.qv.r2(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Float.valueOf(((com.omarea.model.ChargeStatRecord) it2.next()).temperature));
        }
        java.lang.Float p2 = a.qv.p2(arrayList3);
        com.omarea.model.ChargeStatRecord chargeStatRecord = (com.omarea.model.ChargeStatRecord) a.qv.g2(arrayList);
        java.lang.Long valueOf = chargeStatRecord != null ? java.lang.Long.valueOf(chargeStatRecord.time) : null;
        com.omarea.model.ChargeStatRecord chargeStatRecord2 = (com.omarea.model.ChargeStatRecord) a.qv.m2(arrayList);
        double longValue = (valueOf == null || (chargeStatRecord2 != null ? java.lang.Long.valueOf(chargeStatRecord2.time) : null) == null) ? 5.0d : (java.lang.Long.valueOf(chargeStatRecord2.time).longValue() - valueOf.longValue()) / 60000.0d;
        a.pm pmVar = this.f;
        a.gm1 t = pmVar.t(longValue);
        float f4 = getChartStyles().b;
        float measureText = paint.measureText(p2 + "℃");
        int floatValue = (p2 == null || p2.floatValue() <= 50.0f) ? 51 : ((int) p2.floatValue()) + 2;
        java.lang.String str2 = "℃";
        double d2 = t.f183a;
        double width = (((getWidth() - f4) - f4) * 1.0d) / d2;
        int i3 = floatValue - 25;
        float height = (float) ((((getHeight() - f4) - f4) * 1.0d) / i3);
        float height2 = getHeight() - f4;
        a.gm1 gm1Var = t;
        int i4 = gm1Var.b;
        double d3 = d2 / i4;
        if (i4 >= 0) {
            int i5 = i3;
            int i6 = 0;
            while (true) {
                double d4 = i6 * d3;
                double d5 = d3;
                float f5 = ((int) (d4 * width)) + f4;
                if (i6 % gm1Var.d == 0) {
                    getChartStyles().c(paint);
                    ((a.gy) pmVar.d).getClass();
                    canvas2 = canvas;
                    canvas2.drawText(a.gy.o(d4), f5, (getHeight() - f4) + f3 + (N * 2), paint);
                } else {
                    canvas2 = canvas;
                }
                getChartStyles().a(i6, i6 % gm1Var.c == 0, paint);
                f2 = height2;
                i = i5;
                f = f4;
                d = width;
                int i7 = i4;
                a.gm1 gm1Var2 = gm1Var;
                a.pm pmVar2 = pmVar;
                canvas.drawLine(f5, f4, f5, getHeight() - f4, paint);
                if (i6 == i7) {
                    break;
                }
                i6++;
                gm1Var = gm1Var2;
                i4 = i7;
                pmVar = pmVar2;
                f4 = f;
                d3 = d5;
                width = d;
                i5 = i;
                height2 = f2;
            }
        } else {
            canvas2 = canvas;
            f = f4;
            d = width;
            f2 = height2;
            i = i3;
        }
        if (i >= 0) {
            int i8 = 0;
            while (true) {
                float f6 = f + ((int) ((i - i8) * height));
                if (i8 % 5 == 0) {
                    if (i8 > 0) {
                        getChartStyles().d(paint);
                        str = str2;
                        canvas2.drawText(a.ai1.c(i8 + 25, str), f - (N * 4), (f3 / 2.0f) + f6, paint);
                    } else {
                        str = str2;
                    }
                    z = true;
                    getChartStyles().a(i8, true, paint);
                    z2 = false;
                } else {
                    str = str2;
                    z = true;
                    z2 = false;
                    getChartStyles().a(i8, false, paint);
                }
                canvas.drawLine(measureText, f6, getWidth() - f, f6, paint);
                if (i8 == i) {
                    break;
                }
                i8++;
                str2 = str;
            }
        } else {
            z = true;
            z2 = false;
        }
        if (valueOf != null) {
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                com.omarea.model.ChargeStatRecord r1 = (com.omarea.model.ChargeStatRecord) it3.next();
                float longValue2 = ((float) ((((float) (r1.time - valueOf.longValue())) / 60000.0f) * d)) + f;
                float f7 = r1.temperature;
                float f8 = 25;
                float f9 = f7 > f8 ? f7 - f8 : 0.0f;
                if (z) {
                    path.moveTo(longValue2, f2 - (f9 * height));
                    z = z2;
                } else {
                    path.lineTo(longValue2, f2 - (f9 * height));
                }
            }
        }
        getChartStyles().getClass();
        a.du.b(paint);
        canvas2.drawPath(path, paint);
    }
}
