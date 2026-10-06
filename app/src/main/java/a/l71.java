package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l71 extends a.uu0 implements a.bp0 {
    public static final a.l71 e = new a.l71(0);
    public static final a.l71 f = new a.l71(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l71(int i) {
        super(1);
        this.d = i;
    }

    public final void a(a.zt0 zt0Var) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(java.lang.Boolean.TRUE, "mem");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(java.lang.Boolean.TRUE, "merge");
                zt0Var.m("cpu", "sort");
                zt0Var.m(50, "count");
                zt0Var.m("cpu>0", "filter");
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
