package a;

import android.widget.Toast;
import com.omarea.vtools.activities.ActivityMagisk;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class db implements Runnable {

    public db(ActivityMagisk p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityMagisk d;

    public /* synthetic */ db(ActivityMagisk activityMagisk, int i) {
        this.c = i;
        this.d = activityMagisk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ActivityMagisk activityMagisk = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityMagisk.f;
                wv.w(activityMagisk, "this$0");
                if (!b20.s0(activityMagisk.getContext())) {
                    Toast.makeText(activityMagisk.getContext(), ">_<", 0).show();
                    return;
                } else {
                    Toast.makeText(activityMagisk.getContext(), "OK!", 1).show();
                    activityMagisk.recreate();
                    return;
                }
            default:
                gu0[] gu0VarArr2 = ActivityMagisk.f;
                wv.w(activityMagisk, "this$0");
                activityMagisk.finish();
                return;
        }
    }
}
