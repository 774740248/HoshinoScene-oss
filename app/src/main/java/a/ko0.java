package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ko0 implements a.er0, a.kd1, a.fr1 {
    public final a.er1 c;
    public androidx.lifecycle.a d = null;
    public a.jd1 e = null;

    public ko0(a.er1 er1Var) {
        this.c = er1Var;
    }

    public final void a(a.ev0 ev0Var) {
        this.d.e(ev0Var);
    }

    public final void b() {
        if (this.d == null) {
            this.d = new androidx.lifecycle.a(this);
            this.e = new a.jd1(this);
        }
    }

    @Override // a.mv0
    public final a.gv0 getLifecycle() {
        b();
        return this.d;
    }

    @Override // a.kd1
    public final a.id1 getSavedStateRegistry() {
        b();
        return this.e.b;
    }

    @Override // a.fr1
    public final a.er1 getViewModelStore() {
        b();
        return this.c;
    }
}
