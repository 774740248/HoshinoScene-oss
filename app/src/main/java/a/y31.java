package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y31 implements java.io.Serializable {
    public final java.lang.Object c;
    public final java.lang.Object d;

    public y31(java.lang.Object obj, java.lang.Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.y31)) {
            return false;
        }
        a.y31 y31Var = (a.y31) obj;
        return a.wv.e(this.c, y31Var.c) && a.wv.e(this.d, y31Var.d);
    }

    public final int hashCode() {
        java.lang.Object obj = this.c;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.d;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.c + ", " + this.d + ')';
    }
}
