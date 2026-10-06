package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p00 extends a.lj1 implements a.fp0 {
    public int g;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            obj = q10Var.R(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                a.q10 q10Var2 = a.q10.f457a;
                a.q10.P(a.q10.u);
                a.q10.E(java.lang.Boolean.valueOf(a.q10.t));
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str.length() > 0 && !a.wv.e(str, "error") && !a.wv.e(a.q10.l, str)) {
            a.q10.l = str;
        }
        if (a.q10.e.length() > 0) {
            a.q10 q10Var3 = a.q10.f457a;
            a.q10.g(a.q10.e);
        }
        this.g = 2;
        if (a.wv.Q(500L, this) == dzVar) {
            return dzVar;
        }
        a.q10 q10Var22 = a.q10.f457a;
        a.q10.P(a.q10.u);
        a.q10.E(java.lang.Boolean.valueOf(a.q10.t));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.p00) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
