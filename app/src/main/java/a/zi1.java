package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zi1 extends a.pz0 implements android.view.SubMenu {
    public final a.xz0 A;
    public final a.pz0 z;

    public zi1(android.content.Context context, a.pz0 pz0Var, a.xz0 xz0Var) {
        super(context);
        this.z = pz0Var;
        this.A = xz0Var;
    }

    @Override // a.pz0
    public final boolean d(a.xz0 xz0Var) {
        return this.z.d(xz0Var);
    }

    @Override // a.pz0
    public final boolean e(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        return super.e(pz0Var, menuItem) || this.z.e(pz0Var, menuItem);
    }

    @Override // a.pz0
    public final boolean f(a.xz0 xz0Var) {
        return this.z.f(xz0Var);
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.A;
    }

    @Override // a.pz0
    public final java.lang.String j() {
        a.xz0 xz0Var = this.A;
        int i = xz0Var != null ? xz0Var.f698a : 0;
        if (i == 0) {
            return null;
        }
        return a.ii1.d("android:menu:actionviewstates:", i);
    }

    @Override // a.pz0
    public final a.pz0 k() {
        return this.z.k();
    }

    @Override // a.pz0
    public final boolean m() {
        return this.z.m();
    }

    @Override // a.pz0
    public final boolean n() {
        return this.z.n();
    }

    @Override // a.pz0
    public final boolean o() {
        return this.z.o();
    }

    @Override // a.pz0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        v(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        v(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        v(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // a.pz0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // a.pz0
    public final void u(a.nz0 nz0Var) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i) {
        v(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i) {
        v(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
