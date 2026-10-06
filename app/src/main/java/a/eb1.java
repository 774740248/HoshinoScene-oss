package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eb1 implements android.app.Application.ActivityLifecycleCallbacks {
    public static final a.db1 Companion = new a.db1();

    public static final void registerIn(android.app.Activity activity) {
        Companion.getClass();
        a.wv.w(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new a.eb1());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        int i = a.fb1.d;
        a.fa0.h(activity, a.ev0.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
        a.wv.w(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }
}
