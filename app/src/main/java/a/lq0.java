package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lq0 extends a.uu0 implements a.qo0 {
    public static final a.lq0 e = new a.lq0(0);
    public static final a.lq0 f = new a.lq0(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.Object systemService = a.fs1.t().getSystemService("batterymanager");
                a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                return (android.os.BatteryManager) systemService;
            default:
                a.cp cpVar2 = com.omarea.Scene.c;
                return java.lang.Integer.valueOf((int) a.gy.q(a.fs1.t()));
        }
    }
}
