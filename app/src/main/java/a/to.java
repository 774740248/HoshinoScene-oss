package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class to implements java.util.concurrent.Executor {
    public final java.lang.Object c = new java.lang.Object();
    public final java.util.ArrayDeque d = new java.util.ArrayDeque();
    public final java.util.concurrent.Executor e;
    public java.lang.Runnable f;

    public to(a.uo uoVar) {
        this.e = uoVar;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.d.poll();
                this.f = runnable;
                if (runnable != null) {
                    this.e.execute(runnable);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.c) {
            try {
                this.d.add(new a.so(this, 0, runnable));
                if (this.f == null) {
                    a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
