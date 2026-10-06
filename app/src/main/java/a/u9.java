package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class u9 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSessions d;

    public /* synthetic */ u9(com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, int i) {
        this.c = i;
        this.d = activityFpsSessions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSessions.t;
                a.wv.w(activityFpsSessions, "this$0");
                activityFpsSessions.p();
                return;
            default:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSessions.t;
                a.wv.w(activityFpsSessions, "this$0");
                activityFpsSessions.q = a.wv.M0(a.wv.b(a.z80.b), null, new a.ca(activityFpsSessions, null), 3);
                return;
        }
    }
}
