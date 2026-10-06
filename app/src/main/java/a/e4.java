package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e4 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppContents g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.omarea.vtools.activities.ActivityAppContents activityAppContents, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityAppContents;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.e4(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppContents.q;
        com.omarea.vtools.activities.ActivityAppContents activityAppContents = this.g;
        activityAppContents.getClass();
        ((android.widget.LinearLayout) activityAppContents.h.a(com.omarea.vtools.activities.ActivityAppContents.q[4])).setVisibility(8);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.e4 e4Var = (a.e4) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        e4Var.e(no1Var);
        return no1Var;
    }
}
