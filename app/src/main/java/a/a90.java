package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class a90 {
    public static android.view.DisplayCutout a(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
        return new android.view.DisplayCutout(rect, list);
    }

    public static java.util.List<android.graphics.Rect> b(android.view.DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int c(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int d(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int e(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int f(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
