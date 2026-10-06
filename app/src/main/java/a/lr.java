package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lr extends a.lj1 implements a.fp0 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lr(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.cp cpVar = com.omarea.Scene.c;
        android.app.Application t = a.fs1.t();
        int i = this.g;
        synchronized (t) {
            a.q10 q10Var = a.q10.f457a;
            a.q10.L("charge-control", i + "000", null);
            a.mr.f = false;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.lr lrVar = (a.lr) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        lrVar.e(no1Var);
        return no1Var;
    }
}
