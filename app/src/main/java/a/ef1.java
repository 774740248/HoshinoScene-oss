package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ef1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.concurrent.FutureTask g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(java.util.concurrent.FutureTask futureTask, a.ey eyVar) {
        super(2, eyVar);
        this.g = futureTask;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ef1(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.run();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ef1 ef1Var = (a.ef1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ef1Var.e(no1Var);
        return no1Var;
    }
}
