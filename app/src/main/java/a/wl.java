package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wl {
    public static android.os.LocaleList a(java.lang.Object obj) {
        return ((android.app.LocaleManager) obj).getApplicationLocales();
    }

    public static void b(java.lang.Object obj, android.os.LocaleList localeList) {
        ((android.app.LocaleManager) obj).setApplicationLocales(localeList);
    }
}
