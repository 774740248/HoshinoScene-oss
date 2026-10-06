package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ub extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.ma1 h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleUpload i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(a.ma1 ma1Var, com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload, a.ey eyVar) {
        super(2, eyVar);
        this.h = ma1Var;
        this.i = activityModuleUpload;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ub(this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [a.be1, a.qr0] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload = this.i;
        try {
        } catch (java.lang.Exception unused) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.tb tbVar = new a.tb(activityModuleUpload, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, tbVar, this) == dzVar) {
                return dzVar;
            }
        }
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.model.MagiskModuleUnofficial o = new a.qr0().o((java.lang.String) this.h.c);
            a.zx0 zx0Var2 = a.by0.f57a;
            a.sb sbVar = new a.sb(o, activityModuleUpload, null);
            this.g = 1;
            if (a.wv.S1(zx0Var2, sbVar, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ub) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
