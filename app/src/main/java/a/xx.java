package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xx {
    public static java.io.File a(android.content.Context context) {
        return context.getCodeCacheDir();
    }

    public static android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        return context.getDrawable(i);
    }

    public static java.io.File c(android.content.Context context) {
        return context.getNoBackupFilesDir();
    }
}
