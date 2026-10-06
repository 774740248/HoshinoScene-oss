package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class k0 {
    public static int a(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void d(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
