package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jc extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOplusORMS h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityOplusORMS;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jc(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.no1 no1Var = a.no1.f387a;
        if (i != 0) {
            if (i == 1) {
                a.b20.q1(obj);
            }
            if (i == 2) {
                a.b20.q1(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.b20.q1(obj);
        java.lang.String str = a.v21.b;
        a.wv.v(str, "file2");
        boolean n = a.gy.n(str);
        com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS = this.h;
        if (n) {
            activityOplusORMS.f = str;
        } else {
            if (!a.gy.n("/odm/etc/orms/orms_core_config.xml")) {
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.ic icVar = new a.ic(activityOplusORMS, null);
                this.g = 1;
                return a.wv.S1(zx0Var, icVar, this) == dzVar ? dzVar : no1Var;
            }
            activityOplusORMS.f = "/odm/etc/orms/orms_core_config.xml";
        }
        this.g = 2;
        return com.omarea.vtools.activities.ActivityOplusORMS.o(activityOplusORMS, this) == dzVar ? dzVar : no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.jc) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
