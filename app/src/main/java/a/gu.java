package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gu {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.DashPathEffect f192a = new android.graphics.DashPathEffect(new float[]{6.0f, 4.0f}, 0.0f);

    public static void a(android.graphics.Canvas canvas, float f, float f2, android.graphics.RectF rectF, java.lang.String str, float f3, android.graphics.Paint paint, int i) {
        int parseColor = android.graphics.Color.parseColor("#cc000000");
        a.wv.w(canvas, "canvas");
        a.wv.w(paint, "paint");
        b(canvas, f, f2, rectF, a.b20.y0(str), f3, paint, a.b20.y0(java.lang.Integer.valueOf(i)), parseColor, 512);
    }

    public static android.graphics.RectF b(android.graphics.Canvas canvas, float f, float f2, android.graphics.RectF rectF, java.util.List list, float f3, android.graphics.Paint paint, java.util.List list2, int i, int i2) {
        java.lang.Integer num;
        java.util.List list3 = (i2 & 128) != 0 ? null : list2;
        int parseColor = (i2 & 256) != 0 ? android.graphics.Color.parseColor("#cc000000") : i;
        int i3 = (i2 & 512) != 0 ? -1 : 0;
        a.wv.w(canvas, "canvas");
        a.wv.w(paint, "paint");
        paint.reset();
        float f4 = 0.95f * f3;
        paint.setTextSize(f4);
        paint.setTypeface(android.graphics.Typeface.MONOSPACE);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        float f5 = 0.55f * f4;
        float f6 = 0.35f * f4;
        float f7 = 1.2f * f4;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(paint.measureText((java.lang.String) it.next())));
        }
        java.lang.Float p2 = a.qv.p2(arrayList);
        float f8 = 2;
        float floatValue = (f5 * f8) + (p2 != null ? p2.floatValue() : 0.0f);
        float size = ((list.size() - 1) * f7) + (f6 * f8) + f4;
        float f9 = 5.0f * f4;
        float f10 = rectF.left;
        int i4 = i3;
        float f11 = rectF.right;
        float f12 = 0.8f * f4;
        float B = a.wv.B(f > (f10 + f11) / f8 ? ((f - floatValue) - f9) - f12 : f + f9 + f12, f10, f11 - floatValue);
        float B2 = a.wv.B(f2 - (size / 2.0f), rectF.top, rectF.bottom - size);
        android.graphics.RectF rectF2 = new android.graphics.RectF(B, B2, floatValue + B, size + B2);
        paint.setColor(parseColor);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        float f13 = f4 / f8;
        canvas.drawRoundRect(rectF2, f13, f13, paint);
        float f14 = rectF2.top + f6 + f13;
        int i5 = 0;
        for (java.lang.Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                a.b20.p1();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            paint.setColor((list3 == null || (num = (java.lang.Integer) a.qv.h2(list3, i5)) == null) ? i4 : num.intValue());
            paint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawText(str, rectF2.left + f5, (f4 / 3) + (i5 * f7) + f14, paint);
            i5 = i6;
        }
        return rectF2;
    }

    public static void c(android.graphics.Canvas canvas, float f, float f2, float f3, android.graphics.Paint paint) {
        a.wv.w(canvas, "canvas");
        a.wv.w(paint, "paint");
        paint.reset();
        paint.setColor(android.graphics.Color.parseColor("#ff808080"));
        paint.setStrokeWidth(4.0f);
        paint.setPathEffect(f192a);
        canvas.drawLine(f, f2, f, f3, paint);
    }

    public static int d(float f, float f2, float f3, int i, int i2) {
        if (i2 <= 0) {
            return -1;
        }
        int i3 = i2 - 1;
        return java.lang.Math.max(0, java.lang.Math.min((int) (((f - f2) / java.lang.Math.max(1.0f, (i - f2) - f3)) * i3), i3));
    }
}
