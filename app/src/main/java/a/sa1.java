package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sa1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.l1 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa1(a.l1 l1Var, boolean z, int i) {
        super(1);
        this.d = i;
        this.e = l1Var;
        this.f = z;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        int i2 = 3;
        int i3 = 2;
        boolean z = this.f;
        a.l1 l1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953319, "title");
                zt0Var.m(l1Var.o(2131953320), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xb0(i3, z));
                return;
            case 1:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953301, "title");
                zt0Var.m(l1Var.o(2131953302), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xb0(i2, z));
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.ra1(l1Var, 5), new a.sa1(l1Var, z, 0), new a.sa1(l1Var, z, 1), new a.ra1(l1Var, 6)), "items");
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
