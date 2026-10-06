package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n71 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n71(int i, int i2) {
        super(1);
        this.d = i2;
        this.e = i;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        int i = this.d;
        int i2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.zt0 zt0Var = (a.zt0) obj;
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(java.lang.Integer.valueOf(i2), "pid");
                zt0Var.m(java.lang.Boolean.TRUE, "mem");
                return a.no1.f387a;
            default:
                return a.ai1.c(((java.lang.Number) obj).intValue() * i2, "MB");
        }
    }
}
