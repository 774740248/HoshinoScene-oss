package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class p40 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Runnable d;

    public /* synthetic */ p40(java.lang.Runnable runnable, int i) {
        this.c = i;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Runnable runnable = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(runnable, "$exitDelete");
                runnable.run();
                return;
            case 1:
                a.wv.w(runnable, "$exitDelete");
                runnable.run();
                return;
            default:
                a.wv.w(runnable, "$next");
                runnable.run();
                return;
        }
    }
}
