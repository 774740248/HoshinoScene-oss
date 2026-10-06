package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ji1 {

    public ji1() {
        this(null);
    }

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f255a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public boolean d = false;
    public boolean e = false;

    public ji1(android.view.ViewGroup viewGroup) {
        this.f255a = viewGroup;
    }

    public static a.ji1 f(android.view.ViewGroup viewGroup, a.sl0 sl0Var) {
        java.lang.Object tag = viewGroup.getTag(2131363172);
        if (tag instanceof a.ji1) {
            return (a.ji1) tag;
        }
        sl0Var.getClass();
        a.ji1 ji1Var = new a.ji1(viewGroup);
        viewGroup.setTag(2131363172, ji1Var);
        return ji1Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a.ct, java.lang.Object] */
    public final void a(int i, int i2, androidx.fragment.app.a aVar) {
        synchronized (this.b) {
            try {
                a.ct obj = new a.ct();
                a.hi1 d = d(aVar.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                a.hi1 hi1Var = new a.hi1(i, i2, aVar, obj);
                this.b.add(hi1Var);
                hi1Var.d.add(new a.gi1(this, hi1Var, 0));
                hi1Var.d.add(new a.gi1(this, hi1Var, 1));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(java.util.ArrayList arrayList, boolean z);

    public final void c() {
        if (this.e) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f255a;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (!a.up1.b(viewGroup)) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(this.c);
                    this.c.clear();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.hi1 hi1Var = (a.hi1) it.next();
                        if (android.util.Log.isLoggable("FragmentManager", 2)) {
                            android.util.Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + hi1Var);
                        }
                        hi1Var.a();
                        if (!hi1Var.g) {
                            this.c.add(hi1Var);
                        }
                    }
                    h();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    java.util.Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((a.hi1) it2.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final a.hi1 d(a.gk0 gk0Var) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a.hi1 hi1Var = (a.hi1) it.next();
            if (hi1Var.c.equals(gk0Var) && !hi1Var.f) {
                return hi1Var;
            }
        }
        return null;
    }

    public final void e() {
        java.lang.String str;
        java.lang.String str2;
        android.view.ViewGroup viewGroup = this.f255a;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean b = a.up1.b(viewGroup);
        synchronized (this.b) {
            try {
                h();
                java.util.Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((a.hi1) it.next()).d();
                }
                java.util.Iterator it2 = new java.util.ArrayList(this.c).iterator();
                while (it2.hasNext()) {
                    a.hi1 hi1Var = (a.hi1) it2.next();
                    if (android.util.Log.isLoggable("FragmentManager", 2)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (b) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f255a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(hi1Var);
                        android.util.Log.v("FragmentManager", sb.toString());
                    }
                    hi1Var.a();
                }
                java.util.Iterator it3 = new java.util.ArrayList(this.b).iterator();
                while (it3.hasNext()) {
                    a.hi1 hi1Var2 = (a.hi1) it3.next();
                    if (android.util.Log.isLoggable("FragmentManager", 2)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (b) {
                            str = "";
                        } else {
                            str = "Container " + this.f255a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(hi1Var2);
                        android.util.Log.v("FragmentManager", sb2.toString());
                    }
                    hi1Var2.a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            try {
                h();
                this.e = false;
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    a.hi1 hi1Var = (a.hi1) this.b.get(size);
                    int c = a.ii1.c(hi1Var.c.H);
                    if (hi1Var.f206a == 2 && c != 2) {
                        hi1Var.c.getClass();
                        this.e = false;
                        break;
                    }
                    size--;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a.hi1 hi1Var = (a.hi1) it.next();
            if (hi1Var.b == 2) {
                hi1Var.c(a.ii1.b(hi1Var.c.M().getVisibility()), 1);
            }
        }
    }
}
