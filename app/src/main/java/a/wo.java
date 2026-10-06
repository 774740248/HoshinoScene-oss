package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wo {
    public static int a(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static java.lang.String b(android.content.Context context) {
        return context.getOpPackageName();
    }

    public static android.app.AppOpsManager c(android.content.Context context) {
        return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
    }
}
