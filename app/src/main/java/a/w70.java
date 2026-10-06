package a;

import android.view.View;
import android.widget.TextView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class w70 implements View.OnClickListener {

    public w70() {
        this(null, null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ka1 d;
    public final /* synthetic */ x70 e;
    public final /* synthetic */ TextView f;

    public /* synthetic */ w70(ka1 ka1Var, u5 u5Var, TextView textView, int i) {
        this.c = i;
        this.d = ka1Var;
        this.e = u5Var;
        this.f = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int i3 = this.c;
        TextView textView = this.f;
        u5 u5Var = this.e;
        ka1 ka1Var = this.d;
        switch (i3) {
            case 0:
                wv.w(ka1Var, "$current");
                wv.w(u5Var, "$dialogRequest");
                int i4 = ka1Var.c;
                u5 u5Var2 = u5Var;
                switch (u5Var2.f576a) {
                    case 0:
                        i = u5Var2.b;
                        break;
                    default:
                        i = u5Var2.b;
                        break;
                }
                if (i4 > i) {
                    ka1Var.c = i4 - 1;
                }
                textView.setText(String.valueOf(ka1Var.c));
                return;
            default:
                wv.w(ka1Var, "$current");
                wv.w(u5Var, "$dialogRequest");
                int i5 = ka1Var.c;
                u5 u5Var3 = u5Var;
                switch (u5Var3.f576a) {
                    case 0:
                        i2 = u5Var3.c;
                        break;
                    default:
                        i2 = u5Var3.c;
                        break;
                }
                if (i5 < i2) {
                    ka1Var.c = i5 + 1;
                }
                textView.setText(String.valueOf(ka1Var.c));
                return;
        }
    }
}
