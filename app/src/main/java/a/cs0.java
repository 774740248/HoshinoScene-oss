package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cs0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f80a;
    public final java.lang.Object b;

    public cs0(int i, java.lang.Object obj) {
        this.f80a = i;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.cs0)) {
            return false;
        }
        a.cs0 cs0Var = (a.cs0) obj;
        return this.f80a == cs0Var.f80a && a.wv.e(this.b, cs0Var.b);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f80a) * 31;
        java.lang.Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.f80a + ", value=" + this.b + ')';
    }
}
