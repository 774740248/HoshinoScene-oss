package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c7 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityCpuControl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.c7(this.g, eyVar);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [a.b11, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.g;
        activityCpuControl.G.getClass();
        activityCpuControl.v = a.ls.d().size();
        java.lang.String[] split = a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_governors").split("[ ]+");
        a.wv.v(split, "cpuUtil.availableGovernors");
        activityCpuControl.F = split;
        int i = activityCpuControl.v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.util.HashMap hashMap = activityCpuControl.E;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i3);
            java.lang.String[] c = a.ls.c(i3);
            a.wv.v(c, "cpuUtil.getAvailableFrequencies(cluster)");
            hashMap.put(valueOf, c);
        }
        activityCpuControl.w = a.ls.f();
        a.qp0 qp0Var = activityCpuControl.H;
        qp0Var.getClass();
        boolean z = a.qp0.i() || a.qp0.k();
        activityCpuControl.y = z;
        if (z) {
            java.lang.String[] e = a.qp0.e();
            a.wv.v(e, "gpuUtils.governors");
            activityCpuControl.A = e;
            java.lang.String[] c2 = qp0Var.c();
            a.wv.v(c2, "gpuUtils.frequencies");
            activityCpuControl.z = c2;
        }
        a.gz gzVar = new a.gz(activityCpuControl.getContext());
        java.lang.String str = activityCpuControl.u;
        if (str == null) {
            str = gzVar.c;
        }
        activityCpuControl.C = (com.omarea.model.CpuStatus) gzVar.c(str);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCpuControl.J;
        ((android.widget.Switch) activityCpuControl.e.a(gu0VarArr[1])).setChecked(activityCpuControl.C != null);
        if (activityCpuControl.u != null) {
            ((com.omarea.ui.BlurViewLinearLayout) activityCpuControl.d.a(gu0VarArr[0])).setVisibility(8);
            if (activityCpuControl.C != null) {
                a.b11 obj2 = new a.b11();
                java.lang.String str2 = activityCpuControl.u;
                a.wv.s(str2);
                java.lang.String packageName = activityCpuControl.getPackageName();
                a.wv.v(packageName, "packageName");
                obj2.e(str2, packageName, "manual");
                com.omarea.model.CpuStatus cpuStatus = activityCpuControl.C;
                a.wv.s(cpuStatus);
                activityCpuControl.D = cpuStatus;
            }
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.o6(activityCpuControl, i2));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.c7 c7Var = (a.c7) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        c7Var.e(no1Var);
        return no1Var;
    }
}
