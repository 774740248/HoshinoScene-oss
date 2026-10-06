package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gb1 extends java.lang.Thread {
    public final int c;

    public gb1(java.lang.Runnable runnable, java.lang.String str, int i) {
        super(runnable, str);
        this.c = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.c);
        super.run();
    }
}
