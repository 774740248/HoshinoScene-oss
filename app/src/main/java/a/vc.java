package a;

import android.database.Cursor;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.omarea.Scene;
import com.omarea.ui.bench.CyclesPowerView;
import com.omarea.vtools.activities.ActivityPowerBench;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class vc implements View.OnClickListener {

    public vc(ActivityPowerBench p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityPowerBench d;

    public /* synthetic */ vc(ActivityPowerBench activityPowerBench, int i) {
        this.c = i;
        this.d = activityPowerBench;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityPowerBench activityPowerBench = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityPowerBench.U;
                wv.w(activityPowerBench, "this$0");
                p5.fullScreen$default(activityPowerBench, false, 1, (Object) null);
                cp cpVar = Scene.c;
                if (fs1.D().getBoolean("dynamic_control", false)) {
                    int i2 = x60.f681a;
                    String string = activityPowerBench.getString(2131953730);
                    wv.v(string, "getString(R.string.warn)");
                    String string2 = activityPowerBench.getString(2131953147);
                    wv.v(string2, "getString(R.string.pb_perf_control)");
                    fs1.F(activityPowerBench, string, string2, (Runnable) null).b(false);
                    return;
                }
                if (SystemClock.elapsedRealtime() < 300000) {
                    int i3 = x60.f681a;
                    String string3 = activityPowerBench.getString(2131953169);
                    wv.v(string3, "getString(R.string.pb_wait_idle)");
                    String string4 = activityPowerBench.getString(2131953170);
                    wv.v(string4, "getString(R.string.pb_wait_idle_full)");
                    fs1.F(activityPowerBench, string3, string4, (Runnable) null).b(false);
                    return;
                }
                zc zcVar = new zc(activityPowerBench, 7);
                vj1 vj1Var = oq0.c;
                if (!oq0.a()) {
                    zcVar.b();
                    return;
                }
                int i4 = x60.f681a;
                String string5 = activityPowerBench.getString(2131953150);
                wv.v(string5, "getString(R.string.pb_power_invalid)");
                String string6 = activityPowerBench.getString(2131953151);
                wv.v(string6, "getString(R.string.pb_power_invalid_full)");
                fs1.i(activityPowerBench, string5, string6, new xc(zcVar, 0), (Runnable) null);
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityPowerBench.U;
                wv.w(activityPowerBench, "this$0");
                CyclesPowerView s = activityPowerBench.s();
                s.setShowFreq(!s.getShowFreq());
                ((TextView) activityPowerBench.x.a(ActivityPowerBench.U[23])).setText(s.getShowFreq() ? "(MHz)" : "(M Cycles)");
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityPowerBench.U;
                wv.w(activityPowerBench, "this$0");
                i61 F = activityPowerBench.F();
                F.getClass();
                ArrayList arrayList = new ArrayList();
                Cursor query = F.a().query("session", null, null, null, null, null, "time desc");
                while (query.moveToNext()) {
                    try {
                        arrayList.add(i61.c(query));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            wv.z(query, th);
                            throw th2;
                        }
                    }
                }
                wv.z(query, (Throwable) null);
                ArrayList arrayList2 = new ArrayList(op.J1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h61 h61Var = (h61) it.next();
                    ng1 ng1Var = new ng1(activityPowerBench.C(h61Var), String.valueOf(h61Var.f201a));
                    ng1Var.e = h61Var;
                    arrayList2.add(ng1Var);
                }
                b70 b70Var = new b70(activityPowerBench.getThemeMode().a, arrayList2, false, new bd(activityPowerBench, 0), 7);
                if (b70Var.v0) {
                    b70Var.v0 = false;
                    View view2 = ((gk0) b70Var).H;
                    if (view2 != null) {
                        view2.post(new fw(11, b70Var));
                    }
                }
                cd cdVar = new cd(activityPowerBench, 0);
                b70Var.x0 = cdVar;
                aj T = b20.T(b70Var.s0);
                if (T != null) {
                    T.k = cdVar;
                }
                b70Var.V(activityPowerBench.getSupportFragmentManager(), "PowerBenchSessions");
                return;
            default:
                gu0[] gu0VarArr4 = ActivityPowerBench.U;
                wv.w(activityPowerBench, "this$0");
                if (activityPowerBench.H.size() < 2) {
                    cp cpVar2 = Scene.c;
                    String string7 = activityPowerBench.getString(2131953144);
                    wv.v(string7, "getString(R.string.pb_need_more)");
                    fs1.X(string7, 0);
                    return;
                }
                h61 h61Var2 = activityPowerBench.I;
                if (h61Var2 == null) {
                    wv.M1("session");
                    throw null;
                }
                String C = activityPowerBench.C(h61Var2);
                String string8 = activityPowerBench.getString(2131952299);
                wv.v(string8, "getString(R.string.fps_export_type_img)");
                String string9 = activityPowerBench.getString(2131952298);
                wv.v(string9, "getString(R.string.fps_export_type_csv)");
                fs1.T(activityPowerBench, new String[]{string8, string9}, 0, new lc1(activityPowerBench, 11, C)).c();
                return;
        }
    }
}
