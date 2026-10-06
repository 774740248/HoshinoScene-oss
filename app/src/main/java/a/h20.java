package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h20 extends a.ic0 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;
    public static final a.h20 l;
    public static final long m;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.ic0, a.h20, a.jc0] */
    static {
        java.lang.Long l2;
        a.ic0 ic0Var = new a.ic0();
        l = (h20) ic0Var;
        ic0Var.n(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l2 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l2 = 1000L;
        }
        m = timeUnit.toNanos(l2.longValue());
    }

    @Override // a.ic0, a.f30
    public final a.c90 b(long j, java.lang.Runnable runnable, a.ty tyVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return a.e21.c;
        }
        long nanoTime = java.lang.System.nanoTime();
        a.fc0 fc0Var = new a.fc0(runnable, j2 + nanoTime);
        v(nanoTime, fc0Var);
        return fc0Var;
    }

    @Override // a.jc0
    public final java.lang.Thread m() {
        java.lang.Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // a.jc0
    public final void q(long j, a.gc0 gc0Var) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // a.ic0, a.jc0
    public final void r() {
        debugStatus = 4;
        super.r();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u;
        a.xl1.f690a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        java.lang.Thread.interrupted();
                        long o = o();
                        if (o == Long.MAX_VALUE) {
                            long nanoTime = java.lang.System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = m + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                w();
                                if (u()) {
                                    return;
                                }
                                m();
                                return;
                            }
                            if (o > j2) {
                                o = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (o > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                break;
                            } else {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, o);
                            }
                        }
                    }
                    if (u) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                w();
                if (u()) {
                    return;
                }
                m();
            }
        } finally {
            _thread = null;
            w();
            if (!u()) {
                m();
            }
        }
    }

    @Override // a.ic0
    public final void s(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.s(runnable);
    }

    public final synchronized void w() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            a.ic0.i.set(this, null);
            a.ic0.j.set(this, null);
            notifyAll();
        }
    }
}
