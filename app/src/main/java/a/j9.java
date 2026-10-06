package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession g;
    public final /* synthetic */ java.lang.StringBuilder h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, java.lang.StringBuilder sb, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSession;
        this.h = sb;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.j9(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
        this.g.p(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.j9 j9Var = (a.j9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        j9Var.e(no1Var);
        return no1Var;
    }
}
