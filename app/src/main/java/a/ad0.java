package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ad0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ a.l1 e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(java.lang.String str, a.l1 l1Var, java.lang.String str2, boolean z, boolean z2) {
        super(1);
        this.d = str;
        this.e = l1Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        zt0Var.m("Scene FAS", "title");
        zt0Var.m(this.d, "visible");
        java.lang.String str = this.f;
        a.l1 l1Var = this.e;
        zt0Var.m(new a.yt0(new a.yc0(l1Var, str), new a.xc0(l1Var, 11), new a.zc0(l1Var, this.g, 1), new a.zc0(l1Var, this.h, 2), new a.xc0(l1Var, 16), new a.xc0(l1Var, 17), a.zb0.o), "items");
        return a.no1.f387a;
    }
}
