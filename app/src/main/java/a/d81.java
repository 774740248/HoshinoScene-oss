package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d81 extends a.e81 implements a.fu0 {
    public d81(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        super(a.rs.c, cls, str, str2, 0);
    }

    @Override // a.ss
    public final a.au0 a() {
        a.na1.f375a.getClass();
        return this;
    }

    public final void f() {
        if (this.i) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        a.au0 e = e();
        if (e == this) {
            throw new java.lang.Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((a.d81) ((a.fu0) ((a.gu0) e))).f();
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        f();
        throw null;
    }
}
