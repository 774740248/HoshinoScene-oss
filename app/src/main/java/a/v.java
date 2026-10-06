package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class v {
    public static int a(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
