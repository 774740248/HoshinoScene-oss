package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class da implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps d;

    public /* synthetic */ da(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, int i) {
        this.c = i;
        this.d = activityFreezeApps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.b81 b81Var;
        a.b81 b81Var2;
        int i = this.c;
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityFreezeApps.addFreezeApps$lambda$20(activityFreezeApps);
                return;
            case 1:
                com.omarea.vtools.activities.ActivityFreezeApps.createShortcutAll$lambda$33(activityFreezeApps);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityFreezeApps.shortcutsLostDialog$lambda$9$lambda$8(activityFreezeApps);
                return;
            case 3:
                com.omarea.vtools.activities.ActivityFreezeApps.createShortcutAll$lambda$33$lambda$32$lambda$31(activityFreezeApps);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.vtools.activities.ActivityFreezeApps.createShortcutAll$lambda$33$lambda$32(activityFreezeApps);
                return;
            case 5:
                com.omarea.vtools.activities.ActivityFreezeApps.shortcutsLostDialog$lambda$9$lambda$8$lambda$7(activityFreezeApps);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                com.omarea.vtools.activities.ActivityFreezeApps.freezeOptionsDialog$lambda$25$lambda$24$lambda$23(activityFreezeApps);
                return;
            case 7:
                com.omarea.vtools.activities.ActivityFreezeApps.freezeOptionsDialog$lambda$25$lambda$24(activityFreezeApps);
                return;
            case 8:
                com.omarea.vtools.activities.ActivityFreezeApps.addFreezeApps$lambda$20$lambda$19(activityFreezeApps);
                return;
            case 9:
                b81Var = activityFreezeApps.processBarDialog;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var.a();
                activityFreezeApps.loadData();
                return;
            default:
                b81Var2 = activityFreezeApps.processBarDialog;
                if (b81Var2 == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var2.a();
                activityFreezeApps.loadData();
                return;
        }
    }
}
