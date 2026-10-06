package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yn {
    public static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, int i2, android.widget.TextView textView, android.text.TextPaint textPaint, a.bo boVar) {
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        android.text.StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            boVar.a(obtain, textView);
        } catch (java.lang.ClassCastException unused) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
