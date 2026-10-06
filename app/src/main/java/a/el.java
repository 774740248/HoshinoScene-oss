package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class el {

    /* renamed from: a, reason: collision with root package name */
    public static final android.view.animation.LinearInterpolator f126a = new android.view.animation.LinearInterpolator();
    public static final a.hd0 b = new a.hd0();
    public static final a.gd0 c = new a.gd0();
    public static final a.wv0 d = new a.wv0();
    public static final android.view.animation.DecelerateInterpolator e = new android.view.animation.DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return java.lang.Math.round(f * (i2 - i)) + i;
    }
}
