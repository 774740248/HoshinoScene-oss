package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class tx0 implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f570a;
    public final float b;

    public tx0(float[] fArr) {
        this.f570a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f570a;
        int min = java.lang.Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
