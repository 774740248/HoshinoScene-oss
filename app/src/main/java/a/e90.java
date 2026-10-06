package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e90 extends a.rt0 {
    public final /* synthetic */ int g;
    public final java.lang.Object h;

    public e90(int i, java.lang.Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.g) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                o((java.lang.Throwable) obj);
                return no1Var;
            case 1:
                o((java.lang.Throwable) obj);
                return no1Var;
            default:
                o((java.lang.Throwable) obj);
                return no1Var;
        }
    }

    @Override // a.rt0
    public final void o(java.lang.Throwable th) {
        int i = this.g;
        java.lang.Object obj = this.h;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.c90) obj).c();
                return;
            case 1:
                ((a.bp0) obj).i(th);
                return;
            default:
                java.lang.Object C = n().C();
                if (C instanceof a.dw) {
                    ((a.at) obj).j(a.b20.I(((a.dw) C).f110a));
                    return;
                } else {
                    ((a.at) obj).j(a.wv.P1(C));
                    return;
                }
        }
    }
}
