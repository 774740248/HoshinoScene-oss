package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class w {
    public static boolean a(android.view.accessibility.AccessibilityManager accessibilityManager, a.x xVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new a.y(xVar));
    }

    public static boolean b(android.view.accessibility.AccessibilityManager accessibilityManager, a.x xVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new a.y(xVar));
    }
}
