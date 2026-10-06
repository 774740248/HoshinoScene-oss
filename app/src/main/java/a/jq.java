package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class jq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263a = 1;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public jq() {
    }

    public static boolean l(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean q(java.util.Map map, java.util.Collection collection) {
        int size = map.size();
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract java.lang.Object d(int i, int i2);

    public abstract a.kp e();

    public abstract int f();

    public abstract int g(java.lang.Object obj);

    public abstract int h(java.lang.Object obj);

    public abstract void i(java.lang.Object obj, java.lang.Object obj2);

    public abstract void j(int i);

    public abstract java.lang.Object k(int i, java.lang.Object obj);

    public final android.view.MenuItem m(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof a.kj1)) {
            return menuItem;
        }
        a.kj1 kj1Var = (a.kj1) menuItem;
        if (((a.rh1) this.c) == null) {
            this.c = new a.rh1();
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) ((a.rh1) this.c).getOrDefault(kj1Var, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        a.d01 d01Var = new a.d01((android.content.Context) this.b, kj1Var);
        ((a.rh1) this.c).put(kj1Var, d01Var);
        return d01Var;
    }

    public final java.lang.String n() {
        if (((java.lang.String) this.d) == null) {
            android.content.SharedPreferences sharedPreferences = ((android.content.Context) this.b).getSharedPreferences("TripleCacheValues", 0);
            if (sharedPreferences.contains((java.lang.String) this.c)) {
                this.d = sharedPreferences.getString((java.lang.String) this.c, "");
                a.ty tyVar = a.z80.b;
                a.ao1 ao1Var = new a.ao1(this, sharedPreferences, null);
                int i = 2 & 1;
                a.ty tyVar2 = a.ob0.c;
                if (i != 0) {
                    tyVar = tyVar2;
                }
                int i2 = (2 & 2) != 0 ? 1 : 0;
                a.ty W = a.wv.W(tyVar2, tyVar, true);
                a.u20 u20Var = a.z80.f728a;
                if (W != u20Var && W.g(a.gy.c) == null) {
                    W = W.c(u20Var);
                }
                a.f av0Var = i2 == 2 ? new a.av0(W, ao1Var) : new a.f(W, true);
                av0Var.S(i2, av0Var, ao1Var);
            } else {
                java.lang.String o = o();
                this.d = o;
                if (o != null && o.length() > 0 && !a.wv.e((java.lang.String) this.d, "error")) {
                    sharedPreferences.edit().putString((java.lang.String) this.c, (java.lang.String) this.d).apply();
                }
            }
        }
        return (java.lang.String) this.d;
    }

    public abstract java.lang.String o();

    public final void p() {
        this.d = null;
        ((android.content.Context) this.b).getSharedPreferences("TripleCacheValues", 0).edit().remove((java.lang.String) this.c).apply();
        n();
    }

    public final java.lang.Object[] r(int i, java.lang.Object[] objArr) {
        int f = f();
        if (objArr.length < f) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), f);
        }
        for (int i2 = 0; i2 < f; i2++) {
            objArr[i2] = d(i2, i);
        }
        if (objArr.length > f) {
            objArr[f] = null;
        }
        return objArr;
    }

    public final java.lang.String toString() {
        switch (this.f263a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.lang.String n = n();
                return n == null ? "" : n;
            default:
                return super.toString();
        }
    }

    public jq(android.content.Context context, java.lang.String str) {
        this.b = context;
        this.c = str;
    }

    public jq(android.content.Context context) {
        this.b = context;
    }
}
