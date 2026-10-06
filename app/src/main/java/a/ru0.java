package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ru0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.tu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru0(a.tu0 tu0Var, int i) {
        super(1);
        this.d = i;
        this.e = tu0Var;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.tu0 tu0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952833), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952834), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.s);
                return;
            case 1:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952829), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952830), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.t);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952831), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952832), "desc");
                zt0Var.m("never", "visible");
                zt0Var.s("field", a.zb0.u);
                return;
            case 3:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952835), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952836), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.v);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952821), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952822), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.w);
                return;
            case 5:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952823), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952824), "desc");
                zt0Var.m("never", "visible");
                zt0Var.s("field", a.zb0.x);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952825), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952826), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.y);
                return;
            case 7:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952819), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952820), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.z);
                return;
            case 8:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952827), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952828), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.A);
                return;
            case 9:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952815), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952816), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", a.zb0.B);
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.w(new a.bp0[]{new a.ru0(tu0Var, 9)});
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
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
