package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xi extends a.uu0 implements a.bp0 {
    public static final a.xi e = new a.xi(0);
    public static final a.xi f = new a.xi(1);
    public static final a.xi g = new a.xi(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi(int i) {
        super(1);
        this.d = i;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ng1 ng1Var = (a.ng1) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(ng1Var, "it");
                        return no1Var;
                    default:
                        a.wv.w(ng1Var, "it");
                        return no1Var;
                }
            case 1:
                a.ng1 ng1Var2 = (a.ng1) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(ng1Var2, "it");
                        return no1Var;
                    default:
                        a.wv.w(ng1Var2, "it");
                        return no1Var;
                }
            default:
                a.wv.w((a.x81) obj, "it");
                return no1Var;
        }
    }
}
