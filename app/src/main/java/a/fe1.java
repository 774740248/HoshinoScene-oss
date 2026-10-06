package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fe1 extends a.lj1 implements a.fp0 {
    public int g;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.no1 no1Var = a.no1.f387a;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String str = a.me1.n;
            this.g = 1;
            java.lang.Object K = a.q10.K(q10Var, "shell-delayed-remove", str, new java.lang.Long(1000L), this, 8);
            if (K != dzVar) {
                K = no1Var;
            }
            if (K == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.fe1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
