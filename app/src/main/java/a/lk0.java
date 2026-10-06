package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lk0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ lk0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.w20 w20Var = (a.w20) obj;
                a.gk0 obj2 = (gk0) w20Var.c;
                a.ek0 ek0Var = ((a.gk0) obj2).K;
                if ((ek0Var == null ? null : ek0Var.f125a) != null) {
                    ((a.gk0) obj2).c().f125a = null;
                    ((a.sl0) w20Var.d).c((a.gk0) w20Var.c, (a.ct) w20Var.e);
                    return;
                }
                return;
            case 1:
                a.w20 w20Var2 = (a.w20) obj;
                w20Var2.b.endViewTransition((android.view.View) w20Var2.c);
                ((a.y20) w20Var2.d).b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.m60 m60Var = (a.m60) obj;
                m60Var.Z.onDismiss(m60Var.h0);
                return;
            case 3:
                ((a.am0) obj).u(true);
                return;
            default:
                a.gn0.b((java.util.ArrayList) obj, 4);
                return;
        }
    }
}
