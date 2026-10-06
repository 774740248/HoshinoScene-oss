package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ll1 {
    public static java.lang.String[] a(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static android.text.PrecomputedText.Params b(android.widget.TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void c(android.widget.TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
