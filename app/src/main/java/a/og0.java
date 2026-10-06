package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class og0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.rg0 d;

    public /* synthetic */ og0(a.rg0 rg0Var, int i) {
        this.c = i;
        this.d = rg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        a.rg0 rg0Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(rg0Var, "this$0");
                rg0Var.d();
                return;
            default:
                a.wv.w(rg0Var, "this$0");
                rg0Var.b();
                return;
        }
    }
}
