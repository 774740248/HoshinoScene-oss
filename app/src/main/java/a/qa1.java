package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qa1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.l1 e;
    public final /* synthetic */ java.util.List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa1(a.l1 l1Var, java.util.List list, int i) {
        super(1);
        this.d = i;
        this.e = l1Var;
        this.f = list;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        int i2 = 5;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        java.util.List list = this.f;
        a.l1 l1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953290, "title");
                zt0Var.m(l1Var.o(2131953291), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, i4));
                return;
            case 1:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953315, "title");
                zt0Var.m(l1Var.o(2131953316), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, i5));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(l1Var.o(2131953292), "title");
                zt0Var.m(new a.yt0(new a.qa1(l1Var, list, i4), new a.qa1(l1Var, list, i5)), "items");
                return;
            case 3:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953311, "title");
                zt0Var.m(l1Var.o(2131953312), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, i3));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.qa1(l1Var, list, 3)), "items");
                return;
            case 5:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953293, "title");
                zt0Var.m(l1Var.o(2131953294), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, 3));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.qa1(l1Var, list, i2), new a.ra1(l1Var, i4)), "items");
                return;
            case 7:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953317, "title");
                zt0Var.m(l1Var.o(2131953318), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, 4));
                return;
            case 8:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953313, "title");
                zt0Var.m(l1Var.o(2131953314), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, i2));
                return;
            case 9:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.qa1(l1Var, list, 7), new a.qa1(l1Var, list, 8)), "items");
                return;
            case 10:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953297, "title");
                zt0Var.m(l1Var.o(2131953298), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.pa1(list, 6));
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(new a.yt0(new a.ra1(l1Var, i5), new a.qa1(l1Var, list, 10)), "items");
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
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
