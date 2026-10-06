package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ a.f60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a.w60 w60Var, a.f60 f60Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = f60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.z50(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        a.qo0 qo0Var = this.h.b;
        if (qo0Var != null) {
            qo0Var.b();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.z50 z50Var = (a.z50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        z50Var.e(no1Var);
        return no1Var;
    }
}
