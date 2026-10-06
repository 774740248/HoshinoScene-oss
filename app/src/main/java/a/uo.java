package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uo implements java.util.concurrent.Executor {

    public uo() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        new java.lang.Thread(runnable).start();
    }
}
