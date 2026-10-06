package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pa extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.pa(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b81 b81Var;
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.g;
        b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        activityFreezeApps.loadData();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.pa paVar = (a.pa) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        paVar.e(no1Var);
        return no1Var;
    }
}
