package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class on {
    public static android.graphics.drawable.Drawable[] a(android.widget.TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void b(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void c(android.widget.TextView textView, java.util.Locale locale) {
        textView.setTextLocale(locale);
    }
}
