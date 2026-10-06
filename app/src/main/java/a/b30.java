package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b30 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f31a = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName("arch_disk_io_" + this.f31a.getAndIncrement());
        return thread;
    }
}
