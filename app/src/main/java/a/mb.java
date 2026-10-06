package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mb extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMiuiCloudProfile g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(com.omarea.vtools.activities.ActivityMiuiCloudProfile activityMiuiCloudProfile, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityMiuiCloudProfile;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mb(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gy.h(this.g.k);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mb mbVar = (a.mb) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        mbVar.e(no1Var);
        return no1Var;
    }
}
