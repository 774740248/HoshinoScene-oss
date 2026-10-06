package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y5 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeControl g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.omarea.vtools.activities.ActivityChargeControl activityChargeControl, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityChargeControl;
        this.h = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.y5(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.G.getClass();
        a.mr.h(this.h, false);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.y5 y5Var = (a.y5) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        y5Var.e(no1Var);
        return no1Var;
    }
}
