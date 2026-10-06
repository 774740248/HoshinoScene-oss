package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class o40 implements View.OnClickListener {

    public o40() {
        this(null, null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ha1 d;
    public final /* synthetic */ View e;
    public final /* synthetic */ View f;

    public /* synthetic */ o40(ha1 ha1Var, View view, View view2, int i) {
        this.c = i;
        this.d = ha1Var;
        this.e = view;
        this.f = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        View view2 = this.f;
        View view3 = this.e;
        ha1 ha1Var = this.d;
        switch (i) {
            case 0:
                wv.w(ha1Var, "$editing");
                ha1Var.c = true;
                view3.setVisibility(8);
                view2.setVisibility(0);
                return;
            default:
                wv.w(ha1Var, "$editing");
                ha1Var.c = true;
                view3.setVisibility(8);
                view2.setVisibility(0);
                return;
        }
    }
}
