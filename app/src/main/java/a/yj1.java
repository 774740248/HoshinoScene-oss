package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yj1 extends a.t31 {
    public final a.am0 c;
    public a.cq d = null;
    public a.gk0 e = null;
    public boolean f;
    public final /* synthetic */ a.zj1 g;

    public yj1(a.zj1 zj1Var, a.am0 am0Var) {
        this.g = zj1Var;
        this.c = am0Var;
    }

    @Override // a.t31
    public final void a(a.gk0 gk0Var) {
        if (this.d == null) {
            a.am0 am0Var = this.c;
            am0Var.getClass();
            this.d = new a.cq(am0Var);
        }
        a.cq cqVar = this.d;
        cqVar.getClass();
        a.am0 am0Var2 = gk0Var.u;
        if (am0Var2 != null && am0Var2 != cqVar.p) {
            throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + gk0Var.toString() + " is already attached to a FragmentManager.");
        }
        cqVar.b(new a.en0(6, gk0Var));
        if (gk0Var.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // a.t31
    public final void b() {
        a.cq cqVar = this.d;
        if (cqVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    if (cqVar.g) {
                        throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                    }
                    a.am0 am0Var = cqVar.p;
                    if (am0Var.q != null && !am0Var.D) {
                        am0Var.t(true);
                        cqVar.a(am0Var.F, am0Var.G);
                        am0Var.b = true;
                        try {
                            am0Var.L(am0Var.F, am0Var.G);
                            am0Var.d();
                            am0Var.V();
                            am0Var.q();
                            am0Var.c.b.values().removeAll(java.util.Collections.singleton(null));
                        } catch (java.lang.Throwable th) {
                            am0Var.d();
                            throw th;
                        }
                    }
                } finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }

    @Override // a.t31
    public final int c() {
        return this.g.d.size();
    }

    @Override // a.t31
    public final void d(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new java.lang.IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
