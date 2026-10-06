package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rj0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.tj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(a.tj1 tj1Var, int i) {
        super(1);
        this.d = i;
        this.e = tj1Var;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        int i = this.d;
        a.tj1 tj1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int intValue = ((java.lang.Number) obj).intValue();
                double d = tj1Var.i;
                if (d != 0.0d) {
                    intValue = (int) (intValue * d);
                }
                return java.lang.Integer.valueOf(intValue);
            default:
                int intValue2 = ((java.lang.Number) obj).intValue();
                double d2 = tj1Var.i;
                return d2 == 0.0d ? java.lang.String.valueOf(intValue2) : java.lang.String.valueOf((int) (intValue2 * d2));
        }
    }
}
