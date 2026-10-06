package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vt0 extends a.rp {
    public final a.lx0 b;
    public a.lx0 c;
    public final /* synthetic */ a.wt0 d;
    public final /* synthetic */ java.lang.Object e;

    public vt0(a.lx0 lx0Var, a.wt0 wt0Var, java.lang.Object obj) {
        this.d = wt0Var;
        this.e = obj;
        this.b = lx0Var;
    }

    @Override // a.rp
    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        a.lx0 lx0Var = (a.lx0) obj;
        boolean z = obj2 == null;
        a.lx0 lx0Var2 = this.b;
        a.lx0 lx0Var3 = z ? lx0Var2 : this.c;
        if (lx0Var3 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.lx0.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(lx0Var, this, lx0Var3)) {
                if (atomicReferenceFieldUpdater.get(lx0Var) != this) {
                    return;
                }
            }
            if (z) {
                a.lx0 lx0Var4 = this.c;
                a.wv.s(lx0Var4);
                lx0Var2.j(lx0Var4);
            }
        }
    }

    @Override // a.rp
    public final a.qm1 c(java.lang.Object obj) {
        if (this.d.C() == this.e) {
            return null;
        }
        return a.b20.j;
    }
}
