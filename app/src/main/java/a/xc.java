package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class xc implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.qo0 d;

    public /* synthetic */ xc(a.qo0 qo0Var, int i) {
        this.c = i;
        this.d = qo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.qo0 qo0Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.wv.w(qo0Var, "$tmp0");
                qo0Var.b();
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(qo0Var, "$tmp0");
                qo0Var.b();
                return;
            default:
                a.gu0[] gu0VarArr3 = a.bn0.x0;
                a.wv.w(qo0Var, "$next");
                qo0Var.b();
                return;
        }
    }
}
