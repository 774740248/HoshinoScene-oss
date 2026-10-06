package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xo extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.cp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(a.cp cpVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = cpVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xo(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = a.cp.E;
        this.g.h();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.xo xoVar = (a.xo) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        xoVar.e(no1Var);
        return no1Var;
    }
}
