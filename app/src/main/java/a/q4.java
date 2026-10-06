package a;

import android.view.View;
import com.omarea.vtools.activities.ActivityAppRetrieve;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class q4 implements View.OnClickListener {

    public q4(ActivityAppRetrieve p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityAppRetrieve d;

    public /* synthetic */ q4(ActivityAppRetrieve activityAppRetrieve, int i) {
        this.c = i;
        this.d = activityAppRetrieve;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nh nhVar;
        int i = this.c;
        ActivityAppRetrieve activityAppRetrieve = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityAppRetrieve.k;
                wv.w(activityAppRetrieve, "this$0");
                WeakReference weakReference = activityAppRetrieve.h;
                if (weakReference == null || (nhVar = (nh) weakReference.get()) == null) {
                    return;
                }
                ArrayList c = nhVar.c();
                if (c.size() > 0) {
                    String j2 = qv.j2(c, "，", (String) null, (String) null, o4.g, 30);
                    int i2 = x60.f681a;
                    String string = activityAppRetrieve.getString(2131951990);
                    wv.v(string, "getString(R.string.apps_retrieve_confirm_apps)");
                    fs1.i(activityAppRetrieve, string, j2, new so(c, 17, activityAppRetrieve), (Runnable) null);
                    return;
                }
                return;
            default:
                gu0[] gu0VarArr2 = ActivityAppRetrieve.k;
                wv.w(activityAppRetrieve, "this$0");
                int i3 = x60.f681a;
                String string2 = activityAppRetrieve.getString(2131951989);
                wv.v(string2, "getString(R.string.apps_retrieve_confirm)");
                fs1.i(activityAppRetrieve, string2, "", new fw(25, activityAppRetrieve), (Runnable) null);
                return;
        }
    }
}
