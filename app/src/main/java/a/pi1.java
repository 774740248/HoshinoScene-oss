package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pi1 extends a.o2 implements a.nz0 {
    public android.content.Context e;
    public androidx.appcompat.widget.ActionBarContextView f;
    public a.n2 g;
    public java.lang.ref.WeakReference h;
    public boolean i;
    public a.pz0 j;

    @Override // a.o2
    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.b(this);
    }

    @Override // a.o2
    public final android.view.View b() {
        java.lang.ref.WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // a.o2
    public final a.pz0 c() {
        return this.j;
    }

    @Override // a.o2
    public final android.view.MenuInflater d() {
        return new a.jj1(this.f.getContext());
    }

    @Override // a.o2
    public final java.lang.CharSequence e() {
        return this.f.getSubtitle();
    }

    @Override // a.o2
    public final java.lang.CharSequence f() {
        return this.f.getTitle();
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        return this.g.e(this, menuItem);
    }

    @Override // a.o2
    public final void h() {
        this.g.a(this, this.j);
    }

    @Override // a.o2
    public final boolean i() {
        return this.f.mTitleOptional;
    }

    @Override // a.o2
    public final void j(android.view.View view) {
        this.f.setCustomView(view);
        this.h = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // a.o2
    public final void k(int i) {
        l(this.e.getString(i));
    }

    @Override // a.o2
    public final void l(java.lang.CharSequence charSequence) {
        this.f.setSubtitle(charSequence);
    }

    @Override // a.o2
    public final void m(int i) {
        n(this.e.getString(i));
    }

    @Override // a.o2
    public final void n(java.lang.CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // a.o2
    public final void o(boolean z) {
        this.d = z;
        this.f.setTitleOptional(z);
    }

    @Override // a.nz0
    public final void r(a.pz0 pz0Var) {
        h();
        a.j2 j2Var = this.f.f;
        if (j2Var != null) {
            j2Var.l();
        }
    }
}
