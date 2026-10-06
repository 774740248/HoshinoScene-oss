package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sn1 {
    public final android.view.View b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f532a = new java.util.HashMap();
    public final java.util.ArrayList c = new java.util.ArrayList();

    public sn1(android.view.View view) {
        this.b = view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof a.sn1)) {
            return false;
        }
        a.sn1 sn1Var = (a.sn1) obj;
        return this.b == sn1Var.b && this.f532a.equals(sn1Var.f532a);
    }

    public final int hashCode() {
        return this.f532a.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.String e = a.ii1.e(("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        java.util.HashMap hashMap = this.f532a;
        for (java.lang.String str : (Iterable<java.lang.String>) hashMap.keySet()) {
            e = e + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e;
    }
}
