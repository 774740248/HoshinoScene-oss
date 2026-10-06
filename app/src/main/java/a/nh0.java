package a;

import android.content.Context;
import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class nh0 implements View.OnClickListener {

    public nh0(ph0 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ph0 d;

    public /* synthetic */ nh0(ph0 ph0Var, int i) {
        this.c = i;
        this.d = ph0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ph0 ph0Var = this.d;
        switch (i) {
            case 0:
                wv.w(ph0Var, "this$0");
                boolean z = !ph0.k;
                ph0.k = z;
                if (!z) {
                    view.setAlpha(0.3f);
                    return;
                }
                view.setAlpha(1.0f);
                Context context = ph0Var.f435a;
                ai1.r(context, 2131953272, context, 1);
                return;
            default:
                wv.w(ph0Var, "this$0");
                ph0Var.a(true);
                return;
        }
    }
}
