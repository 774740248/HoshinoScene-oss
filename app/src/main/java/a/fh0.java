package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class fh0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ fh0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.hh0 hh0Var = (a.hh0) obj;
                a.wv.w(hh0Var, "this$0");
                hh0Var.a();
                return;
            case 1:
                a.kh0 kh0Var = (a.kh0) obj;
                a.wv.w(kh0Var, "this$0");
                kh0Var.a();
                return;
            default:
                a.fa0 fa0Var = a.uh0.f;
                a.wv.w((a.uh0) obj, "this$0");
                try {
                    ((android.widget.LinearLayout) view.findViewById(2131362543)).setOrientation(1);
                    android.view.View view2 = a.uh0.i;
                    a.wv.t(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
                    ((android.widget.LinearLayout) view2).setOrientation(0);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
        }
    }
}
