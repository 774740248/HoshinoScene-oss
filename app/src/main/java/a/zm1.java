package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zm1 implements a.n01 {

    public zm1() {
    }

    public boolean c;
    public java.lang.Object d;

    @Override // a.n01
    public final void a(a.pz0 pz0Var, boolean z) {
        a.j2 j2Var;
        if (this.c) {
            return;
        }
        this.c = true;
        a.an1 an1Var = (a.an1) this.d;
        androidx.appcompat.widget.ActionMenuView actionMenuView = an1Var.f20a.f47a.mMenuView;
        if (actionMenuView != null && (j2Var = actionMenuView.mPresenter) != null) {
            j2Var.f();
            a.e2 e2Var = j2Var.v;
            if (e2Var != null && e2Var.b()) {
                e2Var.j.dismiss();
            }
        }
        an1Var.b.onPanelClosed(108, pz0Var);
        this.c = false;
    }

    @Override // a.n01
    public final boolean o(a.pz0 pz0Var) {
        ((a.an1) this.d).b.onMenuOpened(108, pz0Var);
        return true;
    }
}
