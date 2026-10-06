package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class af implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash e;

    public /* synthetic */ af(a.v60 v60Var, com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = activityStartSplash;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.e;
        a.v60 v60Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(activityStartSplash, "this$0");
                v60Var.a();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("agreement_v6", true).apply();
                activityStartSplash.k();
                return;
            default:
                a.fa0 fa0Var2 = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(activityStartSplash, "this$0");
                v60Var.a();
                activityStartSplash.o();
                return;
        }
    }
}
