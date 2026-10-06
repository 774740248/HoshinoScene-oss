package com.omarea.ui.charge;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ChargeTimeView extends android.view.View {
    public final a.au c;
    public int d;
    public final a.vj1 e;
    public final a.pm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeTimeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = a.au.e();
        this.e = new a.vj1(new a.cd1(14, this));
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
        android.graphics.Path path;
        float f;
        android.graphics.Path path2;
        a.wv.w(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.d;
        a.au auVar = this.c;
        auVar.m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) auVar.d).rawQuery("select capacity, time from records where session = ?", new java.lang.String[]{"" + i});
            a.yt ytVar = null;
            while (rawQuery.moveToNext()) {
                a.yt ytVar2 = new a.yt(rawQuery);
                if (ytVar != null) {
                    if (ytVar2.capacity == ytVar.capacity && ytVar2.startTime - ytVar.endTime < 10000) {
                        ytVar.endTime = ytVar2.endTime;
                    }
                    arrayList.add(ytVar);
                }
                ytVar = ytVar2;
            }
            if (ytVar != null) {
                arrayList.add(ytVar);
            }
            rawQuery.close();
        } catch (java.lang.Exception unused) {
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        int i2 = getChartStyles().f106a;
        float f2 = getChartStyles().b;
        com.omarea.model.ChargeStatTime chargeStatTime = (com.omarea.model.ChargeStatTime) a.qv.g2(arrayList);
        java.lang.Long valueOf = chargeStatTime != null ? java.lang.Long.valueOf(chargeStatTime.startTime) : null;
        com.omarea.model.ChargeStatTime chargeStatTime2 = (com.omarea.model.ChargeStatTime) a.qv.m2(arrayList);
        double longValue = (valueOf == null || (chargeStatTime2 != null ? java.lang.Long.valueOf(chargeStatTime2.endTime) : null) == null) ? 5.0d : (java.lang.Long.valueOf(chargeStatTime2.endTime).longValue() - valueOf.longValue()) / 60000.0d;
        a.pm pmVar = this.f;
        a.gm1 t = pmVar.t(longValue);
        double d = t.f183a;
        double width = (((getWidth() - f2) - f2) * 1.0d) / d;
        float height = (float) ((((getHeight() - f2) - f2) * 1.0d) / 101);
        float height2 = getHeight() - f2;
        android.graphics.Path path3 = new android.graphics.Path();
        int i3 = t.b;
        a.gm1 gm1Var = t;
        double d2 = d / i3;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                double d3 = i4 * d2;
                int i5 = i3;
                android.graphics.Path path4 = path3;
                float f3 = ((int) (d3 * width)) + f2;
                a.gm1 gm1Var2 = gm1Var;
                f = height;
                if (i4 % gm1Var2.d == 0) {
                    getChartStyles().c(paint);
                    ((a.gy) pmVar.d).getClass();
                    canvas.drawText(a.gy.o(d3), f3, (getHeight() - f2) + getChartStyles().c + (i2 * 2), paint);
                }
                getChartStyles().a(i4, i4 % gm1Var2.c == 0, paint);
                double d4 = d2;
                path = path4;
                int i6 = i4;
                canvas.drawLine(f3, f2, f3, getHeight() - f2, paint);
                if (i6 == i5) {
                    break;
                }
                i4 = i6 + 1;
                i3 = i5;
                height = f;
                d2 = d4;
                path3 = path;
                gm1Var = gm1Var2;
            }
        } else {
            path = path3;
            f = height;
        }
        int i7 = 0;
        while (true) {
            if (i7 % 20 == 0) {
                if (i7 > 0) {
                    getChartStyles().d(paint);
                    canvas.drawText(i7 + "%", f2 - (i2 * 4), (getChartStyles().c / 2.2f) + ((int) ((101 - i7) * f)) + f2, paint);
                }
                getChartStyles().a(i7, true, paint);
            } else {
                getChartStyles().a(i7, false, paint);
            }
            if (i7 % 10 == 0) {
                float f4 = f2 + ((int) ((101 - i7) * f));
                canvas.drawLine(f2, f4, getWidth() - f2, f4, paint);
            }
            if (i7 == 101) {
                break;
            } else {
                i7++;
            }
        }
        if (valueOf != null) {
            com.omarea.model.ChargeStatTime chargeStatTime3 = (com.omarea.model.ChargeStatTime) a.qv.e2(arrayList);
            com.omarea.model.ChargeStatTime chargeStatTime4 = (com.omarea.model.ChargeStatTime) a.qv.l2(arrayList);
            float longValue2 = ((float) ((((float) (chargeStatTime4.endTime - valueOf.longValue())) / 60000.0f) * width)) + f2;
            path2 = path;
            path2.moveTo(((float) ((((float) (chargeStatTime3.startTime - valueOf.longValue())) / 60000.0f) * width)) + f2, height2 - (chargeStatTime3.capacity * f));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.omarea.model.ChargeStatTime chargeStatTime5 = (com.omarea.model.ChargeStatTime) it.next();
                path2.lineTo(((float) ((((float) (chargeStatTime5.startTime - valueOf.longValue())) / 60000.0f) * width)) + f2, height2 - (chargeStatTime5.capacity * f));
            }
            path2.lineTo(longValue2, height2 - (chargeStatTime4.capacity * f));
        } else {
            path2 = path;
        }
        getChartStyles().getClass();
        a.du.b(paint);
        canvas.drawPath(path2, paint);
    }
}
