package a;

import android.view.View;
import com.omarea.vtools.activities.ActivityFreezeApps;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ga implements View.OnClickListener {

    public ga() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ v60 d;
    public final /* synthetic */ ActivityFreezeApps e;

    public /* synthetic */ ga(v60 v60Var, ActivityFreezeApps activityFreezeApps, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = activityFreezeApps;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityFreezeApps activityFreezeApps = this.e;
        v60 v60Var = this.d;
        switch (i) {
            case 0:
                ActivityFreezeApps.freezeOptionsDialog$lambda$21(v60Var, activityFreezeApps, view);
                return;
            case 1:
                ActivityFreezeApps.freezeOptionsDialog$lambda$22(v60Var, activityFreezeApps, view);
                return;
            case 2:
                ActivityFreezeApps.freezeOptionsDialog$lambda$25(v60Var, activityFreezeApps, view);
                return;
            case 3:
                ActivityFreezeApps.freezeOptionsDialog$lambda$26(v60Var, activityFreezeApps, view);
                return;
            default:
                ActivityFreezeApps.freezeOptionsDialog$lambda$27(v60Var, activityFreezeApps, view);
                return;
        }
    }
}
