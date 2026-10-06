package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ a.k50 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(a.w60 w60Var, a.f60 f60Var, a.k50 k50Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = f60Var;
        this.i = k50Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.l50(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        int i = a.x60.f681a;
        a.ml mlVar = this.h.f145a;
        java.lang.String string = mlVar.getString(2131952389);
        a.wv.v(string, "activity.getString(R.string.fs_batch_exists)");
        return a.fs1.F(mlVar, string, a.qv.j2(this.i.f283a, "\n", null, null, null, 62), new a.hs(18));
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.l50) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
