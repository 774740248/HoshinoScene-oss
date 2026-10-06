package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.f9(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.f9 f9Var = (a.f9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        f9Var.e(no1Var);
        return no1Var;
    }
}
