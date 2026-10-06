package a;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class nr implements Runnable {

    public nr() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ nr(Runnable runnable, r1 r1Var, int i) {
        this.c = i;
        this.d = runnable;
        this.e = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Runnable runnable = this.e;
        Runnable runnable2 = this.d;
        switch (i) {
            case 0:
                wv.w(runnable2, "$onExit");
                wv.w(runnable, "$onDismiss");
                try {
                    runnable2.run();
                    runnable.run();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                wv.w(runnable2, "$onExit");
                wv.w(runnable, "$onDismiss");
                try {
                    runnable2.run();
                    runnable.run();
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
