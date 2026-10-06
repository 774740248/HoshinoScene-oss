package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oj1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.pj1 h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(a.pj1 pj1Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = pj1Var;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.oj1(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.nu0 nu0Var = a.nu0.f395a;
            a.pj1 pj1Var = this.h;
            java.lang.String str = pj1Var.n;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("vm_swappiness=");
            java.lang.String str2 = this.i;
            sb.append(str2);
            a.y31 y31Var = new a.y31(str, sb.toString());
            java.lang.String g = a.ai1.g("kswapd_swappiness=", str2);
            java.lang.String str3 = pj1Var.n;
            java.util.List w2 = a.qv.w2(a.b20.f(y31Var, new a.y31(str3, g), new a.y31(str3, a.ai1.g("swapd_swappiness=", str2))));
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
        return ((a.oj1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
