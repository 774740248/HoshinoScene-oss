package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ android.text.PrecomputedText.Params.Builder j(android.text.TextPaint textPaint) {
        return new android.text.PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ android.text.style.TypefaceSpan m(android.graphics.Typeface typeface) {
        return new android.text.style.TypefaceSpan(typeface);
    }

    public static /* bridge */ /* synthetic */ boolean v(android.text.Spannable spannable) {
        return spannable instanceof android.text.PrecomputedText;
    }
}
