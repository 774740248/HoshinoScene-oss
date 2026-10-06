package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y00 extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.y00, a.lj1, a.ey] */
    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.y00 lj1Var = (y00) new a.lj1(2, eyVar);
        lj1Var.h = obj;
        return lj1Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.cz czVar;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            czVar = (a.cz) this.h;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            czVar = (a.cz) this.h;
            a.b20.q1(obj);
        }
        do {
            a.nt0 nt0Var = (a.nt0) czVar.b().g(a.gy.f);
            if (nt0Var != null && !nt0Var.a()) {
                return null;
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("self-activate", "", new java.lang.Long(5000L));
            if (!a.wv.e(L, "error")) {
                return L;
            }
            this.h = czVar;
            this.g = 1;
        } while (a.wv.Q(300L, this) != dzVar);
        return dzVar;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.y00) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
