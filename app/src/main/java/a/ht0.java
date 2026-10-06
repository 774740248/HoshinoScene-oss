package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ht0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer f216a;

    static {
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Integer num2 = null;
        try {
            obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Throwable unused) {
        }
        if (obj instanceof java.lang.Integer) {
            num = (java.lang.Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f216a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f216a = num2;
    }
}
