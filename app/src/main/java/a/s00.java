package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.s00(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.util.List y2 = a.yi1.y2(this.g, new java.lang.String[]{"|"});
        if (y2.size() == 2 && a.q10.g != null) {
            java.lang.String str = (java.lang.String) y2.get(0);
            java.lang.String str2 = (java.lang.String) y2.get(1);
            a.wv.w(str, "scene");
            a.wv.w(str2, "mode");
            a.vj1 vj1Var = a.oq0.c;
            a.oq0.j = str;
            a.oq0.k = null;
            a.nk nkVar = a.b11.c;
            nkVar.getClass();
            nkVar.e = str;
            nkVar.d = str2;
            java.util.ArrayList arrayList = a.dc0.f93a;
            a.dc0.a(a.kc0.l, null);
            a.dc0.a(a.kc0.s, null);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.s00 s00Var = (a.s00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        s00Var.e(no1Var);
        return no1Var;
    }
}
