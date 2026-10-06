package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class em0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.fm0 d;

    public /* synthetic */ em0(a.fm0 fm0Var, int i) {
        this.c = i;
        this.d = fm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.fm0 fm0Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fa0 fa0Var = a.fm0.Z;
                a.wv.w(fm0Var, "this$0");
                new a.u70(fm0Var.K(), 2).a();
                return;
            default:
                a.fa0 fa0Var2 = a.fm0.Z;
                a.wv.w(fm0Var, "this$0");
                try {
                    fm0Var.R(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://vtools.omarea.com/")));
                    return;
                } catch (java.lang.Exception unused) {
                    android.widget.Toast.makeText(fm0Var.f(), "Failed to open browser!", 0).show();
                    return;
                }
        }
    }
}
