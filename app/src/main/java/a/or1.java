package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class or1 {
    public static boolean a(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    public static boolean b(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static void c(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    public static void d(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(android.view.ViewParent viewParent, android.view.View view) {
        viewParent.onStopNestedScroll(view);
    }
}
