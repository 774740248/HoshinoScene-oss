package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.bench.CyclesPowerView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(com.omarea.ui.bench.CyclesPowerView cyclesPowerView, a.ey eyVar) {
        super(2, eyVar);
        this.g = cyclesPowerView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.e00(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.e00 e00Var = (a.e00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        e00Var.e(no1Var);
        return no1Var;
    }
}
