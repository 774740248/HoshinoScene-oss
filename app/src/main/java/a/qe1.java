package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qe1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.re1 g;
    public final /* synthetic */ a.lv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe1(a.re1 re1Var, a.lv lvVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = re1Var;
        this.h = lvVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qe1(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.lv lvVar = this.h;
        java.lang.String str = lvVar.j;
        java.lang.String str2 = lvVar.k;
        a.re1 re1Var = this.g;
        android.content.Context context = re1Var.e;
        try {
            if (str2.length() > 0) {
                byte[] b = a.qr0.b(re1Var, re1Var.h + java.net.URLEncoder.encode(str, "UTF-8"));
                if (a.pe0.i(context, "scene-daemon-bak", b)) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.vj1 vj1Var = a.ep1.b;
                    a.fs1.O("daemon_version_name", a.fs1.v().b);
                    a.fs1.O("daemon_build_time", str2);
                }
                a.pe0.i(context, "scene-daemon", b);
            } else {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.O("daemon_version_name", null);
                a.fs1.O("daemon_build_time", null);
            }
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.qe1 qe1Var = (a.qe1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        qe1Var.e(no1Var);
        return no1Var;
    }
}
