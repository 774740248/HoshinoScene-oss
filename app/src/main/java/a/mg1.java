package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mg1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350a;
    public final java.lang.String b;

    public mg1(java.lang.String str, java.lang.String str2) {
        a.wv.w(str2, "value");
        this.f350a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.mg1)) {
            return false;
        }
        a.mg1 mg1Var = (a.mg1) obj;
        return a.wv.e(this.f350a, mg1Var.f350a) && a.wv.e(this.b, mg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f350a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectItem(label=");
        sb.append(this.f350a);
        sb.append(", value=");
        return a.ai1.j(sb, this.b, ")");
    }
}
