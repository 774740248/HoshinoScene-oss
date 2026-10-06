package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vj extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.xj g;
    public final /* synthetic */ a.mc1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(a.mc1 mc1Var, a.xj xjVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = xjVar;
        this.h = mc1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vj(this.h, this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        a.b20.q1(obj);
        a.xj xjVar = this.g;
        xjVar.f();
        a.b81 b81Var = xjVar.n;
        a.wv.s(b81Var);
        b81Var.a();
        a.bp0 bp0Var = xjVar.q;
        a.mc1 mc1Var = this.h;
        if (bp0Var != null) {
            bp0Var.i(mc1Var);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = xjVar.u;
        if (recyclerView != null && (linearLayoutManager = xjVar.v) != null) {
            recyclerView.post(new a.ua0(xjVar, mc1Var, linearLayoutManager, 5));
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.vj vjVar = (a.vj) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        vjVar.e(no1Var);
        return no1Var;
    }
}
