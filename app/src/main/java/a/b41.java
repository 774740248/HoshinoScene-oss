package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class b41 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;

    public /* synthetic */ b41(int i) {
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        a.kc0 kc0Var = a.kc0.p;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 1:
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.cp cpVar = com.omarea.Scene.c;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                a.fs1.N("scene_logview", ((android.widget.Switch) view).isChecked());
                a.dc0.a(kc0Var, null);
                return;
            case 3:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.cp cpVar2 = com.omarea.Scene.c;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                a.fs1.N("frame_time_monitor", ((android.widget.Switch) view).isChecked());
                a.dc0.a(kc0Var, null);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.cp cpVar3 = com.omarea.Scene.c;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                a.fs1.N("get_next_release", ((android.widget.Switch) view).isChecked());
                return;
            case 5:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.cp cpVar4 = com.omarea.Scene.c;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                a.fs1.N("layer_always_on", ((android.widget.Switch) view).isChecked());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                boolean isChecked = ((android.widget.Switch) view).isChecked();
                a.cp cpVar5 = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("kernel_mem", isChecked).apply();
                return;
            case 7:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                boolean isChecked2 = ((android.widget.Switch) view).isChecked();
                a.cp cpVar6 = com.omarea.Scene.c;
                a.fs1.N("daemon_alive", isChecked2);
                a.q10 q10Var = a.q10.f457a;
                a.q10.E(java.lang.Boolean.valueOf(isChecked2));
                return;
            case 8:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                boolean isChecked3 = ((android.widget.Switch) view).isChecked();
                a.cp cpVar7 = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("daemon_auto", isChecked3).apply();
                a.q10.A("custom-cache");
                return;
            case 9:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityPerfBench.z;
                a.q10 q10Var2 = a.q10.f457a;
                a.q10.l("dumpsys battery reset");
                return;
            case 10:
                a.gu0[] gu0VarArr9 = a.bn0.x0;
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                if (((android.widget.CompoundButton) view).isChecked()) {
                    new a.en1();
                    a.q10 q10Var3 = a.q10.f457a;
                    a.q10.p(2000L, "extreme-perf", "true");
                    return;
                } else {
                    new a.en1();
                    a.q10 q10Var4 = a.q10.f457a;
                    a.q10.p(2000L, "extreme-perf", "false");
                    return;
                }
            case 11:
                a.gu0[] gu0VarArr10 = a.jo0.v0;
                return;
            case 12:
                a.fa0 fa0Var = a.ag0.w;
                return;
            default:
                android.view.WindowManager windowManager = a.dh0.n;
                a.cp cpVar8 = com.omarea.Scene.c;
                a.fs1.X("未启用性能调节，无法切换模式", 0);
                return;
        }
    }
}
