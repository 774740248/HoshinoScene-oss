package a;

import android.view.View;
import android.widget.Toast;
import com.omarea.Scene;
import com.omarea.vtools.activities.ActivityMiuiCloudProfile;
import java.io.File;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class lb implements View.OnClickListener {

    public lb(ActivityMiuiCloudProfile p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityMiuiCloudProfile d;

    public /* synthetic */ lb(ActivityMiuiCloudProfile activityMiuiCloudProfile, int i) {
        this.c = i;
        this.d = activityMiuiCloudProfile;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityMiuiCloudProfile activityMiuiCloudProfile = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityMiuiCloudProfile.s;
                wv.w(activityMiuiCloudProfile, "this$0");
                activityMiuiCloudProfile.q("SmartP.db", activityMiuiCloudProfile.o);
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityMiuiCloudProfile.s;
                wv.w(activityMiuiCloudProfile, "this$0");
                activityMiuiCloudProfile.q("teg_config.db", activityMiuiCloudProfile.o);
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityMiuiCloudProfile.s;
                wv.w(activityMiuiCloudProfile, "this$0");
                activityMiuiCloudProfile.q("SmartP.db", activityMiuiCloudProfile.p);
                return;
            case 3:
                gu0[] gu0VarArr4 = ActivityMiuiCloudProfile.s;
                wv.w(activityMiuiCloudProfile, "this$0");
                activityMiuiCloudProfile.q("teg_config.db", activityMiuiCloudProfile.p);
                return;
            default:
                gu0[] gu0VarArr5 = ActivityMiuiCloudProfile.s;
                wv.w(activityMiuiCloudProfile, "this$0");
                if (!new File("/odm/etc/default_cloud.json").exists()) {
                    cp cpVar = Scene.c;
                    fs1.X("/odm/etc/default_cloud.json Not Found!", 0);
                    return;
                } else if (b20.D0()) {
                    activityMiuiCloudProfile.q("default_cloud.db", activityMiuiCloudProfile.o);
                    return;
                } else {
                    Toast.makeText(activityMiuiCloudProfile.getContext(), activityMiuiCloudProfile.getString(2131952861), 1).show();
                    return;
                }
        }
    }
}
