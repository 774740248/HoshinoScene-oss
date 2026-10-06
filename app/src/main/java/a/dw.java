package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class dw {

    public dw() {
        this(null, false);
    }
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.dw.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f110a;

    public dw(java.lang.Throwable th, boolean z) {
        this.f110a = th;
        this._handled = z ? 1 : 0;
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.f110a + ']';
    }
}
