package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class al0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.pl0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(a.pl0 pl0Var, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = pl0Var;
        this.h = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.al0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String str;
        a.b20.q1(obj);
        a.pl0 pl0Var = this.g;
        a.ob1 ob1Var = new a.ob1(pl0Var.L());
        a.pj1 pj1Var = (a.pj1) pl0Var.N0.a();
        if (((java.lang.String) pj1Var.i.a()) != null) {
            java.lang.String str2 = ((java.lang.String) pj1Var.i.a()) + " " + this.h;
            a.wv.w(str2, "shell");
            a.q10 q10Var = a.q10.f457a;
            str = a.q10.l(str2);
        } else {
            str = "Fail!";
        }
        return ob1Var.a(str, false);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.al0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
