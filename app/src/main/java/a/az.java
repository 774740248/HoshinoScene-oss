package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class az extends java.lang.Thread {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater k = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.az.class, "workerCtl");
    public final a.ku1 c;
    public final a.ma1 d;
    public int e;
    public long f;
    public long g;
    public int h;
    public boolean i;
    private volatile int indexInArray;
    public final /* synthetic */ a.bz j;
    private volatile java.lang.Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, a.ma1] */
    public az(a.bz bzVar, int i) {
        this.j = bzVar;
        setDaemon(true);
        this.c = new a.ku1();
        this.d = new a.ma1();
        this.e = 4;
        this.nextParkedWorker = a.bz.m;
        a.z81.c.getClass();
        this.h = a.z81.d.a();
        f(i);
    }

    public final a.lk1 a(boolean z) {
        a.lk1 e;
        a.lk1 e2;
        long j;
        int i = this.e;
        a.bz bzVar = this.j;
        a.lk1 lk1Var = null;
        a.ku1 ku1Var = this.c;
        if (i != 1) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = a.bz.k;
            do {
                j = atomicLongFieldUpdater.get(bzVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ku1Var.getClass();
                    loop1: while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.ku1.b;
                        a.lk1 lk1Var2 = (a.lk1) atomicReferenceFieldUpdater.get(ku1Var);
                        if (lk1Var2 == null || lk1Var2.d.c != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(ku1Var, lk1Var2, null)) {
                            if (atomicReferenceFieldUpdater.get(ku1Var) != lk1Var2) {
                                break;
                            }
                        }
                        lk1Var = lk1Var2;
                    }
                    int i2 = a.ku1.d.get(ku1Var);
                    int i3 = a.ku1.c.get(ku1Var);
                    while (true) {
                        if (i2 == i3 || a.ku1.e.get(ku1Var) == 0) {
                            break;
                        }
                        i3--;
                        a.lk1 c = ku1Var.c(i3, true);
                        if (c != null) {
                            lk1Var = c;
                            break;
                        }
                    }
                    if (lk1Var != null) {
                        return lk1Var;
                    }
                    a.lk1 lk1Var3 = (a.lk1) bzVar.h.d();
                    return lk1Var3 == null ? i(1) : lk1Var3;
                }
            } while (!a.bz.k.compareAndSet(bzVar, j, j - 4398046511104L));
            this.e = 1;
        }
        if (z) {
            boolean z2 = d(bzVar.c * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            ku1Var.getClass();
            a.lk1 lk1Var4 = (a.lk1) a.ku1.b.getAndSet(ku1Var, null);
            if (lk1Var4 == null) {
                lk1Var4 = ku1Var.b();
            }
            if (lk1Var4 != null) {
                return lk1Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            a.lk1 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final java.lang.Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final a.lk1 e() {
        int d = d(2);
        a.bz bzVar = this.j;
        if (d == 0) {
            a.lk1 lk1Var = (a.lk1) bzVar.g.d();
            return lk1Var != null ? lk1Var : (a.lk1) bzVar.h.d();
        }
        a.lk1 lk1Var2 = (a.lk1) bzVar.h.d();
        return lk1Var2 != null ? lk1Var2 : (a.lk1) bzVar.g.d();
    }

    public final void f(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.j.f);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : java.lang.String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            a.bz.k.addAndGet(this.j, 4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.lk1 i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.az.i(int):a.lk1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.az.run():void");
    }
}
