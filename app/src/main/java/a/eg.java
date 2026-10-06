package a;

import com.omarea.vtools.activities.ActivitySwap;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class eg implements Runnable {

    public eg() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivitySwap d;
    public final /* synthetic */ StringBuilder e;

    public /* synthetic */ eg(ActivitySwap activitySwap, StringBuilder sb, int i) {
        this.c = i;
        this.d = activitySwap;
        this.e = sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        StringBuilder sb = this.e;
        ActivitySwap activitySwap = this.d;
        switch (i) {
            case 0:
                wv.w(activitySwap, "this$0");
                wv.w(sb, "$tipStr");
                b81 b81Var = activitySwap.M;
                if (b81Var == null) {
                    wv.M1("processBarDialog");
                    throw null;
                }
                String sb2 = sb.toString();
                wv.v(sb2, "tipStr.toString()");
                b81Var.b(sb2);
                return;
            default:
                wv.w(activitySwap, "this$0");
                wv.w(sb, "$tipStr");
                b81 b81Var2 = activitySwap.M;
                if (b81Var2 == null) {
                    wv.M1("processBarDialog");
                    throw null;
                }
                String sb3 = sb.toString();
                wv.v(sb3, "tipStr.toString()");
                b81Var2.b(sb3);
                return;
        }
    }
}
