package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class a50 implements java.lang.Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ a.i50 d;
    public final /* synthetic */ a.ma1 e;

    public /* synthetic */ a50(a.i50 i50Var, a.ma1 ma1Var) {
        this.d = i50Var;
        this.e = ma1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.ma1 ma1Var = this.e;
        a.i50 i50Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(ma1Var, "$d");
                a.wv.w(i50Var, "this$0");
                ((a.v60) ma1Var.c).a();
                new a.x01(i50Var.f225a, i50Var.b, i50Var.c).d();
                return;
            default:
                a.wv.w(i50Var, "this$0");
                a.wv.w(ma1Var, "$d");
                new a.ej1(i50Var.f225a, i50Var.c, new a.tf(1, i50Var)).w();
                ((a.v60) ma1Var.c).a();
                return;
        }
    }

    public /* synthetic */ a50(a.ma1 ma1Var, a.i50 i50Var) {
        this.e = ma1Var;
        this.d = i50Var;
    }
}
