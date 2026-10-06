package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class l40 implements View.OnClickListener {

    public l40() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ v60 d;
    public final /* synthetic */ nk e;

    public /* synthetic */ l40(v60 v60Var, nk nkVar, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = nkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        nk nkVar = this.e;
        v60 v60Var = this.d;
        switch (i) {
            case 0:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H(b11.i);
                return;
            case 1:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H(b11.l);
                return;
            case 2:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H(b11.j);
                return;
            case 3:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H(b11.k);
                return;
            case 4:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H("");
                return;
            default:
                wv.w(v60Var, "$dialog");
                wv.w(nkVar, "this$0");
                v60Var.a();
                nkVar.H(b11.o);
                return;
        }
    }
}
