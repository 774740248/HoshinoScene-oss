package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oq0 {

    /* renamed from: a, reason: collision with root package name */
    public static double f417a = -1.0d;
    public static long b;
    public static java.lang.Boolean e;
    public static java.lang.String k;
    public static boolean l;
    public static double m;
    public static double o;
    public static final a.vj1 c = new a.vj1(a.lq0.f);
    public static final a.vj1 d = new a.vj1(a.lq0.e);
    public static int f = -1;
    public static double g = -1.0d;
    public static long h = -1;
    public static int i = 1;
    public static java.lang.String j = "";
    public static long n = java.lang.System.currentTimeMillis() - 5000;

    public static boolean a() {
        int i2 = i;
        return i2 == 2 || i2 == 5;
    }

    public static java.lang.String b() {
        java.lang.String str = k;
        return str == null ? j : str;
    }

    public static int c() {
        return ((java.lang.Number) c.a()).intValue();
    }

    public static double d() {
        int c2;
        double c3;
        double d2 = 3.86d;
        if (c() > 2510) {
            c2 = c();
        } else {
            if (g >= 5.0d) {
                c3 = c() * 3.86d;
                d2 = 2;
                return c3 * d2;
            }
            c2 = c();
        }
        c3 = c2;
        return c3 * d2;
    }

    public static java.lang.String e() {
        double d2;
        double f2;
        long j2 = h;
        if (i == 2) {
            d2 = j2;
            f2 = f();
        } else {
            d2 = j2;
            f2 = f();
        }
        double d3 = ((int) (f2 * d2)) / 1000;
        return (d3 >= 100.0d || d3 <= -100.0d) ? a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(d3)}, 1, "%.1fW", "format(format, *args)") : a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(d3)}, 1, "%.2fW", "format(format, *args)");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double f() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oq0.f():double");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [a.fp0, a.lj1] */
    public static long g(long j2) {
        if (j2 == 0 || java.lang.System.currentTimeMillis() - j2 >= b) {
            i();
            a.vj1 vj1Var = d;
            f = ((android.os.BatteryManager) vj1Var.a()).getIntProperty(4);
            int intProperty = ((android.os.BatteryManager) vj1Var.a()).getIntProperty(6);
            if (intProperty != 1) {
                i = intProperty;
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String t = a.q10.t();
            if (!a.wv.e(t, "basic")) {
                if (!a.wv.e(t, "root") || a.wv.e(e, java.lang.Boolean.FALSE)) {
                    com.omarea.model.BatteryStatus batteryStatus = (com.omarea.model.BatteryStatus) a.wv.v1(new a.lj1(2, null));
                    double d2 = batteryStatus.temperature;
                    double d3 = batteryStatus.voltage;
                    if (d3 > 3.0d && d3 < 10.0d) {
                        g = d3;
                    }
                    if (d2 > 10.0d && d2 < 100.0d) {
                        f417a = d2;
                    }
                } else {
                    double doubleValue = ((java.lang.Number) a.wv.v1(new a.nq0(-2.147483648E9d, null))).doubleValue();
                    java.lang.Boolean bool = e;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    if (!a.wv.e(bool, bool2)) {
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(doubleValue == -2.147483648E9d));
                        e = valueOf;
                        if (a.wv.e(valueOf, bool2)) {
                            f417a = doubleValue;
                        }
                    } else if (doubleValue != -2.147483648E9d) {
                        f417a = doubleValue;
                    }
                }
            }
            b = java.lang.System.currentTimeMillis();
        }
        return b;
    }

    public static void i() {
        a.cp cpVar = com.omarea.Scene.c;
        h = (((android.os.BatteryManager) d.a()).getLongProperty(2) / a.fs1.D().getInt((java.lang.String) a.la0.c.a(), -1000)) * (a.fs1.s((java.lang.String) a.la0.e.a(), false) ? 2 : 1);
    }
}
