package a;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.omarea.Scene;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fl0 implements rq0 {

    public fl0() {
        this(null, null, null, null);
    }
    public final /* synthetic */ ma1 c;
    public final /* synthetic */ pl0 d;
    public final /* synthetic */ tq0 e;
    public final /* synthetic */ String f;

    public /* synthetic */ fl0(ma1 ma1Var, pl0 pl0Var, tq0 tq0Var, String str) {
        this.c = ma1Var;
        this.d = pl0Var;
        this.e = tq0Var;
        this.f = str;
    }

    public final void c(pq0 pq0Var) {
        String str;
        ma1 ma1Var = this.c;
        pl0 pl0Var = this.d;
        tq0 tq0Var = this.e;
        try {
            ma1Var.c = pq0Var;
            if (tq0Var.m) {
                str = "Vulkan " + tq0Var.f + "  Driver Version: " + tq0Var.i;
            } else {
                str = this.f;
            }
            String str2 = pq0Var.b + " " + pq0Var.c + "\n" + pq0Var.f447a + "\n" + str;
            pl0Var.L0 = str2;
            cp cpVar = Scene.c;
            fs1.O("gpu_info", yi1.G2(str2).toString());
            gu0[] gu0VarArr = pl0.W0;
            ((LinearLayout) pl0Var.n0.a(gu0VarArr[17])).removeView((FrameLayout) pl0Var.q0.a(gu0VarArr[20]));
        } catch (Exception unused) {
        }
    }
}
