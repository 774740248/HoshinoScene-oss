package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b01 implements android.view.MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.MenuItem.OnActionExpandListener f28a;
    public final /* synthetic */ a.d01 b;

    public b01(a.d01 d01Var, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = d01Var;
        this.f28a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return this.f28a.onMenuItemActionCollapse(this.b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return this.f28a.onMenuItemActionExpand(this.b.m(menuItem));
    }
}
