package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class t {
    public static android.view.accessibility.AccessibilityNodeProvider a(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public static boolean b(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
