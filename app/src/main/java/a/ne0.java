package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ne0 implements a.qg1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f379a;
    public final int b;
    public final int c;

    public ne0(java.io.File file) {
        a.ai1.n(2, "direction");
        this.f379a = file;
        this.b = 2;
        this.c = Integer.MAX_VALUE;
    }

    @Override // a.qg1
    public final java.util.Iterator iterator() {
        return new a.le0(this);
    }
}
