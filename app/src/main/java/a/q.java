package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class q implements java.util.concurrent.Future {
    public static final boolean d = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final java.util.logging.Logger e = java.util.logging.Logger.getLogger(a.q.class.getName());
    public static final a.b20 f;
    public static final java.lang.Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f456a;
    public volatile a.m b;
    public volatile a.p c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.b20] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    static {
        java.lang.Object r2;
        java.lang.Throwable th = null;
        /* TODO: jadx type unresolved, defaulted to Object */
        try {
            r2 = new a.n(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.p.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.p.class, a.p.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.q.class, a.p.class, "c"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.q.class, a.m.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.q.class, java.lang.Object.class, "a"));
        } catch (java.lang.Throwable th1) {
            th = th1;
            r2 = new a.o();
        }
        f = (a.b20) (r2);
        if (th != null) {
            e.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new java.lang.Object();
    }

    public static void b(a.q qVar) {
        a.p pVar;
        a.m mVar;
        do {
            pVar = qVar.c;
        } while (!f.q(qVar, pVar, a.p.c));
        while (pVar != null) {
            java.lang.Thread thread = pVar.f427a;
            if (thread != null) {
                pVar.f427a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            pVar = pVar.b;
        }
        do {
            mVar = qVar.b;
        } while (!f.o(qVar, mVar));
        a.m mVar2 = null;
        while (mVar != null) {
            a.m mVar3 = mVar.f335a;
            mVar.f335a = mVar2;
            mVar2 = mVar;
            mVar = mVar3;
        }
        while (mVar2 != null) {
            mVar2 = mVar2.f335a;
            try {
                throw null;
                break;
            } catch (java.lang.RuntimeException e2) {
                e.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable null with executor null", (java.lang.Throwable) e2);
            }
        }
    }

    public static java.lang.Object c(java.lang.Object obj) {
        if (obj instanceof a.k) {
            java.lang.Throwable th = ((a.k) obj).f277a;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a.l) {
            ((a.l) obj).getClass();
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public final void a(java.lang.StringBuilder sb) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                } catch (java.lang.Throwable th) {
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (java.lang.RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (java.util.concurrent.ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : java.lang.String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        java.lang.Object obj = this.f456a;
        if (obj == null) {
            if (f.p(this, obj, d ? new a.k(new java.util.concurrent.CancellationException("Future.cancel() was called."), z) : z ? a.k.b : a.k.c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void d(a.p pVar) {
        pVar.f427a = null;
        while (true) {
            a.p pVar2 = this.c;
            if (pVar2 == a.p.c) {
                return;
            }
            a.p pVar3 = null;
            while (pVar2 != null) {
                a.p pVar4 = pVar2.b;
                if (pVar2.f427a != null) {
                    pVar3 = pVar2;
                } else if (pVar3 != null) {
                    pVar3.b = pVar4;
                    if (pVar3.f427a == null) {
                        break;
                    }
                } else if (!f.q(this, pVar2, pVar4)) {
                    break;
                }
                pVar2 = pVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009f -> B:33:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f456a instanceof a.k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f456a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f456a instanceof a.k) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof java.util.concurrent.ScheduledFuture) {
                    str = "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (java.lang.RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f456a;
        if ((obj2 != null) & true) {
            return c(obj2);
        }
        a.p pVar = this.c;
        a.p pVar2 = a.p.c;
        if (pVar != pVar2) {
            a.p pVar3 = new a.p();
            do {
                a.b20 b20Var = f;
                b20Var.T0(pVar3, pVar);
                if (b20Var.q(this, pVar, pVar3)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            d(pVar3);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f456a;
                    } while (!((obj != null) & true));
                    return c(obj);
                }
                pVar = this.c;
            } while (pVar != pVar2);
        }
        return c(this.f456a);
    }
}
