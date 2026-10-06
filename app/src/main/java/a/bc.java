package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bc extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModules h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.omarea.vtools.activities.ActivityModules activityModules, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityModules;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.bc(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityModules activityModules = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.pm pmVar = activityModules.j;
            a.wv.s(pmVar);
            this.g = 1;
            if (pmVar.x(this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                activityModules.n = false;
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        if (!activityModules.isDestroyed()) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.ac acVar = new a.ac(activityModules, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, acVar, this) == dzVar) {
                return dzVar;
            }
            activityModules.n = false;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.bc) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
