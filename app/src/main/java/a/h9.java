package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, float f, float f2, float f3, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSession;
        this.h = f;
        this.i = f2;
        this.j = f3;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h9(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.g;
        activityFpsSession.getClass();
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSession.I0;
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.h)}, 1, "%.1f℃", "format(format, *args)", (android.widget.TextView) activityFpsSession.y0.a(gu0VarArr2[91]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.i)}, 1, "%.1f℃", "format(format, *args)", (android.widget.TextView) activityFpsSession.z0.a(gu0VarArr2[92]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.j)}, 1, "%.1f℃", "format(format, *args)", (android.widget.TextView) activityFpsSession.A0.a(gu0VarArr2[93]));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h9 h9Var = (a.h9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h9Var.e(no1Var);
        return no1Var;
    }
}
