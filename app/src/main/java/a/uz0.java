package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uz0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f615a;
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.HashMap c = new java.util.HashMap();

    public uz0(java.lang.Runnable runnable) {
        this.f615a = runnable;
    }

    public final void a() {
        this.b.remove((java.lang.Object) null);
        a.tz0 tz0Var = (a.tz0) this.c.remove(null);
        if (tz0Var != null) {
            tz0Var.f572a.b(tz0Var.b);
            tz0Var.b = null;
        }
        this.f615a.run();
    }
}
