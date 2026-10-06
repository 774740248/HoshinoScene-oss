package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w6 implements a.r6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f653a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl b;

    public /* synthetic */ w6(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i) {
        this.f653a = i;
        this.b = activityCpuControl;
    }

    @Override // a.r6
    public final void a(boolean[] zArr) {
        int i = this.f653a;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                activityCpuControl.D.cpusetBg = com.omarea.vtools.activities.ActivityCpuControl.o(activityCpuControl, zArr);
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String str = activityCpuControl.D.cpusetBg;
                a.wv.v(str, "status.cpusetBg");
                a.nu0.l("/dev/cpuset/background/cpus", str);
                return;
            case 1:
                activityCpuControl.D.cpusetSysBg = com.omarea.vtools.activities.ActivityCpuControl.o(activityCpuControl, zArr);
                a.nu0 nu0Var2 = a.nu0.f395a;
                java.lang.String str2 = activityCpuControl.D.cpusetSysBg;
                a.wv.v(str2, "status.cpusetSysBg");
                a.nu0.l("/dev/cpuset/system-background/cpus", str2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                activityCpuControl.D.cpusetFg = com.omarea.vtools.activities.ActivityCpuControl.o(activityCpuControl, zArr);
                a.nu0 nu0Var3 = a.nu0.f395a;
                java.lang.String str3 = activityCpuControl.D.cpusetFg;
                a.wv.v(str3, "status.cpusetFg");
                a.nu0.l("/dev/cpuset/foreground/cpus", str3);
                return;
            default:
                activityCpuControl.D.cpusetTop = com.omarea.vtools.activities.ActivityCpuControl.o(activityCpuControl, zArr);
                a.nu0 nu0Var4 = a.nu0.f395a;
                java.lang.String str4 = activityCpuControl.D.cpusetTop;
                a.wv.v(str4, "status.cpusetTop");
                a.nu0.l("/dev/cpuset/top-app/cpus", str4);
                return;
        }
    }
}
