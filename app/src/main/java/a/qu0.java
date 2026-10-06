package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qu0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ a.tu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(a.tu0 tu0Var, boolean z) {
        super(1);
        this.d = 0;
        this.f = tu0Var;
        this.e = z;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.tu0 tu0Var = this.f;
        boolean z = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952837), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952838), "desc");
                zt0Var.m(z ? "always" : "never", "visible");
                zt0Var.s("field", a.zb0.r);
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(z ? "always" : "never", "visible");
                zt0Var.m(a.tu0.a(tu0Var, 2131952839), "desc");
                zt0Var.w(new a.bp0[]{new a.qu0(tu0Var, z), new a.ru0(tu0Var, 0), new a.ru0(tu0Var, 1), new a.ru0(tu0Var, 2)});
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(z ? "always" : "never", "visible");
                zt0Var.w(new a.bp0[]{new a.ru0(tu0Var, 3), new a.ru0(tu0Var, 4), new a.ru0(tu0Var, 5), new a.ru0(tu0Var, 6), new a.ru0(tu0Var, 7), new a.ru0(tu0Var, 8)});
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
    public /* synthetic */ qu0(boolean z, a.tu0 tu0Var, int i) {
        super(1);
        this.d = i;
        this.e = z;
        this.f = tu0Var;
    }
}
