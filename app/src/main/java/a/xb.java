package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xb extends a.lj1 implements a.fp0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleUpload h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(boolean z, com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload, a.ey eyVar) {
        super(2, eyVar);
        this.g = z;
        this.h = activityModuleUpload;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xb(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        if (this.g) {
            com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload = this.h;
            if (!activityModuleUpload.isDestroyed()) {
                activityModuleUpload.setResult(-1);
                activityModuleUpload.finishAfterTransition();
            }
        } else {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X(">_<!", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.xb xbVar = (a.xb) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        xbVar.e(no1Var);
        return no1Var;
    }
}
