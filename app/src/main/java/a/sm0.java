package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sm0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.bn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sm0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.x60.f681a;
        a.bn0 bn0Var = this.g;
        a.kk0 K = bn0Var.K();
        java.lang.String m = bn0Var.m(2131953439);
        a.wv.v(m, "getString(R.string.schedule_unsupported)");
        return a.fs1.G(K, m, null);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.sm0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
