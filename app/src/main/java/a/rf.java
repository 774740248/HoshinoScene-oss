package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rf extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.concurrent.FutureTask g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(java.util.concurrent.FutureTask futureTask, a.ey eyVar) {
        super(2, eyVar);
        this.g = futureTask;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.rf(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        for (int i = 0; i < 6; i++) {
            a.q10 q10Var = a.q10.f457a;
            if (a.q10.r()) {
                break;
            }
            a.q10.T(300L);
        }
        a.q10 q10Var2 = a.q10.f457a;
        if (a.q10.r()) {
            this.g.cancel(true);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.rf rfVar = (a.rf) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        rfVar.e(no1Var);
        return no1Var;
    }
}
