package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mj extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.nj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(a.nj njVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = njVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mj(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.nj njVar = this.g;
        if (!njVar.g.isEmpty()) {
            njVar.r();
            njVar.s();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mj mjVar = (a.mj) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        mjVar.e(no1Var);
        return no1Var;
    }
}
