package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class aq1 {
    public static void a(android.view.View view, java.util.Collection<android.view.View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static int b(android.view.View view) {
        return view.getImportantForAutofill();
    }

    public static int c(android.view.View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean d(android.view.View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean e(android.view.View view) {
        return view.isFocusedByDefault();
    }

    public static boolean f(android.view.View view) {
        return view.isImportantForAutofill();
    }

    public static boolean g(android.view.View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static android.view.View h(android.view.View view, android.view.View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static boolean i(android.view.View view) {
        return view.restoreDefaultFocus();
    }

    public static void j(android.view.View view, java.lang.String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void k(android.view.View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void l(android.view.View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void m(android.view.View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void n(android.view.View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void o(android.view.View view, java.lang.CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
