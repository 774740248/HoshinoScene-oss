package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cl0 extends a.lj1 implements a.bp0 {
    public final /* synthetic */ a.pl0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl0(a.pl0 pl0Var, a.ey eyVar) {
        super(1, eyVar);
        this.g = pl0Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.pl0.W0;
        this.g.getClass();
        a.q10 q10Var = a.q10.f457a;
        a.q10.l("sync\necho 3 > /proc/sys/vm/drop_caches\necho 1 > /proc/sys/vm/compact_memory");
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.W(2131952504, 0);
        return a.no1.f387a;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.cl0 cl0Var = new a.cl0(this.g, (a.ey) obj);
        a.no1 no1Var = a.no1.f387a;
        cl0Var.e(no1Var);
        return no1Var;
    }
}
