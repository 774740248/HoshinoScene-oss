package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ea implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps d;

    public /* synthetic */ ea(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, int i) {
        this.c = i;
        this.d = activityFreezeApps;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityFreezeApps.loadData$lambda$3(activityFreezeApps, view);
                return;
            case 1:
                com.omarea.vtools.activities.ActivityFreezeApps.loadData$lambda$6(activityFreezeApps, view);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityFreezeApps.onViewCreated$lambda$0(activityFreezeApps, view);
                return;
            default:
                com.omarea.vtools.activities.ActivityFreezeApps.onViewCreated$lambda$1(activityFreezeApps, view);
                return;
        }
    }
}
