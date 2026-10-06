package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class us {

    /* renamed from: a, reason: collision with root package name */
    public final float f606a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public us(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f606a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static a.us a(int i) {
        float r3 = 0.0f;
        a.gs1 gs1Var = a.gs1.k;
        float x0 = a.b20.x0(android.graphics.Color.red(i));
        float x02 = a.b20.x0(android.graphics.Color.green(i));
        float x03 = a.b20.x0(android.graphics.Color.blue(i));
        float[][] fArr = a.b20.e;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * x03) + (fArr2[1] * x02) + (fArr2[0] * x0);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * x03) + (fArr3[1] * x02) + (fArr3[0] * x0);
        float[] fArr4 = fArr[2];
        float f3 = (x03 * fArr4[2]) + (x02 * fArr4[1]) + (x0 * fArr4[0]);
        float[][] fArr5 = a.b20.b;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = gs1Var.g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float abs = java.lang.Math.abs(f7);
        float f10 = gs1Var.h;
        float pow = (float) java.lang.Math.pow((abs * f10) / 100.0d, 0.42d);
        float pow2 = (float) java.lang.Math.pow((java.lang.Math.abs(f8) * f10) / 100.0d, 0.42d);
        float pow3 = (float) java.lang.Math.pow((java.lang.Math.abs(f9) * f10) / 100.0d, 0.42d);
        float signum = ((java.lang.Math.signum(f7) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((java.lang.Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((java.lang.Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((21.0f * signum3) + ((signum * 20.0f) + f13)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) java.lang.Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * gs1Var.b;
        float f19 = gs1Var.f191a;
        float f20 = gs1Var.d;
        float pow4 = ((float) java.lang.Math.pow(f18 / f19, gs1Var.j * f20)) * 100.0f;
        java.lang.Math.sqrt(pow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float pow5 = ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, gs1Var.f), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos((((((double) f16) < 20.14d ? 360.0f + f16 : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * gs1Var.e) * gs1Var.c) * ((float) java.lang.Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) java.lang.Math.sqrt(pow4 / 100.0d));
        float f22 = gs1Var.i * pow5;
        java.lang.Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) java.lang.Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new a.us(f16, pow5, pow4, f23, log * ((float) java.lang.Math.cos(d2)), log * ((float) java.lang.Math.sin(d2)));
    }

    public static a.us b(float f, float f2, float f3) {
        long r1 = 0L;
        a.gs1 gs1Var = a.gs1.k;
        float f4 = gs1Var.d;
        java.lang.Math.sqrt(f / 100.0d);
        float f5 = gs1Var.f191a + 4.0f;
        float f6 = gs1Var.i * f2;
        java.lang.Math.sqrt(((f2 / ((float) java.lang.Math.sqrt(r1))) * gs1Var.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) java.lang.Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new a.us(f3, f2, f, f7, log * ((float) java.lang.Math.cos(d)), log * ((float) java.lang.Math.sin(d)));
    }

    public final int c(a.gs1 gs1Var) {
        float f;
        float f2 = this.b;
        double d = f2;
        float f3 = this.c;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) java.lang.Math.sqrt(d2 / 100.0d));
                float pow = (float) java.lang.Math.pow(f / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, gs1Var.f), 0.73d), 1.1111111111111112d);
                double d3 = (this.f606a * 3.1415927f) / 180.0f;
                float cos = ((float) (java.lang.Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = gs1Var.f191a * ((float) java.lang.Math.pow(f3 / 100.0d, (1.0d / gs1Var.d) / gs1Var.j));
                float f4 = cos * 3846.1538f * gs1Var.e * gs1Var.c;
                float f5 = pow2 / gs1Var.b;
                float sin = (float) java.lang.Math.sin(d3);
                float cos2 = (float) java.lang.Math.cos(d3);
                float f6 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f4 * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f5 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float max = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f10) * 27.13d) / (400.0d - java.lang.Math.abs(f10)));
                float signum = java.lang.Math.signum(f10);
                float f13 = 100.0f / gs1Var.h;
                float pow3 = signum * f13 * ((float) java.lang.Math.pow(max, 2.380952380952381d));
                float signum2 = java.lang.Math.signum(f11) * f13 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f11) * 27.13d) / (400.0d - java.lang.Math.abs(f11))), 2.380952380952381d));
                float signum3 = java.lang.Math.signum(f12) * f13 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f12) * 27.13d) / (400.0d - java.lang.Math.abs(f12))), 2.380952380952381d));
                float[] fArr = gs1Var.g;
                float f14 = pow3 / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = a.b20.c;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return a.sv.a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f = 0.0f;
        float pow4 = (float) java.lang.Math.pow(f / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, gs1Var.f), 0.73d), 1.1111111111111112d);
        double d32 = (this.f606a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (java.lang.Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = gs1Var.f191a * ((float) java.lang.Math.pow(f3 / 100.0d, (1.0d / gs1Var.d) / gs1Var.j));
        float f42 = cos3 * 3846.1538f * gs1Var.e * gs1Var.c;
        float f52 = pow22 / gs1Var.b;
        float sin2 = (float) java.lang.Math.sin(d32);
        float cos22 = (float) java.lang.Math.cos(d32);
        float f62 = (((0.305f + f52) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f42 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f52 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float max2 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f102) * 27.13d) / (400.0d - java.lang.Math.abs(f102)));
        float signum4 = java.lang.Math.signum(f102);
        float f132 = 100.0f / gs1Var.h;
        float pow32 = signum4 * f132 * ((float) java.lang.Math.pow(max2, 2.380952380952381d));
        float signum22 = java.lang.Math.signum(f112) * f132 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f112) * 27.13d) / (400.0d - java.lang.Math.abs(f112))), 2.380952380952381d));
        float signum32 = java.lang.Math.signum(f122) * f132 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f122) * 27.13d) / (400.0d - java.lang.Math.abs(f122))), 2.380952380952381d));
        float[] fArr6 = gs1Var.g;
        float f142 = pow32 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = a.b20.c;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return a.sv.a(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
