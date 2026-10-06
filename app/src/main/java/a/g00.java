package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g00 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final java.lang.String g;

    public g00() {
        java.lang.Object obj;
        java.lang.String str;
        a.nu0 nu0Var = a.nu0.f395a;
        boolean z = true;
        if (a.nu0.d.length() == 0) {
            java.util.Iterator it = a.yi1.y2(a.nu0.d("/proc/mounts"), new java.lang.String[]{"\n"}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (a.yi1.B2((java.lang.String) obj, "debugfs")) {
                        break;
                    }
                }
            }
            java.lang.String str2 = (java.lang.String) obj;
            java.lang.String str3 = "";
            if (str2 != null && (str = (java.lang.String) a.yi1.y2(str2, new java.lang.String[]{""}).get(1)) != null) {
                str3 = str;
            }
            a.nu0.d = str3;
        }
        this.b = a.ii1.e(a.nu0.d, "/clk/measure_only_mccc_clk/clk_measure");
        this.c = "/sys/devices/system/cpu/bus_dcvs/DDR/cur_freq";
        this.d = a.gy.G();
        if (!a.ai1.w("/sys/module/xring_thermal")) {
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("path-basic-info", "/sys/module/xring_thermal", 10000L);
            if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                z = false;
            }
        }
        this.e = z;
        a.q10 q10Var2 = a.q10.f457a;
        this.f = a.wv.e(a.q10.t(), "root");
        this.g = "/sys/class/devfreq/mtk-dvfsrc-devfreq/available_frequencies";
    }
}
