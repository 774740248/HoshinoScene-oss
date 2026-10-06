package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原：f 无抽象方法，abstract 为 R8 冗余标志，去 abstract 保编译 */
public class f extends a.wt0 implements a.ey, a.cz {
    public final a.ty e;

    public f(a.ty tyVar, boolean z) {
        super(z);
        F((a.nt0) tyVar.g(a.gy.f));
        this.e = tyVar.c(this);
    }

    @Override // a.wt0
    public final void E(a.fk0 fk0Var) {
        a.wv.v0(this.e, fk0Var);
    }

    @Override // a.wt0
    public java.lang.String J() {
        return super.J();
    }

    @Override // a.wt0
    public final void M(java.lang.Object obj) {
        if (obj instanceof a.dw) {
            a.dw dwVar = (a.dw) obj;
            java.lang.Throwable th = dwVar.f110a;
            dwVar.getClass();
            a.dw.b.get(dwVar);
        }
    }

    public final void S(int i, a.f fVar, a.fp0 fp0Var) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            a.wv.G1(fp0Var, fVar, this);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                a.wv.w(fp0Var, "<this>");
                a.wv.B0(a.wv.K(fVar, this, fp0Var)).j(a.no1.f387a);
                return;
            }
            if (i2 != 3) {
                throw new java.lang.RuntimeException();
            }
            try {
                a.ty tyVar = this.e;
                java.lang.Object Q1 = a.wv.Q1(tyVar, null);
                try {
                    a.wv.k(fp0Var);
                    java.lang.Object g = fp0Var.g(fVar, this);
                    if (g != a.dz.c) {
                        j(g);
                    }
                } finally {
                    a.wv.r1(tyVar, Q1);
                }
            } catch (java.lang.Throwable th) {
                j(a.b20.I(th));
            }
        }
    }

    @Override // a.wt0, a.nt0
    public final boolean a() {
        return super.a();
    }

    @Override // a.cz
    public final a.ty b() {
        return this.e;
    }

    @Override // a.ey
    public final a.ty h() {
        return this.e;
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        java.lang.Throwable a2 = a.bc1.a(obj);
        if (a2 != null) {
            obj = new a.dw(a2, false);
        }
        java.lang.Object I = I(obj);
        if (I == a.wv.r) {
            return;
        }
        n(I);
    }

    @Override // a.wt0
    public final java.lang.String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
