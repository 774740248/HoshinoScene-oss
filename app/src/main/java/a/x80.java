package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x80 extends a.mf1 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.x80.class, "_decision");
    private volatile int _decision;

    @Override // a.mf1, a.wt0
    public final void m(java.lang.Object obj) {
        n(obj);
    }

    @Override // a.mf1, a.wt0
    public final void n(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
                a.wv.t1(a.wv.B0(this.f), a.wv.l1(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
