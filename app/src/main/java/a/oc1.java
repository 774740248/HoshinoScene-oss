package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class oc1 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f407a = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f407a) * f2) + f);
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f407a) * f2) + (f * 1.5f));
    }
}
