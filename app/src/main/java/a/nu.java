package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nu extends a.pt0 {
    public final a.at g;

    public nu(a.at atVar) {
        this.g = atVar;
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        o((java.lang.Throwable) obj);
        return a.no1.f387a;
    }

    @Override // a.rt0
    public final void o(java.lang.Throwable th) {
        a.wt0 n = n();
        a.at atVar = this.g;
        java.lang.Throwable n2 = atVar.n(n);
        if (atVar.s()) {
            a.ey eyVar = atVar.f;
            a.wv.t(eyVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            a.w80 w80Var = (a.w80) eyVar;
            loop0: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.w80.j;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(w80Var);
                a.qm1 qm1Var = a.wv.n;
                if (!a.wv.e(obj, qm1Var)) {
                    if (obj instanceof java.lang.Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(w80Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(w80Var) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(w80Var, qm1Var, n2)) {
                    if (atomicReferenceFieldUpdater.get(w80Var) != qm1Var) {
                        break;
                    }
                }
                return;
            }
        }
        atVar.l(n2);
        if (atVar.s()) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.at.j;
        a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(atVar);
        if (c90Var == null) {
            return;
        }
        c90Var.c();
        atomicReferenceFieldUpdater2.set(atVar, a.e21.c);
    }
}
