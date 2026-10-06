package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xb0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb0(int i, boolean z) {
        super(1);
        this.d = i;
        this.e = z;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        boolean z = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m(z ? "1" : "0", "default");
                zt0Var.m("gpu_lock", "path");
                zt0Var.m("boolean", "type");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("conservative", "path");
                zt0Var.m("boolean", "type");
                zt0Var.m(z ? "1" : "0", "default");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m(z ? "1" : "0", "default");
                zt0Var.m("strict", "path");
                zt0Var.m("boolean", "type");
                return;
            default:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m(z ? "1" : "0", "default");
                zt0Var.m("compatible", "path");
                zt0Var.m("boolean", "type");
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
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
