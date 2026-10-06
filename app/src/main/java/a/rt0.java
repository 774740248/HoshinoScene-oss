package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class rt0 extends a.lx0 implements a.c90, a.as0, a.bp0 {
    public a.wt0 f;

    @Override // a.as0
    public final boolean a() {
        return true;
    }

    @Override // a.c90
    public final void c() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        a.wt0 n = n();
        while (true) {
            java.lang.Object C = n.C();
            if (!(C instanceof a.rt0)) {
                if (!(C instanceof a.as0) || ((a.as0) C).f() == null) {
                    return;
                }
                while (true) {
                    java.lang.Object k = k();
                    if (k instanceof a.cb1) {
                        a.lx0 lx0Var = ((a.cb1) k).f65a;
                        return;
                    }
                    if (k == this) {
                        return;
                    }
                    a.wv.t(k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    a.lx0 lx0Var2 = (a.lx0) k;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a.lx0.e;
                    a.cb1 cb1Var = (a.cb1) atomicReferenceFieldUpdater3.get(lx0Var2);
                    if (cb1Var == null) {
                        cb1Var = new a.cb1(lx0Var2);
                        atomicReferenceFieldUpdater3.lazySet(lx0Var2, cb1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = a.lx0.c;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k, cb1Var)) {
                            lx0Var2.h();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k);
                }
            } else {
                if (C != this) {
                    return;
                }
                a.mb0 mb0Var = a.wv.w;
                do {
                    atomicReferenceFieldUpdater2 = a.wt0.c;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n, C, mb0Var)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n) == C);
            }
        }
    }

    @Override // a.as0
    public final a.d21 f() {
        return null;
    }

    public final a.wt0 n() {
        a.wt0 wt0Var = this.f;
        if (wt0Var != null) {
            return wt0Var;
        }
        a.wv.M1("job");
        throw null;
    }

    public abstract void o(java.lang.Throwable th);

    @Override // a.lx0
    public final java.lang.String toString() {
        return getClass().getSimpleName() + '@' + a.b20.b0(this) + "[job@" + a.b20.b0(n()) + ']';
    }
}
