package a;

import android.content.Context;
import android.widget.Toast;
import com.omarea.vtools.activities.ActivitySwap;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ag implements Runnable {

    public ag() {
        this(null, 0, 0L);
    }
    public final /* synthetic */ ActivitySwap c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ag(ActivitySwap activitySwap, int i, long j) {
        this.c = activitySwap;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0[] gu0VarArr = ActivitySwap.W;
        ActivitySwap activitySwap = this.c;
        wv.w(activitySwap, "this$0");
        b81 b81Var = activitySwap.M;
        if (b81Var == null) {
            wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        long j = this.e;
        int i = (int) ((this.d * 1000.0d) / j);
        Context context = activitySwap.getContext();
        String string = activitySwap.getString(2131953581);
        wv.v(string, "getString(R.string.swap_swapfile_speed)");
        Toast.makeText(context, ai1.l(new Object[]{Long.valueOf(j / 1000), Integer.valueOf(i)}, 2, string, "format(this, *args)"), 1).show();
        activitySwap.t();
    }
}
