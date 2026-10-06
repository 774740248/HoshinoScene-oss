package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class h8 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles d;

    public /* synthetic */ h8(com.omarea.vtools.activities.ActivityFiles activityFiles, int i) {
        this.c = i;
        this.d = activityFiles;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                a.wv.w(activityFiles, "this$0");
                activityFiles.B(null, false, null);
                return;
            case 1:
                a.wv.w(activityFiles, "this$0");
                com.omarea.vtools.activities.ActivityFiles.o(activityFiles, activityFiles.x);
                return;
            default:
                com.omarea.vtools.activities.ActivityFiles.p(activityFiles);
                return;
        }
    }
}
