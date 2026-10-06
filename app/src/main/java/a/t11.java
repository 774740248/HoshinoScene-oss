package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class t11 {
    public static android.content.Intent a(android.app.Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean b(android.app.Activity activity, android.content.Intent intent) {
        return activity.navigateUpTo(intent);
    }

    public static boolean c(android.app.Activity activity, android.content.Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
