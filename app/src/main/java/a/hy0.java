package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hy0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f223a;
    public final a.ss0 b;

    public hy0(java.lang.String str, a.ss0 ss0Var) {
        this.f223a = str;
        this.b = ss0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.hy0)) {
            return false;
        }
        a.hy0 hy0Var = (a.hy0) obj;
        return a.wv.e(this.f223a, hy0Var.f223a) && a.wv.e(this.b, hy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f223a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MatchGroup(value=" + this.f223a + ", range=" + this.b + ')';
    }
}
