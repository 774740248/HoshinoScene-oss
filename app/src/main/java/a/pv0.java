package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pv0 extends a.xy implements a.f30 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater j = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.pv0.class, "runningWorkers");
    public final a.xy e;
    public final int f;
    public final /* synthetic */ a.f30 g;
    public final a.mx0 h;
    public final java.lang.Object i;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public pv0(a.po1 po1Var, int i) {
        this.e = po1Var;
        this.f = i;
        a.f30 f30Var = po1Var instanceof a.f30 ? (a.f30) po1Var : null;
        this.g = f30Var == null ? a.i20.f224a : f30Var;
        this.h = new a.mx0();
        this.i = new java.lang.Object();
    }

    @Override // a.f30
    public final a.c90 b(long j2, java.lang.Runnable runnable, a.ty tyVar) {
        return this.g.b(j2, runnable, tyVar);
    }

    @Override // a.f30
    public final void f(long j2, a.at atVar) {
        this.g.f(j2, atVar);
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        this.h.a(runnable);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
        if (atomicIntegerFieldUpdater.get(this) < this.f) {
            synchronized (this.i) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                java.lang.Runnable l = l();
                if (l == null) {
                    return;
                }
                this.e.h(this, new a.g2(this, 16, l));
            }
        }
    }

    public final java.lang.Runnable l() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
