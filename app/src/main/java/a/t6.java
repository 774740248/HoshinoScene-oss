package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t6 implements a.s6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f550a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl b;
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.View d;

    public /* synthetic */ t6(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i, android.view.View view, int i2) {
        this.f550a = i2;
        this.b = activityCpuControl;
        this.c = i;
        this.d = view;
    }

    @Override // a.s6
    public final void a(java.lang.String str) {
        int i = this.f550a;
        android.view.View view = this.d;
        int i2 = this.c;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "result");
                activityCpuControl.G.getClass();
                if (!a.wv.e(a.ls.k(i2), str)) {
                    activityCpuControl.G.w(str, i2);
                    activityCpuControl.D.clusters.get(i2).min_freq = str;
                }
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, com.omarea.vtools.activities.ActivityCpuControl.D(str));
                return;
            case 1:
                a.wv.w(str, "result");
                activityCpuControl.G.getClass();
                if (!a.wv.e(a.ls.j(i2), str)) {
                    activityCpuControl.G.v(str, i2);
                    activityCpuControl.D.clusters.get(i2).max_freq = str;
                }
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, com.omarea.vtools.activities.ActivityCpuControl.D(str));
                return;
            default:
                a.wv.w(str, "result");
                activityCpuControl.G.getClass();
                if (!a.wv.e(a.ls.m(i2), str)) {
                    activityCpuControl.G.getClass();
                    a.ls.u(str, i2);
                    activityCpuControl.D.clusters.get(i2).governor = str;
                }
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, str);
                return;
        }
    }
}
