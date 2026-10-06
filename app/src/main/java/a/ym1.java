package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ym1 implements a.wm1, a.nz0 {
    public final /* synthetic */ a.an1 c;

    public /* synthetic */ ym1(a.an1 an1Var) {
        this.c = an1Var;
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        return false;
    }

    @Override // a.nz0
    public final void r(a.pz0 pz0Var) {
        a.an1 an1Var = this.c;
        boolean q = an1Var.f20a.f47a.isOverflowMenuShowing();
        android.view.Window.Callback callback = an1Var.b;
        if (q) {
            callback.onPanelClosed(108, pz0Var);
        } else if (callback.onPreparePanel(0, null, pz0Var)) {
            callback.onMenuOpened(108, pz0Var);
        }
    }
}
