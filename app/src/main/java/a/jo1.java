package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jo1 extends android.text.style.ReplacementSpan {
    public final a.eb0 b;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f262a = new android.graphics.Paint.FontMetricsInt();
    public float c = 1.0f;

    public jo1(a.eb0 eb0Var) {
        if (eb0Var == null) {
            throw new java.lang.NullPointerException("metadata cannot be null");
        }
        this.b = eb0Var;
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        java.lang.Object r1 = null;
        java.lang.Object r7 = null;
        java.lang.Object r8 = null;
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.f262a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        a.eb0 eb0Var = this.b;
        this.c = abs / (eb0Var.c().a(14) != 0 ? r8.b.getShort(r1 + r8.f295a) : (short) 0);
        a.t01 c = eb0Var.c();
        int a2 = c.a(14);
        if (a2 != 0) {
            c.b.getShort(a2 + c.f295a);
        }
        short s = (short) ((eb0Var.c().a(12) != 0 ? r5.b.getShort(r7 + r5.f295a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        a.ta0.a().getClass();
        a.eb0 eb0Var = this.b;
        a.ej1 ej1Var = eb0Var.b;
        android.graphics.Typeface typeface = (android.graphics.Typeface) ej1Var.f;
        android.graphics.Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) ej1Var.d, eb0Var.f119a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
