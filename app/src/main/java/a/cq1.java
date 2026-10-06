package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class cq1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View.OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(android.view.View view, a.hq1 hq1Var) {
        a.rh1 rh1Var = (a.rh1) view.getTag(2131363252);
        a.rh1 rh1Var2 = rh1Var;
        if (rh1Var == null) {
            a.rh1 rh1Var3 = new a.rh1();
            view.setTag(2131363252, rh1Var3);
            rh1Var2 = rh1Var3;
        }
        java.util.Objects.requireNonNull(hq1Var);
        android.view.View.OnUnhandledKeyEventListener obj = new android.view.View.OnUnhandledKeyEventListener();
        rh1Var2.put(hq1Var, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static java.lang.CharSequence b(android.view.View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(android.view.View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(android.view.View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(android.view.View view, a.hq1 hq1Var) {
        android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        a.rh1 rh1Var = (a.rh1) view.getTag(2131363252);
        if (rh1Var == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) rh1Var.getOrDefault(hq1Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(android.view.View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(android.view.View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(android.view.View view, java.lang.CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(android.view.View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
