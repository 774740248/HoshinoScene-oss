package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h5 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityApplications h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityApplications i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(a.w60 w60Var, com.omarea.vtools.activities.ActivityApplications activityApplications, com.omarea.vtools.activities.ActivityApplications activityApplications2, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = activityApplications;
        this.i = activityApplications2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h5(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        int i = a.x60.f681a;
        java.lang.String string = this.i.getString(2131951889);
        a.wv.v(string, "getString(R.string.apps_batch_uninstall_no_sync)");
        return a.fs1.G(this.h, string, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.h5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
