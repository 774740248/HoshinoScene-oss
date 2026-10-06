package a;

import android.content.Intent;
import android.view.View;
import com.omarea.krscript.model.RunnableNode;
import com.omarea.vtools.activities.ActivityCpuControl;
import com.omarea.vtools.activities.ActivityPerfBench;
import com.omarea.vtools.activities.ActivitySwap;
import java.util.HashMap;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class pc implements View.OnClickListener {

    public pc(ActivityPerfBench p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityPerfBench d;

    public /* synthetic */ pc(ActivityPerfBench activityPerfBench, int i) {
        this.c = i;
        this.d = activityPerfBench;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityPerfBench activityPerfBench = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityPerfBench.z;
                wv.w(activityPerfBench, "this$0");
                activityPerfBench.startActivity(new Intent(activityPerfBench.getContext(), (Class<?>) ActivityCpuControl.class));
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityPerfBench.z;
                wv.w(activityPerfBench, "this$0");
                activityPerfBench.startActivity(new Intent(activityPerfBench.getContext(), (Class<?>) ActivitySwap.class));
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityPerfBench.z;
                wv.w(activityPerfBench, "this$0");
                activityPerfBench.o();
                return;
            case 3:
                gu0[] gu0VarArr4 = ActivityPerfBench.z;
                wv.w(activityPerfBench, "this$0");
                gu0[] gu0VarArr5 = ActivityPerfBench.z;
                if (activityPerfBench.n.a(gu0VarArr5[15]).getCheckedIndex() == 0) {
                    q10 q10Var = q10.f457a;
                    q10.l("dumpsys battery unplug");
                } else {
                    q10 q10Var2 = q10.f457a;
                    q10.l("dumpsys battery set ac 2");
                }
                q10 q10Var3 = q10.f457a;
                q10.l("dumpsys battery set level " + activityPerfBench.o.a(gu0VarArr5[16]).getProgress());
                return;
            default:
                gu0[] gu0VarArr6 = ActivityPerfBench.z;
                wv.w(activityPerfBench, "this$0");
                gu0[] gu0VarArr7 = ActivityPerfBench.z;
                int progress = activityPerfBench.r.a(gu0VarArr7[20]).getProgress();
                int progress2 = activityPerfBench.s.a(gu0VarArr7[21]).getProgress();
                String str = pe0.f434a;
                String str2 = activityPerfBench.y;
                String j = pe0.j(activityPerfBench, str2, str2);
                if (j == null) {
                    j = "/data/adb/modules/scene_swap_controller/scripts/alive_benchmark.sh";
                }
                String str3 = "sh " + j + " " + progress + " " + progress2;
                RunnableNode runnableNode = new RunnableNode("");
                runnableNode.setTitle("KeepAlive Benchmark");
                runnableNode.setDesc(str3);
                fs1 fs1Var = l70.A0;
                hs hsVar = new hs(10);
                hs hsVar2 = new hs(11);
                fs1Var.getClass();
                l70 l = fs1.l(runnableNode, hsVar, hsVar2, str3, (HashMap) null, false);
                l.U(false);
                l.V(activityPerfBench.getSupportFragmentManager(), "");
                return;
        }
    }
}
