package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mk1 extends a.lk1 {
    public final java.lang.Runnable e;

    public mk1(java.lang.Runnable runnable, long j, a.fa0 fa0Var) {
        super(j, fa0Var);
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.run();
        } finally {
            this.d.getClass();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.e;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a.b20.b0(runnable));
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
