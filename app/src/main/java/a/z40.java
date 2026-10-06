package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class z40 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ a.ma1 d;
    public final /* synthetic */ a.i50 e;

    public /* synthetic */ z40(a.i50 i50Var, a.ma1 ma1Var) {
        this.e = i50Var;
        this.d = ma1Var;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [a.be1, a.qr0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.be1, a.qr0] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        a.i50 i50Var = this.e;
        a.ma1 ma1Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(i50Var, "this$0");
                a.wv.w(ma1Var, "$d");
                new a.qr0().s(new a.a50(i50Var, ma1Var));
                return;
            default:
                a.wv.w(ma1Var, "$d");
                a.wv.w(i50Var, "this$0");
                new a.qr0().s(new a.a50(ma1Var, i50Var));
                return;
        }
    }

    public /* synthetic */ z40(a.ma1 ma1Var, a.i50 i50Var) {
        this.d = ma1Var;
        this.e = i50Var;
    }
}
