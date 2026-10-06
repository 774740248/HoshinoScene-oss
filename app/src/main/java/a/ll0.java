package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ll0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.pl0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll0(a.pl0 pl0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = pl0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ll0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.pl0 pl0Var = this.g;
        java.util.ArrayList g = pl0Var.R0.g();
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.xa(pl0Var, 17, g));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ll0 ll0Var = (a.ll0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ll0Var.e(no1Var);
        return no1Var;
    }
}
