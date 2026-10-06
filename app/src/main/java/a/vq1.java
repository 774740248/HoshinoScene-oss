package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f640a = new java.lang.ThreadLocal();
    public static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static void a(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            a(viewParent, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
