package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t71 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.u71 g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(a.u71 u71Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = u71Var;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.t71(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String g;
        java.lang.Object c;
        a.b20.q1(obj);
        a.u71 u71Var = this.g;
        a.re1 re1Var = new a.re1(u71Var.f581a);
        android.content.Context context = re1Var.e;
        java.lang.String str = null;
        try {
            a.lc1 lc1Var = new a.lc1(context.getPackageManager().getPackageInfo(context.getPackageName(), 0), 4, re1Var);
            a.lt0 lt0Var = new a.lt0();
            lc1Var.i(lt0Var);
            g = re1Var.g(lt0Var, a.tg1.i().concat("/cloud-scheduler-threads"));
            c = new a.tk(g).c();
        } catch (java.lang.Exception unused) {
        }
        if (!(c instanceof a.jt0)) {
            a.b20.B1(c, "JSONArray");
            throw null;
        }
        java.util.List list = ((a.jt0) c).f269a;
        str = g;
        if (str != null) {
            java.lang.String str2 = a.pe0.f434a;
            byte[] bytes = str.getBytes(a.bu.f53a);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            a.pe0.i(u71Var.f581a, this.h, bytes);
            a.q10 q10Var = a.q10.f457a;
            a.q10.A("version-update");
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.t71 t71Var = (a.t71) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        t71Var.e(no1Var);
        return no1Var;
    }
}
