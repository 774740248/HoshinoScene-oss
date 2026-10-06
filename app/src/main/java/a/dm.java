package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dm {
    public static android.window.OnBackInvokedDispatcher a(android.app.Activity activity) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Object obj, a.km kmVar) {
        java.util.Objects.requireNonNull(kmVar);
        a.c31 c31Var = new a.c31(2, kmVar);
        a.a0.e(obj).registerOnBackInvokedCallback(1000000, c31Var);
        return c31Var;
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        a.a0.e(obj).unregisterOnBackInvokedCallback(a.a0.b(obj2));
    }
}
