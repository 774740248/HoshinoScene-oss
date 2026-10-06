package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bp extends java.util.TimerTask {
    public int c;
    public final /* synthetic */ java.util.Timer d;
    public final /* synthetic */ a.cp e;

    public bp(java.util.Timer timer, a.cp cpVar) {
        this.d = timer;
        this.e = cpVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a.cp cpVar = this.e;
        if (!a.wv.e(this.d, cpVar.B)) {
            cancel();
            return;
        }
        if (android.os.SystemClock.uptimeMillis() - com.omarea.vtools.AccessibilitySceneMode.C < 60000 && cpVar.y) {
            a.wk.b(false);
        }
        int i = this.c + 6;
        this.c = i;
        int i2 = i % 60;
        this.c = i2;
        if (i2 == 0) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.ap(cpVar, null), 3);
        }
    }
}
