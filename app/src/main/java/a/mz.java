package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mz extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.CpuFrequencyView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(com.omarea.ui.fps.CpuFrequencyView cpuFrequencyView, a.ey eyVar) {
        super(2, eyVar);
        this.g = cpuFrequencyView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mz(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mz mzVar = (a.mz) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        mzVar.e(no1Var);
        return no1Var;
    }
}
