package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class th extends a.vh {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f557a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;

    public th(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2) {
        a.wv.w(str3, "durationText");
        this.f557a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.th)) {
            return false;
        }
        a.th thVar = (a.th) obj;
        return this.f557a == thVar.f557a && a.wv.e(this.b, thVar.b) && a.wv.e(this.c, thVar.c) && a.wv.e(this.d, thVar.d) && this.e == thVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f557a;
        int i = (z) ? 1 : 0;
        if (z) {
            i = 1;
        }
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (i * 31)) * 31)) * 31)) * 31;
        boolean z2 = this.e;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final java.lang.String toString() {
        return "Header(isGame=" + this.f557a + ", title=" + this.b + ", avgText=" + this.c + ", durationText=" + this.d + ", collapsed=" + this.e + ")";
    }
}
