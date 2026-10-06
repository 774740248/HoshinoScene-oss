package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ge extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ma1 g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.w60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(a.ma1 ma1Var, java.lang.String str, java.lang.String str2, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = ma1Var;
        this.h = str;
        this.i = str2;
        this.j = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ge(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.k((java.lang.String) this.g.c, "1", new java.lang.Long(15000L));
        java.lang.String str = this.h;
        if (a.wv.e(str, "0")) {
            a.nu0.l(this.i, str);
        }
        this.j.a();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ge geVar = (a.ge) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        geVar.e(no1Var);
        return no1Var;
    }
}
