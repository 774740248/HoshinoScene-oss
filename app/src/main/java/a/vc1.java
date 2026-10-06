package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vc1 extends a.xc1 implements java.util.Iterator {
    public a.uc1 c;
    public boolean d = true;
    public final /* synthetic */ a.yc1 e;

    public vc1(a.yc1 yc1Var) {
        this.e = yc1Var;
    }

    @Override // a.xc1
    public final void a(a.uc1 uc1Var) {
        a.uc1 uc1Var2 = this.c;
        if (uc1Var == uc1Var2) {
            a.uc1 uc1Var3 = uc1Var2.f;
            this.c = uc1Var3;
            this.d = uc1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d) {
            return this.e.c != null;
        }
        a.uc1 uc1Var = this.c;
        return (uc1Var == null || uc1Var.e == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.d) {
            this.d = false;
            this.c = this.e.c;
        } else {
            a.uc1 uc1Var = this.c;
            this.c = uc1Var != null ? uc1Var.e : null;
        }
        return this.c;
    }
}
