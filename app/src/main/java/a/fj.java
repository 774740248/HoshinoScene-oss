package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fj implements View.OnClickListener {

    public fj(jj p0) {
        this(p0, 0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ int e;

    public /* synthetic */ fj(jj jjVar, int i, int i2) {
        this.c = i2;
        this.d = jjVar;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        int i2 = this.e;
        jj jjVar = this.d;
        switch (i) {
            case 0:
                wv.w(jjVar, "this$0");
                jjVar.q(-1, false);
                q40 q40Var = jjVar.p;
                if (q40Var != null) {
                    q40Var.a(i2);
                    return;
                }
                return;
            default:
                wv.w(jjVar, "this$0");
                jjVar.q(i2, true);
                return;
        }
    }
}
