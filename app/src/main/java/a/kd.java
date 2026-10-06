package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kd extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.kd(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.g;
        java.lang.String string = activityPowerBench.getString(2131953165);
        a.wv.v(string, "getString(R.string.pb_temp_high)");
        java.lang.String string2 = activityPowerBench.getString(2131953166);
        a.wv.v(string2, "getString(R.string.pb_temp_high_full)");
        return a.fs1.F(activityPowerBench, string, string2, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.kd) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
