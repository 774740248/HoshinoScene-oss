package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x41 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.sysmbol.PerfOptionsRender h;
    public final /* synthetic */ a.tj1 i;
    public final /* synthetic */ com.omarea.ui.SelectView j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, a.tj1 tj1Var, com.omarea.ui.SelectView selectView, a.ey eyVar) {
        super(2, eyVar);
        this.h = perfOptionsRender;
        this.i = tj1Var;
        this.j = selectView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.x41(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                java.lang.String a2 = com.omarea.sysmbol.PerfOptionsRender.a(this.h, this.i);
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.w41 w41Var = new a.w41(this.j, a2, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, w41Var, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.x41) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
