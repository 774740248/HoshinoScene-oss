package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wx {
    public static java.io.File[] a(android.content.Context context) {
        return context.getExternalCacheDirs();
    }

    public static java.io.File[] b(android.content.Context context, java.lang.String str) {
        return context.getExternalFilesDirs(str);
    }

    public static java.io.File[] c(android.content.Context context) {
        return context.getObbDirs();
    }
}
