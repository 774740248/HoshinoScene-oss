package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n9 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ float g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession h;
    public final /* synthetic */ java.util.ArrayList i;
    public final /* synthetic */ com.omarea.model.FpsWatchSession j;
    public final /* synthetic */ float k;
    public final /* synthetic */ double l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;
    public final /* synthetic */ double p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(float f, com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, java.util.ArrayList arrayList, com.omarea.model.FpsWatchSession fpsWatchSession, float f2, double d, float f3, float f4, float f5, double d2, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = f;
        this.h = activityFpsSession;
        this.i = arrayList;
        this.j = fpsWatchSession;
        this.k = f2;
        this.l = d;
        this.m = f3;
        this.n = f4;
        this.o = f5;
        this.p = d2;
        this.q = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.n9(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        float f = this.g;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.h;
        if (f > 45.0f) {
            sb.append(activityFpsSession.getString(2131952333) + f + "℃");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : this.i) {
                if (((java.lang.Number) obj2).floatValue() > 45.0f) {
                    arrayList.add(obj2);
                }
            }
            sb.append("    ≥45℃ " + arrayList.size() + activityFpsSession.getString(2131952336));
            activityFpsSession.p(sb);
        }
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
        activityFpsSession.getClass();
        a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSession.I0;
        android.widget.TextView textView = (android.widget.TextView) activityFpsSession.t.a(gu0VarArr2[17]);
        com.omarea.model.FpsWatchSession fpsWatchSession = this.j;
        java.lang.String str = fpsWatchSession.viewSize;
        textView.setText((str == null || str.length() == 0) ? "crop: --" : a.ai1.g("crop: ", fpsWatchSession.viewSize));
        if (fpsWatchSession.packageVersion != null) {
            activityFpsSession.x().setText(activityFpsSession.F0);
        }
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.k)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.z.a(gu0VarArr2[25]));
        double d = this.l;
        if (d > 0.0d) {
            a.ai1.v(new java.lang.Object[]{new java.lang.Double(d)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.y.a(gu0VarArr2[24]));
        }
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(f)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.A.a(gu0VarArr2[26]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.m)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.u.a(gu0VarArr2[19]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.n)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.v.a(gu0VarArr2[20]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Float(this.o)}, 1, "%.1f", "format(format, *args)", (android.widget.TextView) activityFpsSession.w.a(gu0VarArr2[21]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Double(this.p)}, 1, "%.1f%%", "format(format, *args)", (android.widget.TextView) activityFpsSession.x.a(gu0VarArr2[22]));
        a.ai1.v(new java.lang.Object[]{new java.lang.Integer(this.q)}, 1, "%dmA", "format(format, *args)", (android.widget.TextView) activityFpsSession.o0.a(gu0VarArr2[78]));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.n9 n9Var = (a.n9) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        n9Var.e(no1Var);
        return no1Var;
    }
}
