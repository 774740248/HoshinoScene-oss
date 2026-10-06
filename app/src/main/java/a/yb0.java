package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yb0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.cc0 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb0(a.cc0 cc0Var, boolean z, int i) {
        super(1);
        this.d = i;
        this.e = cc0Var;
        this.f = z;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        boolean z = this.f;
        a.cc0 cc0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.cc0.a(cc0Var, 2131953377), "title");
                zt0Var.m(a.cc0.a(cc0Var, 2131953378), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xb0(0, z));
                return;
            case 1:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.cc0.a(cc0Var, 2131953375), "title");
                zt0Var.m(a.cc0.a(cc0Var, 2131953376), "desc");
                zt0Var.m(z ? "always" : "never", "visible");
                zt0Var.s("field", a.zb0.e);
                return;
            default:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.cc0.a(cc0Var, 2131953379), "title");
                zt0Var.m(a.cc0.a(cc0Var, 2131953380), "desc");
                zt0Var.m(z ? "never" : "always", "visible");
                zt0Var.s("field", a.zb0.f);
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
            case 1:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
