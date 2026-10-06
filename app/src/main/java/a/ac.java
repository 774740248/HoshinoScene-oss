package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ac extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModules g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.omarea.vtools.activities.ActivityModules activityModules, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityModules;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ac(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.vtools.activities.ActivityModules activityModules = this.g;
        a.b20.q1(obj);
        try {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityModules.o;
            activityModules.getClass();
            ((android.widget.LinearLayout) activityModules.d.a(com.omarea.vtools.activities.ActivityModules.o[0])).setVisibility(8);
            activityModules.r();
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ac acVar = (a.ac) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        acVar.e(no1Var);
        return no1Var;
    }
}
