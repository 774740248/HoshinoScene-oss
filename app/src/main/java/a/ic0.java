package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ic0 extends a.jc0 implements a.f30 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.ic0.class, java.lang.Object.class, "_queue");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.ic0.class, java.lang.Object.class, "_delayed");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater k = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.ic0.class, "_isCompleted");
    private volatile java.lang.Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile java.lang.Object _queue;

    public a.c90 b(long j2, java.lang.Runnable runnable, a.ty tyVar) {
        return a.i20.f224a.b(j2, runnable, tyVar);
    }

    @Override // a.f30
    public final void f(long j2, a.at atVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = java.lang.System.nanoTime();
            a.ec0 ec0Var = new a.ec0(this, j3 + nanoTime, atVar);
            v(nanoTime, ec0Var);
            atVar.r(new a.d90(0, ec0Var));
        }
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        s(runnable);
    }

    @Override // a.jc0
    public final long o() {
        java.lang.Runnable runnable;
        a.gc0 gc0Var;
        a.gc0 b;
        if (p()) {
            return 0L;
        }
        a.hc0 hc0Var = (a.hc0) j.get(this);
        if (hc0Var != null && a.yl1.b.get(hc0Var) != 0) {
            long nanoTime = java.lang.System.nanoTime();
            do {
                synchronized (hc0Var) {
                    a.gc0[] gc0VarArr = hc0Var.f713a;
                    a.gc0 gc0Var2 = gc0VarArr != null ? gc0VarArr[0] : null;
                    b = gc0Var2 == null ? null : (nanoTime - gc0Var2.c < 0 || !t(gc0Var2)) ? null : hc0Var.b(0);
                }
            } while (b != null);
        }
        loop1: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof a.ox0)) {
                if (obj == a.wv.p) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (java.lang.Runnable) obj;
                break loop1;
            }
            a.ox0 ox0Var = (a.ox0) obj;
            java.lang.Object d = ox0Var.d();
            if (d != a.ox0.g) {
                runnable = (java.lang.Runnable) d;
                break;
            }
            a.ox0 c = ox0Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        a.hp hpVar = this.g;
        if (((hpVar == null || hpVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        java.lang.Object obj2 = i.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof a.ox0)) {
                if (obj2 != a.wv.p) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = a.ox0.f.get((a.ox0) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        a.hc0 hc0Var2 = (a.hc0) j.get(this);
        if (hc0Var2 != null) {
            synchronized (hc0Var2) {
                a.gc0[] gc0VarArr2 = hc0Var2.f713a;
                gc0Var = gc0VarArr2 != null ? gc0VarArr2[0] : null;
            }
            if (gc0Var != null) {
                long nanoTime2 = gc0Var.c - java.lang.System.nanoTime();
                if (nanoTime2 < 0) {
                    return 0L;
                }
                return nanoTime2;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // a.jc0
    public void r() {
        a.gc0 b;
        java.lang.ThreadLocal threadLocal = a.xl1.f690a;
        a.xl1.f690a.set(null);
        k.set(this, 1);
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            a.qm1 qm1Var = a.wv.p;
            if (obj != null) {
                if (!(obj instanceof a.ox0)) {
                    if (obj != qm1Var) {
                        a.ox0 ox0Var = new a.ox0(8, true);
                        ox0Var.a((java.lang.Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ox0Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((a.ox0) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qm1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (o() <= 0);
        long nanoTime = java.lang.System.nanoTime();
        while (true) {
            a.hc0 hc0Var = (a.hc0) j.get(this);
            if (hc0Var == null) {
                return;
            }
            synchronized (hc0Var) {
                b = a.yl1.b.get(hc0Var) > 0 ? hc0Var.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                q(nanoTime, b);
            }
        }
    }

    public void s(java.lang.Runnable runnable) {
        if (!t(runnable)) {
            a.h20.l.s(runnable);
            return;
        }
        java.lang.Thread m = m();
        if (java.lang.Thread.currentThread() != m) {
            java.util.concurrent.locks.LockSupport.unpark(m);
        }
    }

    public final boolean t(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (k.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof a.ox0)) {
                if (obj == a.wv.p) {
                    return false;
                }
                a.ox0 ox0Var = new a.ox0(8, true);
                ox0Var.a((java.lang.Runnable) obj);
                ox0Var.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ox0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            a.ox0 ox0Var2 = (a.ox0) obj;
            int a2 = ox0Var2.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.ox0 c = ox0Var2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final boolean u() {
        a.hp hpVar = this.g;
        if (hpVar != null && !hpVar.isEmpty()) {
            return false;
        }
        a.hc0 hc0Var = (a.hc0) j.get(this);
        if (hc0Var != null && a.yl1.b.get(hc0Var) != 0) {
            return false;
        }
        java.lang.Object obj = i.get(this);
        if (obj != null) {
            if (obj instanceof a.ox0) {
                long j2 = a.ox0.f.get((a.ox0) obj);
                if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                    return false;
                }
            } else if (obj != a.wv.p) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [a.hc0, java.lang.Object] */
    public final void v(long j2, a.gc0 gc0Var) {
        java.lang.Object r4 = null;
        int b;
        java.lang.Thread m;
        boolean z = k.get(this) != 0;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (z) {
            b = 1;
        } else {
            a.hc0 hc0Var = (a.hc0) atomicReferenceFieldUpdater.get(this);
            if (hc0Var == null) {
                a.hc0 obj = new a.hc0();
                obj.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                a.hc0 obj2 = (hc0) atomicReferenceFieldUpdater.get(this);
                a.wv.s(obj2);
                hc0Var = (a.hc0) obj2;
            }
            b = gc0Var.b(j2, hc0Var, this);
        }
        if (b != 0) {
            if (b == 1) {
                q(j2, gc0Var);
                return;
            } else {
                if (b != 2) {
                    throw new java.lang.IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        a.hc0 hc0Var2 = (a.hc0) atomicReferenceFieldUpdater.get(this);
        if (hc0Var2 != null) {
            synchronized (hc0Var2) {
                a.gc0[] gc0VarArr = hc0Var2.f713a;
                r4 = gc0VarArr != null ? gc0VarArr[0] : null;
            }
        }
        if (r4 != gc0Var || java.lang.Thread.currentThread() == (m = m())) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(m);
    }
}
