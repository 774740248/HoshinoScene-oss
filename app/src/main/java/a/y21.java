package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y21 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f701a;
    public int b;
    public long c;
    public java.lang.String d;
    public boolean e;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.y21)) {
            return false;
        }
        a.y21 y21Var = (a.y21) obj;
        return a.wv.e(this.f701a, y21Var.f701a) && this.b == y21Var.b && this.c == y21Var.c && a.wv.e(this.d, y21Var.d) && this.e == y21Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((java.lang.Long.hashCode(this.c) + ((java.lang.Integer.hashCode(this.b) + (this.f701a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z = this.e;
        int i = (z) ? 1 : 0;
        if (z) {
            i = 1;
        }
        return hashCode + i;
    }

    public final java.lang.String toString() {
        return "Offer(projectId=" + this.f701a + ", files=" + this.b + ", totalSize=" + this.c + ", dest=" + this.d + ", isApp=" + this.e + ")";
    }
}
