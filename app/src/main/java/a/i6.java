package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i6 {
    public static void a(android.app.Activity activity) {
        activity.finishAfterTransition();
    }

    public static void b(android.app.Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void c(android.app.Activity activity, android.app.SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void d(android.app.Activity activity, android.app.SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    public static void e(android.app.Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
