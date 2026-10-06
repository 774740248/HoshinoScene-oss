package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hg0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.ui.fw.FloatMonitorRender e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg0(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, int i) {
        super(0);
        this.d = i;
        this.e = floatMonitorRender;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        com.omarea.ui.fw.FloatMonitorRender floatMonitorRender = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.Object systemService = floatMonitorRender.getContext().getApplicationContext().getSystemService("activity");
                a.wv.t(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                return (android.app.ActivityManager) systemService;
            default:
                android.content.Context applicationContext = floatMonitorRender.getContext().getApplicationContext();
                a.wv.v(applicationContext, "context.applicationContext");
                return new a.pj1(applicationContext);
        }
    }
}
