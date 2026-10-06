package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class at1 {
    public static void a(android.view.Window window, boolean z) {
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
