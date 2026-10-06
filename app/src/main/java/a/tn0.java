package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tn0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.jo0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(a.jo0 jo0Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.tn0(this.i, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.cp cpVar = com.omarea.Scene.c;
            com.omarea.model.AccountPointsResponse accountPointsResponse = (com.omarea.model.AccountPointsResponse) new a.kf1(a.fs1.t()).m(this.h).get(10L, java.util.concurrent.TimeUnit.SECONDS);
            a.zx0 zx0Var = a.by0.f57a;
            a.sn0 sn0Var = new a.sn0(this.i, accountPointsResponse, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, sn0Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.tn0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
