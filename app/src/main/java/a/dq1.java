package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dq1 {
    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return view.getAccessibilityDelegate();
    }

    public static java.util.List<android.graphics.Rect> b(android.view.View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void c(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void d(android.view.View view, java.util.List<android.graphics.Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
