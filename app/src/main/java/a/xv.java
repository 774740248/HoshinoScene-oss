package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xv extends a.lj1 implements a.bp0 {
    public int g;

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            obj = a.q10.K(q10Var, "dex2oat-clear", "all", new java.lang.Long(1000L), this, 8);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return obj;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        return new a.lj1(1, (a.ey) obj).e(a.no1.f387a);
    }
}
