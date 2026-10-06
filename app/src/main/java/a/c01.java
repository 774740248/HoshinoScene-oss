package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c01 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f58a;
    public final /* synthetic */ a.d01 b;

    public c01(a.d01 d01Var, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = d01Var;
        this.f58a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return this.f58a.onMenuItemClick(this.b.m(menuItem));
    }
}
