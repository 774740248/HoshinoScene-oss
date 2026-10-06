package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jf1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.concurrent.FutureTask g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf1(java.util.concurrent.FutureTask futureTask, a.ey eyVar) {
        super(2, eyVar);
        this.g = futureTask;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jf1(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.run();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.jf1 jf1Var = (a.jf1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        jf1Var.e(no1Var);
        return no1Var;
    }
}
