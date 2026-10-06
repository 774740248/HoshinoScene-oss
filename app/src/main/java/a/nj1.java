package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nj1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.pj1 h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(a.pj1 pj1Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = pj1Var;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.nj1(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.nu0 nu0Var = a.nu0.f395a;
            a.pj1 pj1Var = this.h;
            java.lang.String e = a.ii1.e(pj1Var.m, "/hybridswapd_swappiness");
            java.lang.String str = this.i;
            a.y31 y31Var = new a.y31(e, str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str2 = pj1Var.m;
            java.util.List w2 = a.qv.w2(a.b20.f(y31Var, new a.y31(a.ai1.j(sb, str2, "/vm_swappiness_threshold1"), str), new a.y31(a.ii1.e(str2, "/vm_swappiness_threshold2"), str)));
            this.g = 1;
            if (a.nu0.m(w2, this) == dzVar) {
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
        return ((a.nj1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
