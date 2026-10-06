package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yx {
    public static int a(android.content.Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T b(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static java.lang.String c(android.content.Context context, java.lang.Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
