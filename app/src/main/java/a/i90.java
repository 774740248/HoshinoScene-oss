package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i90 {
    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(android.graphics.drawable.Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static android.graphics.ColorFilter c(android.graphics.drawable.Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void d(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void e(android.graphics.drawable.Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void f(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void g(android.graphics.drawable.Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void h(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void i(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
