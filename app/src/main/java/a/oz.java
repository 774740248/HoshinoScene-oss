package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oz extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.CpuLoadsView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(com.omarea.ui.fps.CpuLoadsView cpuLoadsView, a.ey eyVar) {
        super(2, eyVar);
        this.g = cpuLoadsView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.oz(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.oz ozVar = (a.oz) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ozVar.e(no1Var);
        return no1Var;
    }
}
