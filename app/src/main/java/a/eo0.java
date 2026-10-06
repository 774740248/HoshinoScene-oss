package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eo0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(a.jo0 jo0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.eo0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.kk0 d = this.g.d();
        if (d != null) {
            d.finishAfterTransition();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.eo0 eo0Var = (a.eo0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        eo0Var.e(no1Var);
        return no1Var;
    }
}
