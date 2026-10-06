package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.ma1 h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleDetail i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(a.ma1 ma1Var, com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail, a.ey eyVar) {
        super(2, eyVar);
        this.h = ma1Var;
        this.i = activityModuleDetail;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qb(this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [a.be1, a.qr0] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail = this.i;
        try {
        } catch (java.lang.Exception unused) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.pb pbVar = new a.pb(activityModuleDetail, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, pbVar, this) == dzVar) {
                return dzVar;
            }
        }
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.model.MagiskModuleUnofficial o = new a.qr0().o((java.lang.String) this.h.c);
            a.zx0 zx0Var2 = a.by0.f57a;
            a.ob obVar = new a.ob(o, activityModuleDetail, null);
            this.g = 1;
            if (a.wv.S1(zx0Var2, obVar, this) == dzVar) {
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
        return ((a.qb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
