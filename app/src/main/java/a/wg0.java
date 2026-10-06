package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class wg0 implements android.view.View.OnKeyListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ wg0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        int i2 = this.c;
        java.lang.Object obj = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.dh0 dh0Var = (a.dh0) obj;
                a.wv.w(dh0Var, "this$0");
                if (i != 4) {
                    return false;
                }
                dh0Var.a();
                return true;
            case 1:
                a.hh0 hh0Var = (a.hh0) obj;
                android.view.WindowManager windowManager = a.hh0.d;
                a.wv.w(hh0Var, "this$0");
                if (i != 4) {
                    return false;
                }
                hh0Var.a();
                return true;
            default:
                a.kh0 kh0Var = (a.kh0) obj;
                a.wv.w(kh0Var, "this$0");
                if (i != 4) {
                    return false;
                }
                kh0Var.a();
                return true;
        }
    }
}
