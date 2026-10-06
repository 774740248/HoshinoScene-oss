package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class td extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.gy g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerStat h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(a.gy gyVar, com.omarea.vtools.activities.ActivityPowerStat activityPowerStat, a.ey eyVar) {
        super(2, eyVar);
        this.g = gyVar;
        this.h = activityPowerStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.td(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityPowerStat activityPowerStat = this.h;
        android.content.Context context = activityPowerStat.getContext();
        this.g.getClass();
        if (a.gy.O(context)) {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerStat.D;
            activityPowerStat.r();
        } else {
            try {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = activityPowerStat.getString(2131951824);
                a.wv.v(string, "getString(R.string.accessibility_please_activate)");
                a.fs1.X(string, 0);
                activityPowerStat.startActivity(new android.content.Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            } catch (java.lang.Exception unused) {
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.td tdVar = (a.td) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        tdVar.e(no1Var);
        return no1Var;
    }
}
