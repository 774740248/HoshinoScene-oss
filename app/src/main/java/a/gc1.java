package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gc1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.bp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc1(a.bp0 bp0Var, int i) {
        super(1);
        this.d = i;
        this.e = bp0Var;
    }

    public final void a(java.lang.String str) {
        int i = this.d;
        a.bp0 bp0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "progress");
                if (bp0Var != null) {
                    bp0Var.i(str);
                    return;
                }
                return;
            case 1:
                a.wv.w(str, "progress");
                if (bp0Var != null) {
                    bp0Var.i(str);
                    return;
                }
                return;
            default:
                a.wv.w(str, "progress");
                if (bp0Var != null) {
                    bp0Var.i(str);
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        java.lang.Object obj2;
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((java.lang.String) obj);
                return no1Var;
            case 1:
                a((java.lang.String) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((java.lang.String) obj);
                return no1Var;
            default:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                try {
                    java.lang.Throwable th2 = (java.lang.Throwable) this.e.i(th);
                    boolean e = a.wv.e(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!e) {
                        boolean e2 = a.wv.e(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!e2) {
                            obj2 = null;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    obj2 = a.b20.I(th3);
                }
                return (java.lang.Throwable) (obj2 instanceof a.ac1 ? null : obj2);
        }
    }
}
