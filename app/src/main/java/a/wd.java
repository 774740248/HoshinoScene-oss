package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class wd implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess e;
    public final /* synthetic */ com.omarea.model.ProcessInfo f;

    public /* synthetic */ wd(a.v60 v60Var, com.omarea.vtools.activities.ActivityProcess activityProcess, com.omarea.model.ProcessInfo processInfo) {
        this.c = 1;
        this.d = v60Var;
        this.e = activityProcess;
        this.f = processInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        a.v60 v60Var = this.d;
        com.omarea.model.ProcessInfo processInfo = this.f;
        com.omarea.vtools.activities.ActivityProcess activityProcess = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                a.wv.w(processInfo, "$detail");
                a.wv.w(v60Var, "$dialog");
                a.rg0 rg0Var = new a.rg0(activityProcess.getBaseContext());
                int i2 = processInfo.pid;
                java.lang.String str = processInfo.friendlyName;
                a.wv.v(str, "detail.friendlyName");
                rg0Var.c(str, i2);
                v60Var.a();
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(activityProcess, "this$0");
                a.wv.w(processInfo, "$detail");
                v60Var.a();
                int i3 = a.x60.f681a;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.fe(processInfo, a.fs1.J(activityProcess, activityProcess.getString(2131953262)), null), 3);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                a.wv.w(processInfo, "$detail");
                a.wv.w(v60Var, "$dialog");
                activityProcess.s.getClass();
                java.lang.String str2 = processInfo.name;
                a.wv.v(str2, "name");
                if (a.yi1.g2(str2, ":")) {
                    str2 = str2.substring(0, a.yi1.m2(str2, ":", 0, false, 6));
                    a.wv.v(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                a.q10 q10Var = a.q10.f457a;
                a.q10.k(3000L, a.ai1.l(new java.lang.Object[]{str2, str2, str2}, 3, "killall -9 %s;am force-stop %s;am kill %s", "format(format, *args)"));
                a.q10.k(3000L, "kill -9 " + processInfo.pid);
                v60Var.a();
                return;
            default:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                a.wv.w(processInfo, "$detail");
                a.wv.w(v60Var, "$dialog");
                int i4 = processInfo.pid;
                activityProcess.s.getClass();
                a.q10 q10Var2 = a.q10.f457a;
                a.q10.k(3000L, "kill -9 " + i4);
                v60Var.a();
                return;
        }
    }

    public /* synthetic */ wd(com.omarea.vtools.activities.ActivityProcess activityProcess, com.omarea.model.ProcessInfo processInfo, a.v60 v60Var, int i) {
        this.c = i;
        this.e = activityProcess;
        this.f = processInfo;
        this.d = v60Var;
    }
}
