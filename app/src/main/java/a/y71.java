package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class y71 {
    public static android.content.pm.PackageInfo a(android.content.pm.PackageManager packageManager, android.content.Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
    }
}
