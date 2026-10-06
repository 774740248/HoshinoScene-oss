package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jd extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench g;
    public final /* synthetic */ java.lang.StringBuilder h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, java.lang.StringBuilder sb, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerBench;
        this.h = sb;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jd(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.g;
        java.lang.String string = activityPowerBench.getString(2131953155);
        a.wv.v(string, "getString(R.string.pb_set_freq_fail)");
        return a.fs1.F(activityPowerBench, string, activityPowerBench.getString(2131953156) + "\n" + ((java.lang.Object) this.h), null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.jd) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
