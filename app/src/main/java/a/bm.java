package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bm implements a.n2 {
    public final a.n2 c;
    public final /* synthetic */ a.km d;

    public bm(a.km kmVar, a.n2 n2Var) {
        this.d = kmVar;
        this.c = n2Var;
    }

    @Override // a.n2
    public final boolean a(a.o2 o2Var, a.pz0 pz0Var) {
        android.view.ViewGroup viewGroup = this.d.C;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.vp1.c(viewGroup);
        return this.c.a(o2Var, pz0Var);
    }

    @Override // a.n2
    public final void b(a.o2 o2Var) {
        this.c.b(o2Var);
        a.km kmVar = this.d;
        if (kmVar.y != null) {
            kmVar.n.getDecorView().removeCallbacks(kmVar.z);
        }
        if (kmVar.x != null) {
            a.sr1 sr1Var = kmVar.A;
            if (sr1Var != null) {
                sr1Var.b();
            }
            a.sr1 a2 = a.jq1.a(kmVar.x);
            a2.a(0.0f);
            kmVar.A = a2;
            a2.d(new a.am(2, this));
        }
        a.ql qlVar = kmVar.p;
        if (qlVar != null) {
            qlVar.onSupportActionModeFinished(kmVar.w);
        }
        kmVar.w = null;
        android.view.ViewGroup viewGroup = kmVar.C;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.vp1.c(viewGroup);
        kmVar.L();
    }

    @Override // a.n2
    public final boolean e(a.o2 o2Var, android.view.MenuItem menuItem) {
        return this.c.e(o2Var, menuItem);
    }

    @Override // a.n2
    public final boolean f(a.o2 o2Var, a.pz0 pz0Var) {
        return this.c.f(o2Var, pz0Var);
    }
}
