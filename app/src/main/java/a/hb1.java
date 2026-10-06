package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hb1 implements java.util.concurrent.ThreadFactory {

    public hb1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f202a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new a.gb1(runnable, this.f202a, this.b);
    }
}
