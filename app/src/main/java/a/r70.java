package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r70 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ej1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(a.ej1 ej1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = ej1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.r70(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        ((a.b81) this.g.c).a();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.r70 r70Var = (a.r70) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        r70Var.e(no1Var);
        return no1Var;
    }
}
