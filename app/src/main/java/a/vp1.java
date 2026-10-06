package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vp1 {
    public static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static android.view.WindowInsets b(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(android.view.View view) {
        view.requestApplyInsets();
    }
}
