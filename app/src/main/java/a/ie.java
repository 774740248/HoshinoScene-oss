package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ie extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.content.Intent g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityQuickStart h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(android.content.Intent intent, com.omarea.vtools.activities.ActivityQuickStart activityQuickStart, a.ey eyVar) {
        super(2, eyVar);
        this.g = intent;
        this.h = activityQuickStart;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ie(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.content.Intent intent = this.g;
        intent.setFlags(268500992);
        com.omarea.vtools.activities.ActivityQuickStart activityQuickStart = this.h;
        activityQuickStart.startActivity(intent);
        a.tg1 tg1Var = a.me1.m;
        a.me1 me1Var = a.me1.p;
        if (me1Var != null) {
            me1Var.n(activityQuickStart.a());
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ie ieVar = (a.ie) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ieVar.e(no1Var);
        return no1Var;
    }
}
