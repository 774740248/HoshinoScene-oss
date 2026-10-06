package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g7 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityCpuControl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g7(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCpuControl.J;
        this.g.F();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.g7 g7Var = (a.g7) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        g7Var.e(no1Var);
        return no1Var;
    }
}
