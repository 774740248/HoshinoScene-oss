package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pe1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ a.re1 e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ android.content.pm.PackageInfo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(a.re1 re1Var, java.lang.String str, java.lang.String str2, android.content.pm.PackageInfo packageInfo) {
        super(1);
        this.e = re1Var;
        this.f = str;
        this.g = str2;
        this.h = packageInfo;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        android.content.pm.PackageInfo packageInfo = this.h;
        java.lang.String str = this.g;
        java.lang.String str2 = this.f;
        a.re1 re1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str2, "branch");
                zt0Var.m(str, "daemonVersion");
                zt0Var.m(packageInfo.versionName, "versionName");
                zt0Var.m(java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), "osVersion");
                zt0Var.m(a.re1.m(re1Var), "platform");
                zt0Var.m(a.gy.u(), "machine");
                zt0Var.m(a.re1.n(re1Var), "scheme");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                re1Var.getClass();
                zt0Var.m("sceneN1/1.0".concat(a.wv.e(str2, "lp") ? "/lp" : a.wv.e(str2, "ep") ? "/ep" : "/hp"), "branch");
                zt0Var.m(str, "daemonVersion");
                zt0Var.m(packageInfo.versionName, "versionName");
                zt0Var.m(java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), "osVersion");
                zt0Var.m(a.re1.m(re1Var), "platform");
                zt0Var.m(a.gy.u(), "machine");
                zt0Var.m(a.re1.n(re1Var), "scheme");
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(java.lang.String str, java.lang.String str2, android.content.pm.PackageInfo packageInfo, a.re1 re1Var) {
        super(1);
        this.f = str;
        this.g = str2;
        this.h = packageInfo;
        this.e = re1Var;
    }
}
