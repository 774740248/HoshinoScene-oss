package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s61 {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f519a;
    public final android.text.TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public s61(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        android.text.PrecomputedText.Params.Builder breakStrategy;
        android.text.PrecomputedText.Params.Builder hyphenationFrequency;
        android.text.PrecomputedText.Params.Builder textDirection;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            breakStrategy = a.z.j(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f519a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a.s61)) {
            return false;
        }
        a.s61 s61Var = (a.s61) obj;
        if (this.c == s61Var.c && this.d == s61Var.d) {
            android.text.TextPaint textPaint = this.f519a;
            float textSize = textPaint.getTextSize();
            android.text.TextPaint textPaint2 = s61Var.f519a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.b == s61Var.b;
        }
        return false;
    }

    public final int hashCode() {
        android.text.TextPaint textPaint = this.f519a;
        return a.x21.b(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.b, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f519a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public s61(android.text.PrecomputedText.Params params) {
        android.text.TextPaint textPaint;
        android.text.TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f519a = textPaint;
        textDirection = params.getTextDirection();
        this.b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.d = hyphenationFrequency;
    }
}
