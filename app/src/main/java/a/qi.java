package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qi extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ti g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(a.ti tiVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = tiVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qi(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.ti tiVar = this.g;
        tiVar.f();
        a.b81 b81Var = tiVar.j;
        a.wv.s(b81Var);
        b81Var.a();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.qi qiVar = (a.qi) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        qiVar.e(no1Var);
        return no1Var;
    }
}
