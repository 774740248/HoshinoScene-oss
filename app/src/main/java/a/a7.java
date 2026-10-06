package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a7 implements a.s6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl b;
    public final /* synthetic */ android.view.View c;

    public /* synthetic */ a7(int i, android.view.View view, com.omarea.vtools.activities.ActivityCpuControl activityCpuControl) {
        this.f4a = i;
        this.b = activityCpuControl;
        this.c = view;
    }

    @Override // a.s6
    public final void a(java.lang.String str) {
        int i = this.f4a;
        android.view.View view = this.c;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "result");
                a.qp0 qp0Var = activityCpuControl.H;
                qp0Var.getClass();
                a.q10 q10Var = a.q10.f457a;
                if (a.q10.t().equals("root")) {
                    a.q10.z(new java.lang.String[]{"@gpu_freq_min", str});
                } else if (a.qp0.j()) {
                    a.vx0.L1(12582912, java.util.Arrays.asList(qp0Var.f473a).indexOf(str));
                } else if (a.qp0.i()) {
                    a.f81.K1(1115701248, java.util.Arrays.asList(qp0Var.f473a).indexOf(str));
                }
                activityCpuControl.D.gpuMinFreq = str;
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, com.omarea.vtools.activities.ActivityCpuControl.E(str));
                return;
            case 1:
                a.wv.w(str, "result");
                a.qp0 qp0Var2 = activityCpuControl.H;
                qp0Var2.getClass();
                a.q10 q10Var2 = a.q10.f457a;
                if (a.q10.t().equals("root")) {
                    a.q10.z(new java.lang.String[]{"@gpu_freq_max", str});
                } else if (a.qp0.j()) {
                    a.vx0.L1(12599296, java.util.Arrays.asList(qp0Var2.f473a).indexOf(str));
                } else if (a.qp0.i()) {
                    a.f81.K1(1115717632, java.util.Arrays.asList(qp0Var2.f473a).indexOf(str));
                }
                activityCpuControl.D.gpuMaxFreq = str;
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, com.omarea.vtools.activities.ActivityCpuControl.E(str));
                return;
            default:
                a.wv.w(str, "result");
                activityCpuControl.H.getClass();
                if (a.wv.e(a.qp0.d(), str)) {
                    return;
                }
                activityCpuControl.H.getClass();
                a.nu0 nu0Var = a.nu0.f395a;
                a.nu0.l(a.qp0.f() + "/governor", str);
                activityCpuControl.D.adrenoGovernor = str;
                com.omarea.vtools.activities.ActivityCpuControl.A((android.widget.TextView) view, str);
                return;
        }
    }
}
