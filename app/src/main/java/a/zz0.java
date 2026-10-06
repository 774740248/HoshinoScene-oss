package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zz0 extends a.yz0 implements android.view.ActionProvider.VisibilityListener {
    public a.vu0 c;

    @Override // a.yz0
    public final boolean a() {
        return this.f722a.isVisible();
    }

    @Override // a.yz0
    public final android.view.View b(android.view.MenuItem menuItem) {
        return this.f722a.onCreateActionView(menuItem);
    }

    @Override // a.yz0
    public final boolean c() {
        return this.f722a.overridesItemVisibility();
    }

    @Override // a.yz0
    public final void d(a.vu0 vu0Var) {
        this.c = vu0Var;
        this.f722a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        a.vu0 vu0Var = this.c;
        if (vu0Var != null) {
            a.pz0 pz0Var = ((a.xz0) vu0Var.d).n;
            pz0Var.h = true;
            pz0Var.p(true);
        }
    }
}
