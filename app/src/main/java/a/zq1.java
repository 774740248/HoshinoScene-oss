package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class zq1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f742a = new java.util.HashMap();
    public final java.util.LinkedHashSet b = new java.util.LinkedHashSet();
    public volatile boolean c = false;

    public static void a(java.lang.Object obj) {
        if (obj instanceof java.io.Closeable) {
            try {
                ((java.io.Closeable) obj).close();
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public void b() {
    }
}
