package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class jl1 {
    public static int a(android.widget.TextView textView) {
        return textView.getBreakStrategy();
    }

    public static android.content.res.ColorStateList b(android.widget.TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static android.graphics.PorterDuff.Mode c(android.widget.TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int d(android.widget.TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void e(android.widget.TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void f(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void h(android.widget.TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
