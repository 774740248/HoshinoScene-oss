package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kr extends a.uu0 implements a.qo0 {
    public static final a.kr e = new a.kr(0);
    public static final a.kr f = new a.kr(1);
    public static final a.kr g = new a.kr(2);
    public static final a.kr h = new a.kr(3);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr(int i) {
        super(0);
        this.d = i;
    }

    public final java.lang.Boolean a() {
        java.lang.Object r1 = null;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.io.File file = new java.io.File("/proc/oplus-votable");
                if (!file.exists() || !file.isDirectory()) {
                    a.q10 q10Var = a.q10.f457a;
                    r1 = a.yi1.B2(a.q10.L("path-basic-info", "/proc/oplus-votable", 10000L), "dir");
                }
                return java.lang.Boolean.valueOf(r1);
            case 1:
                a.nu0 nu0Var = a.nu0.f395a;
                return java.lang.Boolean.valueOf(a.nu0.a(new java.lang.String[]{"/sys/class/power_supply/battery/constant_charge_current_max", "/sys/class/power_supply/battery/constant_charge_current", "/sys/class/power_supply/main/constant_charge_current_max", "/sys/class/xm_power/charger/charger_thermal/wired_chg_curr"}) != null);
            default:
                return java.lang.Boolean.valueOf(a.op.K1(new java.lang.String[]{"mt6989", "mt6991", "mt6993", "mt6995", "sun", "canoe", "pineapple", "o1_asic"}, a.gy.u()));
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.ls();
            default:
                return a();
        }
    }
}
