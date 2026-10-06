package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dd1 implements a.hd1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.id1 f95a;
    public boolean b;
    public android.os.Bundle c;
    public final a.vj1 d;

    public dd1(a.id1 id1Var, a.fr1 fr1Var) {
        a.wv.w(id1Var, "savedStateRegistry");
        a.wv.w(fr1Var, "viewModelStoreOwner");
        this.f95a = id1Var;
        this.d = new a.vj1(new a.cd1(0, fr1Var));
    }

    @Override // a.hd1
    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) ((a.ed1) this.d.a()).d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle a2 = ((a.ad1) entry.getValue()).e.a();
            if (!a.wv.e(a2, android.os.Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.c = this.f95a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.b = true;
    }
}
