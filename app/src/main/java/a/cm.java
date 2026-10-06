package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class cm {
    public static void a(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
        android.os.LocaleList locales = configuration.getLocales();
        android.os.LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static a.hx0 b(android.content.res.Configuration configuration) {
        return a.hx0.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(a.hx0 hx0Var) {
        android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(((a.jx0) hx0Var.f221a).f274a.toLanguageTags()));
    }

    public static void d(android.content.res.Configuration configuration, a.hx0 hx0Var) {
        configuration.setLocales(android.os.LocaleList.forLanguageTags(((a.jx0) hx0Var.f221a).f274a.toLanguageTags()));
    }
}
