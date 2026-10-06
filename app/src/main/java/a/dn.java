package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dn {
    public static void a(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, android.content.res.Resources.Theme theme) {
        if (a.x21.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
