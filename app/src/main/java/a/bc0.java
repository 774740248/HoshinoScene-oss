package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bc0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ a.cc0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(a.cc0 cc0Var, boolean z, boolean z2, boolean z3) {
        super(1);
        this.d = cc0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        a.cc0 cc0Var = this.d;
        zt0Var.m(a.cc0.a(cc0Var, 2131953386), "title");
        zt0Var.w(new a.bp0[]{new a.yb0(cc0Var, this.e, 0), new a.yb0(cc0Var, this.f, 1), new a.yb0(cc0Var, this.g, 2), new a.ac0(cc0Var, 8)});
        return a.no1.f387a;
    }
}
