package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dt1 extends a.o2 implements a.nz0 {
    public final android.content.Context e;
    public final a.pz0 f;
    public a.n2 g;
    public java.lang.ref.WeakReference h;
    public final /* synthetic */ a.et1 i;

    public dt1(a.et1 et1Var, android.content.Context context, a.bm bmVar) {
        this.i = et1Var;
        this.e = context;
        this.g = bmVar;
        a.pz0 pz0Var = new a.pz0(context);
        pz0Var.l = 1;
        this.f = pz0Var;
        pz0Var.e = this;
    }

    @Override // a.o2
    public final void a() {
        a.et1 et1Var = this.i;
        if (et1Var.i != this) {
            return;
        }
        if (et1Var.p) {
            et1Var.j = this;
            et1Var.k = this.g;
        } else {
            this.g.b(this);
        }
        this.g = null;
        et1Var.r(false);
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = et1Var.f;
        if (actionBarContextView.mClose == null) {
            actionBarContextView.killMode();
        }
        et1Var.c.setHideOnContentScrollEnabled(et1Var.u);
        et1Var.i = null;
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
        return this.f;
    }

    @Override // a.o2
    public final android.view.MenuInflater d() {
        return new a.jj1(this.e);
    }

    @Override // a.o2
    public final java.lang.CharSequence e() {
        return this.i.f.getSubtitle();
    }

    @Override // a.o2
    public final java.lang.CharSequence f() {
        return this.i.f.getTitle();
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        a.n2 n2Var = this.g;
        if (n2Var != null) {
            return n2Var.e(this, menuItem);
        }
        return false;
    }

    @Override // a.o2
    public final void h() {
        if (this.i.i != this) {
            return;
        }
        a.pz0 pz0Var = this.f;
        pz0Var.x();
        try {
            this.g.a(this, pz0Var);
        } finally {
            pz0Var.w();
        }
    }

    @Override // a.o2
    public final boolean i() {
        return this.i.f.u;
    }

    @Override // a.o2
    public final void j(android.view.View view) {
        this.i.f.setCustomView(view);
        this.h = new java.lang.ref.WeakReference(view);
    }

    @Override // a.o2
    public final void k(int i) {
        l(this.i.f136a.getResources().getString(i));
    }

    @Override // a.o2
    public final void l(java.lang.CharSequence charSequence) {
        this.i.f.setSubtitle(charSequence);
    }

    @Override // a.o2
    public final void m(int i) {
        n(this.i.f136a.getResources().getString(i));
    }

    @Override // a.o2
    public final void n(java.lang.CharSequence charSequence) {
        this.i.f.setTitle(charSequence);
    }

    @Override // a.o2
    public final void o(boolean z) {
        this.d = z;
        this.i.f.setTitleOptional(z);
    }

    @Override // a.nz0
    public final void r(a.pz0 pz0Var) {
        if (this.g == null) {
            return;
        }
        h();
        a.j2 j2Var = this.i.f.f;
        if (j2Var != null) {
            j2Var.l();
        }
    }
}
