package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class bs1 extends a.as1 {
    public static boolean e = true;
    public static boolean f = true;

    public void c0(android.view.View view, android.graphics.Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void d0(android.view.View view, android.graphics.Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
