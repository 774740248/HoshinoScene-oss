package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class lf1 extends a.lc0 {

    public lf1() {
        this(0, 0, 0L, null);
    }
    public final a.bz e;

    public lf1(int i, int i2, long j, java.lang.String str) {
        this.e = new a.bz(i, i2, j, str);
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        a.bz bzVar = this.e;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = a.bz.j;
        bzVar.b(runnable, a.pk1.g, false);
    }
}
