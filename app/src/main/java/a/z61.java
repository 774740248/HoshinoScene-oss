package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z61 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f726a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final com.omarea.model.ProcessInfo e;
    public final int f;
    public final float g;
    public final long h;
    public final boolean i;

    public z61(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, com.omarea.model.ProcessInfo processInfo, int i, float f, long j, boolean z2) {
        this.f726a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = processInfo;
        this.f = i;
        this.g = f;
        this.h = j;
        this.i = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.z61)) {
            return false;
        }
        a.z61 z61Var = (a.z61) obj;
        return this.f726a == z61Var.f726a && a.wv.e(this.b, z61Var.b) && a.wv.e(this.c, z61Var.c) && a.wv.e(this.d, z61Var.d) && a.wv.e(this.e, z61Var.e) && this.f == z61Var.f && java.lang.Float.compare(this.g, z61Var.g) == 0 && this.h == z61Var.h && this.i == z61Var.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f726a;
        int i = (z) ? 1 : 0;
        if (z) {
            i = 1;
        }
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (i * 31)) * 31)) * 31;
        java.lang.String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.omarea.model.ProcessInfo processInfo = this.e;
        int hashCode3 = (java.lang.Long.hashCode(this.h) + ((java.lang.Float.hashCode(this.g) + ((java.lang.Integer.hashCode(this.f) + ((hashCode2 + (processInfo != null ? processInfo.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        boolean z2 = this.i;
        return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final java.lang.String toString() {
        return "ProcessGroupRow(isGroup=" + this.f726a + ", user=" + this.b + ", displayName=" + this.c + ", packageName=" + this.d + ", process=" + this.e + ", count=" + this.f + ", cpu=" + this.g + ", res=" + this.h + ", expanded=" + this.i + ")";
    }
}
