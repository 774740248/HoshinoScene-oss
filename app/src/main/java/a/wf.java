package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wf implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public wf(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, int i, int i2) {
        this.c = activityStartSplash;
        this.d = i;
        this.e = i2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
        com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.c;
        activityStartSplash.p().getViewTreeObserver().removeOnPreDrawListener(this);
        float f = 120 * activityStartSplash.getResources().getDisplayMetrics().density;
        activityStartSplash.q().setTranslationY(this.d - activityStartSplash.q().getTop());
        activityStartSplash.r().setTranslationY(this.e - activityStartSplash.r().getTop());
        activityStartSplash.p().setTranslationY(f);
        activityStartSplash.p().animate().translationY(0.0f).alpha(1.0f).setDuration(1400L).start();
        activityStartSplash.q().animate().translationY(0.0f).alpha(0.1f).setDuration(1400L).start();
        activityStartSplash.r().animate().translationY(0.0f).setDuration(1400L).start();
        return true;
    }
}
