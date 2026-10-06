package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class a91 implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "realtime-blur");
        thread.setDaemon(true);
        return thread;
    }
}
