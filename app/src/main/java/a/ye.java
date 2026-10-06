package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ye implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash d;

    public /* synthetic */ ye(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, int i) {
        this.c = i;
        this.d = activityStartSplash;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                if (activityStartSplash.p().getVisibility() == 0) {
                    return;
                }
                int top = activityStartSplash.q().getTop();
                int top2 = activityStartSplash.r().getTop();
                activityStartSplash.p().setAlpha(0.0f);
                activityStartSplash.p().setVisibility(0);
                activityStartSplash.p().getViewTreeObserver().addOnPreDrawListener(new a.wf(activityStartSplash, top, top2));
                return;
            case 1:
                a.fa0 fa0Var2 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.ye(activityStartSplash, 5));
                android.content.Context applicationContext = activityStartSplash.getApplicationContext();
                a.wv.v(applicationContext, "applicationContext");
                a.a3 a3Var = new a.a3(applicationContext);
                if (a3Var.c().getActivated()) {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.jf(a3Var, activityStartSplash, null), 3);
                    return;
                } else {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.mf(a3Var, activityStartSplash, null), 3);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.fa0 fa0Var3 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.o();
                return;
            case 3:
                a.fa0 fa0Var4 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.l();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.fa0 fa0Var5 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.m();
                return;
            case 5:
                a.fa0 fa0Var6 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.s().setText(activityStartSplash.getString(2131953662));
                return;
            default:
                a.fa0 fa0Var7 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.n();
                return;
        }
    }
}
