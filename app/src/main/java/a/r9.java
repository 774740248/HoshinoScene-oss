package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession g;
    public final /* synthetic */ android.graphics.drawable.Drawable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, android.graphics.drawable.Drawable drawable, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSession;
        this.h = drawable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.r9(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.g;
        activityFpsSession.getClass();
        ((android.widget.ImageView) activityFpsSession.q.a(com.omarea.vtools.activities.ActivityFpsSession.I0[14])).setImageDrawable(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.r9 r9Var = (a.r9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        r9Var.e(no1Var);
        return no1Var;
    }
}
