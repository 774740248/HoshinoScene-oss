package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pt1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Field f451a;
    public static final java.lang.reflect.Field b;
    public static final java.lang.reflect.Field c;
    public static final boolean d;

    static {
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
            f451a = declaredField;
            declaredField.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
            b = declaredField2;
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
