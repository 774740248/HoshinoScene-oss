package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ew {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f139a;
    public final a.bp0 b;

    public ew(java.lang.Object obj, a.bp0 bp0Var) {
        this.f139a = obj;
        this.b = bp0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.ew)) {
            return false;
        }
        a.ew ewVar = (a.ew) obj;
        return a.wv.e(this.f139a, ewVar.f139a) && a.wv.e(this.b, ewVar.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f139a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "CompletedWithCancellation(result=" + this.f139a + ", onCancellation=" + this.b + ')';
    }
}
