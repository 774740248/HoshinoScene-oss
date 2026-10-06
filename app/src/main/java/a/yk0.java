package a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.omarea.Scene;
import com.omarea.vtools.activities.ActivityChargeStat;
import com.omarea.vtools.activities.ActivityPowerStat;
import com.omarea.vtools.activities.ActivitySwap;
import java.util.ArrayList;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class yk0 implements View.OnClickListener {

    public yk0(pl0 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ pl0 d;

    public /* synthetic */ yk0(pl0 pl0Var, int i) {
        this.c = i;
        this.d = pl0Var;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [a.ng1, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        pl0 pl0Var = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = pl0.W0;
                wv.w(pl0Var, "this$0");
                ((TextView) pl0Var.B0.a(pl0.W0[31])).setText(pl0Var.m(2131953213));
                cp cpVar = Scene.c;
                fs1.c(new cl0(pl0Var, (ey) null));
                return;
            case 1:
                gu0[] gu0VarArr2 = pl0.W0;
                wv.w(pl0Var, "this$0");
                int i2 = oq0.i;
                if (i2 == 3 || i2 == 4) {
                    pl0Var.R(new Intent(pl0Var.f(), (Class<?>) ActivityPowerStat.class));
                    return;
                } else {
                    pl0Var.R(new Intent(pl0Var.f(), (Class<?>) ActivityChargeStat.class));
                    return;
                }
            case 2:
                gu0[] gu0VarArr3 = pl0.W0;
                wv.w(pl0Var, "this$0");
                ((TextView) pl0Var.H0.a(pl0.W0[37])).setText(pl0Var.j().getText(2131953213));
                Toast.makeText(pl0Var.L(), 2131952516, 0).show();
                cp cpVar2 = Scene.c;
                fs1.c(new dl0(pl0Var, (ey) null));
                return;
            case 3:
                gu0[] gu0VarArr4 = pl0.W0;
                wv.w(pl0Var, "this$0");
                try {
                    pl0Var.R(new Intent("android.intent.action.VIEW", Uri.parse("https://me.521567.xyz/")));
                    return;
                } catch (Exception unused) {
                    Toast.makeText(pl0Var.L(), 2131952503, 0).show();
                    return;
                }
            case 4:
                gu0[] gu0VarArr5 = pl0.W0;
                wv.w(pl0Var, "this$0");
                new nk(22, 0).P(pl0Var.L());
                return;
            case 5:
                gu0[] gu0VarArr6 = pl0.W0;
                wv.w(pl0Var, "this$0");
                pl0Var.R(new Intent(pl0Var.f(), (Class<?>) ActivitySwap.class));
                return;
            default:
                gu0[] gu0VarArr7 = pl0.W0;
                wv.w(pl0Var, "this$0");
                p5 d = pl0Var.d();
                if (d != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < pl0Var.O0; i3++) {
                        ng1 obj = new ng1();
                        obj.f381a = ii1.d("CPU ", i3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        obj.c = sb.toString();
                        pl0Var.I0.getClass();
                        nu0 nu0Var = nu0.f395a;
                        obj.d = nu0.d("/sys/devices/system/cpu/cpu0/online".replace("cpu0", "cpu" + i3)).equals("1");
                        arrayList.add(obj);
                    }
                    b70 b70Var = new b70(d.getThemeMode().a, arrayList, true, new p4(d, 5, pl0Var), 999);
                    String m = pl0Var.m(2131952506);
                    wv.v(m, "getString(R.string.home_core_switch)");
                    b70Var.t0 = m;
                    b70Var.Y();
                    b70Var.V(d.getSupportFragmentManager(), "home-cpu-control");
                    return;
                }
                return;
        }
    }
}
