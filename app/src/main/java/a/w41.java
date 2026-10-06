package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w41 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.SelectView g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(com.omarea.ui.SelectView selectView, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = selectView;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.w41(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setValue(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.w41 w41Var = (a.w41) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        w41Var.e(no1Var);
        return no1Var;
    }
}
