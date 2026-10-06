package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rc extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPerfBench g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(com.omarea.vtools.activities.ActivityPerfBench activityPerfBench, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPerfBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.rc(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPerfBench.z;
        this.g.o();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.rc rcVar = (a.rc) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        rcVar.e(no1Var);
        return no1Var;
    }
}
