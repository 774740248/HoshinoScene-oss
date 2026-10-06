package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dr0 {
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object I;
        try {
            I = new a.cr0(a(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            I = a.b20.I(th);
        }
        if (I instanceof a.ac1) {
            I = null;
        }
    }

    public static final android.os.Handler a(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
            } catch (java.lang.NoSuchMethodException unused) {
                return new android.os.Handler(looper);
            }
        }
        java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
        a.wv.t(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (android.os.Handler) invoke;
    }
}
