package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ds1 extends a.cs1 {
    public static boolean h = true;

    @Override // a.fs1
    public void Q(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            super.Q(view, i);
        } else if (h) {
            try {
                view.setTransitionVisibility(i);
            } catch (java.lang.NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
