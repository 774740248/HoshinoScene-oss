package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v50 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.mc1 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.f60 j;
    public final /* synthetic */ a.w60 k;
    public final /* synthetic */ java.lang.String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(a.mc1 mc1Var, java.lang.String str, a.f60 f60Var, a.w60 w60Var, java.lang.String str2, a.ey eyVar) {
        super(2, eyVar);
        this.h = mc1Var;
        this.i = str;
        this.j = f60Var;
        this.k = w60Var;
        this.l = str2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.v50(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            java.lang.String str = this.h.c;
            a.wv.w(str, "src");
            java.lang.String str2 = this.i;
            a.wv.w(str2, "dst");
            a.q10 q10Var = a.q10.f457a;
            boolean e = a.wv.e(a.q10.L("move", str + ":" + str2, null), "true");
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.u50 u50Var = new a.u50(e, this.j, this.k, this.l, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, u50Var, this) == dzVar) {
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
        return ((a.v50) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
