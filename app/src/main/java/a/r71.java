package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r71 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f485a;
    public final java.util.ArrayList b;
    public float c;
    public long d;
    public java.lang.String e;
    public java.lang.String f;

    public r71(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f485a = str;
        this.b = arrayList;
        this.c = 0.0f;
        this.d = 0L;
        this.e = str;
        this.f = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.r71)) {
            return false;
        }
        a.r71 r71Var = (a.r71) obj;
        return a.wv.e(this.f485a, r71Var.f485a) && a.wv.e(this.b, r71Var.b) && java.lang.Float.compare(this.c, r71Var.c) == 0 && this.d == r71Var.d && a.wv.e(this.e, r71Var.e) && a.wv.e(this.f, r71Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((java.lang.Long.hashCode(this.d) + ((java.lang.Float.hashCode(this.c) + ((this.b.hashCode() + (this.f485a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        java.lang.String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ProcessUserGroup(user=" + this.f485a + ", processes=" + this.b + ", cpu=" + this.c + ", res=" + this.d + ", displayName=" + this.e + ", packageName=" + this.f + ")";
    }
}
