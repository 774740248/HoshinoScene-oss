package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f441a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final a.s11 f;
    public static final a.fa0 g;
    public static final a.fa0 h;

    static {
        java.lang.String str;
        int i = a.wj1.f665a;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f441a = str;
        b = a.wv.J1("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = a.wj1.f665a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = a.wv.K1("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = a.wv.K1("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = java.util.concurrent.TimeUnit.SECONDS.toNanos(a.wv.J1("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = a.s11.E;
        g = new a.fa0(0);
        h = new a.fa0(1);
    }
}
