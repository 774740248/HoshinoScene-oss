package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class aq extends a.ws {
    public final a.zp[] c;

    public aq(a.zp[] zpVarArr) {
        this.c = zpVarArr;
    }

    @Override // a.ws
    public final void a(java.lang.Throwable th) {
        c();
    }

    public final void c() {
        for (a.zp zpVar : this.c) {
            a.c90 c90Var = zpVar.h;
            if (c90Var == null) {
                a.wv.M1("handle");
                throw null;
            }
            c90Var.c();
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        c();
        return a.no1.f387a;
    }

    public final java.lang.String toString() {
        return "DisposeHandlersOnCancel[" + this.c + ']';
    }
}
