package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ld extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ld(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.g;
        java.lang.String string = activityPowerBench.getString(2131953136);
        a.wv.v(string, "getString(R.string.pb_freq_changed)");
        java.lang.String string2 = activityPowerBench.getString(2131953137);
        a.wv.v(string2, "getString(R.string.pb_freq_changed_full)");
        return a.fs1.F(activityPowerBench, string, string2, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ld) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
