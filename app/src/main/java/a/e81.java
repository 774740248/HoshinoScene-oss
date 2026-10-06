package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class e81 extends a.ss implements a.gu0 {

    public e81() {
        this(null, null, null, null, 0);
    }
    public final boolean i;

    public e81(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.i = (i & 2) == 2;
    }

    public final a.au0 e() {
        if (this.i) {
            return this;
        }
        a.au0 au0Var = this.c;
        if (au0Var != null) {
            return au0Var;
        }
        a.au0 a2 = a();
        this.c = a2;
        return a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.e81) {
            a.e81 e81Var = (a.e81) obj;
            return c().equals(e81Var.c()) && this.f.equals(e81Var.f) && this.g.equals(e81Var.g) && a.wv.e(this.d, e81Var.d);
        }
        if (obj instanceof a.gu0) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        a.au0 e = e();
        return e != this ? e.toString() : a.ai1.j(new java.lang.StringBuilder("property "), this.f, " (Kotlin reflection is not available)");
    }
}
