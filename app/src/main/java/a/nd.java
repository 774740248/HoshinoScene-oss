package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nd extends a.uu0 implements a.bp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ boolean[] h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i, long j, java.lang.String str, boolean[] zArr, int i2, int i3) {
        super(1);
        this.d = activityPowerBench;
        this.e = i;
        this.f = j;
        this.g = str;
        this.h = zArr;
        this.i = i2;
        this.j = i3;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.d;
        zt0Var.m(java.lang.Integer.valueOf(activityPowerBench.u().getProgress()), "coreCount");
        zt0Var.m(java.lang.Integer.valueOf(this.e), "targetLoad");
        zt0Var.m(java.lang.Long.valueOf(this.f), "durationMS");
        zt0Var.m(java.lang.Integer.valueOf(((com.omarea.common.ui.SeekBar) activityPowerBench.k.a(com.omarea.vtools.activities.ActivityPowerBench.U[8])).getProgress()), "period");
        zt0Var.m(this.g, "mode");
        boolean[] zArr = this.h;
        a.wv.w(zArr, "<this>");
        java.lang.Boolean[] boolArr = new java.lang.Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = java.lang.Boolean.valueOf(zArr[i]);
        }
        zt0Var.v("cpus", boolArr);
        zt0Var.m(java.lang.Integer.valueOf(this.i), "ddrMinFreq");
        zt0Var.m(java.lang.Integer.valueOf(this.j), "ramAccess");
        zt0Var.m(java.lang.Boolean.FALSE, "perfStat");
        return a.no1.f387a;
    }
}
