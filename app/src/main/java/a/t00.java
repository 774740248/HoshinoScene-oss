package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ma1 g;
    public final /* synthetic */ a.ma1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(a.ma1 ma1Var, a.ma1 ma1Var2, a.ey eyVar) {
        super(2, eyVar);
        this.g = ma1Var;
        this.h = ma1Var2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.t00(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.rd1 rd1Var = a.q10.g;
        if (rd1Var != null) {
            rd1Var.a((java.lang.String) this.g.c, (java.lang.String) this.h.c);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.t00 t00Var = (a.t00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        t00Var.e(no1Var);
        return no1Var;
    }
}
