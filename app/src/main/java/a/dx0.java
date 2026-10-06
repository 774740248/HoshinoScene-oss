package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dx0 extends a.zq1 {
    public static final a.fa0 e = new a.fa0(1);
    public final a.fi1 d = new a.fi1();

    @Override // a.zq1
    public final void b() {
        a.fi1 fi1Var = this.d;
        int i = fi1Var.e;
        if (i > 0) {
            a.ai1.t(fi1Var.d[0]);
            throw null;
        }
        java.lang.Object[] objArr = fi1Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        fi1Var.e = 0;
    }
}
