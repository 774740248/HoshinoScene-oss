package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y41 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ com.omarea.sysmbol.PerfOptionsRender d;
    public final /* synthetic */ a.tj1 e;
    public final /* synthetic */ a.v41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, a.tj1 tj1Var, a.v41 v41Var) {
        super(2);
        this.d = perfOptionsRender;
        this.e = tj1Var;
        this.f = v41Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mg1 mg1Var = (a.mg1) obj;
        ((java.lang.Number) obj2).intValue();
        a.wv.w(mg1Var, "option");
        java.lang.String str = this.e.c;
        java.lang.String b = this.f.b(mg1Var.b);
        a.wv.s(b);
        com.omarea.sysmbol.PerfOptionsRender.b(this.d, str, b);
        return a.no1.f387a;
    }
}
