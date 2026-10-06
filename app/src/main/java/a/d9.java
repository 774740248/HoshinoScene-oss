package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d9(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        for (a.ng1 ng1Var : (Iterable<a.ng1>) this.g) {
            if (ng1Var.d) {
                java.lang.Object obj2 = ng1Var.e;
                a.wv.t(obj2, "null cannot be cast to non-null type android.view.View");
                ((android.view.View) obj2).setVisibility(0);
            } else {
                java.lang.Object obj3 = ng1Var.e;
                a.wv.t(obj3, "null cannot be cast to non-null type android.view.View");
                ((android.view.View) obj3).setVisibility(8);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.d9 d9Var = (a.d9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        d9Var.e(no1Var);
        return no1Var;
    }
}
