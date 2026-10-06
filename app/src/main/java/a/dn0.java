package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dn0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f101a = new java.util.ArrayList();
    public final java.util.HashMap b = new java.util.HashMap();
    public a.dm0 c;

    public final void a(a.gk0 gk0Var) {
        if (this.f101a.contains(gk0Var)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + gk0Var);
        }
        synchronized (this.f101a) {
            this.f101a.add(gk0Var);
        }
        gk0Var.n = true;
    }

    public final a.gk0 b(java.lang.String str) {
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.b.get(str);
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public final a.gk0 c(java.lang.String str) {
        for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) this.b.values()) {
            if (aVar != null) {
                a.gk0 gk0Var = aVar.c;
                if (!str.equals(gk0Var.h)) {
                    gk0Var = gk0Var.w.c.c(str);
                }
                if (gk0Var != null) {
                    return gk0Var;
                }
            }
        }
        return null;
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) this.b.values()) {
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.a aVar : (Iterable<androidx.fragment.app.a>) this.b.values()) {
            if (aVar != null) {
                arrayList.add(aVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList;
        if (this.f101a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f101a) {
            arrayList = new java.util.ArrayList(this.f101a);
        }
        return arrayList;
    }

    public final void g(androidx.fragment.app.a aVar) {
        a.gk0 gk0Var = aVar.c;
        java.lang.String str = gk0Var.h;
        java.util.HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(gk0Var.h, aVar);
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Added fragment to active set " + gk0Var);
        }
    }

    public final void h(androidx.fragment.app.a aVar) {
        a.gk0 gk0Var = aVar.c;
        if (gk0Var.D) {
            this.c.c(gk0Var);
        }
        if (((androidx.fragment.app.a) this.b.put(gk0Var.h, null)) != null && android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Removed fragment from active set " + gk0Var);
        }
    }
}
