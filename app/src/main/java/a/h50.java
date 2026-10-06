package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.i50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(a.i50 i50Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = i50Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h50(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.i50 i50Var = this.g;
        if (!i50Var.f225a.isDestroyed()) {
            i50Var.f(true);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h50 h50Var = (a.h50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h50Var.e(no1Var);
        return no1Var;
    }
}
