package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k50 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f283a;
    public final java.util.List b;
    public final java.util.List c;

    public k50(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f283a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.k50)) {
            return false;
        }
        a.k50 k50Var = (a.k50) obj;
        return a.wv.e(this.f283a, k50Var.f283a) && a.wv.e(this.b, k50Var.b) && a.wv.e(this.c, k50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f283a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "BatchMoveResult(existingFiles=" + this.f283a + ", operableFiles=" + this.b + ", missedFiles=" + this.c + ")";
    }
}
