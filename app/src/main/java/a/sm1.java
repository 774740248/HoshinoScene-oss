package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sm1 implements a.m2, a.nz0 {
    public final /* synthetic */ androidx.appcompat.widget.Toolbar c;

    public /* synthetic */ sm1(androidx.appcompat.widget.Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        a.nz0 nz0Var = this.c.Q;
        return nz0Var != null && nz0Var.g(pz0Var, menuItem);
    }

    @Override // a.nz0
    public final void r(a.pz0 pz0Var) {
        androidx.appcompat.widget.Toolbar toolbar = this.c;
        a.j2 j2Var = toolbar.mMenuView.v;
        if (j2Var == null || !j2Var.k()) {
            java.util.Iterator it = toolbar.I.b.iterator();
            if (it.hasNext()) {
                a.ai1.t(it.next());
                throw null;
            }
        }
        a.nz0 nz0Var = toolbar.Q;
        if (nz0Var != null) {
            nz0Var.r(pz0Var);
        }
    }
}
