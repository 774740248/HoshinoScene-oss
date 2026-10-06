package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.omarea.Scene;
import com.omarea.ui.SwitchOptionItemView;
import com.omarea.vtools.activities.ActivityFpsSessions;
import java.util.HashMap;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class t9 implements View.OnClickListener {

    public t9(ActivityFpsSessions p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityFpsSessions d;

    public /* synthetic */ t9(ActivityFpsSessions activityFpsSessions, int i) {
        this.c = i;
        this.d = activityFpsSessions;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityFpsSessions activityFpsSessions = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityFpsSessions.t;
                wv.w(activityFpsSessions, "this$0");
                View inflate = LayoutInflater.from(activityFpsSessions).inflate(2131558519, (ViewGroup) null);
                SwitchOptionItemView findViewById = inflate.findViewById(2131362043);
                SwitchOptionItemView findViewById2 = inflate.findViewById(2131363329);
                SwitchOptionItemView findViewById3 = inflate.findViewById(2131363226);
                int i2 = x60.f681a;
                v60 m = fs1.m(activityFpsSessions, inflate, true);
                cp cpVar = Scene.c;
                findViewById.setChecked(fs1.D().getBoolean("auto_upload", true));
                findViewById3.setChecked(fs1.D().getBoolean("sync_delete_cloud", false));
                inflate.findViewById(2131362097).setOnClickListener(new q60(m, 3));
                inflate.findViewById(2131362098).setOnClickListener(new x8(findViewById, findViewById3, findViewById2, activityFpsSessions, m));
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityFpsSessions.t;
                wv.w(activityFpsSessions, "this$0");
                View inflate2 = LayoutInflater.from(activityFpsSessions).inflate(2131558558, (ViewGroup) null);
                SwitchOptionItemView findViewById4 = inflate2.findViewById(2131363301);
                new HashMap();
                findViewById4.setEnabled(((Boolean) new vj1(kr.h).a()).booleanValue());
                int i3 = x60.f681a;
                v60 m2 = fs1.m(activityFpsSessions, inflate2, true);
                cp cpVar2 = Scene.c;
                findViewById4.setChecked(fs1.D().getBoolean("monitor_fps_perf_event", false));
                inflate2.findViewById(2131362097).setOnClickListener(new q60(m2, 2));
                inflate2.findViewById(2131362098).setOnClickListener(new wi(findViewById4, 19, m2));
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityFpsSessions.t;
                wv.w(activityFpsSessions, "this$0");
                q10 q10Var = q10.f457a;
                if (wv.e(q10.t(), "basic")) {
                    int i4 = x60.f681a;
                    String string = activityFpsSessions.getString(2131952285);
                    wv.v(string, "getString(R.string.fps_adb_root_require)");
                    fs1.G(activityFpsSessions, string, (Runnable) null);
                    return;
                }
                if (wv.e(ag0.w.q(), Boolean.TRUE)) {
                    view.setRotation(0.0f);
                    new ag0(activityFpsSessions.getContext()).b(true);
                    return;
                }
                view.setRotation(45.0f);
                new ag0(activityFpsSessions.getContext()).c();
                int i5 = x60.f681a;
                String string2 = activityFpsSessions.getContext().getString(2131952329);
                wv.v(string2, "context.getString(R.string.fps_tip)");
                fs1.G(activityFpsSessions, string2, (Runnable) null);
                return;
            case 3:
                gu0[] gu0VarArr4 = ActivityFpsSessions.t;
                wv.w(activityFpsSessions, "this$0");
                jh adapter = activityFpsSessions.r().getAdapter();
                if (adapter == null) {
                    return;
                }
                adapter.k = true;
                adapter.f();
                activityFpsSessions.r = true;
                gu0[] gu0VarArr5 = ActivityFpsSessions.t;
                ((ImageView) activityFpsSessions.i.a(gu0VarArr5[5])).setVisibility(0);
                activityFpsSessions.q().setVisibility(8);
                ((ImageView) activityFpsSessions.h.a(gu0VarArr5[4])).setVisibility(8);
                return;
            default:
                gu0[] gu0VarArr6 = ActivityFpsSessions.t;
                wv.w(activityFpsSessions, "this$0");
                activityFpsSessions.p();
                return;
        }
    }
}
