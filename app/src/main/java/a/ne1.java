package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ne1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne1(java.lang.String str, int i) {
        super(1);
        this.d = i;
        this.e = str;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        java.lang.String str = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str, "id");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str, "id");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str, "id");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str, "id");
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
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
            default:
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(str, "line");
                return a.ai1.j(new java.lang.StringBuilder(), this.e, str);
        }
    }
}
