package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class d31 {
    public static android.window.OnBackInvokedCallback a(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        return new a.c31(0, runnable);
    }

    public static void b(java.lang.Object obj, int i, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (android.window.OnBackInvokedCallback) obj2);
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
    }
}
