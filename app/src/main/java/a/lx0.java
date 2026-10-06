package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class lx0 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.lx0.class, java.lang.Object.class, "_next");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.lx0.class, java.lang.Object.class, "_prev");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.lx0.class, java.lang.Object.class, "_removedRef");
    private volatile java.lang.Object _next = this;
    private volatile java.lang.Object _prev = this;
    private volatile java.lang.Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((a.cb1) r6).f65a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.lx0 h() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a.lx0.d
            java.lang.Object r1 = r0.get(r9)
            a.lx0 r1 = (a.lx0) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a.lx0.c
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof a.l31
            if (r7 == 0) goto L38
            a.l31 r6 = (a.l31) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof a.cb1
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            a.cb1 r6 = (a.cb1) r6
            a.lx0 r6 = r6.f65a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            a.lx0 r3 = (a.lx0) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            a.wv.t(r6, r4)
            r4 = r6
            a.lx0 r4 = (a.lx0) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lx0.h():a.lx0");
    }

    public final void j(a.lx0 lx0Var) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            a.lx0 lx0Var2 = (a.lx0) atomicReferenceFieldUpdater.get(lx0Var);
            if (k() != lx0Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lx0Var, lx0Var2, this)) {
                if (atomicReferenceFieldUpdater.get(lx0Var) != lx0Var2) {
                    break;
                }
            }
            if (m()) {
                lx0Var.h();
                return;
            }
            return;
        }
    }

    public final java.lang.Object k() {
        while (true) {
            java.lang.Object obj = c.get(this);
            if (!(obj instanceof a.l31)) {
                return obj;
            }
            ((a.l31) obj).a(this);
        }
    }

    public final a.lx0 l() {
        a.lx0 lx0Var;
        java.lang.Object k = k();
        a.cb1 cb1Var = k instanceof a.cb1 ? (a.cb1) k : null;
        if (cb1Var != null && (lx0Var = cb1Var.f65a) != null) {
            return lx0Var;
        }
        a.wv.t(k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (a.lx0) k;
    }

    public boolean m() {
        return k() instanceof a.cb1;
    }

    public java.lang.String toString() {
        return new a.e81(this, a.b20.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + a.b20.b0(this);
    }
}
