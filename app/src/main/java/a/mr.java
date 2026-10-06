package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mr {
    public static final a.gy e = new a.gy();
    public static boolean f = false;
    public static java.lang.Boolean g = null;
    public static java.lang.String h = "";

    /* renamed from: a, reason: collision with root package name */
    public final a.vj1 f360a = new a.vj1(a.kr.f);
    public final a.vj1 b = new a.vj1(a.kr.e);
    public java.lang.Boolean c = java.lang.Boolean.FALSE;
    public java.lang.Boolean d;

    public static boolean a() {
        a.nu0 nu0Var = a.nu0.f395a;
        return (a.nu0.a(new java.lang.String[]{"/sys/class/power_supply/battery/battery_charging_enabled", "/sys/class/power_supply/battery/input_suspend", "/sys/class/qcom-battery/input_suspend", "/sys/class/power_supply/battery/night_charging", "/sys/class/cms_class/disable_charge"}) == null && a.nu0.a(new java.lang.String[]{"/sys/class/power_supply/battery/night_charging", "/sys/class/qcom-battery/night_charging", "/sys/devices/platform/11e01000.i2c/i2c-5/5-0034/11e01000.i2c:mt6375@34:mtk_gauge/power_supply/battery/night_charging", "/proc/oplus-votable/CHG_DISABLE/force_active", "/sys/class/power_supply/battery/charging_enabled", "/sys/class/power_supply/battery/battery_charging_enabled", "/sys/class/power_supply/battery/mmi_charging_enable", "/sys/class/power_supply/battery/charge_control_limit", "/sys/class/meizu/charger/wired_level", "/sys/class/meizu/charger/wired/wired_level", "/sys/class/cms_class/disable_charge"}) == null) ? false : true;
    }

    public static int b() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d = a.nu0.d("/sys/class/power_supply/battery/capacity");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[0-9]+");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(d, "input");
        if (compile.matcher(d).matches()) {
            return java.lang.Integer.parseInt(d);
        }
        return 0;
    }

    public static int c() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d = a.nu0.d("/sys/class/power_supply/bms/charge_full");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[0-9]+");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(d, "input");
        if (compile.matcher(d).matches()) {
            return java.lang.Integer.parseInt(d) / 1000;
        }
        return 0;
    }

    public static boolean g() {
        a.q10 q10Var = a.q10.f457a;
        return a.wv.e(a.q10.L("charge-control", "resume", null), "true");
    }

    public static void h(int i, boolean z) {
        if (!f || z) {
            f = true;
            a.wv.M0(a.wv.b(a.z80.b), null, new a.lr(i, null), 3);
        }
    }

    public static java.lang.String i(java.lang.String str) {
        int i;
        java.lang.String substring = str.substring(0, str.length() <= 4 ? str.length() : 4);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        double parseDouble = java.lang.Double.parseDouble(substring);
        if (parseDouble > 3000.0d) {
            i = 1000;
        } else {
            if (parseDouble <= 300.0d) {
                if (parseDouble > 30.0d) {
                    i = 10;
                }
                return parseDouble + "v";
            }
            i = 100;
        }
        parseDouble /= i;
        return parseDouble + "v";
    }

    public final float d(int i) {
        if (this.d == null) {
            this.d = java.lang.Boolean.valueOf(a.gy.n("/sys/class/power_supply/bms/capacity_raw"));
        }
        if (a.wv.e(this.d, java.lang.Boolean.TRUE)) {
            try {
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String d = a.nu0.d("/sys/class/power_supply/bms/capacity_raw");
                int parseInt = java.lang.Integer.parseInt(d);
                float abs = java.lang.Math.abs(parseInt - i);
                float f2 = parseInt / 100.0f;
                float f3 = i;
                if (abs <= java.lang.Math.abs(f2 - f3)) {
                    f2 = java.lang.Float.parseFloat(d);
                }
                if (java.lang.Math.abs(f2 - f3) <= 7.0f) {
                    return f2;
                }
                this.d = java.lang.Boolean.FALSE;
                return -1.0f;
            } catch (java.lang.Exception unused) {
                this.d = java.lang.Boolean.FALSE;
            }
        }
        return -1.0f;
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.b.a()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.f360a.a()).booleanValue();
    }
}
