package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xs0 extends a.pt0 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater h = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.xs0.class, "_invoked");
    private volatile int _invoked;
    public final a.bp0 g;

    public xs0(a.rt0 rt0Var) {
        this.g = rt0Var;
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        o((java.lang.Throwable) obj);
        return a.no1.f387a;
    }

    @Override // a.rt0
    public final void o(java.lang.Throwable th) {
        if (h.compareAndSet(this, 0, 1)) {
            this.g.i(th);
        }
    }
}
