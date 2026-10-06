package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u30 extends java.util.TimerTask {
    public static final /* synthetic */ int h = 0;
    public final /* synthetic */ a.ka1 c;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ android.os.Handler e;
    public final /* synthetic */ a.v30 f;
    public final /* synthetic */ android.widget.TextView g;

    public u30(a.ka1 ka1Var, a.v60 v60Var, android.os.Handler handler, a.v30 v30Var, android.widget.TextView textView) {
        this.c = ka1Var;
        this.d = v60Var;
        this.e = handler;
        this.f = v30Var;
        this.g = textView;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a.ka1 ka1Var = this.c;
        int i = ka1Var.c - 1;
        ka1Var.c = i;
        android.os.Handler handler = this.e;
        if (i >= 1) {
            handler.post(new a.xa(this.g, 10, ka1Var));
            return;
        }
        cancel();
        a.v60 v60Var = this.d;
        if (v60Var.f625a.isShowing()) {
            handler.post(new a.ya(5, v60Var));
            this.f.getClass();
            a.q10.k(2000L, "wm size reset\nwm density reset\nwm overscan reset\n");
            a.q10.k(2000L, "settings put system pointer_location 0");
        }
    }
}
