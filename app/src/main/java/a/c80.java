package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c80 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.x01 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(a.x01 x01Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = x01Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.c80(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String j1;
        boolean z;
        a.b20.q1(obj);
        a.x01 x01Var = this.g;
        try {
            java.net.URLConnection openConnection = new java.net.URL(a.ii1.e((java.lang.String) x01Var.d, "vi/lastversion.json")).openConnection();
            a.wv.t(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            j1 = a.wv.j1(new java.io.BufferedReader(new java.io.InputStreamReader(((java.net.HttpURLConnection) openConnection).getInputStream())));
        } catch (java.lang.Exception unused) {
            x01Var.b = true;
        }
        if (!a.yi1.g2(j1, "NoSuchKey") && !a.yi1.g2(j1, "AccessDenied")) {
            z = false;
            x01Var.b = z;
            return a.no1.f387a;
        }
        z = true;
        x01Var.b = z;
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.c80 c80Var = (a.c80) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        c80Var.e(no1Var);
        return no1Var;
    }
}
