package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class zr1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f744a;
    public static final boolean b;

    static {
        b = android.os.Build.VERSION.SDK_INT >= 27;
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            f744a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                // no further setup needed
            } else {
                declaredMethod.setAccessible(true);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(android.view.View view) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        return a.sp1.d(view) == 1;
    }
}
