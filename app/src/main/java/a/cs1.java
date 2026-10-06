package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class cs1 extends a.bs1 {
    public static boolean g = true;

    public void e0(android.view.View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (java.lang.NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
