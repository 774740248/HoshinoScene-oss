package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u60 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f578a;
    public final java.lang.Runnable b;
    public final boolean c;

    public /* synthetic */ u60(java.lang.String str, java.lang.Runnable runnable, int i) {
        this(str, (i & 2) != 0 ? null : runnable, (i & 4) != 0);
    }

    public u60(java.lang.String str, java.lang.Runnable runnable, boolean z) {
        this.f578a = str;
        this.b = runnable;
        this.c = z;
    }
}
