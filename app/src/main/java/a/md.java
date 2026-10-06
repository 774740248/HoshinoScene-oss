package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class md extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.md(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.g;
        java.lang.String string = activityPowerBench.getString(2131953132);
        a.wv.v(string, "getString(R.string.pb_done)");
        return a.fs1.G(activityPowerBench, string, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.md) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
