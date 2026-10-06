package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ze implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash d;

    public /* synthetic */ ze(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, int i) {
        this.c = i;
        this.d = activityStartSplash;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.finishAfterTransition();
                return;
            case 1:
                a.fa0 fa0Var2 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.u(new a.ye(activityStartSplash, 4));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.fa0 fa0Var3 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.u(new a.ye(activityStartSplash, 3));
                return;
            default:
                a.fa0 fa0Var4 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(activityStartSplash, "this$0");
                activityStartSplash.u(new a.ye(activityStartSplash, 6));
                return;
        }
    }
}
