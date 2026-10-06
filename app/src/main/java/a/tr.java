package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tr extends a.f {
    public final java.lang.Thread f;
    public final a.jc0 g;

    public tr(a.ty tyVar, java.lang.Thread thread, a.jc0 jc0Var) {
        super(tyVar, true);
        this.f = thread;
        this.g = jc0Var;
    }

    @Override // a.wt0
    public final void m(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f;
        if (a.wv.e(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
