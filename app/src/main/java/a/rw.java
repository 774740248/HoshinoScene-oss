package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class rw implements java.util.concurrent.ThreadFactory {

    public rw(String p0) {
        this.f509a = p0;
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.f509a);
        thread.setPriority(10);
        return thread;
    }
}
