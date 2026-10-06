package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fx0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Locale[] f163a = {new java.util.Locale("en", "XA"), new java.util.Locale("ar", "XB")};

    public static java.util.Locale a(java.lang.String str) {
        return java.util.Locale.forLanguageTag(str);
    }

    public static boolean b(java.util.Locale locale, java.util.Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        java.util.Locale[] localeArr = f163a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (java.util.Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                java.lang.String c = a.ur0.c(a.ur0.a(a.ur0.b(locale)));
                if (!c.isEmpty()) {
                    return c.equals(a.ur0.c(a.ur0.a(a.ur0.b(locale2))));
                }
                java.lang.String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
