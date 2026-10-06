package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class sv {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f540a = new java.lang.ThreadLocal();

    public static int a(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double pow = d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) java.lang.Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : java.lang.Math.min(round, 255);
        int round2 = (int) java.lang.Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : java.lang.Math.min(round2, 255);
        int round3 = (int) java.lang.Math.round(pow3 * 255.0d);
        return android.graphics.Color.rgb(min, min2, round3 >= 0 ? java.lang.Math.min(round3, 255) : 0);
    }

    public static int b(int i, int i2) {
        int alpha = android.graphics.Color.alpha(i2);
        int alpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return android.graphics.Color.argb(i3, c(android.graphics.Color.red(i), alpha2, android.graphics.Color.red(i2), alpha, i3), c(android.graphics.Color.green(i), alpha2, android.graphics.Color.green(i2), alpha, i3), c(android.graphics.Color.blue(i), alpha2, android.graphics.Color.blue(i2), alpha, i3));
    }

    public static int c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int d(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
