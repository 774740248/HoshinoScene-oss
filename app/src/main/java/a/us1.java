package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class us1 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Process c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.Thread e;
    public final /* synthetic */ java.lang.Thread f;
    public final /* synthetic */ java.lang.Runnable g;
    public final /* synthetic */ a.vs1 h;

    public us1(a.vs1 vs1Var, java.lang.Process process, java.lang.String str, java.lang.Thread thread, java.lang.Thread thread2, a.hw hwVar) {
        this.h = vs1Var;
        this.c = process;
        this.d = str;
        this.e = thread;
        this.f = thread2;
        this.g = hwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.g;
        a.vs1 vs1Var = this.h;
        java.lang.Thread thread = this.f;
        java.lang.Thread thread2 = this.e;
        try {
            try {
                int waitFor = this.c.waitFor();
                try {
                    a.lt0 lt0Var = new a.lt0();
                    lt0Var.n("type", -2);
                    lt0Var.m("" + waitFor, "message");
                    ((android.webkit.WebView) vs1Var.c.d).post(new a.g2(this, 10, lt0Var));
                } catch (java.lang.Exception unused) {
                }
                if (thread2.isAlive()) {
                    thread2.interrupt();
                }
                if (thread.isAlive()) {
                    thread.interrupt();
                }
                if (runnable == null) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                try {
                    a.lt0 lt0Var2 = new a.lt0();
                    lt0Var2.n("type", -2);
                    lt0Var2.m("-1", "message");
                    ((android.webkit.WebView) vs1Var.c.d).post(new a.g2(this, 10, lt0Var2));
                } catch (java.lang.Exception unused2) {
                }
                if (thread2.isAlive()) {
                    thread2.interrupt();
                }
                if (thread.isAlive()) {
                    thread.interrupt();
                }
                if (runnable == null) {
                    throw th;
                }
                runnable.run();
                throw th;
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            try {
                a.lt0 lt0Var3 = new a.lt0();
                lt0Var3.n("type", -2);
                lt0Var3.m("-1", "message");
                ((android.webkit.WebView) vs1Var.c.d).post(new a.g2(this, 10, lt0Var3));
            } catch (java.lang.Exception unused3) {
            }
            if (thread2.isAlive()) {
                thread2.interrupt();
            }
            if (thread.isAlive()) {
                thread.interrupt();
            }
            if (runnable == null) {
                return;
            }
        }
        runnable.run();
    }
}
