package a;

import android.view.View;
import com.omarea.ui.fw.FloatMonitorRender;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class if0 implements View.OnClickListener {

    public if0() {
        this(0, 0, null, null, null, null);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ha1 e;
    public final /* synthetic */ FloatMonitorRender f;
    public final /* synthetic */ la1 g;
    public final /* synthetic */ jf0 h;

    public /* synthetic */ if0(int i, int i2, ha1 ha1Var, FloatMonitorRender floatMonitorRender, la1 la1Var, jf0 jf0Var) {
        this.c = i;
        this.d = i2;
        this.e = ha1Var;
        this.f = floatMonitorRender;
        this.g = la1Var;
        this.h = jf0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ha1 ha1Var = this.e;
        wv.w(ha1Var, "$expanded");
        FloatMonitorRender floatMonitorRender = this.f;
        wv.w(floatMonitorRender, "$this_apply");
        la1 la1Var = this.g;
        wv.w(la1Var, "$lastClickTime");
        wv.w(this.h, "this$0");
        int i2 = this.c;
        if (i2 != 0 && i2 != (i = this.d)) {
            boolean z = !ha1Var.c;
            ha1Var.c = z;
            if (z) {
                i2 = i;
            }
            floatMonitorRender.setFlags(i2);
        }
        try {
            if (System.currentTimeMillis() - la1Var.c < 300) {
                jf0.a(true);
            } else {
                la1Var.c = System.currentTimeMillis();
            }
        } catch (Exception unused) {
        }
    }
}
