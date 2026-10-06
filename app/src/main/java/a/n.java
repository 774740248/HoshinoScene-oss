package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n extends a.b20 {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater E;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater F;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater G;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater H;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater I;

    public n(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.E = atomicReferenceFieldUpdater;
        this.F = atomicReferenceFieldUpdater2;
        this.G = atomicReferenceFieldUpdater3;
        this.H = atomicReferenceFieldUpdater4;
        this.I = atomicReferenceFieldUpdater5;
    }

    @Override // a.b20
    public final void T0(a.p pVar, a.p pVar2) {
        this.F.lazySet(pVar, pVar2);
    }

    @Override // a.b20
    public final void U0(a.p pVar, java.lang.Thread thread) {
        this.E.lazySet(pVar, thread);
    }

    @Override // a.b20
    public final boolean o(a.q qVar, a.m mVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a.m mVar2 = a.m.b;
        do {
            atomicReferenceFieldUpdater = this.H;
            if (atomicReferenceFieldUpdater.compareAndSet(qVar, mVar, mVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qVar) == mVar);
        return false;
    }

    @Override // a.b20
    public final boolean p(a.q qVar, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.I;
            if (atomicReferenceFieldUpdater.compareAndSet(qVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qVar) == obj);
        return false;
    }

    @Override // a.b20
    public final boolean q(a.q qVar, a.p pVar, a.p pVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.G;
            if (atomicReferenceFieldUpdater.compareAndSet(qVar, pVar, pVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(qVar) == pVar);
        return false;
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: n.U");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: n.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: n.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: n.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: n.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: n.J0");
    }
}
