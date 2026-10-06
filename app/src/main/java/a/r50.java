package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r50 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ a.k50 d;
    public final /* synthetic */ a.ha1 e;
    public final /* synthetic */ a.f60 f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ a.ma1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(a.k50 k50Var, a.ha1 ha1Var, a.f60 f60Var, java.lang.String str, a.ma1 ma1Var) {
        super(0);
        this.d = k50Var;
        this.e = ha1Var;
        this.f = f60Var;
        this.g = str;
        this.h = ma1Var;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.k50 k50Var = this.d;
        for (a.y31 y31Var : (Iterable<a.y31>) k50Var.b) {
            java.lang.String str = (java.lang.String) y31Var.c;
            java.lang.String str2 = (java.lang.String) y31Var.d;
            a.wv.w(str, "src");
            a.wv.w(str2, "dst");
            a.q10 q10Var = a.q10.f457a;
            if (!a.wv.e(a.q10.L("move", str + ":" + str2, null), "true")) {
                arrayList.add(y31Var.c);
            }
        }
        if (this.e.c) {
            for (a.y31 y31Var2 : (Iterable<a.y31>) k50Var.f283a) {
                boolean h = a.gy.h((java.lang.String) y31Var2.d);
                java.lang.Object obj = y31Var2.c;
                if (!h || !a.gy.J((java.lang.String) obj, (java.lang.String) y31Var2.d)) {
                    arrayList.add(obj);
                }
            }
        }
        a.u20 u20Var = a.z80.f728a;
        return a.wv.M0(a.wv.b(a.by0.f57a), null, new a.q50(this.f, this.g, this.h, arrayList, null), 3);
    }
}
