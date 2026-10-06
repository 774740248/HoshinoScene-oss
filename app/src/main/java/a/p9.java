package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ double j;
    public final /* synthetic */ double k;
    public final /* synthetic */ double l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, int i, int i2, double d, double d2, double d3, int i3, int i4, int i5, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFpsSession;
        this.h = i;
        this.i = i2;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = i3;
        this.n = i4;
        this.o = i5;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p9(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.g;
        activityFpsSession.getClass();
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSession.I0;
        a.ai1.v(new java.lang.Object[]{new java.lang.Integer(this.h)}, 1, "%dmA", "format(format, *args)", (android.widget.TextView) activityFpsSession.m0.a(gu0VarArr2[76]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Integer(this.i)}, 1, "%dmA", "format(format, *args)", (android.widget.TextView) activityFpsSession.n0.a(gu0VarArr2[77]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Double(this.j)}, 1, "%.2fW", "format(format, *args)", (android.widget.TextView) activityFpsSession.t0.a(gu0VarArr2[85]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Double(this.k)}, 1, "%.2fW", "format(format, *args)", (android.widget.TextView) activityFpsSession.u0.a(gu0VarArr2[86]));
        android.widget.TextView textView = (android.widget.TextView) activityFpsSession.v0.a(gu0VarArr2[87]);
        double d = this.l;
        a.ai1.v(new java.lang.Object[]{new java.lang.Double(d)}, 1, "%.2fW", "format(format, *args)", textView);
        a.ai1.v(new java.lang.Object[]{new java.lang.Double(d)}, 1, "%.2f", "format(format, *args)", (android.widget.TextView) activityFpsSession.B.a(gu0VarArr2[27]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Integer(this.m)}, 1, "%d", "format(format, *args)", (android.widget.TextView) activityFpsSession.H.a(gu0VarArr2[35]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Integer(this.n)}, 1, "%d", "format(format, *args)", (android.widget.TextView) activityFpsSession.I.a(gu0VarArr2[36]));
        ((android.widget.TextView) activityFpsSession.L.a(gu0VarArr2[40])).setText(this.o + "ms");
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.p9 p9Var = (a.p9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        p9Var.e(no1Var);
        return no1Var;
    }
}
