package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class d40 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ a.k40 e;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView f;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView g;

    public /* synthetic */ d40(a.v60 v60Var, a.k40 k40Var, com.omarea.ui.SwitchOptionItemView switchOptionItemView, com.omarea.ui.SwitchOptionItemView switchOptionItemView2, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = k40Var;
        this.f = switchOptionItemView;
        this.g = switchOptionItemView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = this.g;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = this.f;
        a.k40 k40Var = this.e;
        a.v60 v60Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(v60Var, "$dialog");
                a.wv.w(k40Var, "this$0");
                v60Var.a();
                k40Var.b(switchOptionItemView2.i, switchOptionItemView.i);
                return;
            default:
                a.wv.w(v60Var, "$dialog");
                a.wv.w(k40Var, "this$0");
                v60Var.a();
                k40Var.b(switchOptionItemView2.i, switchOptionItemView.i);
                return;
        }
    }
}
