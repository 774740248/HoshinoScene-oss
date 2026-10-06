package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class tp1 {
    public static android.graphics.Rect a(android.view.View view) {
        return view.getClipBounds();
    }

    public static boolean b(android.view.View view) {
        return view.isInLayout();
    }

    public static void c(android.view.View view, android.graphics.Rect rect) {
        view.setClipBounds(rect);
    }
}
