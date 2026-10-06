package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u20 extends a.lf1 {
    public static final a.u20 f = new a.lf1(a.pk1.c, a.pk1.d, a.pk1.e, a.pk1.f441a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // a.xy
    public final java.lang.String toString() {
        return "Dispatchers.Default";
    }
}
