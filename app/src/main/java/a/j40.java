package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j40 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.k40 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(a.k40 k40Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = k40Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.j40(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        return a.fs1.J(this.g.f281a, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.j40) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
