package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ku1 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.ku1.class, java.lang.Object.class, "lastScheduledTask");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.ku1.class, "producerIndex");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.ku1.class, "consumerIndex");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.ku1.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f304a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile java.lang.Object lastScheduledTask;
    private volatile int producerIndex;

    public final a.lk1 a(a.lk1 lk1Var) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return lk1Var;
        }
        if (lk1Var.d.c == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f304a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, lk1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final a.lk1 b() {
        a.lk1 lk1Var;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (lk1Var = (a.lk1) this.f304a.getAndSet(i2, null)) != null) {
                if (lk1Var.d.c == 1) {
                    e.decrementAndGet(this);
                }
                return lk1Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.get(r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r7 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        a.ku1.e.decrementAndGet(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r1.d.c == 1) == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0.compareAndSet(r6, r1, null) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.lk1 c(int r6, boolean r7) {
        /*
            r5 = this;
            r6 = r6 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f304a
            java.lang.Object r1 = r0.get(r6)
            a.lk1 r1 = (a.lk1) r1
            r2 = 0
            if (r1 == 0) goto L2c
            a.fa0 r3 = r1.d
            int r3 = r3.c
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 != r7) goto L2c
        L18:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L26
            if (r7 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = a.ku1.e
            r6.decrementAndGet(r5)
        L25:
            return r1
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L18
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ku1.c(int, boolean):a.lk1");
    }
}
