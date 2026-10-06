package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class s7 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare d;

    public /* synthetic */ s7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, int i) {
        this.c = i;
        this.d = activityFastShare;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
                activityFastShare.w().performClick();
                a.cp cpVar = com.omarea.Scene.c;
                com.omarea.Scene.d.postDelayed(new a.s7(activityFastShare, 1), 1000L);
                return;
            default:
                activityFastShare.O = false;
                return;
        }
    }
}
