package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class up1 {
    public static int a(android.view.View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean b(android.view.View view) {
        return view.isAttachedToWindow();
    }

    public static boolean c(android.view.View view) {
        return view.isLaidOut();
    }

    public static boolean d(android.view.View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static void f(android.view.View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void g(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
