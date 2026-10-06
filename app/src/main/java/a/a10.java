package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a10 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.Boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(java.lang.Boolean bool, a.ey eyVar) {
        super(2, eyVar);
        this.g = bool;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.a10(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.q10 q10Var = a.q10.f457a;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = this.g;
        a.q10.L("accessibility-daemon", a.wv.e(bool2, bool) ? "60" : bool2 == null ? "-1" : "0", new java.lang.Long(10000L));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.a10 a10Var = (a.a10) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        a10Var.e(no1Var);
        return no1Var;
    }
}
