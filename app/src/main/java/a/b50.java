package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class b50 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.i50 d;

    public /* synthetic */ b50(a.i50 i50Var, int i) {
        this.c = i;
        this.d = i50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.i50 i50Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(i50Var, "this$0");
                i50Var.d();
                return;
            case 1:
                a.wv.w(i50Var, "this$0");
                i50Var.d();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(i50Var, "this$0");
                ((a.w1) i50Var.b).b();
                return;
            case 3:
                a.wv.w(i50Var, "this$0");
                ((a.w1) i50Var.b).b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(i50Var, "this$0");
                ((a.w1) i50Var.b).b();
                return;
            case 5:
                i50Var.c();
                return;
            default:
                i50Var.c();
                return;
        }
    }
}
