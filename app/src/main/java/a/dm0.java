package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dm0 extends a.zq1 {
    public static final a.fa0 j = new a.fa0(0);
    public final boolean g;
    public final java.util.HashMap d = new java.util.HashMap();
    public final java.util.HashMap e = new java.util.HashMap();
    public final java.util.HashMap f = new java.util.HashMap();
    public boolean h = false;
    public boolean i = false;

    public dm0(boolean z) {
        this.g = z;
    }

    @Override // a.zq1
    public final void b() {
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(a.gk0 gk0Var) {
        if (this.i) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(gk0Var.h) == null || !android.util.Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Removed " + gk0Var);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.dm0.class != obj.getClass()) {
            return false;
        }
        a.dm0 dm0Var = (a.dm0) obj;
        return this.d.equals(dm0Var.d) && this.e.equals(dm0Var.e) && this.f.equals(dm0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((java.lang.String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((java.lang.String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
