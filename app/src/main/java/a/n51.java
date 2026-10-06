package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n51 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ long d;
    public final /* synthetic */ a.r51 e;
    public final /* synthetic */ com.omarea.model.FpsWatchSession f;
    public final /* synthetic */ a.l51 g;
    public final /* synthetic */ a.jt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(long j, a.r51 r51Var, com.omarea.model.FpsWatchSession fpsWatchSession, a.l51 l51Var, a.jt0 jt0Var) {
        super(1);
        this.d = j;
        this.e = r51Var;
        this.f = fpsWatchSession;
        this.g = l51Var;
        this.h = jt0Var;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.d);
        zt0Var.m(sb.toString(), "id");
        a.cp cpVar = com.omarea.Scene.c;
        android.app.Application t = a.fs1.t();
        this.e.getClass();
        java.lang.String string = android.provider.Settings.Secure.getString(t.getContentResolver(), "android_id");
        a.wv.v(string, "getString(\n            c…cure.ANDROID_ID\n        )");
        zt0Var.m(string, "androidId");
        com.omarea.model.FpsWatchSession fpsWatchSession = this.f;
        a.wv.s(fpsWatchSession);
        zt0Var.m(fpsWatchSession.beginTime, "time");
        zt0Var.m(fpsWatchSession.appName, "appName");
        zt0Var.m(fpsWatchSession.packageName, "pkg");
        zt0Var.m(fpsWatchSession.packageVersion, "version");
        zt0Var.m(fpsWatchSession.viewSize, "viewSize");
        a.l51 l51Var = this.g;
        java.lang.String str = l51Var.e;
        if (str == null) {
            a.wv.M1("model");
            throw null;
        }
        zt0Var.m(str, "model");
        zt0Var.m(l51Var.f, "marketModel");
        zt0Var.m(l51Var.a(), "mode");
        java.lang.String str2 = l51Var.g;
        if (str2 == null) {
            a.wv.M1("workingMode");
            throw null;
        }
        zt0Var.m(str2, "workingMode");
        zt0Var.m(java.lang.Integer.valueOf(l51Var.f310a), "sdkInt");
        java.lang.String str3 = l51Var.b;
        if (str3 == null) {
            a.wv.M1("platform");
            throw null;
        }
        zt0Var.m(str3, "platform");
        java.lang.String str4 = l51Var.c;
        if (str4 == null) {
            a.wv.M1("machine");
            throw null;
        }
        zt0Var.m(str4, "machine");
        java.lang.String str5 = l51Var.d;
        if (str5 == null) {
            a.wv.M1("manufacturer");
            throw null;
        }
        zt0Var.m(str5, "manufacturer");
        zt0Var.m(l51Var.i, "version");
        zt0Var.m(fpsWatchSession.sessionDesc, "remark");
        a.m51 m51Var = new a.m51(this.e, this.d, this.h, 0);
        a.lt0 lt0Var = new a.lt0();
        m51Var.i(lt0Var);
        zt0Var.m(lt0Var, "summary");
        return a.no1.f387a;
    }
}
