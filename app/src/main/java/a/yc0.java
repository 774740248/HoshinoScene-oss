package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yc0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ a.l1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(a.l1 l1Var, java.lang.String str) {
        super(1);
        this.d = 2;
        this.f = l1Var;
        this.e = str;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        int i2 = 0;
        java.lang.String str = this.e;
        a.l1 l1Var = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("General", "title");
                zt0Var.m(str, "visible");
                zt0Var.m(new a.yt0(new a.xc0(l1Var, i2)), "items");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Scene FAS / FEAS", "title");
                zt0Var.m(str, "visible");
                zt0Var.m(new a.yt0(new a.xc0(l1Var, 2), new a.xc0(l1Var, 4), new a.xc0(l1Var, 6)), "items");
                return;
            default:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953446, "title");
                zt0Var.m(l1Var.o(2131953448), "desc");
                zt0Var.m((a.wv.e(str, "sun") || a.wv.e(str, "canoe")) ? "never" : "always", "visible");
                zt0Var.s("field", new a.xc0(l1Var, 10));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc0(java.lang.String str, a.l1 l1Var, int i) {
        super(1);
        this.d = i;
        this.e = str;
        this.f = l1Var;
    }
}
