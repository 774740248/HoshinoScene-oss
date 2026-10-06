package a;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class wf1 implements Runnable {

    public wf1() {
        this(null, 0L);
    }
    public final /* synthetic */ xf1 c;
    public final /* synthetic */ long d;

    public /* synthetic */ wf1(xf1 xf1Var, long j) {
        this.c = xf1Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xf1 xf1Var = this.c;
        wv.w(xf1Var, "this$0");
        if (xf1Var.e == this.d) {
            xf1Var.c.run();
        }
    }
}
