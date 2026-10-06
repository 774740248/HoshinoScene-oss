package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z8 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.l51 g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(a.l51 l51Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = l51Var;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.z8(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.oe1 oe1Var = new a.oe1();
        java.lang.String str = this.g.j;
        a.wv.w(str, "cloudId");
        java.lang.String str2 = this.h;
        a.wv.w(str2, "remark");
        try {
            java.lang.String concat = a.tg1.i().concat("/pvp/user-report-remark");
            a.jc1 jc1Var = new a.jc1(2, str, str2);
            a.lt0 lt0Var = new a.lt0();
            jc1Var.i(lt0Var);
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "cloudId: String, remark:…\n            }.toString()");
            oe1Var.k(concat, lt0Var2);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.z8 z8Var = (a.z8) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        z8Var.e(no1Var);
        return no1Var;
    }
}
