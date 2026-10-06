package a;

import android.app.ActivityManager;
import android.widget.TextView;
import com.omarea.ui.CpuChartBarView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class bg0 implements Runnable {

    public bg0() {
        this(null, null, null, null, 0.0d);
    }
    public final /* synthetic */ fg0 c;
    public final /* synthetic */ ka1 d;
    public final /* synthetic */ k11 e;
    public final /* synthetic */ ma1 f;
    public final /* synthetic */ double g;

    public /* synthetic */ bg0(fg0 fg0Var, ka1 ka1Var, k11 k11Var, ma1 ma1Var, double d) {
        this.c = fg0Var;
        this.d = ka1Var;
        this.e = k11Var;
        this.f = ma1Var;
        this.g = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        fg0 fg0Var = this.c;
        wv.w(fg0Var, "this$0");
        ka1 ka1Var = this.d;
        wv.w(ka1Var, "$cpuMaxFreq");
        k11 k11Var = this.e;
        wv.w(k11Var, "$data");
        ma1 ma1Var = this.f;
        wv.w(ma1Var, "$batState");
        TextView textView = fg0Var.d;
        if (textView != null) {
            textView.setText(String.valueOf(ka1Var.c / 1000));
        }
        CpuChartBarView cpuChartBarView = fg0Var.e;
        if (cpuChartBarView != null) {
            Integer[] numArr = fg0Var.x;
            if (numArr == null) {
                wv.M1("coreLoads");
                throw null;
            }
            cpuChartBarView.setData(numArr);
        }
        CpuChartBarView cpuChartBarView2 = fg0Var.f;
        if (cpuChartBarView2 != null) {
            cpuChartBarView2.a(100.0f, 100.0f - k11Var.d);
        }
        TextView textView2 = fg0Var.g;
        if (textView2 != null) {
            int i2 = k11Var.c;
            textView2.setText(i2 > -1 ? String.valueOf(i2) : "--");
        }
        TextView textView3 = fg0Var.h;
        if (textView3 != null) {
            textView3.setText((CharSequence) ma1Var.c);
        }
        if (!((Boolean) fg0Var.t.a()).booleanValue()) {
            TextView textView4 = fg0Var.i;
            if (textView4 == null) {
                return;
            }
            double d = this.g;
            textView4.setText(d >= 100.0d ? String.valueOf((int) d) : String.valueOf(d));
            return;
        }
        if (fg0Var.w % 3 == 1) {
            ActivityManager activityManager = fg0Var.j;
            wv.s(activityManager);
            activityManager.getMemoryInfo(fg0Var.k);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager2 = fg0Var.j;
            wv.s(activityManager2);
            activityManager2.getMemoryInfo(memoryInfo);
            long j = 1024;
            int i3 = (int) (((float) (memoryInfo.totalMem / j)) / 1024.0f);
            if (((Boolean) fg0Var.p.a()).booleanValue() && ((Boolean) fg0Var.b.a()).booleanValue()) {
                jz0 jz0Var = (jz0) wv.v1(new eg0(fg0Var, (ey) null));
                i = (jz0Var.b + jz0Var.c) / 1024;
            } else {
                i = (int) (((float) (memoryInfo.availMem / j)) / 1024.0f);
            }
            TextView textView5 = fg0Var.i;
            if (textView5 != null) {
                textView5.setText((((i3 - i) * 100) / i3) + "%");
            }
        }
        fg0Var.w++;
    }
}
