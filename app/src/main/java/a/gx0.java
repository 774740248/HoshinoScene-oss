package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gx0 {
    public static android.os.LocaleList a(java.util.Locale... localeArr) {
        return new android.os.LocaleList(localeArr);
    }

    public static android.os.LocaleList b() {
        return android.os.LocaleList.getAdjustedDefault();
    }

    public static android.os.LocaleList c() {
        return android.os.LocaleList.getDefault();
    }
}
