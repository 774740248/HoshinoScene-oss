package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class rn0 implements View.OnClickListener {

    public rn0(jo0 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ jo0 d;

    public /* synthetic */ rn0(jo0 jo0Var, int i) {
        this.c = i;
        this.d = jo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        jo0 jo0Var = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                ((i50) jo0Var.q0.a()).f(false);
                return;
            case 1:
                gu0[] gu0VarArr2 = jo0.v0;
                wv.w(jo0Var, "this$0");
                new l1(jo0Var.K(), 14).j();
                return;
            case 2:
                gu0[] gu0VarArr3 = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                jo0Var.W(new wn0(jo0Var, 3));
                return;
            case 3:
                gu0[] gu0VarArr4 = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                jo0Var.W(new wn0(jo0Var, 4));
                return;
            case 4:
                gu0[] gu0VarArr5 = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                jo0Var.W(new wn0(jo0Var, 5));
                return;
            case 5:
                gu0[] gu0VarArr6 = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                jo0Var.W(new wn0(jo0Var, 0));
                return;
            default:
                gu0[] gu0VarArr7 = jo0.v0;
                wv.w(jo0Var, "this$0");
                view.performHapticFeedback(1);
                new qr0().s(new ya(8, jo0Var));
                return;
        }
    }
}
