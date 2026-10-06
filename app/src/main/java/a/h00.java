package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.fps.DDRView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(com.omarea.ui.fps.DDRView dDRView, a.ey eyVar) {
        super(2, eyVar);
        this.g = dDRView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h00(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h00 h00Var = (a.h00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h00Var.e(no1Var);
        return no1Var;
    }
}
