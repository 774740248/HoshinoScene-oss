package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class su0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.tu0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su0(a.tu0 tu0Var, boolean z, boolean z2, int i) {
        super(1);
        this.d = i;
        this.e = tu0Var;
        this.f = z;
        this.g = z2;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        a.tu0 tu0Var = this.e;
        boolean z = this.g;
        boolean z2 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.tu0.a(tu0Var, 2131952817), "title");
                zt0Var.m(a.tu0.a(tu0Var, 2131952818), "desc");
                zt0Var.m((z2 || z) ? "always" : "never", "visible");
                zt0Var.s("field", a.zb0.C);
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.w(new a.bp0[]{new a.su0(tu0Var, z2, z, 0)});
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
