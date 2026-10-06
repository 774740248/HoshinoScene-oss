package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class es {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f133a = 0;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = a.ds.f105a;
        }
        if (i >= 30) {
            int i3 = a.ds.f105a;
        }
        if (i >= 30) {
            int i4 = a.ds.f105a;
        }
        if (i >= 30) {
            int i5 = a.ds.f105a;
        }
    }

    public static boolean a() {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                java.lang.String str = android.os.Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
