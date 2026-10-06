package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class g71 {
    public static final void a(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        a.wv.w(activity, "activity");
        a.wv.w(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
