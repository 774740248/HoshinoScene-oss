package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ic extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOplusORMS g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityOplusORMS;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ic(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.widget.Toast.makeText(this.g, "orms_core_config.xml Not found!", 0).show();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ic icVar = (a.ic) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        icVar.e(no1Var);
        return no1Var;
    }
}
