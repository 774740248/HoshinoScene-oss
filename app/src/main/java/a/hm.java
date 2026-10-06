package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class hm {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f211a;
    public final java.lang.Object b;

    public hm(a.hi1 hi1Var, a.ct ctVar) {
        this.f211a = hi1Var;
        this.b = ctVar;
    }

    public final void a() {
        java.lang.Object obj = this.f211a;
        if (((android.content.BroadcastReceiver) obj) != null) {
            try {
                ((a.km) this.b).m.unregisterReceiver((android.content.BroadcastReceiver) obj);
            } catch (java.lang.IllegalArgumentException unused) {
            }
            this.f211a = null;
        }
    }

    public final void b() {
        a.hi1 hi1Var = (a.hi1) this.f211a;
        a.ct ctVar = (a.ct) this.b;
        java.util.HashSet hashSet = hi1Var.e;
        if (hashSet.remove(ctVar) && hashSet.isEmpty()) {
            hi1Var.b();
        }
    }

    public abstract android.content.IntentFilter c();

    public abstract int d();

    public final boolean e() {
        int c = a.ii1.c(((a.hi1) this.f211a).c.H);
        int i = ((a.hi1) this.f211a).f206a;
        return c == i || !(c == 2 || i == 2);
    }

    public abstract void f();

    public final void g() {
        a();
        android.content.IntentFilter c = c();
        if (c == null || c.countActions() == 0) {
            return;
        }
        if (((android.content.BroadcastReceiver) this.f211a) == null) {
            this.f211a = new a.gm(0, this);
        }
        ((a.km) this.b).m.registerReceiver((android.content.BroadcastReceiver) this.f211a, c);
    }

    public hm(a.km kmVar) {
        this.b = kmVar;
    }
}
