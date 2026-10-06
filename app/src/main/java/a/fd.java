package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fd extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench g;
    public final /* synthetic */ a.y31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.y31 y31Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityPowerBench;
        this.h = y31Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.fd(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.y31 y31Var = this.h;
        com.omarea.vtools.activities.ActivityPowerBench.o(this.g, (a.h61) y31Var.c, (java.util.ArrayList) y31Var.d);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.fd fdVar = (a.fd) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        fdVar.e(no1Var);
        return no1Var;
    }
}
