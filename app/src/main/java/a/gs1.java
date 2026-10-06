package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gs1 {
    public static final a.gs1 k;

    /* renamed from: a, reason: collision with root package name */
    public final float f191a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = a.b20.d;
        float H1 = (float) ((a.b20.H1() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a.b20.b;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) java.lang.Math.exp(((-H1) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * H1) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) java.lang.Math.cbrt(H1 * 5.0d))) + (f11 * H1);
        float H12 = a.b20.H1() / fArr[1];
        double d2 = H12;
        float sqrt = ((float) java.lang.Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) java.lang.Math.pow(d2, 0.2d));
        float pow2 = (float) java.lang.Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d);
        float[] fArr7 = {(float) java.lang.Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), pow2};
        float f13 = fArr7[0];
        float f14 = fArr7[1];
        k = new a.gs1(H12, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f13 * 400.0f) / (f13 + 27.13f)) * 2.0f) + ((f14 * 400.0f) / (f14 + 27.13f))) * pow, pow, pow, f9, 1.0f, fArr6, cbrt, (float) java.lang.Math.pow(cbrt, 0.25d), sqrt);
    }

    public gs1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.f191a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
