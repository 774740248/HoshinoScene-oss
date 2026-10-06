package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p71 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;

    public p71(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        a.wv.w(str2, "displayName");
        a.wv.w(str3, "label");
        this.f430a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.p71)) {
            return false;
        }
        a.p71 p71Var = (a.p71) obj;
        return a.wv.e(this.f430a, p71Var.f430a) && a.wv.e(this.b, p71Var.b) && a.wv.e(this.c, p71Var.c) && a.wv.e(this.d, p71Var.d) && this.e == p71Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f430a.hashCode() * 31)) * 31)) * 31;
        java.lang.String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.e;
        int i = (z) ? 1 : 0;
        if (z) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final java.lang.String toString() {
        return "ResolvedUser(user=" + this.f430a + ", displayName=" + this.b + ", label=" + this.c + ", packageName=" + this.d + ", final=" + this.e + ")";
    }
}
