package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yp1 {
    public static a.du1 a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        a.du1 h = a.du1.h(null, rootWindowInsets);
        a.au1 au1Var = h.f107a;
        au1Var.p(h);
        au1Var.d(view.getRootView());
        return h;
    }

    public static int b(android.view.View view) {
        return view.getScrollIndicators();
    }

    public static void c(android.view.View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(android.view.View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
