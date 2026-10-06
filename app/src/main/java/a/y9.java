package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(java.util.List list, a.ey eyVar) {
        super(2, eyVar);
        this.g = list;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.y9(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.oe1 oe1Var = new a.oe1();
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            oe1Var.m((java.lang.String) it.next());
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.y9 y9Var = (a.y9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        y9Var.e(no1Var);
        return no1Var;
    }
}
