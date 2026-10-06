package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.List g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions h;
    public final /* synthetic */ a.b81 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(java.util.List list, com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, a.b81 b81Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = list;
        this.h = activityFpsSessions;
        this.i = b81Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.w9(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.util.List list = this.g;
        boolean z = !list.isEmpty();
        com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.h;
        if (z) {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSessions.t;
            activityFpsSessions.o(list);
        }
        this.i.a();
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSessions.t;
        activityFpsSessions.p();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.w9 w9Var = (a.w9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        w9Var.e(no1Var);
        return no1Var;
    }
}
