package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vm0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.bn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vm0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.bn0.x0;
        a.bn0 bn0Var = this.g;
        bn0Var.getClass();
        ((com.omarea.ui.BlurViewLinearLayout) bn0Var.h0.a(a.bn0.x0[11])).setVisibility(((java.lang.Boolean) ((a.vj1) ((a.yu0) new a.en1().f)).a()).booleanValue() ? 0 : 8);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.vm0 vm0Var = (a.vm0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        vm0Var.e(no1Var);
        return no1Var;
    }
}
