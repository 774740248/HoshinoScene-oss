package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class do0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.jo0 i;
    public final /* synthetic */ java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(java.lang.String str, a.jo0 jo0Var, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = jo0Var;
        this.j = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.do0(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.jo0 jo0Var = this.i;
        try {
        } catch (java.lang.Exception unused) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.co0 co0Var = new a.co0(jo0Var, this.j, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, co0Var, this) == dzVar) {
                return dzVar;
            }
        }
        if (i == 0) {
            a.b20.q1(obj);
            a.cp cpVar = com.omarea.Scene.c;
            com.omarea.model.AccountPointsResponse accountPointsResponse = (com.omarea.model.AccountPointsResponse) new a.kf1(a.fs1.t()).m(this.h).get(10L, java.util.concurrent.TimeUnit.SECONDS);
            a.zx0 zx0Var2 = a.by0.f57a;
            a.bo0 bo0Var = new a.bo0(jo0Var, accountPointsResponse, null);
            this.g = 1;
            if (a.wv.S1(zx0Var2, bo0Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.do0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
