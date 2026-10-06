package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vd1 implements android.app.Application.ActivityLifecycleCallbacks {

    public vd1() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.cp cpVar = com.omarea.Scene.c;
        if (a.wv.e(com.omarea.Scene.f, activity)) {
            com.omarea.Scene.f = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.cp cpVar = com.omarea.Scene.c;
        com.omarea.Scene.f = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
        a.wv.w(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        a.wv.w(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.cp cpVar = com.omarea.Scene.c;
        if (a.wv.e(com.omarea.Scene.f, activity)) {
            com.omarea.Scene.f = null;
        }
    }
}
