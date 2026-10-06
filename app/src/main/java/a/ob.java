package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ob extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.model.MagiskModuleUnofficial g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleDetail h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial, com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail, a.ey eyVar) {
        super(2, eyVar);
        this.g = magiskModuleUnofficial;
        this.h = activityModuleDetail;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ob(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityModuleDetail activityModuleDetail = this.h;
        com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = this.g;
        if (magiskModuleUnofficial != null) {
            try {
                com.omarea.vtools.activities.ActivityModuleDetail.o(activityModuleDetail, activityModuleDetail, magiskModuleUnofficial);
            } catch (java.lang.Exception unused) {
                activityModuleDetail.finishAfterTransition();
            }
        } else {
            activityModuleDetail.finishAfterTransition();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ob obVar = (a.ob) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        obVar.e(no1Var);
        return no1Var;
    }
}
