package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h3 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityActionPage g;
    public final /* synthetic */ a.ma1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.omarea.vtools.activities.ActivityActionPage activityActionPage, a.ma1 ma1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityActionPage;
        this.h = ma1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h3(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.g;
        a.g3 g3Var = activityActionPage.f ? null : new a.g3(activityActionPage);
        int i = a.a2.d0;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.h.c;
        a.f3 f3Var = activityActionPage.j;
        a.pl1 themeMode = activityActionPage.getThemeMode();
        a.a2 a2Var = new a.a2();
        if (arrayList != null) {
            a2Var.W = arrayList;
            a2Var.Y = f3Var;
            a2Var.Z = g3Var;
            a2Var.a0 = themeMode;
        }
        a.am0 supportFragmentManager = activityActionPage.getSupportFragmentManager();
        supportFragmentManager.getClass();
        a.cq cqVar = new a.cq(supportFragmentManager);
        cqVar.e(2131362754, a2Var, null, 2);
        cqVar.d(true);
        activityActionPage.g.post(new a.fw(24, activityActionPage));
        activityActionPage.f = true;
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h3 h3Var = (a.h3) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h3Var.e(no1Var);
        return no1Var;
    }
}
