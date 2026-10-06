package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class sp1 {
    public static int a() {
        return android.view.View.generateViewId();
    }

    public static android.view.Display b(android.view.View view) {
        return view.getDisplay();
    }

    public static int c(android.view.View view) {
        return view.getLabelFor();
    }

    public static int d(android.view.View view) {
        return view.getLayoutDirection();
    }

    public static int e(android.view.View view) {
        return view.getPaddingEnd();
    }

    public static int f(android.view.View view) {
        return view.getPaddingStart();
    }

    public static boolean g(android.view.View view) {
        return view.isPaddingRelative();
    }

    public static void h(android.view.View view, int i) {
        view.setLabelFor(i);
    }

    public static void i(android.view.View view, android.graphics.Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void j(android.view.View view, int i) {
        view.setLayoutDirection(i);
    }

    public static void k(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
