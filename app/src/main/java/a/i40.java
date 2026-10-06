package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i40 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ha1 g;
    public final /* synthetic */ a.w60 h;
    public final /* synthetic */ a.k40 i;
    public final /* synthetic */ java.lang.StringBuilder j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(a.ha1 ha1Var, a.w60 w60Var, a.k40 k40Var, java.lang.StringBuilder sb, a.ey eyVar) {
        super(2, eyVar);
        this.g = ha1Var;
        this.h = w60Var;
        this.i = k40Var;
        this.j = sb;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i40(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        if (!this.g.c) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("备份失败", 0);
        }
        this.h.a();
        this.i.k(this.j);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.i40 i40Var = (a.i40) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        i40Var.e(no1Var);
        return no1Var;
    }
}
