package a;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ce1 implements Runnable {

    public ce1(me1 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ me1 d;

    public /* synthetic */ ce1(me1 me1Var, int i) {
        this.c = i;
        this.d = me1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        me1 me1Var = this.d;
        switch (i) {
            case 0:
                wv.w(me1Var, "this$0");
                me1Var.k = new fg0(me1Var.f348a).b();
                return;
            default:
                wv.w(me1Var, "this$0");
                new fg0(me1Var.f348a);
                fg0.a(true);
                return;
        }
    }
}
