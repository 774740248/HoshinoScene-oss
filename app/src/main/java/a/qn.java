package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class qn {
    public static int a(android.widget.TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(android.widget.TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void c(android.widget.TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(android.widget.TextView textView, java.lang.String str) {
        return textView.setFontVariationSettings(str);
    }
}
