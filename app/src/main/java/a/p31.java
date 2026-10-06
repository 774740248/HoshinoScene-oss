package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class p31 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.q31 d;
    public final /* synthetic */ java.lang.Exception e;

    public /* synthetic */ p31(a.q31 q31Var, java.lang.Exception exc, int i) {
        this.c = i;
        this.d = q31Var;
        this.e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Exception exc = this.e;
        a.q31 q31Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(q31Var, "this$0");
                a.wv.w(exc, "$ex");
                android.widget.Toast.makeText(q31Var.f461a, a.ai1.g("Page configuration parsing error!\n", exc.getMessage()), 1).show();
                return;
            default:
                a.wv.w(q31Var, "this$0");
                a.wv.w(exc, "$ex");
                android.widget.Toast.makeText(q31Var.f461a, a.ai1.g("解析配置文件失败\n", exc.getMessage()), 1).show();
                return;
        }
    }
}
