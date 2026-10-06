package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z00 extends a.lj1 implements a.fp0 {
    public int g;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a.fp0, a.lj1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.fp0 lj1Var = new a.lj1(2, null);
            this.g = 1;
            obj = a.wv.T1(10000L, lj1Var, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        return str == null ? "error" : str;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.z00) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
