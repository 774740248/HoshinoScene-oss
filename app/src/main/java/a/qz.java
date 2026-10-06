package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qz extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.CpuTemperatureView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(com.omarea.ui.fps.CpuTemperatureView cpuTemperatureView, a.ey eyVar) {
        super(2, eyVar);
        this.g = cpuTemperatureView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qz(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.qz qzVar = (a.qz) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        qzVar.e(no1Var);
        return no1Var;
    }
}
