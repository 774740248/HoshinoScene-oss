package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wn {
    public static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, android.widget.TextView textView, android.text.TextPaint textPaint) {
        return new android.text.StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(android.widget.TextView textView) {
        return textView.getMaxLines();
    }
}
