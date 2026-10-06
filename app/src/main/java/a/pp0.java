package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pp0 extends a.ss implements a.op0, a.cu0 {
    public final int i;
    public final int j;

    public pp0() {
        super(a.rs.c, a.jy0.class, "next", "next()Lkotlin/text/MatchResult;", false);
        this.i = 1;
        this.j = 0;
    }

    @Override // a.ss
    public final a.au0 a() {
        a.na1.f375a.getClass();
        return this;
    }

    @Override // a.op0
    public final int d() {
        return this.i;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.pp0) {
            a.pp0 pp0Var = (a.pp0) obj;
            return this.f.equals(pp0Var.f) && this.g.equals(pp0Var.g) && this.j == pp0Var.j && this.i == pp0Var.i && a.wv.e(this.d, pp0Var.d) && a.wv.e(c(), pp0Var.c());
        }
        if (!(obj instanceof a.cu0)) {
            return false;
        }
        a.au0 au0Var = this.c;
        if (au0Var == null) {
            a();
            this.c = this;
            au0Var = this;
        }
        return obj.equals(au0Var);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + (c() == null ? 0 : c().hashCode() * 31)) * 31);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final java.lang.String toString() {
        a.au0 au0Var = this.c;
        if (au0Var == null) {
            a();
            this.c = this;
            au0Var = this;
        }
        if (au0Var != this) {
            return au0Var.toString();
        }
        java.lang.String str = this.f;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.ai1.h("function ", str, " (Kotlin reflection is not available)");
    }

    public pp0(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        super(obj, cls, str, str2, false);
        this.i = i;
        this.j = 0;
    }
}
