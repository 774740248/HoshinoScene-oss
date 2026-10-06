package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qm0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.bn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qm0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.bn0 bn0Var = this.g;
        try {
            a.gu0[] gu0VarArr = a.bn0.x0;
            bn0Var.d0();
        } catch (java.lang.Throwable th) {
            a.b20.I(th);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.qm0 qm0Var = (a.qm0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        qm0Var.e(no1Var);
        return no1Var;
    }
}
