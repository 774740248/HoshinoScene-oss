package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tm0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.bn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.tm0(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String m = this.g.m(2131953369);
        a.wv.v(m, "getString(R.string.schedule_cloud_get_failure)");
        a.fs1.X(m, 0);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.tm0 tm0Var = (a.tm0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        tm0Var.e(no1Var);
        return no1Var;
    }
}
