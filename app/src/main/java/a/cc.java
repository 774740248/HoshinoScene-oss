package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cc extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModules g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(com.omarea.vtools.activities.ActivityModules activityModules, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityModules;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.cc(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityModules.o;
        this.g.r();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.cc ccVar = (a.cc) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ccVar.e(no1Var);
        return no1Var;
    }
}
