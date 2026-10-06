package a;

import com.omarea.vtools.activities.ActivityFpsSession;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class y8 implements Runnable {

    public y8() {
        this(null, 0, 0);
    }
    public final /* synthetic */ ActivityFpsSession c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ y8(ActivityFpsSession activityFpsSession, int i, int i2) {
        this.c = activityFpsSession;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0[] gu0VarArr = ActivityFpsSession.I0;
        ActivityFpsSession activityFpsSession = this.c;
        wv.w(activityFpsSession, "this$0");
        activityFpsSession.y().setPadding(activityFpsSession.y().getPaddingLeft(), this.d, activityFpsSession.y().getPaddingRight(), this.e);
    }
}
