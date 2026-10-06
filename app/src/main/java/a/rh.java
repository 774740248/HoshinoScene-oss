package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rh extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.wh h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.sh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(a.wh whVar, java.lang.String str, a.sh shVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = whVar;
        this.i = str;
        this.j = shVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.rh(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        java.lang.String str = this.i;
        if (i == 0) {
            a.b20.q1(obj);
            a.mo moVar = this.h.n;
            a.wv.v(str, "app");
            a.e30 K1 = moVar.K1(str);
            this.g = 1;
            obj = K1.o(this);
            if (obj == dzVar) {
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
        a.io ioVar = (a.io) obj;
        a.sh shVar = this.j;
        java.lang.String str2 = shVar.A;
        if (str2 == null) {
            a.wv.M1("packageName");
            throw null;
        }
        if (a.wv.e(str2, str)) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.qh qhVar = new a.qh(shVar, ioVar, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, qhVar, this) == dzVar) {
                return dzVar;
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.rh) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
