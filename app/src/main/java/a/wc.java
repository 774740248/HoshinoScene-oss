package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class wc implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench d;

    public /* synthetic */ wc(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i) {
        this.c = i;
        this.d = activityPowerBench;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.wv.w(activityPowerBench, "this$0");
                activityPowerBench.D().setKeepScreenOn(false);
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.wv.w(activityPowerBench, "this$0");
                activityPowerBench.D().setKeepScreenOn(false);
                return;
            default:
                a.wv.w(activityPowerBench, "this$0");
                int i2 = a.x60.f681a;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.ed(activityPowerBench, a.fs1.J(activityPowerBench, null), null), 3);
                return;
        }
    }
}
