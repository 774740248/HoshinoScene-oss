package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class id1 {
    public boolean b;
    public android.os.Bundle c;
    public boolean d;
    public a.kl e;

    /* renamed from: a, reason: collision with root package name */
    public final a.yc1 f228a = new a.yc1();
    public boolean f = true;

    public final android.os.Bundle a(java.lang.String str) {
        if (!this.d) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        android.os.Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle.getBundle(str);
        android.os.Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        android.os.Bundle bundle4 = this.c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final a.hd1 b() {
        java.lang.String str;
        a.hd1 hd1Var;
        java.util.Iterator it = this.f228a.iterator();
        do {
            a.wc1 wc1Var = (a.wc1) it;
            if (!wc1Var.hasNext()) {
                return null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) wc1Var.next();
            a.wv.v(entry, "components");
            str = (java.lang.String) entry.getKey();
            hd1Var = (a.hd1) entry.getValue();
        } while (!a.wv.e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return hd1Var;
    }

    public final void c(java.lang.String str, a.hd1 hd1Var) {
        java.lang.Object obj;
        a.wv.w(str, "key");
        a.wv.w(hd1Var, "provider");
        a.yc1 yc1Var = this.f228a;
        a.uc1 a2 = yc1Var.a(str);
        if (a2 != null) {
            obj = a2.d;
        } else {
            a.uc1 uc1Var = new a.uc1(str, hd1Var);
            yc1Var.f++;
            a.uc1 uc1Var2 = yc1Var.d;
            if (uc1Var2 == null) {
                yc1Var.c = uc1Var;
                yc1Var.d = uc1Var;
            } else {
                uc1Var2.e = uc1Var;
                uc1Var.f = uc1Var2;
                yc1Var.d = uc1Var;
            }
            obj = null;
        }
        if (((a.hd1) obj) != null) {
            throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        a.kl klVar = this.e;
        if (klVar == null) {
            klVar = new a.kl(this);
        }
        this.e = klVar;
        try {
            a.bv0.class.getDeclaredConstructor(new java.lang.Class[0]);
            a.kl klVar2 = this.e;
            if (klVar2 != null) {
                ((java.util.Set) klVar2.b).add(a.bv0.class.getName());
            }
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("Class " + a.bv0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
