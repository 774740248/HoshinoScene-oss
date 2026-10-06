package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vz0 {
    public static int a(android.view.MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static java.lang.CharSequence b(android.view.MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static android.content.res.ColorStateList c(android.view.MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static android.graphics.PorterDuff.Mode d(android.view.MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static int e(android.view.MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static java.lang.CharSequence f(android.view.MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static android.view.MenuItem g(android.view.MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    public static android.view.MenuItem h(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static android.view.MenuItem i(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static android.view.MenuItem j(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static android.view.MenuItem k(android.view.MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    public static android.view.MenuItem l(android.view.MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    public static android.view.MenuItem m(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
