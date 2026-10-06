package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jc1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc1(int i, java.lang.String str, java.lang.String str2) {
        super(1);
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        java.lang.String str = this.f;
        java.lang.String str2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str2, "src");
                zt0Var.m(str, "dst");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str2, "id1");
                zt0Var.m(str, "id2");
                return;
            default:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(str2, "id");
                zt0Var.m(str, "remark");
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
