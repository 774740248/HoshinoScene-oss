package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k20 extends a.lc0 implements java.util.concurrent.Executor {
    public static final a.k20 e = new a.k20();
    public static final a.xy f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.k20, a.xy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.pv0] */
    static {
        a.po1 po1Var = a.po1.e;
        int i = a.wj1.f665a;
        if (64 >= i) {
            i = 64;
        }
        int K1 = a.wv.K1("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        po1Var.getClass();
        if (K1 < 1) {
            throw new java.lang.IllegalArgumentException(a.ii1.d("Expected positive parallelism level, but got ", K1).toString());
        }
        if (K1 < a.pk1.d) {
            if (K1 < 1) {
                throw new java.lang.IllegalArgumentException(a.ii1.d("Expected positive parallelism level, but got ", K1).toString());
            }
            po1Var = (po1) new a.pv0(po1Var, K1);
        }
        f = po1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        h(a.ob0.c, runnable);
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        f.h(tyVar, runnable);
    }

    @Override // a.xy
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
