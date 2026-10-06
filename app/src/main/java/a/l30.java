package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class l30 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f309a = new java.lang.ThreadLocal();
    public static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static void a(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        java.lang.ThreadLocal threadLocal = f309a;
        android.graphics.Matrix matrix = (android.graphics.Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        java.lang.ThreadLocal threadLocal2 = b;
        android.graphics.RectF rectF = (android.graphics.RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void b(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            b(viewParent, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
