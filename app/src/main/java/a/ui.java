package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ui {

    public ui() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f596a;
    public int b;
    public java.lang.Object c;
    public int d;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.ui)) {
            return false;
        }
        a.ui uiVar = (a.ui) obj;
        int i = this.f596a;
        if (i != uiVar.f596a) {
            return false;
        }
        if (i == 8 && java.lang.Math.abs(this.d - this.b) == 1 && this.d == uiVar.b && this.b == uiVar.d) {
            return true;
        }
        if (this.d != uiVar.d || this.b != uiVar.b) {
            return false;
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(uiVar.c)) {
                return false;
            }
        } else if (uiVar.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f596a * 31) + this.b) * 31) + this.d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[");
        int i = this.f596a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
