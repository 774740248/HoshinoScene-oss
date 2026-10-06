package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sb extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.model.MagiskModuleUnofficial g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleUpload h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial, com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload, a.ey eyVar) {
        super(2, eyVar);
        this.g = magiskModuleUnofficial;
        this.h = activityModuleUpload;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sb(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload = this.h;
        com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = this.g;
        if (magiskModuleUnofficial != null) {
            try {
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityModuleUpload.q;
                activityModuleUpload.o(activityModuleUpload, magiskModuleUnofficial);
            } catch (java.lang.Exception unused) {
                activityModuleUpload.finishAfterTransition();
            }
        } else {
            activityModuleUpload.finishAfterTransition();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sb sbVar = (a.sb) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sbVar.e(no1Var);
        return no1Var;
    }
}
