package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ke implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f287a;
    public android.app.Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public ke(android.app.Activity activity) {
        this.b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (!this.e || this.f || this.d) {
            return;
        }
        java.lang.Object obj = this.f287a;
        try {
            java.lang.Object obj2 = a.le.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.c) {
                a.le.g.postAtFrontOfQueue(new a.g2(a.le.b.get(activity), obj2, 3));
                this.f = true;
                this.f287a = null;
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (this.b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
