package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class dp implements java.util.concurrent.Executor {
    public final /* synthetic */ int c;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.c;
        runnable.run();
    }
}
