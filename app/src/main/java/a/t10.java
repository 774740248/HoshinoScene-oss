package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t10 {

    /* renamed from: a, reason: collision with root package name */
    public int f544a = 14754;
    public final java.lang.String b = "4.1.0";
    public final java.lang.String c = "2026.09.24 20:50";

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.t10)) {
            return false;
        }
        a.t10 t10Var = (a.t10) obj;
        return this.f544a == t10Var.f544a && a.wv.e(this.b, t10Var.b) && a.wv.e(this.c, t10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (java.lang.Integer.hashCode(this.f544a) * 31)) * 31);
    }

    public final java.lang.String toString() {
        int i = this.f544a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DaemonConfig(port=");
        sb.append(i);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildTime=");
        return a.ai1.j(sb, this.c, ")");
    }
}
