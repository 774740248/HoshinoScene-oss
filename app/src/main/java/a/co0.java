package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class co0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(a.jo0 jo0Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.co0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.jo0.v0;
        this.g.V().setText(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.co0 co0Var = (a.co0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        co0Var.e(no1Var);
        return no1Var;
    }
}
