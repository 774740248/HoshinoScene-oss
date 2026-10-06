package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bo1 {

    public bo1() {
    }

    public static a.bo1 d;

    /* renamed from: a, reason: collision with root package name */
    public long f48a;
    public long b;
    public int c;

    public final void a(long j, double d2, double d3) {
        long r3 = 0L;
        int r4 = 0;
        long r7 = 0L;
        double d4 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (java.lang.Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (java.lang.Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (java.lang.Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (java.lang.Math.sin(2.0d * sin) * (-0.0069d)) + (java.lang.Math.sin(d4) * 0.0053d) + ((float) java.lang.Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = java.lang.Math.asin(java.lang.Math.sin(0.4092797040939331d) * java.lang.Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (java.lang.Math.sin(-0.10471975803375244d) - (java.lang.Math.sin(asin) * java.lang.Math.sin(d5))) / (java.lang.Math.cos(asin) * java.lang.Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.f48a = -1L;
            this.b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.c = 0;
                this.f48a = -1L;
                this.b = -1L;
                return;
            }
            double acos = (float) (java.lang.Math.acos(sin3) / 6.283185307179586d);
            this.f48a = java.lang.Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = java.lang.Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round;
            if (round >= j || this.f48a <= j) {
                this.c = 1;
            } else {
                this.c = 0;
            }
        }
    }
}
