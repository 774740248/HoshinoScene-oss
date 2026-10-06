package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fe extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.model.ProcessInfo g;
    public final /* synthetic */ a.w60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(com.omarea.model.ProcessInfo processInfo, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = processInfo;
        this.h = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.fe(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.k(a.ai1.e("/proc/", this.g.pid, "/reclaim"), "all", new java.lang.Long(15000L));
        this.h.a();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.fe feVar = (a.fe) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        feVar.e(no1Var);
        return no1Var;
    }
}
