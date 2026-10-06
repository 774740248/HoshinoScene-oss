package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hc1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        super(1);
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        char c = 1;
        java.lang.Object obj = this.g;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m((java.lang.String) obj3, "src");
                zt0Var.m((java.lang.String) obj2, "dst");
                a.ec1 ec1Var = (a.ec1) obj;
                zt0Var.m(java.lang.Boolean.valueOf(ec1Var != null ? ec1Var.b : true), "parallel");
                zt0Var.m(java.lang.Boolean.valueOf(ec1Var != null ? ec1Var.f120a : true), "checkSize");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m((java.lang.String) obj3, "fileName");
                java.lang.String str = (java.lang.String) obj2;
                zt0Var.m(str, "id");
                zt0Var.m(((a.l1) obj).m(str), "targeting");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m((java.lang.String) obj3, "id");
                zt0Var.s("map", new a.b10(3, (java.util.HashMap) obj2));
                a.lt0 lt0Var = new a.lt0();
                lt0Var.m(new a.xa1().g(), "refresh");
                zt0Var.m(lt0Var, "fields");
                a.ze1 ze1Var = (a.ze1) obj;
                zt0Var.s("array", new a.ye1(ze1Var, 0));
                zt0Var.s("spf", new a.ye1(ze1Var, c == true ? 1 : 0));
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.jy0 a2;
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            case 1:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((a.zt0) obj);
                return no1Var;
            default:
                com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) obj;
                a.wv.w(fpsWatchSession, "it");
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) this.e;
                java.lang.Long l = fpsWatchSession.sessionId;
                a.wv.v(l, "it.sessionId");
                long longValue = l.longValue();
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                java.lang.String z = activityFpsSession.z(longValue);
                java.lang.String str = null;
                if (z != null && (a2 = ((a.ab1) this.g).a(0, z)) != null) {
                    str = a2.a();
                }
                a.bp0 bp0Var = (a.bp0) this.f;
                a.wv.s(str);
                bp0Var.i(str);
                return no1Var;
        }
    }
}
