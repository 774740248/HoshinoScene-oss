package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bq {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.bq.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final a.d30[] f50a;
    private volatile int notCompletedCount;

    public bq(a.d30[] d30VarArr) {
        this.f50a = d30VarArr;
        this.notCompletedCount = d30VarArr.length;
    }
}
