package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yn0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(a.jo0 jo0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.yn0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.jo0.v0;
        this.g.Y();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.yn0 yn0Var = (a.yn0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        yn0Var.e(no1Var);
        return no1Var;
    }
}
