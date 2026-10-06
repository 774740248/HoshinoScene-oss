package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sf0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ag0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(a.ag0 ag0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = ag0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sf0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.view.View view = this.g.o;
        if (view != null) {
            view.setVisibility(8);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sf0 sf0Var = (a.sf0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sf0Var.e(no1Var);
        return no1Var;
    }
}
