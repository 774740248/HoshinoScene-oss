package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ut0 implements a.as0 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.ut0.class, "_isCompleting");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.ut0.class, java.lang.Object.class, "_rootCause");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.ut0.class, java.lang.Object.class, "_exceptionsHolder");
    private volatile java.lang.Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile java.lang.Object _rootCause;
    public final a.d21 c;

    public ut0(a.d21 d21Var, java.lang.Throwable th) {
        this.c = d21Var;
        this._rootCause = th;
    }

    @Override // a.as0
    public final boolean a() {
        return c() == null;
    }

    public final void b(java.lang.Throwable th) {
        java.lang.Throwable c = c();
        if (c == null) {
            e.set(this, th);
            return;
        }
        if (th == c) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof java.util.ArrayList) {
                ((java.util.ArrayList) obj).add(th);
                return;
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) e.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return d.get(this) != 0;
    }

    @Override // a.as0
    public final a.d21 f() {
        return this.c;
    }

    public final java.util.ArrayList g(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !a.wv.e(th, c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, a.wv.u);
        return arrayList;
    }

    public final java.lang.String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f.get(this) + ", list=" + this.c + ']';
    }
}
