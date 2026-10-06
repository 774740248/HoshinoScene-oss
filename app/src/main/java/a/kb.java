package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class kb implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityMiuiCloudProfile d;

    public /* synthetic */ kb(com.omarea.vtools.activities.ActivityMiuiCloudProfile activityMiuiCloudProfile, int i) {
        this.c = i;
        this.d = activityMiuiCloudProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityMiuiCloudProfile activityMiuiCloudProfile = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityMiuiCloudProfile.s;
                a.wv.w(activityMiuiCloudProfile, "this$0");
                a.q10 q10Var = a.q10.f457a;
                a.q10.l("pm clear com.xiaomi.joyose && am start-service com.xiaomi.joyose/com.xiaomi.joyose.smartop.SmartOpService");
                a.gy.h(a.b20.g0("/odm/etc/default_cloud.json"));
                activityMiuiCloudProfile.o();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("OK", 0);
                return;
            default:
                a.wv.w(activityMiuiCloudProfile, "this$0");
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityMiuiCloudProfile.s;
                activityMiuiCloudProfile.o();
                return;
        }
    }
}
