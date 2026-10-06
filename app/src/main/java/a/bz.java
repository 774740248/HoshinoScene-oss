package a;

import android.util.Size;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bz implements java.util.concurrent.Executor, java.io.Closeable {
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater j = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(a.bz.class, "parkedWorkersStack");
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater k = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(a.bz.class, "controlState");
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater l = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.bz.class, "_isTerminated");
    public static final a.qm1 m = new a.qm1("NOT_IN_STACK");
    private volatile int _isTerminated;
    public final int c;
    private volatile long controlState;
    public final int d;
    public final long e;
    public final java.lang.String f;
    public final a.jq0 g;
    public final a.jq0 h;
    public final a.ib1 i;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r4v10, types: [a.jq0, a.mx0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [a.jq0, a.mx0] */
    public bz(int i, int i2, long j2, java.lang.String str) {
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = str;
        if (i < 1) {
            throw new java.lang.IllegalArgumentException(a.ai1.e("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new java.lang.IllegalArgumentException(a.ai1.e("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.g = (jq0) new a.mx0();
        this.h = (jq0) new a.mx0();
        this.i = new a.ib1((i + 1) * 2);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.i) {
            try {
                if (l.get(this) != 0) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = k;
                long j2 = atomicLongFieldUpdater.get(this);
                int i = (int) (j2 & 2097151);
                int i2 = i - ((int) ((j2 & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.c) {
                    return 0;
                }
                if (i >= this.d) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.i.b(i3) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                a.az azVar = new a.az(this, i3);
                this.i.c(i3, azVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                int i4 = i2 + 1;
                azVar.start();
                return i4;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(java.lang.Runnable runnable, a.fa0 fa0Var, boolean z) {
        a.lk1 mk1Var;
        int i;
        a.pk1.f.getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof a.lk1) {
            mk1Var = (a.lk1) runnable;
            mk1Var.c = nanoTime;
            mk1Var.d = fa0Var;
        } else {
            mk1Var = new a.mk1(runnable, nanoTime, fa0Var);
        }
        boolean z2 = false;
        boolean z3 = mk1Var.d.c == 1;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        a.az azVar = currentThread instanceof a.az ? (a.az) currentThread : null;
        if (azVar == null || !a.wv.e(azVar.j, this)) {
            azVar = null;
        }
        if (azVar != null && (i = azVar.e) != 5 && (mk1Var.d.c != 0 || i != 2)) {
            azVar.i = true;
            a.ku1 ku1Var = azVar.c;
            if (z) {
                mk1Var = ku1Var.a(mk1Var);
            } else {
                ku1Var.getClass();
                a.lk1 lk1Var = (a.lk1) a.ku1.b.getAndSet(ku1Var, mk1Var);
                mk1Var = lk1Var == null ? null : ku1Var.a(lk1Var);
            }
        }
        if (mk1Var != null) {
            if (!(mk1Var.d.c == 1 ? this.h.a(mk1Var) : this.g.a(mk1Var))) {
                throw new java.util.concurrent.RejectedExecutionException(a.ai1.j(new java.lang.StringBuilder(), this.f, " was terminated"));
            }
        }
        if (z && azVar != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (z2 || e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a.az azVar, int i, int i2) {
        while (true) {
            long j2 = j.get(this);
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    java.lang.Object c = azVar.c();
                    while (true) {
                        if (c == m) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        a.az azVar2 = (a.az) c;
                        int b = azVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = azVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && j.compareAndSet(this, j2, i3 | j3)) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = a.bz.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof a.az
            r3 = 0
            if (r1 == 0) goto L18
            a.az r0 = (a.az) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            a.bz r1 = r0.j
            boolean r1 = a.wv.e(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            a.ib1 r1 = r8.i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = a.bz.k     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            a.ib1 r5 = r8.i
            java.lang.Object r5 = r5.b(r1)
            a.wv.s(r5)
            a.az r5 = (a.az) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            a.ku1 r5 = r5.c
            a.jq0 r6 = r8.h
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = a.ku1.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            a.lk1 r7 = (a.lk1) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            a.lk1 r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            a.jq0 r1 = r8.h
            r1.b()
            a.jq0 r1 = r8.g
            r1.b()
        L81:
            if (r0 == 0) goto L89
            a.lk1 r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            a.jq0 r1 = r8.g
            a.lk1 r1 = r1.d()
            a.lk1 r1 = (a.lk1) r1
            if (r1 != 0) goto Lb0
            a.jq0 r1 = r8.h
            a.lk1 r1 = r1.d()
            a.lk1 r1 = (a.lk1) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a.bz.j
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a.bz.k
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bz.close():void");
    }

    public final boolean d(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.c;
        if (i < i2) {
            int a2 = a();
            if (a2 == 1 && i2 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        a.qm1 qm1Var;
        int i;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long j2 = atomicLongFieldUpdater.get(this);
            a.az azVar = (a.az) this.i.b((int) (2097151 & j2));
            if (azVar == null) {
                azVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                java.lang.Object c = azVar.c();
                while (true) {
                    qm1Var = m;
                    if (c == qm1Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    a.az azVar2 = (a.az) c;
                    i = azVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = azVar2.c();
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i)) {
                    azVar.g(qm1Var);
                }
            }
            if (azVar == null) {
                return false;
            }
            if (a.az.k.compareAndSet(azVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(azVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        b(runnable, a.pk1.g, false);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.ib1 ib1Var = this.i;
        int a2 = ib1Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a2; i6++) {
            a.az azVar = (a.az) ib1Var.b(i6);
            if (azVar != null) {
                a.ku1 ku1Var = azVar.c;
                ku1Var.getClass();
                int i7 = a.ku1.b.get(ku1Var) != null ? (a.ku1.c.get(ku1Var) - a.ku1.d.get(ku1Var)) + 1 : a.ku1.c.get(ku1Var) - a.ku1.d.get(ku1Var);
                int B = a.ai1.B(azVar.e);
                if (B == 0) {
                    i++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (B == 1) {
                    i2++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (B == 2) {
                    i3++;
                } else if (B == 3) {
                    i4++;
                    if (i7 > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (B == 4) {
                    i5++;
                }
            }
        }
        long j2 = k.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.f);
        sb4.append('@');
        sb4.append(a.b20.b0(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.c;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.d);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.g.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.h.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
