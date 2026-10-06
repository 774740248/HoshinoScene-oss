package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j8 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.w21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8(a.w21 w21Var, int i) {
        super(1);
        this.d = i;
        this.e = w21Var;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        a.w21 w21Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.mc1 mc1Var = (a.mc1) obj;
                a.wv.w(mc1Var, "file");
                w21Var.d(mc1Var);
                return no1Var;
            default:
                a.vn1 vn1Var = (a.vn1) obj;
                a.wv.w(vn1Var, "node");
                if (!vn1Var.d) {
                    java.lang.Object obj2 = vn1Var.e;
                    a.mc1 mc1Var2 = obj2 instanceof a.mc1 ? (a.mc1) obj2 : null;
                    if (mc1Var2 != null) {
                        w21Var.d(mc1Var2);
                    }
                }
                return no1Var;
        }
    }
}
