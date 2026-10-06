package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tw implements a.qg1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f568a;

    public tw(a.rq1 rq1Var) {
        this.f568a = new java.util.concurrent.atomic.AtomicReference(rq1Var);
    }

    @Override // a.qg1
    public final java.util.Iterator iterator() {
        a.qg1 qg1Var = (a.qg1) this.f568a.getAndSet(null);
        if (qg1Var != null) {
            return qg1Var.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
