package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class at extends a.y80 implements a.zs, a.ez {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater h = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.at.class, "_decisionAndIndex");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.at.class, java.lang.Object.class, "_state");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.at.class, java.lang.Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;
    public final a.ey f;
    public final a.ty g;

    public at(a.ey eyVar) {
        super(1);
        this.f = eyVar;
        this.g = eyVar.h();
        this._decisionAndIndex = 536870911;
        this._state = a.b3.c;
    }

    public static void t(a.ws wsVar, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + wsVar + ", already has " + obj).toString());
    }

    public static void w(a.at atVar, java.lang.Object obj, int i2) {
        atVar.getClass();
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(atVar);
            if (!(obj2 instanceof a.f21)) {
                if (obj2 instanceof a.dt) {
                    a.dt dtVar = (a.dt) obj2;
                    dtVar.getClass();
                    if (a.dt.c.compareAndSet(dtVar, 0, 1)) {
                        return;
                    }
                }
                throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            java.lang.Object y = y((a.f21) obj2, obj, i2, null);
            while (!atomicReferenceFieldUpdater.compareAndSet(atVar, obj2, y)) {
                if (atomicReferenceFieldUpdater.get(atVar) != obj2) {
                    break;
                }
            }
            if (!atVar.s()) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(atVar);
                if (c90Var != null) {
                    c90Var.c();
                    atomicReferenceFieldUpdater2.set(atVar, a.e21.c);
                }
            }
            atVar.m(i2);
            return;
        }
    }

    public static java.lang.Object y(a.f21 f21Var, java.lang.Object obj, int i2, a.bp0 bp0Var) {
        if ((obj instanceof a.dw) || !a.wv.E0(i2)) {
            return obj;
        }
        if (bp0Var != null || (f21Var instanceof a.ws)) {
            return new a.bw(obj, f21Var instanceof a.ws ? (a.ws) f21Var : null, bp0Var, (java.util.concurrent.CancellationException) null, 16);
        }
        return obj;
    }

    @Override // a.y80
    public final void a(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof a.f21) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof a.dw) {
                return;
            }
            if (!(obj2 instanceof a.bw)) {
                a.bw bwVar = new a.bw(obj2, (a.ws) null, (a.bp0) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bwVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            a.bw bwVar2 = (a.bw) obj2;
            if (!(!(bwVar2.e != null))) {
                throw new java.lang.IllegalStateException("Must be called at most once".toString());
            }
            a.bw a2 = a.bw.a(bwVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            a.ws wsVar = bwVar2.b;
            if (wsVar != null) {
                i(wsVar, cancellationException);
            }
            a.bp0 bp0Var = bwVar2.c;
            if (bp0Var != null) {
                k(bp0Var, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // a.y80
    public final a.ey b() {
        return this.f;
    }

    @Override // a.y80
    public final java.lang.Throwable c(java.lang.Object obj) {
        java.lang.Throwable c = super.c(obj);
        if (c != null) {
            return c;
        }
        return null;
    }

    @Override // a.y80
    public final java.lang.Object d(java.lang.Object obj) {
        return obj instanceof a.bw ? ((a.bw) obj).f55a : obj;
    }

    @Override // a.ez
    public final a.ez f() {
        a.ey eyVar = this.f;
        if (eyVar instanceof a.ez) {
            return (a.ez) eyVar;
        }
        return null;
    }

    @Override // a.y80
    public final java.lang.Object g() {
        return i.get(this);
    }

    @Override // a.ey
    public final a.ty h() {
        return this.g;
    }

    public final void i(a.ws wsVar, java.lang.Throwable th) {
        try {
            wsVar.a(th);
        } catch (java.lang.Throwable th2) {
            a.wv.v0(this.g, new java.lang.RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        java.lang.Throwable a2 = a.bc1.a(obj);
        if (a2 != null) {
            obj = new a.dw(a2, false);
        }
        w(this, obj, this.e);
    }

    public final void k(a.bp0 bp0Var, java.lang.Throwable th) {
        try {
            bp0Var.i(th);
        } catch (java.lang.Throwable th2) {
            a.wv.v0(this.g, new java.lang.RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(java.lang.Throwable th) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof a.f21) {
                a.dt dtVar = new a.dt(this, th, obj instanceof a.ws);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dtVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((a.f21) obj) instanceof a.ws) {
                    i((a.ws) obj, th);
                }
                if (!s()) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                    a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(this);
                    if (c90Var != null) {
                        c90Var.c();
                        atomicReferenceFieldUpdater2.set(this, a.e21.c);
                    }
                }
                m(this.e);
                return;
            }
            return;
        }
    }

    public final void m(int i2) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
                boolean z = i2 == 4;
                a.ey eyVar = this.f;
                if (z || !(eyVar instanceof a.w80) || a.wv.E0(i2) != a.wv.E0(this.e)) {
                    a.wv.s1(this, eyVar, z);
                    return;
                }
                a.xy xyVar = ((a.w80) eyVar).f;
                a.ty h2 = eyVar.h();
                if (xyVar.j()) {
                    xyVar.h(h2, this);
                    return;
                }
                a.jc0 a2 = a.xl1.a();
                if (a2.e >= 4294967296L) {
                    a.hp hpVar = a2.g;
                    if (hpVar == null) {
                        hpVar = new a.hp();
                        a2.g = hpVar;
                    }
                    hpVar.addLast(this);
                    return;
                }
                a2.n(true);
                try {
                    a.wv.s1(this, eyVar, true);
                    do {
                    } while (a2.p());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public java.lang.Throwable n(a.wt0 wt0Var) {
        return wt0Var.w();
    }

    public final java.lang.Object o() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean s = s();
        do {
            atomicIntegerFieldUpdater = h;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended".toString());
                }
                if (s) {
                    v();
                }
                java.lang.Object obj = i.get(this);
                if (obj instanceof a.dw) {
                    throw ((a.dw) obj).f110a;
                }
                if (a.wv.E0(this.e)) {
                    a.nt0 nt0Var = (a.nt0) this.g.g(a.gy.f);
                    if (nt0Var != null && !nt0Var.a()) {
                        java.util.concurrent.CancellationException w = ((a.wt0) nt0Var).w();
                        a(obj, w);
                        throw w;
                    }
                }
                return d(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((a.c90) j.get(this)) == null) {
            q();
        }
        if (s) {
            v();
        }
        return a.dz.c;
    }

    public final void p() {
        a.c90 q = q();
        if (q != null && (!(i.get(this) instanceof a.f21))) {
            q.c();
            j.set(this, a.e21.c);
        }
    }

    public final a.c90 q() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a.nt0 nt0Var = (a.nt0) this.g.g(a.gy.f);
        if (nt0Var == null) {
            return null;
        }
        a.c90 C0 = a.wv.C0(nt0Var, true, new a.nu(this), 2);
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, C0)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return C0;
    }

    public final void r(a.bp0 bp0Var) {
        a.ws d90Var = bp0Var instanceof a.ws ? (a.ws) bp0Var : new a.d90(1, bp0Var);
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof a.b3) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d90Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof a.ws) {
                t(d90Var, obj);
                throw null;
            }
            boolean z = obj instanceof a.dw;
            if (z) {
                a.dw dwVar = (a.dw) obj;
                dwVar.getClass();
                if (!a.dw.b.compareAndSet(dwVar, 0, 1)) {
                    t(d90Var, obj);
                    throw null;
                }
                if (obj instanceof a.dt) {
                    if (!z) {
                        dwVar = null;
                    }
                    i(d90Var, dwVar != null ? dwVar.f110a : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof a.bw)) {
                a.bw bwVar = new a.bw(obj, d90Var, (a.bp0) null, (java.util.concurrent.CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bwVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            a.bw bwVar2 = (a.bw) obj;
            if (bwVar2.b != null) {
                t(d90Var, obj);
                throw null;
            }
            java.lang.Throwable th = bwVar2.e;
            if (th != null) {
                i(d90Var, th);
                return;
            }
            a.bw a2 = a.bw.a(bwVar2, d90Var, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean s() {
        if (this.e == 2) {
            a.ey eyVar = this.f;
            a.wv.t(eyVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (a.w80.j.get((a.w80) eyVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(u());
        sb.append('(');
        sb.append(a.b20.u1(this.f));
        sb.append("){");
        java.lang.Object obj = i.get(this);
        sb.append(obj instanceof a.f21 ? "Active" : obj instanceof a.dt ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a.b20.b0(this));
        return sb.toString();
    }

    public java.lang.String u() {
        return "CancellableContinuation";
    }

    public final void v() {
        a.ey eyVar = this.f;
        java.lang.Throwable th = null;
        a.w80 w80Var = eyVar instanceof a.w80 ? (a.w80) eyVar : null;
        if (w80Var == null) {
            return;
        }
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.w80.j;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(w80Var);
            a.qm1 qm1Var = a.wv.n;
            if (obj != qm1Var) {
                if (!(obj instanceof java.lang.Throwable)) {
                    throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(w80Var, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(w80Var) != obj) {
                        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                th = (java.lang.Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(w80Var, qm1Var, this)) {
                if (atomicReferenceFieldUpdater.get(w80Var) != qm1Var) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
        a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(this);
        if (c90Var != null) {
            c90Var.c();
            atomicReferenceFieldUpdater2.set(this, a.e21.c);
        }
        l(th);
    }

    public final void x(a.xy xyVar) {
        a.no1 no1Var = a.no1.f387a;
        a.ey eyVar = this.f;
        a.w80 w80Var = eyVar instanceof a.w80 ? (a.w80) eyVar : null;
        w(this, no1Var, (w80Var != null ? w80Var.f : null) == xyVar ? 4 : this.e);
    }
}
