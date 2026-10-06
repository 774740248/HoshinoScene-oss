package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pn {
    public static android.os.LocaleList a(java.lang.String str) {
        return android.os.LocaleList.forLanguageTags(str);
    }

    public static void b(android.widget.TextView textView, android.os.LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
