package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jh0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.d30 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.kh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(a.d30 d30Var, java.lang.String str, a.kh0 kh0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = d30Var;
        this.i = str;
        this.j = kh0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jh0(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            obj = this.h.i(this);
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
        java.lang.String str = this.i;
        if (a.yi1.g2(str, ".")) {
            str = str.substring(a.yi1.q2(str, ".", 6));
            a.wv.v(str, "this as java.lang.String).substring(startIndex)");
        }
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.ih0 ih0Var = new a.ih0(ioVar, this.j, str, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, ih0Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.jh0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
