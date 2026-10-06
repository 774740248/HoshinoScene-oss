package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class q6 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl d;

    public /* synthetic */ q6(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i) {
        this.c = i;
        this.d = activityCpuControl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        int i2 = 0;
        int i3 = 1;
        int i4 = 2;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                activityCpuControl.z();
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                android.content.Intent intent = new android.content.Intent(activityCpuControl.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
                intent.putExtra("config", 2131886089);
                intent.putExtra("title", "Sched");
                activityCpuControl.startActivity(intent);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String str = activityCpuControl.D.cpusetBg;
                a.wv.v(str, "status.cpusetBg");
                activityCpuControl.s(str, new a.w6(activityCpuControl, 0));
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String str2 = activityCpuControl.D.cpusetSysBg;
                a.wv.v(str2, "status.cpusetSysBg");
                activityCpuControl.s(str2, new a.w6(activityCpuControl, 1));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String str3 = activityCpuControl.D.cpusetFg;
                a.wv.v(str3, "status.cpusetFg");
                activityCpuControl.s(str3, new a.w6(activityCpuControl, 2));
                return;
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String str4 = activityCpuControl.D.cpusetTop;
                a.wv.v(str4, "status.cpusetTop");
                activityCpuControl.s(str4, new a.w6(activityCpuControl, 3));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String string = activityCpuControl.getString(2131953181);
                a.wv.v(string, "getString(R.string.perf_choose_gpu_min)");
                activityCpuControl.w(string, com.omarea.vtools.activities.ActivityCpuControl.y(activityCpuControl.z), a.op.O1(activityCpuControl.z, activityCpuControl.D.gpuMinFreq), new a.a7(i2, view, activityCpuControl));
                return;
            case 7:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String string2 = activityCpuControl.getString(2131953180);
                a.wv.v(string2, "getString(R.string.perf_choose_gpu_max)");
                activityCpuControl.w(string2, com.omarea.vtools.activities.ActivityCpuControl.y(activityCpuControl.z), a.op.O1(activityCpuControl.z, activityCpuControl.D.gpuMaxFreq), new a.a7(i3, view, activityCpuControl));
                return;
            default:
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String string3 = activityCpuControl.getString(2131953179);
                a.wv.v(string3, "getString(R.string.perf_choose_gpu_governor)");
                activityCpuControl.w(string3, com.omarea.vtools.activities.ActivityCpuControl.C(activityCpuControl.A), a.op.O1(activityCpuControl.A, activityCpuControl.D.adrenoGovernor), new a.a7(i4, view, activityCpuControl));
                return;
        }
    }
}
