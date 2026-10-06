package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class mx0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f363a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.mx0.class, java.lang.Object.class, "_cur");
    private volatile java.lang.Object _cur = new a.ox0(8, false);

    public final boolean a(java.lang.Object obj) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f363a;
            a.ox0 ox0Var = (a.ox0) atomicReferenceFieldUpdater.get(this);
            int a2 = ox0Var.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.ox0 c = ox0Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f363a;
            a.ox0 ox0Var = (a.ox0) atomicReferenceFieldUpdater.get(this);
            if (ox0Var.b()) {
                return;
            }
            a.ox0 c = ox0Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
            }
        }
    }

    public final int c() {
        a.ox0 ox0Var = (a.ox0) f363a.get(this);
        ox0Var.getClass();
        long j = a.ox0.f.get(ox0Var);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final java.lang.Object d() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f363a;
            a.ox0 ox0Var = (a.ox0) atomicReferenceFieldUpdater.get(this);
            java.lang.Object d = ox0Var.d();
            if (d != a.ox0.g) {
                return d;
            }
            a.ox0 c = ox0Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ox0Var, c) && atomicReferenceFieldUpdater.get(this) == ox0Var) {
            }
        }
    }
}
