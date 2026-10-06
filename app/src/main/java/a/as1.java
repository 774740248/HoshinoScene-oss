package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class as1 extends a.fs1 {
    public static boolean d = true;

    public float a0(android.view.View view) {
        float transitionAlpha;
        if (d) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (java.lang.NoSuchMethodError unused) {
                d = false;
            }
        }
        return view.getAlpha();
    }

    public void b0(android.view.View view, float f) {
        if (d) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                d = false;
            }
        }
        view.setAlpha(f);
    }
}
