package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s50 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ java.util.List i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ a.ma1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(a.f60 f60Var, java.util.List list, java.lang.String str, a.ma1 ma1Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = f60Var;
        this.i = list;
        this.j = str;
        this.k = ma1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.s50(this.h, this.i, this.j, this.k, eyVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [a.ha1, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object a2;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            a2 = a.f60.a(this.h, this.i, this.j, this);
            if (a2 == dzVar) {
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
            a2 = obj;
        }
        a.k50 k50Var = (a.k50) a2;
        a.ha1 obj2 = new a.ha1();
        a.f60 f60Var = this.h;
        java.lang.String str = this.j;
        a.ma1 ma1Var = this.k;
        a.r50 r50Var = new a.r50(k50Var, obj2, f60Var, str, ma1Var);
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.p50 p50Var = new a.p50(k50Var, ma1Var, f60Var, r50Var, obj2, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, p50Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.s50) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
