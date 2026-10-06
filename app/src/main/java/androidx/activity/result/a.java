package androidx.activity.result;
import a.ev0;
import a.fv0;
import a.gv0;
import a.kv0;
import a.mv0;
import a.ne;
import a.oe;
import a.qe;
import a.sl0;
import a.ue;
import a.ve;
import a.we;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Random f751a = new java.util.Random();
    public final java.util.HashMap b = new java.util.HashMap();
    public final java.util.HashMap c = new java.util.HashMap();
    public final java.util.HashMap d = new java.util.HashMap();
    public java.util.ArrayList e = new java.util.ArrayList();
    public final transient java.util.HashMap f = new java.util.HashMap();
    public final java.util.HashMap g = new java.util.HashMap();
    public final android.os.Bundle h = new android.os.Bundle();

    public final boolean a(int i, int i2, android.content.Intent intent) {
        oe oeVar;
        java.lang.String str = (java.lang.String) this.b.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ve veVar = (ve) this.f.get(str);
        if (veVar == null || (oeVar = veVar.f631a) == null || !this.e.contains(str)) {
            this.g.remove(str);
            this.h.putParcelable(str, new ne(intent, i2));
            return true;
        }
        ((sl0) oeVar).b(veVar.b.c(intent, i2));
        this.e.remove(str);
        return true;
    }

    public abstract void b(int i, qe qeVar, java.lang.Object obj);

    public final ue c(java.lang.String str, qe qeVar, sl0 sl0Var) {
        e(str);
        this.f.put(str, new ve(qeVar, sl0Var));
        java.util.HashMap hashMap = this.g;
        if (hashMap.containsKey(str)) {
            java.lang.Object obj = hashMap.get(str);
            hashMap.remove(str);
            sl0Var.b(obj);
        }
        android.os.Bundle bundle = this.h;
        ne neVar = (ne) bundle.getParcelable(str);
        if (neVar != null) {
            bundle.remove(str);
            sl0Var.b(qeVar.c(neVar.d, neVar.c));
        }
        return new ue(this, str, qeVar, 1);
    }

    public final ue d(final java.lang.String str, mv0 mv0Var, final qe qeVar, final oe oeVar) {
        gv0 lifecycle = mv0Var.getLifecycle();
        androidx.lifecycle.a aVar = (androidx.lifecycle.a) lifecycle;
        if (aVar.d.compareTo(fv0.f) >= 0) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + mv0Var + " is attempting to register while current state is " + aVar.d + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        java.util.HashMap hashMap = this.d;
        we weVar = (we) hashMap.get(str);
        if (weVar == null) {
            weVar = new we(lifecycle);
        }
        kv0 kv0Var = new kv0() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // kv0
            public final void c(mv0 mv0Var2, ev0 ev0Var) {
                boolean equals = ev0.ON_START.equals(ev0Var);
                java.lang.String str2 = str;
                androidx.activity.result.a aVar2 = androidx.activity.result.a.this;
                if (!equals) {
                    if (ev0.ON_STOP.equals(ev0Var)) {
                        aVar2.f.remove(str2);
                        return;
                    } else {
                        if (ev0.ON_DESTROY.equals(ev0Var)) {
                            aVar2.f(str2);
                            return;
                        }
                        return;
                    }
                }
                java.util.HashMap hashMap2 = aVar2.f;
                qe qeVar2 = qeVar;
                oe oeVar2 = oeVar;
                hashMap2.put(str2, new ve(qeVar2, oeVar2));
                java.util.HashMap hashMap3 = aVar2.g;
                if (hashMap3.containsKey(str2)) {
                    java.lang.Object obj = hashMap3.get(str2);
                    hashMap3.remove(str2);
                    ((sl0) oeVar2).b(obj);
                }
                android.os.Bundle bundle = aVar2.h;
                ne neVar = (ne) bundle.getParcelable(str2);
                if (neVar != null) {
                    bundle.remove(str2);
                    ((sl0) oeVar2).b(qeVar2.c(neVar.d, neVar.c));
                }
            }
        };
        weVar.f659a.a(kv0Var);
        weVar.b.add(kv0Var);
        hashMap.put(str, weVar);
        return new ue(this, str, qeVar, 0);
    }

    public final void e(java.lang.String str) {
        java.util.HashMap hashMap = this.c;
        if (((java.lang.Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f751a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            java.util.HashMap hashMap2 = this.b;
            if (!hashMap2.containsKey(java.lang.Integer.valueOf(i))) {
                hashMap2.put(java.lang.Integer.valueOf(i), str);
                hashMap.put(str, java.lang.Integer.valueOf(i));
                return;
            }
            nextInt = this.f751a.nextInt(2147418112);
        }
    }

    public final void f(java.lang.String str) {
        java.lang.Integer num;
        if (!this.e.contains(str) && (num = (java.lang.Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.f.remove(str);
        java.util.HashMap hashMap = this.g;
        if (hashMap.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        android.os.Bundle bundle = this.h;
        if (bundle.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        java.util.HashMap hashMap2 = this.d;
        we weVar = (we) hashMap2.get(str);
        if (weVar != null) {
            java.util.ArrayList arrayList = weVar.b;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                weVar.f659a.b((kv0) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
