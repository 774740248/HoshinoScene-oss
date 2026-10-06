package a;

import android.view.View;
import com.omarea.model.AppInfo;
import com.omarea.vtools.activities.ActivityFreezeApps;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ha implements View.OnClickListener {

    public ha() {
        this(null, null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ v60 d;
    public final /* synthetic */ ActivityFreezeApps e;
    public final /* synthetic */ AppInfo f;

    public /* synthetic */ ha(v60 v60Var, ActivityFreezeApps activityFreezeApps, AppInfo appInfo, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = activityFreezeApps;
        this.f = appInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        v60 v60Var = this.d;
        AppInfo appInfo = this.f;
        ActivityFreezeApps activityFreezeApps = this.e;
        switch (i) {
            case 0:
                ActivityFreezeApps.showOptions$lambda$10(v60Var, activityFreezeApps, appInfo, view);
                return;
            case 1:
                ActivityFreezeApps.showOptions$lambda$11(v60Var, activityFreezeApps, appInfo, view);
                return;
            case 2:
                ActivityFreezeApps.showOptions$lambda$12(v60Var, activityFreezeApps, appInfo, view);
                return;
            case 3:
                ActivityFreezeApps.showOptions$lambda$14(v60Var, activityFreezeApps, appInfo, view);
                return;
            default:
                ActivityFreezeApps.showOptions$lambda$15(v60Var, activityFreezeApps, appInfo, view);
                return;
        }
    }
}
