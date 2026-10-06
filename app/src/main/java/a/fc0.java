package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fc0 extends a.gc0 {
    public final java.lang.Runnable e;

    public fc0(java.lang.Runnable runnable, long j) {
        super(j);
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.run();
    }

    @Override // a.gc0
    public final java.lang.String toString() {
        return super.toString() + this.e;
    }
}
