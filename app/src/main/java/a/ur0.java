package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ur0 {
    public static android.icu.util.ULocale a(java.lang.Object obj) {
        return android.icu.util.ULocale.addLikelySubtags((android.icu.util.ULocale) obj);
    }

    public static android.icu.util.ULocale b(java.util.Locale locale) {
        return android.icu.util.ULocale.forLocale(locale);
    }

    public static java.lang.String c(java.lang.Object obj) {
        return ((android.icu.util.ULocale) obj).getScript();
    }
}
