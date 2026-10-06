package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class yh implements View.OnClickListener {

    public yh(ci p0) {
        this(p0, 0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ci d;
    public final /* synthetic */ int e;

    public /* synthetic */ yh(ci ciVar, int i, int i2) {
        this.c = i2;
        this.d = ciVar;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        int i2 = this.e;
        ci ciVar = this.d;
        switch (i) {
            case 0:
                wv.w(ciVar, "this$0");
                ciVar.q(-1, false);
                s40 s40Var = ciVar.p;
                if (s40Var != null) {
                    s40Var.a(i2);
                    return;
                }
                return;
            default:
                wv.w(ciVar, "this$0");
                ciVar.q(i2, true);
                return;
        }
    }
}
