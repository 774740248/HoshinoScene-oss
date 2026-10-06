package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xc0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.l1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc0(a.l1 l1Var, int i) {
        super(1);
        this.d = i;
        this.e = l1Var;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.l1 l1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953404, "title");
                zt0Var.m(l1Var.o(2131953405), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.j);
                return;
            case 1:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("governor_little", "path");
                zt0Var.m("auto", "default");
                zt0Var.m("select", "type");
                zt0Var.m(a.l1.b(l1Var), "options");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953459, "title");
                zt0Var.m(l1Var.o(2131953460), "desc");
                new a.ls();
                zt0Var.m(a.ls.d().size() < 3 ? "never" : "always", "visible");
                zt0Var.s("field", new a.xc0(l1Var, 1));
                return;
            case 3:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("governor_middle", "path");
                zt0Var.m("auto", "default");
                zt0Var.m("select", "type");
                zt0Var.m(a.l1.b(l1Var), "options");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953461, "title");
                zt0Var.m(l1Var.o(2131953462), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xc0(l1Var, 3));
                return;
            case 5:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("governor_prime", "path");
                zt0Var.m("auto", "default");
                zt0Var.m("select", "type");
                zt0Var.m(a.l1.b(l1Var), "options");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953463, "title");
                zt0Var.m(l1Var.o(2131953464), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xc0(l1Var, 5));
                return;
            case 7:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953447, "label");
                zt0Var.m("0", "value");
                return;
            case 8:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953449, "label");
                zt0Var.m("1", "value");
                return;
            case 9:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953450, "label");
                zt0Var.m("2", "value");
                return;
            case 10:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("target_cluster", "path");
                zt0Var.m("select", "type");
                zt0Var.m("0", "default");
                zt0Var.m(new a.yt0(new a.xc0(l1Var, 7), new a.xc0(l1Var, 8), new a.xc0(l1Var, 9)), "options");
                return;
            case 11:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953457, "title");
                zt0Var.m(l1Var.o(2131953458), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.k);
                return;
            case 12:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953470, "label");
                zt0Var.m("0", "value");
                return;
            case 13:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953468, "label");
                zt0Var.m("1", "value");
                return;
            case 14:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953472, "label");
                zt0Var.m("2", "value");
                return;
            case 15:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953471, "label");
                zt0Var.m("3", "value");
                return;
            case 16:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953455, "title");
                zt0Var.m(l1Var.o(2131953456), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.l);
                return;
            case 17:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953453, "title");
                zt0Var.m(l1Var.o(2131953454), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.m);
                return;
            case 18:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953465, "title");
                zt0Var.m(l1Var.o(2131953466), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.p);
                return;
            case 19:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Scene FAS Lite", "title");
                zt0Var.m(new a.yt0(new a.xc0(l1Var, 18)), "items");
                return;
            case 20:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131952253, "title");
                zt0Var.m(l1Var.o(2131952254), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.q);
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Debug", "title");
                zt0Var.m(new a.yt0(new a.xc0(l1Var, 20)), "items");
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
            case 9:
                a((a.zt0) obj);
                return no1Var;
            case 10:
                a((a.zt0) obj);
                return no1Var;
            case 11:
                a((a.zt0) obj);
                return no1Var;
            case 12:
                a((a.zt0) obj);
                return no1Var;
            case 13:
                a((a.zt0) obj);
                return no1Var;
            case 14:
                a((a.zt0) obj);
                return no1Var;
            case 15:
                a((a.zt0) obj);
                return no1Var;
            case 16:
                a((a.zt0) obj);
                return no1Var;
            case 17:
                a((a.zt0) obj);
                return no1Var;
            case 18:
                a((a.zt0) obj);
                return no1Var;
            case 19:
                a((a.zt0) obj);
                return no1Var;
            case 20:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
