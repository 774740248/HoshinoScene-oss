package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class is0 implements a.cr1 {
    public final a.ar1[] c;

    public is0(a.ar1... ar1VarArr) {
        a.wv.w(ar1VarArr, "initializers");
        this.c = ar1VarArr;
    }

    @Override // a.cr1
    public final a.zq1 d(java.lang.Class cls, a.r11 r11Var) {
        a.zq1 zq1Var = null;
        for (a.ar1 ar1Var : this.c) {
            if (a.wv.e(ar1Var.f23a, cls)) {
                java.lang.Object i = ar1Var.b.i(r11Var);
                zq1Var = i instanceof a.zq1 ? (a.zq1) i : null;
            }
        }
        if (zq1Var != null) {
            return zq1Var;
        }
        throw new java.lang.IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
