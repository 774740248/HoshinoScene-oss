package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ra1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.l1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra1(a.l1 l1Var, int i) {
        super(1);
        this.d = i;
        this.e = l1Var;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.l1 l1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953295, "title");
                zt0Var.m(l1Var.o(2131953296), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.D);
                return;
            case 1:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953299, "title");
                zt0Var.m(l1Var.o(2131953300), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.E);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953309, "title");
                zt0Var.m(l1Var.o(2131953310), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.F);
                return;
            case 3:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953307, "title");
                zt0Var.m(l1Var.o(2131953308), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.G);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.ra1(l1Var, 2), new a.ra1(l1Var, 3)), "items");
                return;
            case 5:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953303, "title");
                zt0Var.m(l1Var.o(2131953304), "desc");
                zt0Var.m("never", "visible");
                zt0Var.s("field", a.zb0.H);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953305, "title");
                zt0Var.m(l1Var.o(2131953306), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.ta1.e);
                return;
            case 7:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(l1Var.o(2131953286).concat(" (120Hz)"), "label");
                zt0Var.m("high", "value");
                return;
            case 8:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(l1Var.o(2131953289).concat(" (90Hz)"), "label");
                zt0Var.m("middle", "value");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(l1Var.o(2131953288).concat(" (60Hz)"), "label");
                zt0Var.m("low", "value");
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
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((a.zt0) obj);
                return no1Var;
            case 3:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a((a.zt0) obj);
                return no1Var;
            case 5:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a((a.zt0) obj);
                return no1Var;
            case 7:
                a((a.zt0) obj);
                return no1Var;
            case 8:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
