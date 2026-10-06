package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ge0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge0(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.String str2, java.lang.String str3, int i4) {
        super(1);
        this.d = i4;
        this.e = str;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str2;
        this.k = str3;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        java.lang.String str = this.k;
        java.lang.String str2 = this.j;
        int i2 = this.i;
        int i3 = this.h;
        int i4 = this.g;
        boolean z = this.f;
        java.lang.String str3 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str3, "pkg");
                zt0Var.m(java.lang.Boolean.valueOf(z), "direct");
                zt0Var.m(java.lang.Integer.valueOf(i4), "port");
                zt0Var.m(java.lang.Integer.valueOf(i3), "band");
                zt0Var.m(java.lang.Integer.valueOf(i2), "bandWidth");
                zt0Var.m(str2, "passphrase");
                zt0Var.m(str, "securityType");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str3, "folder");
                zt0Var.m(java.lang.Boolean.valueOf(z), "direct");
                zt0Var.m(java.lang.Integer.valueOf(i4), "port");
                zt0Var.m(java.lang.Integer.valueOf(i3), "band");
                zt0Var.m(java.lang.Integer.valueOf(i2), "bandWidth");
                zt0Var.m(str2, "passphrase");
                zt0Var.m(str, "securityType");
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
}
