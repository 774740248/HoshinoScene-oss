package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a6 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeStat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.omarea.vtools.activities.ActivityChargeStat activityChargeStat, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityChargeStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.a6(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeStat.v;
        com.omarea.vtools.activities.ActivityChargeStat activityChargeStat = this.g;
        activityChargeStat.getClass();
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityChargeStat.v;
        a.gu0 gu0Var = gu0VarArr2[0];
        a.yq1 yq1Var = activityChargeStat.d;
        ((android.widget.TextView) yq1Var.a(gu0Var)).setVisibility(0);
        ((android.widget.TextView) yq1Var.a(gu0VarArr2[0])).setOnClickListener(new a.z5(activityChargeStat, 5));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.a6 a6Var = (a.a6) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        a6Var.e(no1Var);
        return no1Var;
    }
}
