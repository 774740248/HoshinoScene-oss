package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class j6 {
    public static void a(java.lang.Object obj) {
        ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(android.app.Activity activity, java.lang.String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public static boolean c(android.app.Activity activity, java.lang.String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
