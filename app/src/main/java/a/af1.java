package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class af1 extends java.util.TimerTask {
    public final /* synthetic */ a.nk c;
    public final /* synthetic */ java.util.Timer d;

    public af1(a.nk nkVar, java.util.Timer timer) {
        this.c = nkVar;
        this.d = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a.nk nkVar = this.c;
        if (a.wv.e((java.util.Timer) nkVar.f, this.d)) {
            ((a.qo0) nkVar.d).b();
        } else {
            cancel();
        }
    }
}
