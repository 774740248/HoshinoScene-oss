package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fz extends a.uu0 implements a.qo0 {
    public static final a.fz e = new a.fz(0);
    public static final a.fz f = new a.fz(1);
    public static final a.fz g = new a.fz(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return java.lang.Boolean.valueOf(a.op.K1(new java.lang.String[]{"canoe", "sun", "pineapple", "kalama", "cape", "ukee", "waipio", "cliffs", "tuna", "mt6993", "mt6991", "mt6989", "mt6985", "mt6983", "mt6899", "mt6897", "mt6895", "mt6893", "mt6891"}, a.gy.u()));
            case 1:
                a.cp cpVar = com.omarea.Scene.c;
                return a.fs1.t().getSharedPreferences("folder_favorite", 0);
            default:
                a.nu0 nu0Var = a.nu0.f395a;
                return a.nu0.d("/proc/mz_info/model_name");
        }
    }
}
