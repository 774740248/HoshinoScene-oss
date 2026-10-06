package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class tm1 {
    public static android.window.OnBackInvokedDispatcher a(android.view.View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return new a.c31(1, runnable);
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj2);
    }

    public static void d(java.lang.Object obj, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
    }
}
