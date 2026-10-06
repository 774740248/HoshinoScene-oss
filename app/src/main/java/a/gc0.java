package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gc0 implements java.lang.Runnable, java.lang.Comparable, a.c90 {
    private volatile java.lang.Object _heap;
    public long c;
    public int d = -1;

    public gc0(long j) {
        this.c = j;
    }

    public final a.yl1 a() {
        java.lang.Object obj = this._heap;
        if (obj instanceof a.yl1) {
            return (a.yl1) obj;
        }
        return null;
    }

    public final int b(long j, a.hc0 hc0Var, a.ic0 ic0Var) {
        synchronized (this) {
            if (this._heap == a.wv.o) {
                return 2;
            }
            synchronized (hc0Var) {
                try {
                    a.gc0[] gc0VarArr = hc0Var.f713a;
                    a.gc0 gc0Var = gc0VarArr != null ? gc0VarArr[0] : null;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.ic0.i;
                    ic0Var.getClass();
                    if (a.ic0.k.get(ic0Var) != 0) {
                        return 1;
                    }
                    if (gc0Var == null) {
                        hc0Var.c = j;
                    } else {
                        long j2 = gc0Var.c;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - hc0Var.c > 0) {
                            hc0Var.c = j;
                        }
                    }
                    long j3 = this.c;
                    long j4 = hc0Var.c;
                    if (j3 - j4 < 0) {
                        this.c = j4;
                    }
                    hc0Var.a(this);
                    return 0;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // a.c90
    public final void c() {
        synchronized (this) {
            try {
                java.lang.Object obj = this._heap;
                a.qm1 qm1Var = a.wv.o;
                if (obj == qm1Var) {
                    return;
                }
                a.hc0 hc0Var = obj instanceof a.hc0 ? (a.hc0) obj : null;
                if (hc0Var != null) {
                    synchronized (hc0Var) {
                        if (a() != null) {
                            hc0Var.b(this.d);
                        }
                    }
                }
                this._heap = qm1Var;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        long j = this.c - ((a.gc0) obj).c;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(a.hc0 hc0Var) {
        if (this._heap == a.wv.o) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = hc0Var;
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.c + ']';
    }
}
