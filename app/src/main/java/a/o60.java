package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class o60 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ java.lang.Runnable e;

    public /* synthetic */ o60(a.v60 v60Var, java.lang.Runnable runnable, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Runnable runnable = this.e;
        a.v60 v60Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                a.wv.w(v60Var, "$dialog");
                v60Var.a();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
